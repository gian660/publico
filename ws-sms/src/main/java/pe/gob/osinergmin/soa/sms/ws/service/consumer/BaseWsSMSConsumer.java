package pe.gob.osinergmin.soa.sms.ws.service.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.gob.osinergmin.soa.sms.thirdparty.holacliente.consumer.HolaClienteConsumer;
import pe.gob.osinergmin.soa.sms.thirdparty.infobip.consumer.InfobipConsumer;
import pe.gob.osinergmin.soa.sms.thirdparty.m4wsintsr.consumer.M4WSIntSRConsumer;
import pe.gob.osinergmin.soa.sms.thirdparty.ordenpedido.consumer.OrdenPedidoConsumer;
import pe.gob.osinergmin.soa.sms.ws.schema.EnviarSMSReqParamTYPE;
import pe.gob.osinergmin.soa.sms.ws.schema.EnviarSMSRespParamTYPE;
import pe.gob.osinergmin.soa.sms.ws.schema.RecibeSMSReqParamTYPE;
import pe.gob.osinergmin.soa.sms.ws.schema.RecibeSMSRespParamTYPE;
import pe.gob.osinergmin.soa.sms.ws.schema.comun.consumidor.ConsumidorTYPE;
import pe.gob.osinergmin.soa.sms.ws.service.exception.ServiceException;
import pe.gob.osinergmin.soa.sms.ws.util.Constantes;
import pe.gob.osinergmin.soa.sms.ws.util.PropertiesUtils;
import pe.gob.osinergmin.soa.sms.ws.util.StringUtils;
import pe.gob.osinergmin.soa.sms.ws.util.enums.TipoTokenEnum;
import pe.gob.osinergmin.soa.sms.ws.util.enums.exception.SMSErrorEnum;
/**
 *
 * @author otheo
 */
@Component(value = "baseWsSMSConsumer")
public class BaseWsSMSConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseWsSMSConsumer.class);

    @Autowired
    private InfobipConsumer infobipConsumer;
    @Autowired
    private M4WSIntSRConsumer m4WSIntSRConsumer;

    @Autowired
    private HolaClienteConsumer holaClienteConsumer;
    
    @Autowired
    private OrdenPedidoConsumer ordenPedidoConsumer;
    @Autowired
    private SargopConsumer sargopConsumer;
    //@Autowired
    //private PreciosConsumer preciosConsumer;
    
    //private static final String SMS_WS_PROVIDER = PropertiesUtils.getProperty(PropertiesEnum.SMS_WS_PROVIDER.getValue());
    private static final String SMS_WS_PROVIDER = "H";

    public RecibeSMSRespParamTYPE baseRecibeSMS(RecibeSMSReqParamTYPE in, ConsumidorTYPE consumidor) throws ServiceException {
        RecibeSMSRespParamTYPE _result = new RecibeSMSRespParamTYPE();

        if (in.getNumRem() == null) {
            // numero de remitente vacio
            throw new ServiceException(SMSErrorEnum.ERROR_1000);
        }
        if (StringUtils.isEmpty(in.getMensaje())) {
            // mensaje vacio
            throw new ServiceException(SMSErrorEnum.ERROR_1001);
        }

        String[] mensajeArr = in.getMensaje().split("\\s+");

        TipoTokenEnum tipoTokenEnum = TipoTokenEnum.getFromValidEnums(mensajeArr[0]);

        if (tipoTokenEnum == null) {
            // codigo de solicitud no valido
            _result.setResult(SMSErrorEnum.ERROR_1002.getMessage());
            LOGGER.error(PropertiesUtils.APP_NAME + SMSErrorEnum.ERROR_1002.getMessage());
            return _result;
        }

        if (mensajeArr.length < 2) {
            // mensaje despues del codigo de solicitud esta vacio
            _result.setResult(SMSErrorEnum.ERROR_1003.getMessage());
            LOGGER.error(PropertiesUtils.APP_NAME + SMSErrorEnum.ERROR_1003.getMessage());
            return _result;
        }
        System.out.println("recibeSMS - Prueba 2");
        String result = null;
        switch (tipoTokenEnum) {
            case TK:
            case SGP:
                LOGGER.info(PropertiesUtils.APP_NAME + "Llamando a servicio de SARGOP WS");
                result = sargopConsumer.recibeSMS(in.getNumRem().toString(), in.getMensaje());
                break;
            case SCOP:
                LOGGER.info(PropertiesUtils.APP_NAME + "Llamando a servicio de SCOP Orden Pedido");
                String msg = in.getNumRem().toString() + "|" + mensajeArr[1];
                result = ordenPedidoConsumer.generarOrdenSimple(msg);
                break;
            case PRC:
                LOGGER.info(PropertiesUtils.APP_NAME + "Llamando a servicio de SCOP Orden Pedido (Desarrollo)");
                String msgDesa = in.getNumRem().toString() + "|" + mensajeArr[1];
                result = ordenPedidoConsumer.generarOrdenSimpleDesa(msgDesa);
//                LOGGER.info(PropertiesUtils.APP_NAME + "Llamando a servicio de PRECIOS")
                //BaseDTO dto = preciosConsumer.registraPrecio(in.getNumRem().toString(), in.getMensaje());
                //result = dto.getMensaje();
                break;
        }
        
        /*Envio de SMS al registrar*/
        LOGGER.info(PropertiesUtils.APP_NAME + "Llamado al servicio de enviar SMS");
        EnviarSMSReqParamTYPE inEnviar = new EnviarSMSReqParamTYPE();
        inEnviar.setNumero(String.valueOf(in.getNumRem()));
        inEnviar.setTexto(result);
        baseEnviarSMS_INFOBIP(inEnviar, new ConsumidorTYPE());

        _result.setResult(result);
        return _result;
    }

    public EnviarSMSRespParamTYPE baseEnviarSMS_INFOBIP(EnviarSMSReqParamTYPE in, ConsumidorTYPE consumidor) throws ServiceException {
        EnviarSMSRespParamTYPE _result = new EnviarSMSRespParamTYPE();

        if (StringUtils.isEmpty(in.getNumero())) {
            // numero de remitente vacio
            throw new ServiceException(SMSErrorEnum.ERROR_1000);
        }
        if (StringUtils.isEmpty(in.getTexto())) {
            // mensaje vacio
            throw new ServiceException(SMSErrorEnum.ERROR_1001);
        }
        Integer result = null;
        System.out.println("recibeSMS - Prueba 3");
        result = infobipConsumer.enviarSMS(in.getNumero(), in.getTexto());
        _result.setCodigo(result.toString());
        _result.setMensaje(SMSErrorEnum.fromValue(result).getMessage());

        return _result;
    }

    public EnviarSMSRespParamTYPE baseEnviarSMS(EnviarSMSReqParamTYPE in, ConsumidorTYPE consumidor) throws ServiceException {
        EnviarSMSRespParamTYPE _result = new EnviarSMSRespParamTYPE();

        if (StringUtils.isEmpty(in.getNumero())) {
            // numero de remitente vacio
            throw new ServiceException(SMSErrorEnum.ERROR_1000);
        }
        if (StringUtils.isEmpty(in.getTexto())) {
            // mensaje vacio
            throw new ServiceException(SMSErrorEnum.ERROR_1001);
        }
        Integer result = null;
        if(SMS_WS_PROVIDER.equals(Constantes.SMS_WS_PROVIDER_INFOBIP)){
        	result = infobipConsumer.enviarSMS(in.getNumero(), in.getTexto());
        }else if(SMS_WS_PROVIDER.equals(Constantes.SMS_WS_PROVIDER_TEDEXIS)){
        	result = m4WSIntSRConsumer.enviarSMS(in.getNumero(), in.getTexto());
        }else if(SMS_WS_PROVIDER.equals(Constantes.SMS_WS_PROVIDER_HOLACLIENTE)){
        	result = holaClienteConsumer.enviarSMS(in.getNumero(), in.getTexto());
        }
        _result.setCodigo(result.toString());
        _result.setMensaje(SMSErrorEnum.fromValue(result).getMessage());

        return _result;
    }

}
