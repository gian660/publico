
package pe.gob.osinergmin.soa.sms.ws.schema.comun.consumidor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizacionTYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganizacionTYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GART"/>
 *     &lt;enumeration value="GFHL"/>
 *     &lt;enumeration value="GFGN"/>
 *     &lt;enumeration value="GFE"/>
 *     &lt;enumeration value="GFM"/>
 *     &lt;enumeration value="OC"/>
 *     &lt;enumeration value="COR"/>
 *     &lt;enumeration value="STOR"/>
 *     &lt;enumeration value="OS"/>
 *     &lt;enumeration value="OEE"/>
 *     &lt;enumeration value="EXTERNO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganizacionTYPE")
@XmlEnum
public enum OrganizacionTYPE {

    GART,
    GFHL,
    GFGN,
    GFE,
    GFM,
    OC,
    COR,
    STOR,
    OS,
    OEE,
    EXTERNO;

    public String value() {
        return name();
    }

    public static OrganizacionTYPE fromValue(String v) {
        return valueOf(v);
    }

}
