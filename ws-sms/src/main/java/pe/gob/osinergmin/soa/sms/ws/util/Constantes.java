package pe.gob.osinergmin.soa.sms.ws.util;

public final class Constantes{
	
	//constantes de proveedores de servicios web de SMS
	public static final String SMS_WS_PROVIDER_INFOBIP = "I";
	public static final String SMS_WS_PROVIDER_TEDEXIS = "T";
	public static final String SMS_WS_PROVIDER_HOLACLIENTE = "H";
	
	public static String getSmsWsProviderHolacliente() {
		return SMS_WS_PROVIDER_HOLACLIENTE;
	}

	public String getSMS_WS_PROVIDER_INFOBIP() {
		return SMS_WS_PROVIDER_INFOBIP;
	}
	
	public String getSMS_WS_PROVIDER_TEDEXIS() {
		return SMS_WS_PROVIDER_TEDEXIS;
	}
	
	//constantes de códigos telefónicos de países
	public static final String CODIGO_TELEFONICO_PERU = "51";

	public String getCODIGO_TELEFONICO_PERU() {
		return CODIGO_TELEFONICO_PERU;
	}
	
}
