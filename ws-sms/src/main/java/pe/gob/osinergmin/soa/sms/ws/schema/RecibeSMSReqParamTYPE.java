
package pe.gob.osinergmin.soa.sms.ws.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecibeSMSReqParamTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecibeSMSReqParamTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoPaisRem" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="codAreaRem" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numRem" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idMensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecibeSMSReqParamTYPE", propOrder = {
    "clave",
    "codigoPaisRem",
    "codAreaRem",
    "numRem",
    "mensaje",
    "idMensaje"
})
public class RecibeSMSReqParamTYPE {

    @XmlElement(required = true)
    protected String clave;
    @XmlElement(required = true)
    protected BigInteger codigoPaisRem;
    @XmlElement(required = true)
    protected BigInteger codAreaRem;
    @XmlElement(required = true)
    protected BigInteger numRem;
    @XmlElement(required = true)
    protected String mensaje;
    @XmlElement(required = true)
    protected String idMensaje;

    /**
     * Gets the value of the clave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Gets the value of the codigoPaisRem property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoPaisRem() {
        return codigoPaisRem;
    }

    /**
     * Sets the value of the codigoPaisRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoPaisRem(BigInteger value) {
        this.codigoPaisRem = value;
    }

    /**
     * Gets the value of the codAreaRem property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodAreaRem() {
        return codAreaRem;
    }

    /**
     * Sets the value of the codAreaRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodAreaRem(BigInteger value) {
        this.codAreaRem = value;
    }

    /**
     * Gets the value of the numRem property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumRem() {
        return numRem;
    }

    /**
     * Sets the value of the numRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumRem(BigInteger value) {
        this.numRem = value;
    }

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Gets the value of the idMensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMensaje() {
        return idMensaje;
    }

    /**
     * Sets the value of the idMensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMensaje(String value) {
        this.idMensaje = value;
    }

}
