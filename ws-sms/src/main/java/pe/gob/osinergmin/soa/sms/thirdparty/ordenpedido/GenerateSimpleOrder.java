
package pe.gob.osinergmin.soa.sms.thirdparty.ordenpedido;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generateSimpleOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generateSimpleOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ordenPedido" type="{http://services.webservices.scop.osinergmin.com}ordenPedido" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateSimpleOrder", propOrder = {
    "ordenPedido"
})
public class GenerateSimpleOrder {

    protected OrdenPedido ordenPedido;

    /**
     * Gets the value of the ordenPedido property.
     * 
     * @return
     *     possible object is
     *     {@link OrdenPedido }
     *     
     */
    public OrdenPedido getOrdenPedido() {
        return ordenPedido;
    }

    /**
     * Sets the value of the ordenPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdenPedido }
     *     
     */
    public void setOrdenPedido(OrdenPedido value) {
        this.ordenPedido = value;
    }

}
