package pe.gob.osinergmin.soa.sms.ws.service.consumer;

import javax.jws.WebService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.osinergmin.soa.sms.ws.schema.EnviarSMSReqParamTYPE;
import pe.gob.osinergmin.soa.sms.ws.schema.EnviarSMSRespParamTYPE;
import pe.gob.osinergmin.soa.sms.ws.schema.RecibeSMSReqParamTYPE;
import pe.gob.osinergmin.soa.sms.ws.schema.RecibeSMSRespParamTYPE;
import pe.gob.osinergmin.soa.sms.ws.schema.comun.consumidor.ConsumidorTYPE;
import pe.gob.osinergmin.soa.sms.ws.service.ComunFaultMsg;
import pe.gob.osinergmin.soa.sms.ws.service.WsSMSPort;
import pe.gob.osinergmin.soa.sms.ws.service.exception.ExceptionBuilder;
import pe.gob.osinergmin.soa.sms.ws.service.exception.ServiceException;
import pe.gob.osinergmin.soa.sms.ws.util.PropertiesUtils;

/**
 *
 * @author otheo
 */
//@WebService(serviceName = WsSMSConsumer.SERVICE_NAME,
//        portName = "WsSMSPortSOAP12",
//        targetNamespace = "http://soa.osinergmin.gob.pe/schema/wssms",
//        wsdlLocation = "/WEB-INF/wsdl/WsSms.wsdl",
//        endpointInterface = "pe.gob.osinergmin.soa.sms.ws.service.WsSMSPort")
//@Service(value = "wsSMSConsumer")
public class WsSMSConsumer implements WsSMSPort {

    private static final Logger LOGGER = LoggerFactory.getLogger(WsSMSConsumer.class);

    public static final String SERVICE_NAME = "WsSMSService";

    @Autowired
    private BaseWsSMSConsumer baseWsSMSConsumer;

    @Override
    public RecibeSMSRespParamTYPE recibeSMS(RecibeSMSReqParamTYPE in, ConsumidorTYPE consumidor) throws ComunFaultMsg {
        LOGGER.info(PropertiesUtils.APP_NAME + "Executing operation recibeSMS");
        final String operationName = "recibeSMS";
        try {
            return baseWsSMSConsumer.baseRecibeSMS(in, consumidor);
        } catch (ServiceException ex) {
            LOGGER.error(PropertiesUtils.APP_NAME + ex.getMessage(), ex);
            throw ExceptionBuilder.buildException(SERVICE_NAME, operationName, ex);
        }
    }

    @Override
    public EnviarSMSRespParamTYPE enviarSMS(EnviarSMSReqParamTYPE in, ConsumidorTYPE consumidor) throws ComunFaultMsg {
        LOGGER.info(PropertiesUtils.APP_NAME + "Executing operation enviarSMS");
        final String operationName = "enviarSMS";
        try {
            return baseWsSMSConsumer.baseEnviarSMS(in, consumidor);
        } catch (ServiceException ex) {
            LOGGER.error(PropertiesUtils.APP_NAME + ex.getMessage(), ex);
            throw ExceptionBuilder.buildException(SERVICE_NAME, operationName, ex);
        }
    }

}
