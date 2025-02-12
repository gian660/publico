
package pe.gob.osinergmin.soa.sms.ws.schema.comun.fault;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComponenteMiddlewareTYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComponenteMiddlewareTYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BPEL"/>
 *     &lt;enumeration value="APS"/>
 *     &lt;enumeration value="BPM"/>
 *     &lt;enumeration value="ESB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComponenteMiddlewareTYPE")
@XmlEnum
public enum ComponenteMiddlewareTYPE {

    BPEL,
    APS,
    BPM,
    ESB;

    public String value() {
        return name();
    }

    public static ComponenteMiddlewareTYPE fromValue(String v) {
        return valueOf(v);
    }

}
