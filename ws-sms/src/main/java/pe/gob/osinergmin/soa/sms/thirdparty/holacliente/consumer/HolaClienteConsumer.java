package pe.gob.osinergmin.soa.sms.thirdparty.holacliente.consumer;

import java.net.HttpURLConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import pe.gob.osinergmin.soa.sms.ws.service.exception.ServiceException;
import pe.gob.osinergmin.soa.sms.ws.util.Constantes;
import pe.gob.osinergmin.soa.sms.ws.util.PropertiesUtils;
import pe.gob.osinergmin.soa.sms.ws.util.enums.PropertiesEnum;
import pe.gob.osinergmin.soa.sms.ws.util.enums.exception.SMSErrorEnum;

@Component(value = "holaclienteConsumer")
public class HolaClienteConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(HolaClienteConsumer.class);

	private static final String HOLACLIENTE_WS_URL = PropertiesUtils.getProperty(PropertiesEnum.HOLACLIENTE_WS_URL.getValue());
    private static final String HOLACLIENTE_WS_USER = PropertiesUtils.getProperty(PropertiesEnum.HOLACLIENTE_WS_USER.getValue());
    private static final String HOLACLIENTE_WS_PASSWORD = PropertiesUtils.getProperty(PropertiesEnum.HOLACLIENTE_WS_PASSWORD.getValue());

    public Integer enviarSMS(String numeroTelefonico, String mensaje) throws ServiceException {
        Integer result = SMSErrorEnum.ERROR_9000.getCode();
        try{
            if(numeroTelefonico != null && !numeroTelefonico.trim().toLowerCase().startsWith(Constantes.CODIGO_TELEFONICO_PERU)){
        		numeroTelefonico = Constantes.CODIGO_TELEFONICO_PERU + numeroTelefonico.trim();
			}
            
			String URL = HOLACLIENTE_WS_URL + "?user=" + HOLACLIENTE_WS_USER.trim() + "&password=" + HOLACLIENTE_WS_PASSWORD.trim()
				+ "&SMSText=" + mensaje + "&GSM=" + numeroTelefonico + "&tag=" + "GSTI"; 
			
			//Ejecutamos la función que envía los parámetros a nuestro API 
			String resultado = excutePost(URL); 
			if(Double.parseDouble(resultado) >= 0){
				result = 0;
			}else{
				result = Integer.parseInt(resultado);
			}
			LOGGER.info(resultado);
			//Función para él envió de datos y captura de respuesta
				 
        }catch(Exception ex) {
            LOGGER.error(PropertiesUtils.APP_NAME + ex.getMessage());
        }
        return result;
    }

	public static String excutePost(String targetURL) { 
		HttpURLConnection connection = null; 
		String resultado = "";
		try { 
			//Inicia 
			OkHttpClient client = new OkHttpClient().newBuilder().build();
			Request request = new Request.Builder().url(targetURL).build();
			Response response = client.newCall(request).execute();
			resultado = response.body().string();
		} catch (Exception e) { 
					e.printStackTrace(); return null; 
		} finally {
			if(connection != null) { 
				connection.disconnect(); 
			} 
		} 
		return resultado;
	}

}
