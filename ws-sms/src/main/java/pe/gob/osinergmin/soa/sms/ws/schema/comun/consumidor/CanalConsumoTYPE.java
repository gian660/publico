
package pe.gob.osinergmin.soa.sms.ws.schema.comun.consumidor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanalConsumoTYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CanalConsumoTYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MOVIL"/>
 *     &lt;enumeration value="PORTAL"/>
 *     &lt;enumeration value="WEB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CanalConsumoTYPE")
@XmlEnum
public enum CanalConsumoTYPE {

    MOVIL,
    PORTAL,
    WEB;

    public String value() {
        return name();
    }

    public static CanalConsumoTYPE fromValue(String v) {
        return valueOf(v);
    }

}
