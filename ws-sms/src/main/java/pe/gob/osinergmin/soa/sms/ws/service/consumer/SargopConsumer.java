package pe.gob.osinergmin.soa.sms.ws.service.consumer;

//import java.math.BigInteger;
//import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
//import pe.gob.osinergmin.comun.schema.ConsumidorTYPE;
//import pe.gob.osinergmin.soa.schema.comun.sms.RecibirSMSReqParamTYPE;
//import pe.gob.osinergmin.soa.schema.comun.sms.SuccesRecibirSMSParamTYPE;
import pe.gob.osinergmin.soa.sms.ws.service.exception.ServiceException;
import pe.gob.osinergmin.soa.sms.ws.util.PropertiesUtils;
import pe.gob.osinergmin.soa.sms.ws.util.enums.PropertiesEnum;
import pe.gob.osinergmin.soa.sms.ws.util.enums.exception.SMSErrorEnum;

/**
 *
 * @author otheo
 */
@Component(value = "sargopConsumer")
public class SargopConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(SargopConsumer.class);

//    private static final String SARGOP_WSDL_URL = PropertiesUtils.getProperty(PropertiesEnum.SARGOP_WSDL_URL.getValue());
    private static final String SARGOP_RECIBE_SMS = PropertiesUtils.getProperty(PropertiesEnum.SARGOP_RECIBE_SMS.getValue());

    public String recibeSMS(String numRem, String mensaje) throws ServiceException {
        String result = SMSErrorEnum.ERROR_9000.getMessage();
        try {
            //SargopSMSService service = new SargopSMSService(new URL(SARGOP_WSDL_URL));
            //RecibirSMSReqParamTYPE in = new RecibirSMSReqParamTYPE();
            //in.setNumRem(new BigInteger(numRem));
            //in.setMensaje(mensaje);
            //SuccesRecibirSMSParamTYPE out = service.getSargopSMSPort().recibeSMS(new ConsumidorTYPE(), in);
            //result = out.getResult();
        	System.out.println("SOAP SARGOP-WS");
            LOGGER.info("SOAP - SARGIO_WS");
            LOGGER.info(SARGOP_RECIBE_SMS);
            result = SOAPConsumer.callRecibeSMS(SARGOP_RECIBE_SMS, numRem, mensaje);
            
        } catch (Exception ex) {
            LOGGER.error(PropertiesUtils.APP_NAME + ex.getMessage());
        }
        return result;
    }

}
