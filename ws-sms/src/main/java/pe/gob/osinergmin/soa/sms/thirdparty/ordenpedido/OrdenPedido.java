
package pe.gob.osinergmin.soa.sms.thirdparty.ordenpedido;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ordenPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ordenPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="API" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actividad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="afectoIGV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="afectoISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoAerolinea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoAutorizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoDGHCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEquivalenteMayorista1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEquivalenteMayorista2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEquivalentePlanta1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEquivalentePlanta2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEquivalenteProductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMayorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMayoristaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMayoristaDestinoEquivalente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMayoristaEquivalente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMayoristaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMayoristaOrigenEquivalente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoOsinergCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoOsinergComprador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPlanta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPlantaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPlantaDestinoEquivalente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPlantaEquivalente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPlantaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPlantaOrigenEquivalente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUnidadOperativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cola" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalles" type="{http://services.webservices.scop.osinergmin.com}detallePedido" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="direccionDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionDestinoVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dua1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dua2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dua3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flagFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formaVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isStock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaTransporte" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loginUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medioTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAerolinea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordenPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placaTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucComprador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucMayorista1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rucMayorista2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serieNumeroFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serieNumeroGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="temperatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoVentaFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volumenSolicitado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volumenVenta" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="vuelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordenPedido", propOrder = {
    "api",
    "actividad",
    "afectoIGV",
    "afectoISC",
    "claveUsuario",
    "codigoAerolinea",
    "codigoAutorizacion",
    "codigoDGHCliente",
    "codigoEquivalenteMayorista1",
    "codigoEquivalenteMayorista2",
    "codigoEquivalentePlanta1",
    "codigoEquivalentePlanta2",
    "codigoEquivalenteProductor",
    "codigoEstado",
    "codigoMayorista",
    "codigoMayoristaDestino",
    "codigoMayoristaDestinoEquivalente",
    "codigoMayoristaEquivalente",
    "codigoMayoristaOrigen",
    "codigoMayoristaOrigenEquivalente",
    "codigoOrigen",
    "codigoOsinergCliente",
    "codigoOsinergComprador",
    "codigoPlanta",
    "codigoPlantaDestino",
    "codigoPlantaDestinoEquivalente",
    "codigoPlantaEquivalente",
    "codigoPlantaOrigen",
    "codigoPlantaOrigenEquivalente",
    "codigoProducto",
    "codigoProveedor",
    "codigoTransporte",
    "codigoUnidadOperativa",
    "codigoUsuario",
    "cola",
    "descripcionEstado",
    "detalles",
    "direccionDestino",
    "direccionDestinoVenta",
    "dua1",
    "dua2",
    "dua3",
    "fechaCompra",
    "fechaEntrega",
    "fechaFactura",
    "fechaModificacion",
    "fechaRegistro",
    "fechaVenta",
    "flagFactura",
    "formaVenta",
    "horaModificacion",
    "horaRegistro",
    "horaVenta",
    "idProducto",
    "isStock",
    "listaTransporte",
    "loginUsuario",
    "medioTransporte",
    "nombreAerolinea",
    "numeroEntrega",
    "numeroFactura",
    "numeroGuia",
    "ordenPedido",
    "placaTransporte",
    "rucComprador",
    "rucMayorista1",
    "rucMayorista2",
    "serieNumeroFactura",
    "serieNumeroGuia",
    "temperatura",
    "tipoOrden",
    "tipoTransaccion",
    "tipoVentaFactor",
    "volumenSolicitado",
    "volumenVenta",
    "vuelo"
})
public class OrdenPedido {

    @XmlElement(name = "API")
    protected String api;
    protected String actividad;
    protected String afectoIGV;
    protected String afectoISC;
    protected String claveUsuario;
    protected String codigoAerolinea;
    protected String codigoAutorizacion;
    protected String codigoDGHCliente;
    protected String codigoEquivalenteMayorista1;
    protected String codigoEquivalenteMayorista2;
    protected String codigoEquivalentePlanta1;
    protected String codigoEquivalentePlanta2;
    protected String codigoEquivalenteProductor;
    protected String codigoEstado;
    protected String codigoMayorista;
    protected String codigoMayoristaDestino;
    protected String codigoMayoristaDestinoEquivalente;
    protected String codigoMayoristaEquivalente;
    protected String codigoMayoristaOrigen;
    protected String codigoMayoristaOrigenEquivalente;
    protected String codigoOrigen;
    protected String codigoOsinergCliente;
    protected String codigoOsinergComprador;
    protected String codigoPlanta;
    protected String codigoPlantaDestino;
    protected String codigoPlantaDestinoEquivalente;
    protected String codigoPlantaEquivalente;
    protected String codigoPlantaOrigen;
    protected String codigoPlantaOrigenEquivalente;
    protected String codigoProducto;
    protected String codigoProveedor;
    protected String codigoTransporte;
    protected String codigoUnidadOperativa;
    protected String codigoUsuario;
    protected String cola;
    protected String descripcionEstado;
    @XmlElement(nillable = true)
    protected List<DetallePedido> detalles;
    protected String direccionDestino;
    protected String direccionDestinoVenta;
    protected String dua1;
    protected String dua2;
    protected String dua3;
    protected String fechaCompra;
    protected String fechaEntrega;
    protected String fechaFactura;
    protected String fechaModificacion;
    protected String fechaRegistro;
    protected String fechaVenta;
    protected String flagFactura;
    protected String formaVenta;
    protected String horaModificacion;
    protected String horaRegistro;
    protected String horaVenta;
    protected String idProducto;
    protected String isStock;
    @XmlElement(nillable = true)
    protected List<String> listaTransporte;
    protected String loginUsuario;
    protected String medioTransporte;
    protected String nombreAerolinea;
    protected String numeroEntrega;
    protected String numeroFactura;
    protected String numeroGuia;
    protected String ordenPedido;
    protected String placaTransporte;
    protected String rucComprador;
    protected String rucMayorista1;
    protected String rucMayorista2;
    protected String serieNumeroFactura;
    protected String serieNumeroGuia;
    protected String temperatura;
    protected String tipoOrden;
    protected String tipoTransaccion;
    protected String tipoVentaFactor;
    protected String volumenSolicitado;
    protected float volumenVenta;
    protected String vuelo;

    /**
     * Gets the value of the api property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPI() {
        return api;
    }

    /**
     * Sets the value of the api property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPI(String value) {
        this.api = value;
    }

    /**
     * Gets the value of the actividad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActividad() {
        return actividad;
    }

    /**
     * Sets the value of the actividad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActividad(String value) {
        this.actividad = value;
    }

    /**
     * Gets the value of the afectoIGV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfectoIGV() {
        return afectoIGV;
    }

    /**
     * Sets the value of the afectoIGV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfectoIGV(String value) {
        this.afectoIGV = value;
    }

    /**
     * Gets the value of the afectoISC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfectoISC() {
        return afectoISC;
    }

    /**
     * Sets the value of the afectoISC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfectoISC(String value) {
        this.afectoISC = value;
    }

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
     * Gets the value of the codigoAerolinea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAerolinea() {
        return codigoAerolinea;
    }

    /**
     * Sets the value of the codigoAerolinea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAerolinea(String value) {
        this.codigoAerolinea = value;
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
     * Gets the value of the codigoDGHCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDGHCliente() {
        return codigoDGHCliente;
    }

    /**
     * Sets the value of the codigoDGHCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDGHCliente(String value) {
        this.codigoDGHCliente = value;
    }

    /**
     * Gets the value of the codigoEquivalenteMayorista1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEquivalenteMayorista1() {
        return codigoEquivalenteMayorista1;
    }

    /**
     * Sets the value of the codigoEquivalenteMayorista1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEquivalenteMayorista1(String value) {
        this.codigoEquivalenteMayorista1 = value;
    }

    /**
     * Gets the value of the codigoEquivalenteMayorista2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEquivalenteMayorista2() {
        return codigoEquivalenteMayorista2;
    }

    /**
     * Sets the value of the codigoEquivalenteMayorista2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEquivalenteMayorista2(String value) {
        this.codigoEquivalenteMayorista2 = value;
    }

    /**
     * Gets the value of the codigoEquivalentePlanta1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEquivalentePlanta1() {
        return codigoEquivalentePlanta1;
    }

    /**
     * Sets the value of the codigoEquivalentePlanta1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEquivalentePlanta1(String value) {
        this.codigoEquivalentePlanta1 = value;
    }

    /**
     * Gets the value of the codigoEquivalentePlanta2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEquivalentePlanta2() {
        return codigoEquivalentePlanta2;
    }

    /**
     * Sets the value of the codigoEquivalentePlanta2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEquivalentePlanta2(String value) {
        this.codigoEquivalentePlanta2 = value;
    }

    /**
     * Gets the value of the codigoEquivalenteProductor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEquivalenteProductor() {
        return codigoEquivalenteProductor;
    }

    /**
     * Sets the value of the codigoEquivalenteProductor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEquivalenteProductor(String value) {
        this.codigoEquivalenteProductor = value;
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
     * Gets the value of the codigoMayorista property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMayorista() {
        return codigoMayorista;
    }

    /**
     * Sets the value of the codigoMayorista property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMayorista(String value) {
        this.codigoMayorista = value;
    }

    /**
     * Gets the value of the codigoMayoristaDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMayoristaDestino() {
        return codigoMayoristaDestino;
    }

    /**
     * Sets the value of the codigoMayoristaDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMayoristaDestino(String value) {
        this.codigoMayoristaDestino = value;
    }

    /**
     * Gets the value of the codigoMayoristaDestinoEquivalente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMayoristaDestinoEquivalente() {
        return codigoMayoristaDestinoEquivalente;
    }

    /**
     * Sets the value of the codigoMayoristaDestinoEquivalente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMayoristaDestinoEquivalente(String value) {
        this.codigoMayoristaDestinoEquivalente = value;
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
     * Gets the value of the codigoMayoristaOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMayoristaOrigen() {
        return codigoMayoristaOrigen;
    }

    /**
     * Sets the value of the codigoMayoristaOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMayoristaOrigen(String value) {
        this.codigoMayoristaOrigen = value;
    }

    /**
     * Gets the value of the codigoMayoristaOrigenEquivalente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMayoristaOrigenEquivalente() {
        return codigoMayoristaOrigenEquivalente;
    }

    /**
     * Sets the value of the codigoMayoristaOrigenEquivalente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMayoristaOrigenEquivalente(String value) {
        this.codigoMayoristaOrigenEquivalente = value;
    }

    /**
     * Gets the value of the codigoOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOrigen() {
        return codigoOrigen;
    }

    /**
     * Sets the value of the codigoOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOrigen(String value) {
        this.codigoOrigen = value;
    }

    /**
     * Gets the value of the codigoOsinergCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOsinergCliente() {
        return codigoOsinergCliente;
    }

    /**
     * Sets the value of the codigoOsinergCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOsinergCliente(String value) {
        this.codigoOsinergCliente = value;
    }

    /**
     * Gets the value of the codigoOsinergComprador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOsinergComprador() {
        return codigoOsinergComprador;
    }

    /**
     * Sets the value of the codigoOsinergComprador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOsinergComprador(String value) {
        this.codigoOsinergComprador = value;
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
     * Gets the value of the codigoPlantaDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPlantaDestino() {
        return codigoPlantaDestino;
    }

    /**
     * Sets the value of the codigoPlantaDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPlantaDestino(String value) {
        this.codigoPlantaDestino = value;
    }

    /**
     * Gets the value of the codigoPlantaDestinoEquivalente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPlantaDestinoEquivalente() {
        return codigoPlantaDestinoEquivalente;
    }

    /**
     * Sets the value of the codigoPlantaDestinoEquivalente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPlantaDestinoEquivalente(String value) {
        this.codigoPlantaDestinoEquivalente = value;
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
     * Gets the value of the codigoPlantaOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPlantaOrigen() {
        return codigoPlantaOrigen;
    }

    /**
     * Sets the value of the codigoPlantaOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPlantaOrigen(String value) {
        this.codigoPlantaOrigen = value;
    }

    /**
     * Gets the value of the codigoPlantaOrigenEquivalente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPlantaOrigenEquivalente() {
        return codigoPlantaOrigenEquivalente;
    }

    /**
     * Sets the value of the codigoPlantaOrigenEquivalente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPlantaOrigenEquivalente(String value) {
        this.codigoPlantaOrigenEquivalente = value;
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
     * Gets the value of the codigoProveedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    /**
     * Sets the value of the codigoProveedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProveedor(String value) {
        this.codigoProveedor = value;
    }

    /**
     * Gets the value of the codigoTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTransporte() {
        return codigoTransporte;
    }

    /**
     * Sets the value of the codigoTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTransporte(String value) {
        this.codigoTransporte = value;
    }

    /**
     * Gets the value of the codigoUnidadOperativa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUnidadOperativa() {
        return codigoUnidadOperativa;
    }

    /**
     * Sets the value of the codigoUnidadOperativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUnidadOperativa(String value) {
        this.codigoUnidadOperativa = value;
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
     * Gets the value of the cola property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCola() {
        return cola;
    }

    /**
     * Sets the value of the cola property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCola(String value) {
        this.cola = value;
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
     * Gets the value of the detalles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetallePedido }
     * 
     * 
     */
    public List<DetallePedido> getDetalles() {
        if (detalles == null) {
            detalles = new ArrayList<DetallePedido>();
        }
        return this.detalles;
    }

    /**
     * Gets the value of the direccionDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDestino() {
        return direccionDestino;
    }

    /**
     * Sets the value of the direccionDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDestino(String value) {
        this.direccionDestino = value;
    }

    /**
     * Gets the value of the direccionDestinoVenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDestinoVenta() {
        return direccionDestinoVenta;
    }

    /**
     * Sets the value of the direccionDestinoVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDestinoVenta(String value) {
        this.direccionDestinoVenta = value;
    }

    /**
     * Gets the value of the dua1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDua1() {
        return dua1;
    }

    /**
     * Sets the value of the dua1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDua1(String value) {
        this.dua1 = value;
    }

    /**
     * Gets the value of the dua2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDua2() {
        return dua2;
    }

    /**
     * Sets the value of the dua2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDua2(String value) {
        this.dua2 = value;
    }

    /**
     * Gets the value of the dua3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDua3() {
        return dua3;
    }

    /**
     * Sets the value of the dua3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDua3(String value) {
        this.dua3 = value;
    }

    /**
     * Gets the value of the fechaCompra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Sets the value of the fechaCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCompra(String value) {
        this.fechaCompra = value;
    }

    /**
     * Gets the value of the fechaEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Sets the value of the fechaEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEntrega(String value) {
        this.fechaEntrega = value;
    }

    /**
     * Gets the value of the fechaFactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFactura() {
        return fechaFactura;
    }

    /**
     * Sets the value of the fechaFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFactura(String value) {
        this.fechaFactura = value;
    }

    /**
     * Gets the value of the fechaModificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Sets the value of the fechaModificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaModificacion(String value) {
        this.fechaModificacion = value;
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
     * Gets the value of the flagFactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagFactura() {
        return flagFactura;
    }

    /**
     * Sets the value of the flagFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagFactura(String value) {
        this.flagFactura = value;
    }

    /**
     * Gets the value of the formaVenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaVenta() {
        return formaVenta;
    }

    /**
     * Sets the value of the formaVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaVenta(String value) {
        this.formaVenta = value;
    }

    /**
     * Gets the value of the horaModificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraModificacion() {
        return horaModificacion;
    }

    /**
     * Sets the value of the horaModificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraModificacion(String value) {
        this.horaModificacion = value;
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
     * Gets the value of the horaVenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraVenta() {
        return horaVenta;
    }

    /**
     * Sets the value of the horaVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraVenta(String value) {
        this.horaVenta = value;
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
     * Gets the value of the isStock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStock() {
        return isStock;
    }

    /**
     * Sets the value of the isStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStock(String value) {
        this.isStock = value;
    }

    /**
     * Gets the value of the listaTransporte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaTransporte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaTransporte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaTransporte() {
        if (listaTransporte == null) {
            listaTransporte = new ArrayList<String>();
        }
        return this.listaTransporte;
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
     * Gets the value of the medioTransporte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedioTransporte() {
        return medioTransporte;
    }

    /**
     * Sets the value of the medioTransporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedioTransporte(String value) {
        this.medioTransporte = value;
    }

    /**
     * Gets the value of the nombreAerolinea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    /**
     * Sets the value of the nombreAerolinea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAerolinea(String value) {
        this.nombreAerolinea = value;
    }

    /**
     * Gets the value of the numeroEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEntrega() {
        return numeroEntrega;
    }

    /**
     * Sets the value of the numeroEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEntrega(String value) {
        this.numeroEntrega = value;
    }

    /**
     * Gets the value of the numeroFactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Sets the value of the numeroFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFactura(String value) {
        this.numeroFactura = value;
    }

    /**
     * Gets the value of the numeroGuia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuia() {
        return numeroGuia;
    }

    /**
     * Sets the value of the numeroGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuia(String value) {
        this.numeroGuia = value;
    }

    /**
     * Gets the value of the ordenPedido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenPedido() {
        return ordenPedido;
    }

    /**
     * Sets the value of the ordenPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenPedido(String value) {
        this.ordenPedido = value;
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
     * Gets the value of the rucComprador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucComprador() {
        return rucComprador;
    }

    /**
     * Sets the value of the rucComprador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucComprador(String value) {
        this.rucComprador = value;
    }

    /**
     * Gets the value of the rucMayorista1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucMayorista1() {
        return rucMayorista1;
    }

    /**
     * Sets the value of the rucMayorista1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucMayorista1(String value) {
        this.rucMayorista1 = value;
    }

    /**
     * Gets the value of the rucMayorista2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucMayorista2() {
        return rucMayorista2;
    }

    /**
     * Sets the value of the rucMayorista2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucMayorista2(String value) {
        this.rucMayorista2 = value;
    }

    /**
     * Gets the value of the serieNumeroFactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieNumeroFactura() {
        return serieNumeroFactura;
    }

    /**
     * Sets the value of the serieNumeroFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieNumeroFactura(String value) {
        this.serieNumeroFactura = value;
    }

    /**
     * Gets the value of the serieNumeroGuia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieNumeroGuia() {
        return serieNumeroGuia;
    }

    /**
     * Sets the value of the serieNumeroGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieNumeroGuia(String value) {
        this.serieNumeroGuia = value;
    }

    /**
     * Gets the value of the temperatura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatura() {
        return temperatura;
    }

    /**
     * Sets the value of the temperatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatura(String value) {
        this.temperatura = value;
    }

    /**
     * Gets the value of the tipoOrden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOrden() {
        return tipoOrden;
    }

    /**
     * Sets the value of the tipoOrden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOrden(String value) {
        this.tipoOrden = value;
    }

    /**
     * Gets the value of the tipoTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * Sets the value of the tipoTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTransaccion(String value) {
        this.tipoTransaccion = value;
    }

    /**
     * Gets the value of the tipoVentaFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVentaFactor() {
        return tipoVentaFactor;
    }

    /**
     * Sets the value of the tipoVentaFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVentaFactor(String value) {
        this.tipoVentaFactor = value;
    }

    /**
     * Gets the value of the volumenSolicitado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumenSolicitado() {
        return volumenSolicitado;
    }

    /**
     * Sets the value of the volumenSolicitado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumenSolicitado(String value) {
        this.volumenSolicitado = value;
    }

    /**
     * Gets the value of the volumenVenta property.
     * 
     */
    public float getVolumenVenta() {
        return volumenVenta;
    }

    /**
     * Sets the value of the volumenVenta property.
     * 
     */
    public void setVolumenVenta(float value) {
        this.volumenVenta = value;
    }

    /**
     * Gets the value of the vuelo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVuelo() {
        return vuelo;
    }

    /**
     * Sets the value of the vuelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVuelo(String value) {
        this.vuelo = value;
    }

}
