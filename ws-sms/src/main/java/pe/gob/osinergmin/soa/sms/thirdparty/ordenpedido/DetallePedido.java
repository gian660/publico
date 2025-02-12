
package pe.gob.osinergmin.soa.sms.thirdparty.ordenpedido;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detallePedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detallePedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="cantidad2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="cantidadDespachada" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="cantidadSolicitada" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="cantidadVendida" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="codigoEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMotivoRechazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="densidadObservada" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="descripcionEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detallePedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="factorAPI" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="factorApor" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="factorComp" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fechaDespacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placaTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="precioGalon" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="temperatura" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="tipoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zonaPrecios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detallePedido", propOrder = {
    "cantidad1",
    "cantidad2",
    "cantidadDespachada",
    "cantidadSolicitada",
    "cantidadVendida",
    "codigoEstado",
    "codigoMarca",
    "codigoMotivoRechazo",
    "codigoProducto",
    "codigoUnidad",
    "densidadObservada",
    "descripcionEstado",
    "detallePedido",
    "factorAPI",
    "factorApor",
    "factorComp",
    "fechaDespacho",
    "fechaVenta",
    "idProducto",
    "placaTransporte",
    "precio",
    "precioGalon",
    "temperatura",
    "tipoUsuario",
    "zonaPrecios"
})
public class DetallePedido {

    protected float cantidad1;
    protected float cantidad2;
    protected float cantidadDespachada;
    protected float cantidadSolicitada;
    protected float cantidadVendida;
    protected String codigoEstado;
    protected String codigoMarca;
    protected String codigoMotivoRechazo;
    protected String codigoProducto;
    protected String codigoUnidad;
    protected float densidadObservada;
    protected String descripcionEstado;
    protected String detallePedido;
    protected float factorAPI;
    protected float factorApor;
    protected float factorComp;
    protected String fechaDespacho;
    protected String fechaVenta;
    protected String idProducto;
    protected String placaTransporte;
    protected float precio;
    protected float precioGalon;
    protected float temperatura;
    protected String tipoUsuario;
    protected String zonaPrecios;

    /**
     * Gets the value of the cantidad1 property.
     * 
     */
    public float getCantidad1() {
        return cantidad1;
    }

    /**
     * Sets the value of the cantidad1 property.
     * 
     */
    public void setCantidad1(float value) {
        this.cantidad1 = value;
    }

    /**
     * Gets the value of the cantidad2 property.
     * 
     */
    public float getCantidad2() {
        return cantidad2;
    }

    /**
     * Sets the value of the cantidad2 property.
     * 
     */
    public void setCantidad2(float value) {
        this.cantidad2 = value;
    }

    /**
     * Gets the value of the cantidadDespachada property.
     * 
     */
    public float getCantidadDespachada() {
        return cantidadDespachada;
    }

    /**
     * Sets the value of the cantidadDespachada property.
     * 
     */
    public void setCantidadDespachada(float value) {
        this.cantidadDespachada = value;
    }

    /**
     * Gets the value of the cantidadSolicitada property.
     * 
     */
    public float getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    /**
     * Sets the value of the cantidadSolicitada property.
     * 
     */
    public void setCantidadSolicitada(float value) {
        this.cantidadSolicitada = value;
    }

    /**
     * Gets the value of the cantidadVendida property.
     * 
     */
    public float getCantidadVendida() {
        return cantidadVendida;
    }

    /**
     * Sets the value of the cantidadVendida property.
     * 
     */
    public void setCantidadVendida(float value) {
        this.cantidadVendida = value;
    }

    /**
     * Gets the value of the codigoEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstado() {
        return codigoEstado;
    }

    /**
     * Sets the value of the codigoEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstado(String value) {
        this.codigoEstado = value;
    }

    /**
     * Gets the value of the codigoMarca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMarca() {
        return codigoMarca;
    }

    /**
     * Sets the value of the codigoMarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMarca(String value) {
        this.codigoMarca = value;
    }

    /**
     * Gets the value of the codigoMotivoRechazo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMotivoRechazo() {
        return codigoMotivoRechazo;
    }

    /**
     * Sets the value of the codigoMotivoRechazo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMotivoRechazo(String value) {
        this.codigoMotivoRechazo = value;
    }

    /**
     * Gets the value of the codigoProducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Sets the value of the codigoProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProducto(String value) {
        this.codigoProducto = value;
    }

    /**
     * Gets the value of the codigoUnidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUnidad() {
        return codigoUnidad;
    }

    /**
     * Sets the value of the codigoUnidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUnidad(String value) {
        this.codigoUnidad = value;
    }

    /**
     * Gets the value of the densidadObservada property.
     * 
     */
    public float getDensidadObservada() {
        return densidadObservada;
    }

    /**
     * Sets the value of the densidadObservada property.
     * 
     */
    public void setDensidadObservada(float value) {
        this.densidadObservada = value;
    }

    /**
     * Gets the value of the descripcionEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    /**
     * Sets the value of the descripcionEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstado(String value) {
        this.descripcionEstado = value;
    }

    /**
     * Gets the value of the detallePedido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetallePedido() {
        return detallePedido;
    }

    /**
     * Sets the value of the detallePedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetallePedido(String value) {
        this.detallePedido = value;
    }

    /**
     * Gets the value of the factorAPI property.
     * 
     */
    public float getFactorAPI() {
        return factorAPI;
    }

    /**
     * Sets the value of the factorAPI property.
     * 
     */
    public void setFactorAPI(float value) {
        this.factorAPI = value;
    }

    /**
     * Gets the value of the factorApor property.
     * 
     */
    public float getFactorApor() {
        return factorApor;
    }

    /**
     * Sets the value of the factorApor property.
     * 
     */
    public void setFactorApor(float value) {
        this.factorApor = value;
    }

    /**
     * Gets the value of the factorComp property.
     * 
     */
    public float getFactorComp() {
        return factorComp;
    }

    /**
     * Sets the value of the factorComp property.
     * 
     */
    public void setFactorComp(float value) {
        this.factorComp = value;
    }

    /**
     * Gets the value of the fechaDespacho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDespacho() {
        return fechaDespacho;
    }

    /**
     * Sets the value of the fechaDespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDespacho(String value) {
        this.fechaDespacho = value;
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
     * Gets the value of the idProducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProducto() {
        return idProducto;
    }

    /**
     * Sets the value of the idProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProducto(String value) {
        this.idProducto = value;
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
     * Gets the value of the precio property.
     * 
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     */
    public void setPrecio(float value) {
        this.precio = value;
    }

    /**
     * Gets the value of the precioGalon property.
     * 
     */
    public float getPrecioGalon() {
        return precioGalon;
    }

    /**
     * Sets the value of the precioGalon property.
     * 
     */
    public void setPrecioGalon(float value) {
        this.precioGalon = value;
    }

    /**
     * Gets the value of the temperatura property.
     * 
     */
    public float getTemperatura() {
        return temperatura;
    }

    /**
     * Sets the value of the temperatura property.
     * 
     */
    public void setTemperatura(float value) {
        this.temperatura = value;
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

    /**
     * Gets the value of the zonaPrecios property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZonaPrecios() {
        return zonaPrecios;
    }

    /**
     * Sets the value of the zonaPrecios property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZonaPrecios(String value) {
        this.zonaPrecios = value;
    }

}
