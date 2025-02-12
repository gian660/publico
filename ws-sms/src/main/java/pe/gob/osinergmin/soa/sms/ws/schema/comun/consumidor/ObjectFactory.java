
package pe.gob.osinergmin.soa.sms.ws.schema.comun.consumidor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.gob.osinergmin.soa.sms.ws.schema.comun.consumidor package. 
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

    private final static QName _Consumidor_QNAME = new QName("http://soa.osinergmin.gob.pe/schema/comun/consumidor", "consumidor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.gob.osinergmin.soa.sms.ws.schema.comun.consumidor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsumidorTYPE }
     * 
     */
    public ConsumidorTYPE createConsumidorTYPE() {
        return new ConsumidorTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumidorTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.osinergmin.gob.pe/schema/comun/consumidor", name = "consumidor")
    public JAXBElement<ConsumidorTYPE> createConsumidor(ConsumidorTYPE value) {
        return new JAXBElement<ConsumidorTYPE>(_Consumidor_QNAME, ConsumidorTYPE.class, null, value);
    }

}
