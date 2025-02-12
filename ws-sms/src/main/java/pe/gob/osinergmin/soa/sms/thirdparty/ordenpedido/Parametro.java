
package pe.gob.osinergmin.soa.sms.thirdparty.ordenpedido;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claveUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoAutorizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMayoristaEquivalente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPlanta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPlantaEquivalente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDetalleDivision1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDetalleDivision2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placaTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametro", propOrder = {
    "claveUsuario",
    "codigoAutorizacion",
    "codigoError",
    "codigoMayoristaEquivalente",
    "codigoPlanta",
    "codigoPlantaEquivalente",
    "codigoUsuario",
    "fechaFin",
    "fechaInicio",
    "fechaRegistro",
    "fechaVenta",
    "horaFin",
    "horaInicio",
    "horaRegistro",
    "idDetalleDivision1",
    "idDetalleDivision2",
    "loginUsuario",
    "placaTransporte",
    "resultado",
    "ruc",
    "tipoUsuario"
})
public class Parametro {

    protected String claveUsuario;
    protected String codigoAutorizacion;
    protected String codigoError;
    protected String codigoMayoristaEquivalente;
    protected String codigoPlanta;
    protected String codigoPlantaEquivalente;
    protected String codigoUsuario;
    protected String fechaFin;
    protected String fechaInicio;
    protected String fechaRegistro;
    protected String fechaVenta;
    protected String horaFin;
    protected String horaInicio;
    protected String horaRegistro;
    protected String idDetalleDivision1;
    protected String idDetalleDivision2;
    protected String loginUsuario;
    protected String placaTransporte;
    protected String resultado;
    protected String ruc;
    protected String tipoUsuario;

    /**
     * Gets the value of the claveUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveUsuario() {
        return claveUsuario;
    }

    /**
     * Sets the value of the claveUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveUsuario(String value) {
        this.claveUsuario = value;
    }

    /**
     * Gets the value of the codigoAutorizacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    /**
     * Sets the value of the codigoAutorizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAutorizacion(String value) {
        this.codigoAutorizacion = value;
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
     * Gets the value of the codigoMayoristaEquivalente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMayoristaEquivalente() {
        return codigoMayoristaEquivalente;
    }

    /**
     * Sets the value of the codigoMayoristaEquivalente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMayoristaEquivalente(String value) {
        this.codigoMayoristaEquivalente = value;
    }

    /**
     * Gets the value of the codigoPlanta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPlanta() {
        return codigoPlanta;
    }

    /**
     * Sets the value of the codigoPlanta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPlanta(String value) {
        this.codigoPlanta = value;
    }

    /**
     * Gets the value of the codigoPlantaEquivalente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPlantaEquivalente() {
        return codigoPlantaEquivalente;
    }

    /**
     * Sets the value of the codigoPlantaEquivalente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPlantaEquivalente(String value) {
        this.codigoPlantaEquivalente = value;
    }

    /**
     * Gets the value of the codigoUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * Sets the value of the codigoUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUsuario(String value) {
        this.codigoUsuario = value;
    }

    /**
     * Gets the value of the fechaFin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * Sets the value of the fechaFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFin(String value) {
        this.fechaFin = value;
    }

    /**
     * Gets the value of the fechaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets the value of the fechaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicio(String value) {
        this.fechaInicio = value;
    }

    /**
     * Gets the value of the fechaRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Sets the value of the fechaRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRegistro(String value) {
        this.fechaRegistro = value;
    }

    /**
     * Gets the value of the fechaVenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVenta() {
        return fechaVenta;
    }

    /**
     * Sets the value of the fechaVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVenta(String value) {
        this.fechaVenta = value;
    }

    /**
     * Gets the value of the horaFin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraFin() {
        return horaFin;
    }

    /**
     * Sets the value of the horaFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraFin(String value) {
        this.horaFin = value;
    }

    /**
     * Gets the value of the horaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * Sets the value of the horaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraInicio(String value) {
        this.horaInicio = value;
    }

    /**
     * Gets the value of the horaRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraRegistro() {
        return horaRegistro;
    }

    /**
     * Sets the value of the horaRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraRegistro(String value) {
        this.horaRegistro = value;
    }

    /**
     * Gets the value of the idDetalleDivision1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDetalleDivision1() {
        return idDetalleDivision1;
    }

    /**
     * Sets the value of the idDetalleDivision1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDetalleDivision1(String value) {
        this.idDetalleDivision1 = value;
    }

    /**
     * Gets the value of the idDetalleDivision2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDetalleDivision2() {
        return idDetalleDivision2;
    }

    /**
     * Sets the value of the idDetalleDivision2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDetalleDivision2(String value) {
        this.idDetalleDivision2 = value;
    }

    /**
     * Gets the value of the loginUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUsuario() {
        return loginUsuario;
    }

    /**
     * Sets the value of the loginUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUsuario(String value) {
        this.loginUsuario = value;
    }

    /**
     * Gets the value of the placaTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacaTransporte() {
        return placaTransporte;
    }

    /**
     * Sets the value of the placaTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacaTransporte(String value) {
        this.placaTransporte = value;
    }

    /**
     * Gets the value of the resultado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the ruc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Sets the value of the ruc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuc(String value) {
        this.ruc = value;
    }

    /**
     * Gets the value of the tipoUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Sets the value of the tipoUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoUsuario(String value) {
        this.tipoUsuario = value;
    }

}
