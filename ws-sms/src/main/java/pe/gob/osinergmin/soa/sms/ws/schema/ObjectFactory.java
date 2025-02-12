
package pe.gob.osinergmin.soa.sms.ws.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.gob.osinergmin.soa.sms.ws.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnviarSMSRespParamTYPE_QNAME = new QName("http://soa.osinergmin.gob.pe/schema/wssms", "enviarSMSRespParamTYPE");
    private final static QName _RecibeSMSRespParamTYPE_QNAME = new QName("http://soa.osinergmin.gob.pe/schema/wssms", "recibeSMSRespParamTYPE");
    private final static QName _EnviarSMSReqParamTYPE_QNAME = new QName("http://soa.osinergmin.gob.pe/schema/wssms", "enviarSMSReqParamTYPE");
    private final static QName _RecibeSMSReqParamTYPE_QNAME = new QName("http://soa.osinergmin.gob.pe/schema/wssms", "recibeSMSReqParamTYPE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.gob.osinergmin.soa.sms.ws.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnviarSMSRespParamTYPE }
     * 
     */
    public EnviarSMSRespParamTYPE createEnviarSMSRespParamTYPE() {
        return new EnviarSMSRespParamTYPE();
    }

    /**
     * Create an instance of {@link RecibeSMSReqParamTYPE }
     * 
     */
    public RecibeSMSReqParamTYPE createRecibeSMSReqParamTYPE() {
        return new RecibeSMSReqParamTYPE();
    }

    /**
     * Create an instance of {@link RecibeSMSRespParamTYPE }
     * 
     */
    public RecibeSMSRespParamTYPE createRecibeSMSRespParamTYPE() {
        return new RecibeSMSRespParamTYPE();
    }

    /**
     * Create an instance of {@link EnviarSMSReqParamTYPE }
     * 
     */
    public EnviarSMSReqParamTYPE createEnviarSMSReqParamTYPE() {
        return new EnviarSMSReqParamTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarSMSRespParamTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.osinergmin.gob.pe/schema/wssms", name = "enviarSMSRespParamTYPE")
    public JAXBElement<EnviarSMSRespParamTYPE> createEnviarSMSRespParamTYPE(EnviarSMSRespParamTYPE value) {
        return new JAXBElement<EnviarSMSRespParamTYPE>(_EnviarSMSRespParamTYPE_QNAME, EnviarSMSRespParamTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecibeSMSRespParamTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.osinergmin.gob.pe/schema/wssms", name = "recibeSMSRespParamTYPE")
    public JAXBElement<RecibeSMSRespParamTYPE> createRecibeSMSRespParamTYPE(RecibeSMSRespParamTYPE value) {
        return new JAXBElement<RecibeSMSRespParamTYPE>(_RecibeSMSRespParamTYPE_QNAME, RecibeSMSRespParamTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarSMSReqParamTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.osinergmin.gob.pe/schema/wssms", name = "enviarSMSReqParamTYPE")
    public JAXBElement<EnviarSMSReqParamTYPE> createEnviarSMSReqParamTYPE(EnviarSMSReqParamTYPE value) {
        return new JAXBElement<EnviarSMSReqParamTYPE>(_EnviarSMSReqParamTYPE_QNAME, EnviarSMSReqParamTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecibeSMSReqParamTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.osinergmin.gob.pe/schema/wssms", name = "recibeSMSReqParamTYPE")
    public JAXBElement<RecibeSMSReqParamTYPE> createRecibeSMSReqParamTYPE(RecibeSMSReqParamTYPE value) {
        return new JAXBElement<RecibeSMSReqParamTYPE>(_RecibeSMSReqParamTYPE_QNAME, RecibeSMSReqParamTYPE.class, null, value);
    }

}
