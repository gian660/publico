package pe.gob.osinergmin.soa.sms.ws.util.enums;

import pe.gob.osinergmin.soa.sms.ws.util.StringUtils;

/**
 *
 * @author otheo
 */
public enum PropertiesEnum {

    PREFIJO_TK("prefijo_TK"),
    PREFIJO_SGP("prefijo_SGP"),
    PREFIJO_PRC("prefijo_PRC"),
    PREFIJO_SCOP("prefijo_SCOP"),
    SMS_WS_PROVIDER("sms_ws_provider"),
    TEDEXIS_WSDL_URL("tedexis_wsdl_url"),
    TEDEXIS_PASSPORT("tedexis_passport"),
    TEDEXIS_PASSWORD("tedexis_password"),
    INFOBIP_WS_URL("infobip_ws_url"),
    INFOBIP_WS_USER("infobip_ws_user"),
    INFOBIP_WS_PASSWORD("infobip_ws_password"),    	
    SCOP_ORDENSERVICIO_WSDL_URL("scop_ordenservicio_wsdl_url"),
    SCOP_ORDENSERVICIO_WSDL_URL_DESA("scop_ordenservicio_wsdl_url_desa"),
    PRECIOS_WSDL_URL("precios_wsdl_url"),
    SARGOP_WSDL_URL("sargop_wsdl_url"),
    SARGOP_RECIBE_SMS("sargop_recibe_sms_url"),
    
    HOLACLIENTE_WS_URL("holacliente.ws.url"),
    HOLACLIENTE_WS_USER("holacliente.ws.user"),
    HOLACLIENTE_WS_PASSWORD("holacliente.ws.password"), ;

    private final String value;

    private PropertiesEnum(String value) {
        this.value = value;
    }

    public static PropertiesEnum from(String value) {
        if (!StringUtils.isEmpty(value)) {
            for (PropertiesEnum e : PropertiesEnum.values()) {
                if (e.getValue().equals(value)) {
                    return e;
                }
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

}
