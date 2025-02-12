package pe.gob.osinergmin.soa.sms.ws.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pe.gob.osinergmin.soa.sms.thirdparty.infobip.consumer.InfobipVoiceConsumer;
import pe.gob.osinergmin.soa.sms.ws.service.exception.ServiceException;
import pe.gob.osinergmin.soa.sms.ws.util.StringUtils;

@RestController
@RequestMapping("/voice")
public class VoiceRestController {

    @Autowired
    private InfobipVoiceConsumer infobipVoiceConsumer;

    @PostMapping("/enviar")
    public ResponseEntity<?> enviarVoice(
            @RequestParam("numero") String numero,
            @RequestParam("mensaje") String mensaje) 
    {
        try {
            Integer resultado = infobipVoiceConsumer.enviarMensajeVoz(numero, mensaje);
            if (resultado != null && resultado == 0) {
                return ResponseEntity.ok("Mensaje TTS enviado correctamente.");
            } else {
                return new ResponseEntity<>(
                    "Error al enviar TTS. Código: " + resultado,
                    HttpStatus.INTERNAL_SERVER_ERROR
                );
            }
        } catch (Exception e) {
            return new ResponseEntity<>(
                "Excepción al enviar TTS: " + e.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }
}