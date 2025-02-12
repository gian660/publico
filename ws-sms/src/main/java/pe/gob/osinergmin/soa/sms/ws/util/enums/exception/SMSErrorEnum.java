package pe.gob.osinergmin.soa.sms.ws.util.enums.exception;

/**
 *
 * @author otheo
 */
public enum SMSErrorEnum {

	//grupos de estado de Infobip
	GRUPO_ESTADO_INFOBIP_0(0, "Aceptado"),
	GRUPO_ESTADO_INFOBIP_1(1, "Pendiente"),
	GRUPO_ESTADO_INFOBIP_2(2, "No entregado"),
	GRUPO_ESTADO_INFOBIP_3(3, "Entregado"),
	GRUPO_ESTADO_INFOBIP_4(4, "Expirado"),
	GRUPO_ESTADO_INFOBIP_5(5, "Rechazado"),
    // -603 al 0 son del Web Service de Tedexis :
    ERROR_603(-603, "MO ya contestado."),
    ERROR_602(-602, "Destino de respuesta no coincide."),
    ERROR_601(-601, "Id mensaje no v\u00E1lido."),
    ERROR_302(-302, "Anti flood activado."),
    ERROR_301(-301, "Sin saldo suficiente."),
    ERROR_300(-300, "Pasaporte o password nulo."),
    ERROR_209(-209, "Pasaporte existente."),
    ERROR_208(-208, "Error en n\u00FAmero suministrado."),
    ERROR_207(-207, "Mensaje rechazado."),
    ERROR_206(-206, "N\u00FAmero no soportado."),
    ERROR_205(-205, "C\u00F3digo de \u00E1rea no soportado."),
    ERROR_204(-204, "C\u00F3digo de pa\u00EDs no soportado."),
    ERROR_203(-203, "No configurado."),
    ERROR_202(-202, "Recepci\u00F3n no estaba en proceso."),
    ERROR_201(-201, "Recepci\u00F3n en proceso."),
    ERROR_107(-107, "Destino no aceptado."),
    ERROR_106(-106, "Servicio no disponible."),
    ERROR_105(-105, "No autenticado."),
    ERROR_104(-104, "Destino no aceptado por el operador."),
    ERROR_103(-103, "Receptor no disponible."),
    ERROR_102(-102, "Operador fuera de l\u00EDnea."),
    ERROR_101(-101, "Error interno."),
    ERROR_100(-100, "Error de infraestructura."),
    ERROR_0(0, "Mensaje aceptado por la plataforma."),
    // 1000+ son del ws-sms :
    ERROR_1000(1000, "N\u00FAmero de remitente vac\u00EDo."),
    ERROR_1001(1001, "Mensaje vac\u00EDo."),
    ERROR_1002(1002, "C\u00F3digo de solicitud no v\u00E1lido."),
    ERROR_1003(1003, "Mensaje despu\u00E9s del c\u00F3digo de solicitud esta vac\u00EDo."),
    ERROR_9000(9000, "Error interno en el servidor."),


    //grupos de estado de Infobip
	GRUPO_ESTADO_HOLACLIENTE_1(-1, "ERROR DE ENVIO OPERADOR"),
	GRUPO_ESTADO_HOLACLIENTE_2(-2, "SIN CREDITOS SUFICIENTES"),
	GRUPO_ESTADO_HOLACLIENTE_3(-5, "USUARIO O CONTRASENA NO VALIDOS"),
	GRUPO_ESTADO_HOLACLIENTE_4(-7, "FALTA TEXTO_DEL_MENSAJE"),
	GRUPO_ESTADO_HOLACLIENTE_5(-9, "FORMATO NO VALIDO DE NUMERO DE DESTINO");

    private final Integer code;
    private final String message;
    private boolean logicError = false;

    private SMSErrorEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
        if (code < 9000) {
            this.logicError = true;
        }
    }

    public static SMSErrorEnum fromValue(Integer code) {
        if (code != null) {
            for (SMSErrorEnum errorEnum : SMSErrorEnum.values()) {
                if (errorEnum.getCode().equals(code)) {
                    return errorEnum;
                }
            }
        }
        return ERROR_9000;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isLogicError() {
        return logicError;
    }

}
