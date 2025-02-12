package pe.gob.osinergmin.soa.sms.thirdparty.infobip.consumer;

import org.apache.cxf.common.util.Base64Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import pe.gob.osinergmin.soa.sms.ws.rest.dto.VoiceTtsResponseOutRO;
import pe.gob.osinergmin.soa.sms.ws.rest.dto.VoiceTtsSingleRequestInRO;
import pe.gob.osinergmin.soa.sms.ws.rest.dto.VoiceTtsVoiceInRO;
import pe.gob.osinergmin.soa.sms.ws.service.exception.ServiceException;
import pe.gob.osinergmin.soa.sms.ws.util.Constantes;
import pe.gob.osinergmin.soa.sms.ws.util.PropertiesUtils;
import pe.gob.osinergmin.soa.sms.ws.util.enums.PropertiesEnum;
import pe.gob.osinergmin.soa.sms.ws.util.enums.exception.SMSErrorEnum;

@Component(value = "infobipVoiceConsumer")
public class InfobipVoiceConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(InfobipVoiceConsumer.class);

    // infobip_voice_ws_url=https://api.infobip.com/tts/3/voiceMessages
    private static final String INFOBIP_VOICE_URL = 
        PropertiesUtils.getProperty("https://api.infobip.com/tts/3/voiceMessages");

    private static final String INFOBIP_WS_USER =
        PropertiesUtils.getProperty(PropertiesEnum.INFOBIP_WS_USER.getValue());
    private static final String INFOBIP_WS_PASSWORD =
        PropertiesUtils.getProperty(PropertiesEnum.INFOBIP_WS_PASSWORD.getValue());

    public Integer enviarMensajeVoz(String numeroTelefonico, String mensaje) throws ServiceException {
        Integer result = SMSErrorEnum.ERROR_9000.getCode();

        try {
            if (numeroTelefonico != null 
                    && !numeroTelefonico.trim().startsWith(Constantes.CODIGO_TELEFONICO_PERU)) {
                numeroTelefonico = Constantes.CODIGO_TELEFONICO_PERU + numeroTelefonico.trim();
            }

            String creds = INFOBIP_WS_USER + ":" + INFOBIP_WS_PASSWORD;
            String token = Base64Utility.encode(creds.getBytes());

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json");
            headers.add("Accept", "application/json");
            headers.add("Authorization", "Basic " + token);

            VoiceTtsSingleRequestInRO body = new VoiceTtsSingleRequestInRO();
            body.setText(mensaje);
            body.setLanguage("es");
            body.setFrom("Osinergmin");
            body.setTo(numeroTelefonico);
            
            // voice object
            VoiceTtsVoiceInRO voice = new VoiceTtsVoiceInRO();
            voice.setName("Joanna");
            voice.setGender("female");
            body.setVoice(voice);

            HttpEntity<VoiceTtsSingleRequestInRO> request = new HttpEntity<>(body, headers);

            RestTemplate restTemplate = new RestTemplate();
            VoiceTtsResponseOutRO response = restTemplate.postForObject(
                    INFOBIP_VOICE_URL,
                    request,
                    VoiceTtsResponseOutRO.class
            );

            if (response != null && response.getStatus() != null) {
                Integer groupId = response.getStatus().getGroupId();
                if (groupId != null && groupId >= 0) {
                    result = 0;
                } else {
                    result = SMSErrorEnum.ERROR_207.getCode();
                }
            } else {
                LOGGER.error("Respuesta nula o sin status al enviar Voice TTS");
                result = SMSErrorEnum.ERROR_9000.getCode();
            }

        } catch (Exception ex) {
            LOGGER.error("Error enviando TTS a Infobip: " + ex.getMessage(), ex);
        }

        return result;
    }
}
