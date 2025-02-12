
package pe.gob.osinergmin.soa.sms.ws.schema.comun.fault;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoErrorTYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoErrorTYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEGOCIO"/>
 *     &lt;enumeration value="TECNICO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoErrorTYPE")
@XmlEnum
public enum TipoErrorTYPE {

    NEGOCIO,
    TECNICO;

    public String value() {
        return name();
    }

    public static TipoErrorTYPE fromValue(String v) {
        return valueOf(v);
    }

}
