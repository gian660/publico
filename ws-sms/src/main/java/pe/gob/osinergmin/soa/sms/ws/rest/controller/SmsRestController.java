package pe.gob.osinergmin.soa.sms.ws.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import pe.gob.osinergmin.soa.sms.thirdparty.holacliente.consumer.HolaClienteConsumer;
import pe.gob.osinergmin.soa.sms.thirdparty.infobip.consumer.InfobipConsumer;
import pe.gob.osinergmin.soa.sms.thirdparty.m4wsintsr.consumer.M4WSIntSRConsumer;
import pe.gob.osinergmin.soa.sms.thirdparty.ordenpedido.consumer.OrdenPedidoConsumer;
//import pe.gob.osinergmin.soa.sms.ws.dto.BaseDTO;
import pe.gob.osinergmin.soa.sms.ws.rest.dto.SmsReceivingRequestInRO;
import pe.gob.osinergmin.soa.sms.ws.rest.dto.SmsReceivingRequestResultInRO;
import pe.gob.osinergmin.soa.sms.ws.rest.dto.SmsReceivingRequestResultPriceInRO;
import pe.gob.osinergmin.soa.sms.ws.rest.dto.SmsReceivingResponseOutRO;
//import pe.gob.osinergmin.soa.sms.ws.schema.EnviarSMSReqParamTYPE;
//import pe.gob.osinergmin.soa.sms.ws.schema.comun.consumidor.ConsumidorTYPE;
//import pe.gob.osinergmin.soa.sms.ws.service.consumer.BaseWsSMSConsumer;
//import pe.gob.osinergmin.soa.sms.ws.service.consumer.PreciosConsumer;
import pe.gob.osinergmin.soa.sms.ws.service.consumer.SargopConsumer;
import pe.gob.osinergmin.soa.sms.ws.service.exception.ServiceException;
import pe.gob.osinergmin.soa.sms.ws.util.Constantes;
import pe.gob.osinergmin.soa.sms.ws.util.PropertiesUtils;
import pe.gob.osinergmin.soa.sms.ws.util.StringUtils;
import pe.gob.osinergmin.soa.sms.ws.util.enums.TipoTokenEnum;
import pe.gob.osinergmin.soa.sms.ws.util.enums.exception.SMSErrorEnum;

@RestController("smsRestController")
@RequestMapping("/sms")
public class SmsRestController {

	@Autowired
    private OrdenPedidoConsumer ordenPedidoConsumer;
    @Autowired
    private SargopConsumer sargopConsumer;
//    @Autowired
//    private PreciosConsumer preciosConsumer;
    @Autowired
    private InfobipConsumer infobipConsumer;
    @Autowired
    private M4WSIntSRConsumer m4WSIntSRConsumer;
	@Autowired
    private HolaClienteConsumer holaClienteConsumer;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(SmsRestController.class);
    
    //private static final String SMS_WS_PROVIDER = PropertiesUtils.getProperty(PropertiesEnum.SMS_WS_PROVIDER.getValue());

	private static final String SMS_WS_PROVIDER = "H";
    
    @RequestMapping(value = "/recibir", method = RequestMethod.POST)
    public ResponseEntity<SmsReceivingResponseOutRO> recibir(@RequestBody JsonNode smsReceivingRequestInRO) {
    	LOGGER.info("Beginning requestMapping /sms/recibir");
    	SmsReceivingResponseOutRO smsReceivingResponseOutRO = new SmsReceivingResponseOutRO();
    	
    	SmsReceivingRequestInRO objectIn = new SmsReceivingRequestInRO();
    	
		SmsReceivingRequestResultInRO resultReceiving = new SmsReceivingRequestResultInRO();
		SmsReceivingRequestResultPriceInRO priceReceiving = new SmsReceivingRequestResultPriceInRO();
		resultReceiving.setPrice(priceReceiving);
		objectIn.setResults(resultReceiving);

    	try {
    		JsonNode jnResult = smsReceivingRequestInRO.get("results");
	    	if(jnResult.toString().length()>0) {
			    	if (jnResult.isArray()) {
			    	    for (final JsonNode objNode : jnResult) {
		
			        		resultReceiving.setFrom(tratamientoNumero(objNode.get("from").asText()));
			        		resultReceiving.setText(objNode.get("text").asText());
		
			        		try {
				        		resultReceiving.setMessageID(objNode.get("messageId").asText());
				        		resultReceiving.setTo(objNode.get("to").asText());
				        		resultReceiving.setCleanText(objNode.get("cleanText").asText());
				        		resultReceiving.setKeyword(objNode.get("keyword").asText());
				        		resultReceiving.setReceivedAt(objNode.get("receivedAt").asText());
				        		resultReceiving.setSmsCount(objNode.get("smsCount").asText());
				        		resultReceiving.setCallbackData(objNode.get("callbackData").asText());
				        		JsonNode jnPrice = objNode.get("price");
				        		priceReceiving.setPricePerMessage(jnPrice.get("pricePerMessage").asText());
				        		priceReceiving.setCurrency(jnPrice.get("currency").asText());
				        		resultReceiving.setPrice(priceReceiving);
			        		}catch (Exception e) {
			        			LOGGER.error("Error obtener campos adicionales Price "+e.toString());
							}
			        		objectIn.setResults(resultReceiving);
			    	    }
			    	}
			    	try {
			    		objectIn.setMessageCount(smsReceivingRequestInRO.get("messageCount").asText());
			    		objectIn.setPendingMessageCount(smsReceivingRequestInRO.get("pendingMessageCount").asText());
			    	}catch(Exception e) {
		    			LOGGER.error("Error obtener campos adicionales"+e.toString());
			    	}
	    	}
    	}catch (Exception e) {
			LOGGER.error("Error obtener campos results "+e.toString());
		}
        
    	Integer errorCode = null;
    	try{
    		String numeroTelefonico = objectIn.getResults().getFrom(); 
    		String mensaje = objectIn.getResults().getText(); 
    		if(numeroTelefonico == null || numeroTelefonico.trim().equals("")){
    			errorCode = SMSErrorEnum.ERROR_1000.getCode();
    			throw new Exception("");
            }
            if(mensaje == null || mensaje.trim().equals("")){
            	errorCode = SMSErrorEnum.ERROR_1001.getCode();
            	throw new Exception("");
            }
            numeroTelefonico = numeroTelefonico.trim();
            mensaje = mensaje.trim();

            String[] mensajeArr = objectIn.getResults().getText().trim().split("\\s+");
            TipoTokenEnum tipoTokenEnum = TipoTokenEnum.getFromValidEnums(mensajeArr[0]);
            if(tipoTokenEnum == null){
            	errorCode = SMSErrorEnum.ERROR_1002.getCode();
                throw new Exception("");
            }
            if(mensajeArr.length < 2){
            	errorCode = SMSErrorEnum.ERROR_1003.getCode();
                throw new Exception("");
            }

            String result = null;
            switch(tipoTokenEnum){
                case TK:
                case SGP:
                    LOGGER.info(PropertiesUtils.APP_NAME + "Llamando a servicio de SARGOP WS");
                    result = sargopConsumer.recibeSMS(numeroTelefonico, mensaje);
                    break;
                case SCOP:
                    LOGGER.info(PropertiesUtils.APP_NAME + "Llamando a servicio de SCOP Orden Pedido");
                    String msg = numeroTelefonico + "|" + mensajeArr[1];
                    result = ordenPedidoConsumer.generarOrdenSimple(msg);
                    break;
                case PRC:
                    LOGGER.info(PropertiesUtils.APP_NAME + "Llamando a servicio de SCOP Orden Pedido (desarrollo)");
                    String msgDesa = numeroTelefonico + "|" + mensajeArr[1];
                    result = ordenPedidoConsumer.generarOrdenSimpleDesa(msgDesa);
//                    LOGGER.info(PropertiesUtils.APP_NAME + "Llamando a servicio de PRECIOS");
//                    BaseDTO dto = preciosConsumer.registraPrecio(numeroTelefonico, mensaje);
//                    result = dto.getMensaje();
                    break;
            }
            
            /*Envio de SMS al registrar*/
            LOGGER.info(PropertiesUtils.APP_NAME + "Llamado al servicio de enviar SMS");
            enviarSMS_INFOBIP(String.valueOf(objectIn.getResults().getFrom()),result);

            smsReceivingResponseOutRO.setResult(result);
    	}catch(Exception ex){
    		if(errorCode == null){
    			errorCode = SMSErrorEnum.ERROR_9000.getCode();
    		}
    		String mensajeError = SMSErrorEnum.fromValue(errorCode).getMessage();
    		LOGGER.error(PropertiesUtils.APP_NAME + mensajeError);
    		smsReceivingResponseOutRO.setResult(mensajeError);
    	}
    	LOGGER.info("Ending requestMapping /sms/recibir");
        return new ResponseEntity<SmsReceivingResponseOutRO>(smsReceivingResponseOutRO, HttpStatus.OK);
    }
    
    private String tratamientoNumero(String numero) {
    	String codPaismas = numero.substring(0,3);
    	if(codPaismas.equals("+51")){
    		numero = numero.substring(3,numero.length());
        	return numero;
    	}
    	String codPais = numero.substring(0,2);
    	if(codPais.equals("51")) {
    		numero = numero.substring(2,numero.length());
        	return numero;
    	}
    	return numero;
    }
    
	private void enviarSMS_INFOBIP(String numero, String texto) throws ServiceException  {
    	if (StringUtils.isEmpty(numero)){
            // numero de remitente vacio
            throw new ServiceException(SMSErrorEnum.ERROR_1000);
        }
        if (StringUtils.isEmpty(texto)){
            // mensaje vacio
            throw new ServiceException(SMSErrorEnum.ERROR_1001);
        }

        Integer result = null;
        System.out.println("enviarSMS_INFOBIP");
        result = infobipConsumer.enviarSMS(numero, texto);
    }

    private void enviarSMS(String numero, String texto) throws ServiceException  {
    	if (StringUtils.isEmpty(numero)){
            // numero de remitente vacio
            throw new ServiceException(SMSErrorEnum.ERROR_1000);
        }
        if (StringUtils.isEmpty(texto)){
            // mensaje vacio
            throw new ServiceException(SMSErrorEnum.ERROR_1001);
        }

        Integer result = null;
        if(SMS_WS_PROVIDER.equals(Constantes.SMS_WS_PROVIDER_INFOBIP)){
        	result = infobipConsumer.enviarSMS(numero, texto);
        }
		else if(SMS_WS_PROVIDER.equals(Constantes.SMS_WS_PROVIDER_TEDEXIS)){
        	result = m4WSIntSRConsumer.enviarSMS(numero, texto);
        }
		else if(SMS_WS_PROVIDER.equals(Constantes.SMS_WS_PROVIDER_HOLACLIENTE)){
        	result = holaClienteConsumer.enviarSMS(numero, texto);
        }
    }

}
