
package pe.gob.osinergmin.soa.sms.ws.schema.comun.consumidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConsumidorTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumidorTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organizacion" type="{http://soa.osinergmin.gob.pe/schema/comun/consumidor}OrganizacionTYPE"/>
 *         &lt;element name="canal" type="{http://soa.osinergmin.gob.pe/schema/comun/consumidor}CanalConsumoTYPE"/>
 *         &lt;element name="ubicacionLocalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumidorTYPE", propOrder = {
    "organizacion",
    "canal",
    "ubicacionLocalId",
    "idTerminal",
    "fecha",
    "hora"
})
public class ConsumidorTYPE {

    @XmlElement(required = true)
    protected OrganizacionTYPE organizacion;
    @XmlElement(required = true)
    protected CanalConsumoTYPE canal;
    protected String ubicacionLocalId;
    protected String idTerminal;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hora;

    /**
     * Gets the value of the organizacion property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizacionTYPE }
     *     
     */
    public OrganizacionTYPE getOrganizacion() {
        return organizacion;
    }

    /**
     * Sets the value of the organizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizacionTYPE }
     *     
     */
    public void setOrganizacion(OrganizacionTYPE value) {
        this.organizacion = value;
    }

    /**
     * Gets the value of the canal property.
     * 
     * @return
     *     possible object is
     *     {@link CanalConsumoTYPE }
     *     
     */
    public CanalConsumoTYPE getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CanalConsumoTYPE }
     *     
     */
    public void setCanal(CanalConsumoTYPE value) {
        this.canal = value;
    }

    /**
     * Gets the value of the ubicacionLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacionLocalId() {
        return ubicacionLocalId;
    }

    /**
     * Sets the value of the ubicacionLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacionLocalId(String value) {
        this.ubicacionLocalId = value;
    }

    /**
     * Gets the value of the idTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTerminal() {
        return idTerminal;
    }

    /**
     * Sets the value of the idTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTerminal(String value) {
        this.idTerminal = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the hora property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHora() {
        return hora;
    }

    /**
     * Sets the value of the hora property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHora(XMLGregorianCalendar value) {
        this.hora = value;
    }

}
