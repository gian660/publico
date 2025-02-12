package pe.gob.osinergmin.soa.sms.ws.dto;

import java.io.Serializable;

/**
 *
 * @author otheo
 */
public class BaseDTO implements Serializable {

    private static final long serialVersionUID = -4283314561797996541L;

    private boolean error;
    private String mensaje;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
