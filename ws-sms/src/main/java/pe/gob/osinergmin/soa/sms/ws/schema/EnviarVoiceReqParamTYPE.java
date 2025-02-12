package pe.gob.osinergmin.soa.sms.ws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for EnviarVoiceReqParamTYPE complex type.
 * 
 * <p>Este esquema define la estructura de la petición para enviar un mensaje de voz.
 * 
 * <pre>
 * &lt;complexType name="EnviarVoiceReqParamTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensajeVoz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idioma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="voz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnviarVoiceReqParamTYPE", propOrder = {
    "numero",
    "mensajeVoz",
    "idioma",
    "voz"
})
public class EnviarVoiceReqParamTYPE {

    @XmlElement(required = true)
    protected String numero;
    
    @XmlElement(required = true)
    protected String mensajeVoz;
    
    @XmlElement(required = false)
    protected String idioma; // Ejemplo: "es", "en", "pt"

    @XmlElement(required = false)
    protected String voz; // Ejemplo: "Joanna", "Lucia", "Pedro"

    public String getNumero() {
        return numero;
    }

    public void setNumero(String value) {
        this.numero = value;
    }

    public String getMensajeVoz() {
        return mensajeVoz;
    }

    public void setMensajeVoz(String value) {
        this.mensajeVoz = value;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String value) {
        this.idioma = value;
    }

    public String getVoz() {
        return voz;
    }

    public void setVoz(String value) {
        this.voz = value;
    }
}
