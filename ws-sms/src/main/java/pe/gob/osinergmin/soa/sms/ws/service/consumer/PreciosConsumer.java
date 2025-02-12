package pe.gob.osinergmin.soa.sms.ws.service.consumer;

//import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
//import pe.gob.osinergmin.precios.service.ws.ErrorMsg;
//import pe.gob.osinergmin.precios.service.ws.PreciosPT;
//import pe.gob.osinergmin.precios.service.ws.PreciosService;
//import pe.gob.osinergmin.precios.service.ws.precios.schema.RegistrarPrecioRequestType;
//import pe.gob.osinergmin.precios.service.ws.precios.schema.RegistrarPrecioResponseType;
//import pe.gob.osinergmin.soa.schema.comun.consumidor.ConsumidorTYPE;
import pe.gob.osinergmin.soa.sms.ws.dto.BaseDTO;
import pe.gob.osinergmin.soa.sms.ws.service.exception.ServiceException;
import pe.gob.osinergmin.soa.sms.ws.util.PropertiesUtils;
//import pe.gob.osinergmin.soa.sms.ws.util.enums.PropertiesEnum;

/**
 *
 * @author otheo
 */
@Component(value = "preciosConsumer")
public class PreciosConsumer {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PreciosConsumer.class);
    
//    private static final String PRECIOS_WSDL_URL = PropertiesUtils.getProperty(PropertiesEnum.PRECIOS_WSDL_URL.getValue());
    
    public BaseDTO registraPrecio(String numero, String mensaje) throws ServiceException {
        BaseDTO result = new BaseDTO();
        try {
            //PreciosService service = new PreciosService(new URL(PRECIOS_WSDL_URL));
            //PreciosPT port = service.getPreciosPTPort();
            //RegistrarPrecioRequestType in = new RegistrarPrecioRequestType();
            //in.setNumero(numero);
            //in.setTexto(mensaje);
            // RegistrarPrecioResponseType out = port.registrarPrecio(in, new ConsumidorTYPE());
            result.setError(false);
            //result.setMensaje(out.getCodigoTransaccion());
        } catch (Exception ex) {
            String msje = "Error al llamar Web Service registraPrecio";
            LOGGER.error(PropertiesUtils.APP_NAME + msje, ex);
            result.setError(true);
            //if (ex instanceof ErrorMsg) {
            //    result.setMensaje(ex.getMessage());
            //} else {
            //    result.setMensaje(msje);
            //}
        }
        return result;
    }
    
}
