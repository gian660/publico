package pe.gob.osinergmin.soa.sms.thirdparty.ordenpedido.consumer;

import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import pe.gob.osinergmin.soa.sms.thirdparty.ordenpedido.OrdenPedidoPortType;
import pe.gob.osinergmin.soa.sms.thirdparty.ordenpedido.OrdenPedidoService;
import pe.gob.osinergmin.soa.sms.ws.service.exception.ServiceException;
import pe.gob.osinergmin.soa.sms.ws.util.PropertiesUtils;
import pe.gob.osinergmin.soa.sms.ws.util.enums.PropertiesEnum;
import pe.gob.osinergmin.soa.sms.ws.util.enums.exception.SMSErrorEnum;

/**
 *
 * @author otheo
 */
@Component(value = "ordenPedidoConsumer")
public class OrdenPedidoConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrdenPedidoConsumer.class);
    
    private static final String SCOP_ORDENSERVICIO_WSDL_URL = PropertiesUtils.getProperty(PropertiesEnum.SCOP_ORDENSERVICIO_WSDL_URL.getValue());
    private static final String SCOP_ORDENSERVICIO_WSDL_URL_DESA = PropertiesUtils.getProperty(PropertiesEnum.SCOP_ORDENSERVICIO_WSDL_URL_DESA.getValue());

    public String generarOrdenSimple(String cadena) throws ServiceException {
        String result = SMSErrorEnum.ERROR_9000.getMessage();
        try {
            OrdenPedidoService service = new OrdenPedidoService(new URL(SCOP_ORDENSERVICIO_WSDL_URL));
            OrdenPedidoPortType port = service.getOrdenPedidoPortTypePort();
            result = port.generarOrdenSimple(cadena);
        } catch (Exception ex) {
            LOGGER.error(PropertiesUtils.APP_NAME + ex.getMessage());
        }
        return result;
    }
    
    public String generarOrdenSimpleDesa(String cadena) throws ServiceException {
        String result = SMSErrorEnum.ERROR_9000.getMessage();
        try {
            OrdenPedidoService service = new OrdenPedidoService(new URL(SCOP_ORDENSERVICIO_WSDL_URL_DESA));
            OrdenPedidoPortType port = service.getOrdenPedidoPortTypePort();
            result = port.generarOrdenSimple(cadena);
        } catch (Exception ex) {
            LOGGER.error(PropertiesUtils.APP_NAME + ex.getMessage());
        }
        return result;
    }
}
