package pe.gob.osinergmin.soa.sms.thirdparty.m4wsintsr.consumer;

import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import pe.gob.osinergmin.soa.sms.thirdparty.m4wsintsr.M4WSIntSR;
import pe.gob.osinergmin.soa.sms.thirdparty.m4wsintsr.M4WSIntSRPortType;
import pe.gob.osinergmin.soa.sms.ws.service.exception.ServiceException;
import pe.gob.osinergmin.soa.sms.ws.util.PropertiesUtils;
import pe.gob.osinergmin.soa.sms.ws.util.enums.PropertiesEnum;
import pe.gob.osinergmin.soa.sms.ws.util.enums.exception.SMSErrorEnum;

/**
 *
 * @author otheo
 */
@Component(value = "m4WSIntSRConsumer")
public class M4WSIntSRConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(M4WSIntSRConsumer.class);

    private static final String TEDEXIS_WSDL_URL = PropertiesUtils.getProperty(PropertiesEnum.TEDEXIS_WSDL_URL.getValue());
    private static final String TEDEXIS_PASSPORT = PropertiesUtils.getProperty(PropertiesEnum.TEDEXIS_PASSPORT.getValue());
    private static final String TEDEXIS_PASSWORD = PropertiesUtils.getProperty(PropertiesEnum.TEDEXIS_PASSWORD.getValue());

    public Integer enviarSMS(String numero, String mensaje) throws ServiceException {
        Integer result = SMSErrorEnum.ERROR_9000.getCode();
        try {
            M4WSIntSR service = new M4WSIntSR(new URL(TEDEXIS_WSDL_URL));
            M4WSIntSRPortType port = service.getM4WSIntSRHttpSoap12Endpoint();
            result = port.sendSMS(TEDEXIS_PASSPORT, TEDEXIS_PASSWORD, numero, mensaje);
        } catch (Exception ex) {
            LOGGER.error(PropertiesUtils.APP_NAME + ex.getMessage());
        }
        return result;
    }

}
