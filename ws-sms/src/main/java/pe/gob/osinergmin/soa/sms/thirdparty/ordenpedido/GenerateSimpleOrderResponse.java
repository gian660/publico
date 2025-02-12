
package pe.gob.osinergmin.soa.sms.thirdparty.ordenpedido;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generateSimpleOrderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generateSimpleOrderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generateSimpleOrderResponse" type="{http://services.webservices.scop.osinergmin.com}parametro" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateSimpleOrderResponse", propOrder = {
    "generateSimpleOrderResponse"
})
public class GenerateSimpleOrderResponse {

    protected Parametro generateSimpleOrderResponse;

    /**
     * Gets the value of the generateSimpleOrderResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Parametro }
     *     
     */
    public Parametro getGenerateSimpleOrderResponse() {
        return generateSimpleOrderResponse;
    }

    /**
     * Sets the value of the generateSimpleOrderResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametro }
     *     
     */
    public void setGenerateSimpleOrderResponse(Parametro value) {
        this.generateSimpleOrderResponse = value;
    }

}
