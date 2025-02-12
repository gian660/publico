
package pe.gob.osinergmin.soa.sms.ws.schema.comun.fault;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NivelCriticidadTYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NivelCriticidadTYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BAJO"/>
 *     &lt;enumeration value="MEDIO"/>
 *     &lt;enumeration value="ALTO"/>
 *     &lt;enumeration value="SEVERO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NivelCriticidadTYPE")
@XmlEnum
public enum NivelCriticidadTYPE {

    BAJO,
    MEDIO,
    ALTO,
    SEVERO;

    public String value() {
        return name();
    }

    public static NivelCriticidadTYPE fromValue(String v) {
        return valueOf(v);
    }

}
