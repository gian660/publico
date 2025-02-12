package pe.gob.osinergmin.soa.sms.ws.service.interceptor;

import java.io.InputStream;
import java.io.StringWriter;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.io.IOUtils;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;
import org.springframework.util.Assert;
import org.springframework.xml.transform.ResourceSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import pe.gob.osinergmin.soa.sms.ws.util.PropertiesUtils;

/**
 *
 * @author otheo
 */
public class SoapTransformingInterceptor extends AbstractSoapInterceptor implements InitializingBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(SoapTransformingInterceptor.class);

    private Resource requestXslt;
    private Resource responseXslt;
    private Templates requestTemplates;

    public SoapTransformingInterceptor() {
        super(Phase.RECEIVE);
    }

    public void setRequestXslt(Resource requestXslt) {
        this.requestXslt = requestXslt;
    }

    public void setResponseXslt(Resource responseXslt) {
        this.responseXslt = responseXslt;
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        InputStream is = null;
        InputStream replaceInStream = null;
        try {
            LOGGER.info(PropertiesUtils.APP_NAME + "Procesando conversi\u00F3n ...");
            is = message.getContent(InputStream.class);
            String mensajeConvertido = transform(new StreamSource(is));
            LOGGER.info(PropertiesUtils.APP_NAME + mensajeConvertido);

            replaceInStream = IOUtils.toInputStream(mensajeConvertido, (String) message.get(Message.ENCODING));

            message.setContent(InputStream.class, replaceInStream);

            LOGGER.info(PropertiesUtils.APP_NAME + "Mensaje convertido correctamente ...");

        } catch (Exception ex) {
            LOGGER.error(PropertiesUtils.APP_NAME + ex.getMessage(), ex);
        } finally {
            if (is != null) {
                IOUtils.closeQuietly(is);
            }
            if (replaceInStream != null) {
                IOUtils.closeQuietly(replaceInStream);
            }
     
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (requestXslt == null && responseXslt == null) {
            throw new IllegalArgumentException("Setting either 'requestXslt' or 'responseXslt' is required");
        }
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        XMLReader xmlReader = XMLReaderFactory.createXMLReader();
        xmlReader.setFeature("http://xml.org/sax/features/namespace-prefixes", true);
        if (requestXslt != null) {
            Assert.isTrue(requestXslt.exists(), "requestXslt \"" + requestXslt + "\" does not exit");
            LOGGER.info(PropertiesUtils.APP_NAME + "Transforming request using " + requestXslt);
            Source requestSource = new ResourceSource(xmlReader, requestXslt);
            requestTemplates = transformerFactory.newTemplates(requestSource);
        }
    }

    public String transform(StreamSource streamSourceInput) throws Exception {
        StringWriter out = new StringWriter();
        Transformer transformer = requestTemplates.newTransformer();
        transformer.transform(streamSourceInput, new StreamResult(out));
        return out.toString();
    }

}
