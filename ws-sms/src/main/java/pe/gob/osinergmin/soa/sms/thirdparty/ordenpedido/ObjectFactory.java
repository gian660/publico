
package pe.gob.osinergmin.soa.sms.thirdparty.ordenpedido;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.gob.osinergmin.soa.sms.thirdparty.ordenpedido package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GenerarOrdenSimpleResponse_QNAME = new QName("http://services.webservices.scop.osinergmin.com", "generarOrdenSimpleResponse");
    private final static QName _GenerateSimpleOrderResponse_QNAME = new QName("http://services.webservices.scop.osinergmin.com", "generateSimpleOrderResponse");
    private final static QName _GenerateSimpleOrder_QNAME = new QName("http://services.webservices.scop.osinergmin.com", "generateSimpleOrder");
    private final static QName _GenerarOrdenSimple_QNAME = new QName("http://services.webservices.scop.osinergmin.com", "generarOrdenSimple");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.gob.osinergmin.soa.sms.thirdparty.ordenpedido
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerateSimpleOrderResponse }
     * 
     */
    public GenerateSimpleOrderResponse createGenerateSimpleOrderResponse() {
        return new GenerateSimpleOrderResponse();
    }

    /**
     * Create an instance of {@link GenerarOrdenSimpleResponse }
     * 
     */
    public GenerarOrdenSimpleResponse createGenerarOrdenSimpleResponse() {
        return new GenerarOrdenSimpleResponse();
    }

    /**
     * Create an instance of {@link GenerarOrdenSimple }
     * 
     */
    public GenerarOrdenSimple createGenerarOrdenSimple() {
        return new GenerarOrdenSimple();
    }

    /**
     * Create an instance of {@link GenerateSimpleOrder }
     * 
     */
    public GenerateSimpleOrder createGenerateSimpleOrder() {
        return new GenerateSimpleOrder();
    }

    /**
     * Create an instance of {@link DetallePedido }
     * 
     */
    public DetallePedido createDetallePedido() {
        return new DetallePedido();
    }

    /**
     * Create an instance of {@link Parametro }
     * 
     */
    public Parametro createParametro() {
        return new Parametro();
    }

    /**
     * Create an instance of {@link OrdenPedido }
     * 
     */
    public OrdenPedido createOrdenPedido() {
        return new OrdenPedido();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarOrdenSimpleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservices.scop.osinergmin.com", name = "generarOrdenSimpleResponse")
    public JAXBElement<GenerarOrdenSimpleResponse> createGenerarOrdenSimpleResponse(GenerarOrdenSimpleResponse value) {
        return new JAXBElement<GenerarOrdenSimpleResponse>(_GenerarOrdenSimpleResponse_QNAME, GenerarOrdenSimpleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateSimpleOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservices.scop.osinergmin.com", name = "generateSimpleOrderResponse")
    public JAXBElement<GenerateSimpleOrderResponse> createGenerateSimpleOrderResponse(GenerateSimpleOrderResponse value) {
        return new JAXBElement<GenerateSimpleOrderResponse>(_GenerateSimpleOrderResponse_QNAME, GenerateSimpleOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateSimpleOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservices.scop.osinergmin.com", name = "generateSimpleOrder")
    public JAXBElement<GenerateSimpleOrder> createGenerateSimpleOrder(GenerateSimpleOrder value) {
        return new JAXBElement<GenerateSimpleOrder>(_GenerateSimpleOrder_QNAME, GenerateSimpleOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarOrdenSimple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservices.scop.osinergmin.com", name = "generarOrdenSimple")
    public JAXBElement<GenerarOrdenSimple> createGenerarOrdenSimple(GenerarOrdenSimple value) {
        return new JAXBElement<GenerarOrdenSimple>(_GenerarOrdenSimple_QNAME, GenerarOrdenSimple.class, null, value);
    }

}
