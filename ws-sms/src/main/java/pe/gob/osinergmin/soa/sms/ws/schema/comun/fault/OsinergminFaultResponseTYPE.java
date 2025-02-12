
package pe.gob.osinergmin.soa.sms.ws.schema.comun.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OsinergminFaultResponseTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OsinergminFaultResponseTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="falla" type="{http://soa.osinergmin.gob.pe/schema/comun/fault}OsinergminFaultTYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OsinergminFaultResponseTYPE", propOrder = {
    "falla"
})
public class OsinergminFaultResponseTYPE {

    @XmlElement(required = true)
    protected OsinergminFaultTYPE falla;

    /**
     * Gets the value of the falla property.
     * 
     * @return
     *     possible object is
     *     {@link OsinergminFaultTYPE }
     *     
     */
    public OsinergminFaultTYPE getFalla() {
        return falla;
    }

    /**
     * Sets the value of the falla property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsinergminFaultTYPE }
     *     
     */
    public void setFalla(OsinergminFaultTYPE value) {
        this.falla = value;
    }

}
