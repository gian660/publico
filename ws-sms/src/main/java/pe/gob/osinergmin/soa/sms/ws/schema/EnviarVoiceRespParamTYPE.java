package pe.gob.osinergmin.soa.sms.ws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for EnviarVoiceRespParamTYPE complex type.
 * 
 * <p>Este esquema define la respuesta al enviar un mensaje de voz.
 * 
 * <pre>
 * &lt;complexType name="EnviarVoiceRespParamTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnviarVoiceRespParamTYPE", propOrder = {
    "codigo",
    "mensaje"
})
public class EnviarVoiceRespParamTYPE {

    @XmlElement(required = true)
    protected String codigo;
    
    @XmlElement(required = true)
    protected String mensaje;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String value) {
        this.codigo = value;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String value) {
        this.mensaje = value;
    }
}
