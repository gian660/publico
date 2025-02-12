
package pe.gob.osinergmin.soa.sms.thirdparty.m4wsintsr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.gob.osinergmin.soa.sms.thirdparty.m4wsintsr package. 
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

    private final static QName _ResponseSMSNumber_QNAME = new QName("http://core.ws.m4.tedexis.com", "number");
    private final static QName _ResponseSMSPassword_QNAME = new QName("http://core.ws.m4.tedexis.com", "password");
    private final static QName _ResponseSMSPassport_QNAME = new QName("http://core.ws.m4.tedexis.com", "passport");
    private final static QName _ResponseSMSMessageID_QNAME = new QName("http://core.ws.m4.tedexis.com", "messageID");
    private final static QName _ResponseSMSText_QNAME = new QName("http://core.ws.m4.tedexis.com", "text");
    private final static QName _ResponseSMSccCountryCode_QNAME = new QName("http://core.ws.m4.tedexis.com", "countryCode");
    private final static QName _SendSMSappIDAppID_QNAME = new QName("http://core.ws.m4.tedexis.com", "appID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.gob.osinergmin.soa.sms.thirdparty.m4wsintsr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseSMSResponse }
     * 
     */
    public ResponseSMSResponse createResponseSMSResponse() {
        return new ResponseSMSResponse();
    }

    /**
     * Create an instance of {@link SendSMSWithIDcc }
     * 
     */
    public SendSMSWithIDcc createSendSMSWithIDcc() {
        return new SendSMSWithIDcc();
    }

    /**
     * Create an instance of {@link SendSMSccappID }
     * 
     */
    public SendSMSccappID createSendSMSccappID() {
        return new SendSMSccappID();
    }

    /**
     * Create an instance of {@link SendSMSResponse }
     * 
     */
    public SendSMSResponse createSendSMSResponse() {
        return new SendSMSResponse();
    }

    /**
     * Create an instance of {@link ResponseSMS }
     * 
     */
    public ResponseSMS createResponseSMS() {
        return new ResponseSMS();
    }

    /**
     * Create an instance of {@link ResponseSMScc }
     * 
     */
    public ResponseSMScc createResponseSMScc() {
        return new ResponseSMScc();
    }

    /**
     * Create an instance of {@link SendSMSWithIDccResponse }
     * 
     */
    public SendSMSWithIDccResponse createSendSMSWithIDccResponse() {
        return new SendSMSWithIDccResponse();
    }

    /**
     * Create an instance of {@link SendSMSappID }
     * 
     */
    public SendSMSappID createSendSMSappID() {
        return new SendSMSappID();
    }

    /**
     * Create an instance of {@link SendSMSWithIDResponse }
     * 
     */
    public SendSMSWithIDResponse createSendSMSWithIDResponse() {
        return new SendSMSWithIDResponse();
    }

    /**
     * Create an instance of {@link SendSMS }
     * 
     */
    public SendSMS createSendSMS() {
        return new SendSMS();
    }

    /**
     * Create an instance of {@link SendSMSWithID }
     * 
     */
    public SendSMSWithID createSendSMSWithID() {
        return new SendSMSWithID();
    }

    /**
     * Create an instance of {@link SendSMSccappIDResponse }
     * 
     */
    public SendSMSccappIDResponse createSendSMSccappIDResponse() {
        return new SendSMSccappIDResponse();
    }

    /**
     * Create an instance of {@link SendSMSappIDResponse }
     * 
     */
    public SendSMSappIDResponse createSendSMSappIDResponse() {
        return new SendSMSappIDResponse();
    }

    /**
     * Create an instance of {@link ResponseSMSccResponse }
     * 
     */
    public ResponseSMSccResponse createResponseSMSccResponse() {
        return new ResponseSMSccResponse();
    }

    /**
     * Create an instance of {@link SendSMSccResponse }
     * 
     */
    public SendSMSccResponse createSendSMSccResponse() {
        return new SendSMSccResponse();
    }

    /**
     * Create an instance of {@link SendSMScc }
     * 
     */
    public SendSMScc createSendSMScc() {
        return new SendSMScc();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "number", scope = ResponseSMS.class)
    public JAXBElement<String> createResponseSMSNumber(String value) {
        return new JAXBElement<String>(_ResponseSMSNumber_QNAME, String.class, ResponseSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "password", scope = ResponseSMS.class)
    public JAXBElement<String> createResponseSMSPassword(String value) {
        return new JAXBElement<String>(_ResponseSMSPassword_QNAME, String.class, ResponseSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "passport", scope = ResponseSMS.class)
    public JAXBElement<String> createResponseSMSPassport(String value) {
        return new JAXBElement<String>(_ResponseSMSPassport_QNAME, String.class, ResponseSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "messageID", scope = ResponseSMS.class)
    public JAXBElement<String> createResponseSMSMessageID(String value) {
        return new JAXBElement<String>(_ResponseSMSMessageID_QNAME, String.class, ResponseSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "text", scope = ResponseSMS.class)
    public JAXBElement<String> createResponseSMSText(String value) {
        return new JAXBElement<String>(_ResponseSMSText_QNAME, String.class, ResponseSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "number", scope = SendSMS.class)
    public JAXBElement<String> createSendSMSNumber(String value) {
        return new JAXBElement<String>(_ResponseSMSNumber_QNAME, String.class, SendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "password", scope = SendSMS.class)
    public JAXBElement<String> createSendSMSPassword(String value) {
        return new JAXBElement<String>(_ResponseSMSPassword_QNAME, String.class, SendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "passport", scope = SendSMS.class)
    public JAXBElement<String> createSendSMSPassport(String value) {
        return new JAXBElement<String>(_ResponseSMSPassport_QNAME, String.class, SendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "text", scope = SendSMS.class)
    public JAXBElement<String> createSendSMSText(String value) {
        return new JAXBElement<String>(_ResponseSMSText_QNAME, String.class, SendSMS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "number", scope = ResponseSMScc.class)
    public JAXBElement<String> createResponseSMSccNumber(String value) {
        return new JAXBElement<String>(_ResponseSMSNumber_QNAME, String.class, ResponseSMScc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "countryCode", scope = ResponseSMScc.class)
    public JAXBElement<String> createResponseSMSccCountryCode(String value) {
        return new JAXBElement<String>(_ResponseSMSccCountryCode_QNAME, String.class, ResponseSMScc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "password", scope = ResponseSMScc.class)
    public JAXBElement<String> createResponseSMSccPassword(String value) {
        return new JAXBElement<String>(_ResponseSMSPassword_QNAME, String.class, ResponseSMScc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "passport", scope = ResponseSMScc.class)
    public JAXBElement<String> createResponseSMSccPassport(String value) {
        return new JAXBElement<String>(_ResponseSMSPassport_QNAME, String.class, ResponseSMScc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "messageID", scope = ResponseSMScc.class)
    public JAXBElement<String> createResponseSMSccMessageID(String value) {
        return new JAXBElement<String>(_ResponseSMSMessageID_QNAME, String.class, ResponseSMScc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "text", scope = ResponseSMScc.class)
    public JAXBElement<String> createResponseSMSccText(String value) {
        return new JAXBElement<String>(_ResponseSMSText_QNAME, String.class, ResponseSMScc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "number", scope = SendSMSWithID.class)
    public JAXBElement<String> createSendSMSWithIDNumber(String value) {
        return new JAXBElement<String>(_ResponseSMSNumber_QNAME, String.class, SendSMSWithID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "password", scope = SendSMSWithID.class)
    public JAXBElement<String> createSendSMSWithIDPassword(String value) {
        return new JAXBElement<String>(_ResponseSMSPassword_QNAME, String.class, SendSMSWithID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "passport", scope = SendSMSWithID.class)
    public JAXBElement<String> createSendSMSWithIDPassport(String value) {
        return new JAXBElement<String>(_ResponseSMSPassport_QNAME, String.class, SendSMSWithID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "text", scope = SendSMSWithID.class)
    public JAXBElement<String> createSendSMSWithIDText(String value) {
        return new JAXBElement<String>(_ResponseSMSText_QNAME, String.class, SendSMSWithID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "number", scope = SendSMSappID.class)
    public JAXBElement<String> createSendSMSappIDNumber(String value) {
        return new JAXBElement<String>(_ResponseSMSNumber_QNAME, String.class, SendSMSappID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "appID", scope = SendSMSappID.class)
    public JAXBElement<String> createSendSMSappIDAppID(String value) {
        return new JAXBElement<String>(_SendSMSappIDAppID_QNAME, String.class, SendSMSappID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "password", scope = SendSMSappID.class)
    public JAXBElement<String> createSendSMSappIDPassword(String value) {
        return new JAXBElement<String>(_ResponseSMSPassword_QNAME, String.class, SendSMSappID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "passport", scope = SendSMSappID.class)
    public JAXBElement<String> createSendSMSappIDPassport(String value) {
        return new JAXBElement<String>(_ResponseSMSPassport_QNAME, String.class, SendSMSappID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "text", scope = SendSMSappID.class)
    public JAXBElement<String> createSendSMSappIDText(String value) {
        return new JAXBElement<String>(_ResponseSMSText_QNAME, String.class, SendSMSappID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "number", scope = SendSMSccappID.class)
    public JAXBElement<String> createSendSMSccappIDNumber(String value) {
        return new JAXBElement<String>(_ResponseSMSNumber_QNAME, String.class, SendSMSccappID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "countryCode", scope = SendSMSccappID.class)
    public JAXBElement<String> createSendSMSccappIDCountryCode(String value) {
        return new JAXBElement<String>(_ResponseSMSccCountryCode_QNAME, String.class, SendSMSccappID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "appID", scope = SendSMSccappID.class)
    public JAXBElement<String> createSendSMSccappIDAppID(String value) {
        return new JAXBElement<String>(_SendSMSappIDAppID_QNAME, String.class, SendSMSccappID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "password", scope = SendSMSccappID.class)
    public JAXBElement<String> createSendSMSccappIDPassword(String value) {
        return new JAXBElement<String>(_ResponseSMSPassword_QNAME, String.class, SendSMSccappID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "passport", scope = SendSMSccappID.class)
    public JAXBElement<String> createSendSMSccappIDPassport(String value) {
        return new JAXBElement<String>(_ResponseSMSPassport_QNAME, String.class, SendSMSccappID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "text", scope = SendSMSccappID.class)
    public JAXBElement<String> createSendSMSccappIDText(String value) {
        return new JAXBElement<String>(_ResponseSMSText_QNAME, String.class, SendSMSccappID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "number", scope = SendSMSWithIDcc.class)
    public JAXBElement<String> createSendSMSWithIDccNumber(String value) {
        return new JAXBElement<String>(_ResponseSMSNumber_QNAME, String.class, SendSMSWithIDcc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "countryCode", scope = SendSMSWithIDcc.class)
    public JAXBElement<String> createSendSMSWithIDccCountryCode(String value) {
        return new JAXBElement<String>(_ResponseSMSccCountryCode_QNAME, String.class, SendSMSWithIDcc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "password", scope = SendSMSWithIDcc.class)
    public JAXBElement<String> createSendSMSWithIDccPassword(String value) {
        return new JAXBElement<String>(_ResponseSMSPassword_QNAME, String.class, SendSMSWithIDcc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "passport", scope = SendSMSWithIDcc.class)
    public JAXBElement<String> createSendSMSWithIDccPassport(String value) {
        return new JAXBElement<String>(_ResponseSMSPassport_QNAME, String.class, SendSMSWithIDcc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "text", scope = SendSMSWithIDcc.class)
    public JAXBElement<String> createSendSMSWithIDccText(String value) {
        return new JAXBElement<String>(_ResponseSMSText_QNAME, String.class, SendSMSWithIDcc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "number", scope = SendSMScc.class)
    public JAXBElement<String> createSendSMSccNumber(String value) {
        return new JAXBElement<String>(_ResponseSMSNumber_QNAME, String.class, SendSMScc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "countryCode", scope = SendSMScc.class)
    public JAXBElement<String> createSendSMSccCountryCode(String value) {
        return new JAXBElement<String>(_ResponseSMSccCountryCode_QNAME, String.class, SendSMScc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "password", scope = SendSMScc.class)
    public JAXBElement<String> createSendSMSccPassword(String value) {
        return new JAXBElement<String>(_ResponseSMSPassword_QNAME, String.class, SendSMScc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "passport", scope = SendSMScc.class)
    public JAXBElement<String> createSendSMSccPassport(String value) {
        return new JAXBElement<String>(_ResponseSMSPassport_QNAME, String.class, SendSMScc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://core.ws.m4.tedexis.com", name = "text", scope = SendSMScc.class)
    public JAXBElement<String> createSendSMSccText(String value) {
        return new JAXBElement<String>(_ResponseSMSText_QNAME, String.class, SendSMScc.class, value);
    }

}
