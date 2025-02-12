
package pe.gob.osinergmin.soa.sms.ws.schema.comun.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OsinergminFaultTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OsinergminFaultTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="componenteMiddleware" type="{http://soa.osinergmin.gob.pe/schema/comun/fault}ComponenteMiddlewareTYPE"/>
 *         &lt;element name="nivel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcionError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensajeEntrada" type="{http://soa.osinergmin.gob.pe/schema/comun/fault}GenericoTYPE"/>
 *         &lt;element name="mensajeSalida" type="{http://soa.osinergmin.gob.pe/schema/comun/fault}GenericoTYPE"/>
 *         &lt;element name="inicioEjecucion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="finEjecucion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="idTransaccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoError" type="{http://soa.osinergmin.gob.pe/schema/comun/fault}TipoErrorTYPE"/>
 *         &lt;element name="nivelCriticidad" type="{http://soa.osinergmin.gob.pe/schema/comun/fault}NivelCriticidadTYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OsinergminFaultTYPE", propOrder = {
    "componenteMiddleware",
    "nivel",
    "idServicio",
    "operacion",
    "codigoError",
    "descripcionError",
    "mensajeEntrada",
    "mensajeSalida",
    "inicioEjecucion",
    "finEjecucion",
    "idTransaccion",
    "tipoError",
    "nivelCriticidad"
})
public class OsinergminFaultTYPE {

    @XmlElement(required = true)
    protected ComponenteMiddlewareTYPE componenteMiddleware;
    @XmlElement(required = true)
    protected String nivel;
    @XmlElement(required = true)
    protected String idServicio;
    @XmlElement(required = true)
    protected String operacion;
    @XmlElement(required = true)
    protected String codigoError;
    @XmlElement(required = true)
    protected String descripcionError;
    @XmlElement(required = true, nillable = true)
    protected GenericoTYPE mensajeEntrada;
    @XmlElement(required = true, nillable = true)
    protected GenericoTYPE mensajeSalida;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inicioEjecucion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finEjecucion;
    @XmlElement(required = true)
    protected String idTransaccion;
    @XmlElement(required = true)
    protected TipoErrorTYPE tipoError;
    @XmlElement(required = true)
    protected NivelCriticidadTYPE nivelCriticidad;

    /**
     * Gets the value of the componenteMiddleware property.
     * 
     * @return
     *     possible object is
     *     {@link ComponenteMiddlewareTYPE }
     *     
     */
    public ComponenteMiddlewareTYPE getComponenteMiddleware() {
        return componenteMiddleware;
    }

    /**
     * Sets the value of the componenteMiddleware property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponenteMiddlewareTYPE }
     *     
     */
    public void setComponenteMiddleware(ComponenteMiddlewareTYPE value) {
        this.componenteMiddleware = value;
    }

    /**
     * Gets the value of the nivel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Sets the value of the nivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivel(String value) {
        this.nivel = value;
    }

    /**
     * Gets the value of the idServicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdServicio() {
        return idServicio;
    }

    /**
     * Sets the value of the idServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdServicio(String value) {
        this.idServicio = value;
    }

    /**
     * Gets the value of the operacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Sets the value of the operacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Gets the value of the codigoError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Sets the value of the codigoError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }

    /**
     * Gets the value of the descripcionError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionError() {
        return descripcionError;
    }

    /**
     * Sets the value of the descripcionError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionError(String value) {
        this.descripcionError = value;
    }

    /**
     * Gets the value of the mensajeEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link GenericoTYPE }
     *     
     */
    public GenericoTYPE getMensajeEntrada() {
        return mensajeEntrada;
    }

    /**
     * Sets the value of the mensajeEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericoTYPE }
     *     
     */
    public void setMensajeEntrada(GenericoTYPE value) {
        this.mensajeEntrada = value;
    }

    /**
     * Gets the value of the mensajeSalida property.
     * 
     * @return
     *     possible object is
     *     {@link GenericoTYPE }
     *     
     */
    public GenericoTYPE getMensajeSalida() {
        return mensajeSalida;
    }

    /**
     * Sets the value of the mensajeSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericoTYPE }
     *     
     */
    public void setMensajeSalida(GenericoTYPE value) {
        this.mensajeSalida = value;
    }

    /**
     * Gets the value of the inicioEjecucion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInicioEjecucion() {
        return inicioEjecucion;
    }

    /**
     * Sets the value of the inicioEjecucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInicioEjecucion(XMLGregorianCalendar value) {
        this.inicioEjecucion = value;
    }

    /**
     * Gets the value of the finEjecucion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinEjecucion() {
        return finEjecucion;
    }

    /**
     * Sets the value of the finEjecucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinEjecucion(XMLGregorianCalendar value) {
        this.finEjecucion = value;
    }

    /**
     * Gets the value of the idTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Sets the value of the idTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransaccion(String value) {
        this.idTransaccion = value;
    }

    /**
     * Gets the value of the tipoError property.
     * 
     * @return
     *     possible object is
     *     {@link TipoErrorTYPE }
     *     
     */
    public TipoErrorTYPE getTipoError() {
        return tipoError;
    }

    /**
     * Sets the value of the tipoError property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoErrorTYPE }
     *     
     */
    public void setTipoError(TipoErrorTYPE value) {
        this.tipoError = value;
    }

    /**
     * Gets the value of the nivelCriticidad property.
     * 
     * @return
     *     possible object is
     *     {@link NivelCriticidadTYPE }
     *     
     */
    public NivelCriticidadTYPE getNivelCriticidad() {
        return nivelCriticidad;
    }

    /**
     * Sets the value of the nivelCriticidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link NivelCriticidadTYPE }
     *     
     */
    public void setNivelCriticidad(NivelCriticidadTYPE value) {
        this.nivelCriticidad = value;
    }

}
