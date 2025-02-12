
package pe.gob.osinergmin.soa.sms.ws.schema.comun.fault;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.gob.osinergmin.soa.sms.ws.schema.comun.fault package. 
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

    private final static QName _OsinergminFaultResponse_QNAME = new QName("http://soa.osinergmin.gob.pe/schema/comun/fault", "osinergminFaultResponse");
    private final static QName _Falla_QNAME = new QName("http://soa.osinergmin.gob.pe/schema/comun/fault", "falla");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.gob.osinergmin.soa.sms.ws.schema.comun.fault
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OsinergminFaultTYPE }
     * 
     */
    public OsinergminFaultTYPE createOsinergminFaultTYPE() {
        return new OsinergminFaultTYPE();
    }

    /**
     * Create an instance of {@link OsinergminFaultResponseTYPE }
     * 
     */
    public OsinergminFaultResponseTYPE createOsinergminFaultResponseTYPE() {
        return new OsinergminFaultResponseTYPE();
    }

    /**
     * Create an instance of {@link GenericoTYPE }
     * 
     */
    public GenericoTYPE createGenericoTYPE() {
        return new GenericoTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OsinergminFaultResponseTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.osinergmin.gob.pe/schema/comun/fault", name = "osinergminFaultResponse")
    public JAXBElement<OsinergminFaultResponseTYPE> createOsinergminFaultResponse(OsinergminFaultResponseTYPE value) {
        return new JAXBElement<OsinergminFaultResponseTYPE>(_OsinergminFaultResponse_QNAME, OsinergminFaultResponseTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OsinergminFaultTYPE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.osinergmin.gob.pe/schema/comun/fault", name = "falla")
    public JAXBElement<OsinergminFaultTYPE> createFalla(OsinergminFaultTYPE value) {
        return new JAXBElement<OsinergminFaultTYPE>(_Falla_QNAME, OsinergminFaultTYPE.class, null, value);
    }

}
