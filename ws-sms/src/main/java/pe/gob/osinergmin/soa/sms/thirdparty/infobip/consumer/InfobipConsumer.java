package pe.gob.osinergmin.soa.sms.thirdparty.infobip.consumer;

import org.apache.cxf.common.util.Base64Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import pe.gob.osinergmin.soa.sms.thirdparty.infobip.dto.SmsSendingResponseDetailsOutRO;
import pe.gob.osinergmin.soa.sms.thirdparty.infobip.dto.SmsSendingResponseOutRO;
import pe.gob.osinergmin.soa.sms.thirdparty.infobip.dto.SmsSendingSingleRequestInRO;
import pe.gob.osinergmin.soa.sms.thirdparty.infobip.dto.VoiceTtsResponseDetailsOutRO;
import pe.gob.osinergmin.soa.sms.thirdparty.infobip.dto.VoiceTtsResponseOutRO;
import pe.gob.osinergmin.soa.sms.ws.rest.dto.VoiceTtsSingleRequestInRO;
import pe.gob.osinergmin.soa.sms.ws.rest.dto.VoiceTtsVoiceInRO;
import pe.gob.osinergmin.soa.sms.ws.service.exception.ServiceException;
import pe.gob.osinergmin.soa.sms.ws.util.Constantes;
import pe.gob.osinergmin.soa.sms.ws.util.PropertiesUtils;
import pe.gob.osinergmin.soa.sms.ws.util.enums.PropertiesEnum;
import pe.gob.osinergmin.soa.sms.ws.util.enums.exception.SMSErrorEnum;

@Component(value = "infobipConsumer")
public class InfobipConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(InfobipConsumer.class);

    private static final String INFOBIP_WS_URL = PropertiesUtils.getProperty(PropertiesEnum.INFOBIP_WS_URL.getValue());
    private static final String INFOBIP_WS_USER = PropertiesUtils.getProperty(PropertiesEnum.INFOBIP_WS_USER.getValue());
    private static final String INFOBIP_WS_PASSWORD = PropertiesUtils.getProperty(PropertiesEnum.INFOBIP_WS_PASSWORD.getValue());

    public Integer enviarSMS(String numeroTelefonico, String mensaje) throws ServiceException {
		System.out.println("infobipConsumer enviarSMS");
        Integer result = SMSErrorEnum.ERROR_9000.getCode();
        try{
            if(numeroTelefonico != null && !numeroTelefonico.trim().toLowerCase().startsWith(Constantes.CODIGO_TELEFONICO_PERU)){
        		numeroTelefonico = Constantes.CODIGO_TELEFONICO_PERU + numeroTelefonico.trim();
			}
            
        	String credenciales = INFOBIP_WS_USER + ":" + INFOBIP_WS_PASSWORD;
        	String token = Base64Utility.encode(credenciales.getBytes());
        	
        	HttpHeaders headers = new HttpHeaders();
        	headers.add("Content-Type", "application/json");
        	headers.add("Accept", "application/json");
        	headers.add("Authorization", "Basic " + token);
        	
        	SmsSendingSingleRequestInRO smsSendingSingleRequestInRO = new SmsSendingSingleRequestInRO();
        	smsSendingSingleRequestInRO.setFrom("Osinergmin");
        	smsSendingSingleRequestInRO.setTo(numeroTelefonico);
        	smsSendingSingleRequestInRO.setText(mensaje);
        	
        	HttpEntity<SmsSendingSingleRequestInRO> inputEntity = new HttpEntity<SmsSendingSingleRequestInRO>(smsSendingSingleRequestInRO, headers);
        	
            RestTemplate restTemplate = new RestTemplate();
            SmsSendingResponseOutRO smsSendingResponseOutRO = restTemplate.postForObject(INFOBIP_WS_URL, inputEntity, SmsSendingResponseOutRO.class);
            boolean allMessagesOk = true;
            if(smsSendingResponseOutRO != null && smsSendingResponseOutRO.getMessages() != null && smsSendingResponseOutRO.getMessages().size() > 0){
            	for(SmsSendingResponseDetailsOutRO smsSendingResponseDetailsOutRO : smsSendingResponseOutRO.getMessages()){
            		if(smsSendingResponseDetailsOutRO != null && smsSendingResponseDetailsOutRO.getStatus() != null && smsSendingResponseDetailsOutRO.getStatus().getGroupId() != null){
            			if(smsSendingResponseDetailsOutRO.getStatus().getGroupId().intValue() == SMSErrorEnum.GRUPO_ESTADO_INFOBIP_0.getCode().intValue()){
            				//Para Tedexis esto sería un OK
            			}else if(smsSendingResponseDetailsOutRO.getStatus().getGroupId().intValue() == SMSErrorEnum.GRUPO_ESTADO_INFOBIP_1.getCode().intValue()){
            				//Para Tedexis esto sería un OK
            			}else if(smsSendingResponseDetailsOutRO.getStatus().getGroupId().intValue() == SMSErrorEnum.GRUPO_ESTADO_INFOBIP_2.getCode().intValue()){
            				result = SMSErrorEnum.ERROR_207.getCode();
            				allMessagesOk = false;
            				break;
            			}else if(smsSendingResponseDetailsOutRO.getStatus().getGroupId().intValue() == SMSErrorEnum.GRUPO_ESTADO_INFOBIP_3.getCode().intValue()){
            				//Para Tedexis esto sería un OK
            			}else if(smsSendingResponseDetailsOutRO.getStatus().getGroupId().intValue() == SMSErrorEnum.GRUPO_ESTADO_INFOBIP_4.getCode().intValue()){
            				//No existe código en Tedexis para esto
            				allMessagesOk = false;
            				break;
            			}else if(smsSendingResponseDetailsOutRO.getStatus().getGroupId().intValue() == SMSErrorEnum.GRUPO_ESTADO_INFOBIP_5.getCode().intValue()){
            				result = SMSErrorEnum.ERROR_107.getCode();
            				allMessagesOk = false;
            				break;
            			}
            		}else{
            			break;
            		}
            	}
            	if(allMessagesOk){
            		result = new Integer(0);
            	}
            }
        }catch(Exception ex) {
			System.out.println(ex.getMessage());
            LOGGER.error(PropertiesUtils.APP_NAME + ex.getMessage());
        }
        return result;
    }
    
    public Integer enviarVoice(String numeroTelefonico, String mensaje) throws ServiceException {
        System.out.println("infobipConsumer enviarVoice");
        Integer result = SMSErrorEnum.ERROR_9000.getCode();

        try {
            if (numeroTelefonico != null && !numeroTelefonico.trim().toLowerCase().startsWith(Constantes.CODIGO_TELEFONICO_PERU)) {
                numeroTelefonico = Constantes.CODIGO_TELEFONICO_PERU + numeroTelefonico.trim();
            }

            String credenciales = INFOBIP_WS_USER + ":" + INFOBIP_WS_PASSWORD;
            String token = Base64Utility.encode(credenciales.getBytes());

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json");
            headers.add("Accept", "application/json");
            headers.add("Authorization", "Basic " + token);

            VoiceTtsSingleRequestInRO voiceRequest = new VoiceTtsSingleRequestInRO();
            voiceRequest.setFrom("Osinergmin");
            voiceRequest.setTo(numeroTelefonico);
            voiceRequest.setText(mensaje);
            voiceRequest.setLanguage("es");

            VoiceTtsVoiceInRO voice = new VoiceTtsVoiceInRO();
            voice.setName("Lucia");
            voice.setGender("female");
            voiceRequest.setVoice(voice);

            HttpEntity<VoiceTtsSingleRequestInRO> inputEntity = new HttpEntity<>(voiceRequest, headers);

            RestTemplate restTemplate = new RestTemplate();
            VoiceTtsResponseOutRO voiceResponse = restTemplate.postForObject("https://api.infobip.com/tts/3/voiceMessages", inputEntity, VoiceTtsResponseOutRO.class);

            boolean allMessagesOk = true;

            if (voiceResponse != null && voiceResponse.getMessages() != null && !voiceResponse.getMessages().isEmpty()) {
                for (VoiceTtsResponseDetailsOutRO voiceDetails : voiceResponse.getMessages()) {
                    if (voiceDetails != null && voiceDetails.getStatus() != null && voiceDetails.getStatus().getGroupId() != null) {
                        if (voiceDetails.getStatus().getGroupId().intValue() == SMSErrorEnum.GRUPO_ESTADO_INFOBIP_0.getCode().intValue()) {
                            // OK
                        } else if (voiceDetails.getStatus().getGroupId().intValue() == SMSErrorEnum.GRUPO_ESTADO_INFOBIP_1.getCode().intValue()) {
                            // OK
                        } else if (voiceDetails.getStatus().getGroupId().intValue() == SMSErrorEnum.GRUPO_ESTADO_INFOBIP_2.getCode().intValue()) {
                            result = SMSErrorEnum.ERROR_207.getCode();
                            allMessagesOk = false;
                            break;
                        } else if (voiceDetails.getStatus().getGroupId().intValue() == SMSErrorEnum.GRUPO_ESTADO_INFOBIP_3.getCode().intValue()) {
                            // OK
                        } else if (voiceDetails.getStatus().getGroupId().intValue() == SMSErrorEnum.GRUPO_ESTADO_INFOBIP_4.getCode().intValue()) {
                            // Código desconocido
                            allMessagesOk = false;
                            break;
                        } else if (voiceDetails.getStatus().getGroupId().intValue() == SMSErrorEnum.GRUPO_ESTADO_INFOBIP_5.getCode().intValue()) {
                            result = SMSErrorEnum.ERROR_107.getCode();
                            allMessagesOk = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (allMessagesOk) {
                    result = 0; // Indica éxito
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            LOGGER.error(PropertiesUtils.APP_NAME + ex.getMessage());
        }
        return result;
    }


}
