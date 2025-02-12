package pe.gob.osinergmin.soa.sms.ws.util.enums;

import pe.gob.osinergmin.soa.sms.ws.util.PropertiesUtils;

/**
 *
 * @author otheo
 */
public enum TipoTokenEnum {

    TK(PropertiesUtils.getProperty(PropertiesEnum.PREFIJO_TK.getValue())),
    SGP(PropertiesUtils.getProperty(PropertiesEnum.PREFIJO_SGP.getValue())),
    SCOP(PropertiesUtils.getProperty(PropertiesEnum.PREFIJO_SCOP.getValue())),
    PRC(PropertiesUtils.getProperty(PropertiesEnum.PREFIJO_PRC.getValue()));

    private final String nombre;

    private TipoTokenEnum(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static TipoTokenEnum fromName(String nombre) {
        if (nombre != null) {
            for (TipoTokenEnum tipoToken : TipoTokenEnum.values()) {
                if (tipoToken.getNombre().toUpperCase().equals(nombre.toUpperCase())) {
                    return tipoToken;
                }
            }
        }
        return null;
    }

    public static TipoTokenEnum getFromValidEnums(String token) {
        if (token != null) {
            for (TipoTokenEnum tipoToken : TipoTokenEnum.values()) {
                if (token.toUpperCase().startsWith(tipoToken.getNombre().toUpperCase())) {
                    return tipoToken;
                }
            }
        }
        return null;
    }

}
