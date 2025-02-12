package pe.gob.osinergmin.soa.sms.ws.service.consumer;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class SOAPConsumer {

	public static final String SOAPACTION_RECIBIR_SMS = "recibirSMSReqParamTYPE";
	public static final String SOAPACTION_RECIBE_SMS = "recibeSMS";
	private static final String NAMESPACE = "sms";
	private static final String NAMESPACE_URI = "http://soa.osinergmin.gob.pe/schema/comun/sms";
	
	public static String numRem="";
	public static String mensaje="";

	public static String callRecibeSMS(String soapEndpointUrl,
			String vNumRem, String vMensaje) {
		String result="";
		try {
			numRem = vNumRem;
			mensaje = vMensaje;
			// Create SOAP Connection
			SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory
					.newInstance();
			SOAPConnection soapConnection = soapConnectionFactory
					.createConnection();

			// Send SOAP Message to SOAP Server
			SOAPMessage soapResponse = soapConnection.call(
					createSOAPRequest(), soapEndpointUrl);

			// Print the SOAP Response
			System.out.println("Response SOAP Message:");
			soapResponse.writeTo(System.out);
			System.out.println();
//			Document doc = convertStringToDocument("<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
//					"   <soap:Body>\n" + 
//					"      <ns2:succesRecibirSMSParamTYPE xmlns=\"http://soa.osinergmin.gob.pe/schema/comun/consumidor\" xmlns:ns2=\"http://soa.osinergmin.gob.pe/schema/comun/sms\" xmlns:ns3=\"http://soa.osinergmin.gob.pe/schema/comun/fault\">\n" + 
//					"         <ns2:result>Solicitud: 3194520 registrada satisfactoriamente.</ns2:result>\n" + 
//					"      </ns2:succesRecibirSMSParamTYPE>\n" + 
//					"   </soap:Body>\n" + 
//					"</soap:Envelope>");
			Document doc = toDocument(soapResponse);
			try {
				System.out.println(doc.getElementsByTagName("result").item(0).getTextContent());
				result = doc.getElementsByTagName("result").item(0).getTextContent();
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error lectura etiqueta <result>");
			}
			try {
				if(result.trim()=="") {
					result = doc.getElementsByTagName("ns2:result").item(0).getTextContent();
					System.out.println(doc.getElementsByTagName("ns2:result").item(0).getTextContent());
				}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error lectura etiqueta <ns2:result>");
			}

			soapConnection.close();
		} catch (Exception e) {
			System.err
					.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
			e.printStackTrace();
		}
		return result;
	}
	
	private static Document convertStringToDocument(String xmlStr) {
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder builder;
	    try {
	        builder = factory.newDocumentBuilder();
	        Document doc = builder.parse(new InputSource(new StringReader(xmlStr)));
	        return doc;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	private static SOAPMessage createSOAPRequest()
			throws Exception {
		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage soapMessage = messageFactory.createMessage();

		createSoapEnvelope(soapMessage);

		MimeHeaders headers = soapMessage.getMimeHeaders();
		headers.addHeader("SOAPAction", SOAPACTION_RECIBE_SMS);

		soapMessage.saveChanges();

		/* Print the request message, just for debugging purposes */
		System.out.println("Request SOAP Message:");
		soapMessage.writeTo(System.out);
		System.out.println("\n");

		return soapMessage;
	}

	private static void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException {
		SOAPPart soapPart = soapMessage.getSOAPPart();

		String myNamespace = NAMESPACE;
		String myNamespaceURI = NAMESPACE_URI;

		// SOAP Envelope
		SOAPEnvelope envelope = soapPart.getEnvelope();
		envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);

		// SOAP Body
		SOAPBody soapBody = envelope.getBody();
		SOAPElement soapSMSReq = soapBody.addChildElement(
				"recibirSMSReqParamTYPE", myNamespace);
		SOAPElement soapNum = soapSMSReq.addChildElement("numRem", myNamespace);
		soapNum.addTextNode(numRem);
		SOAPElement soapMensaje = soapSMSReq.addChildElement("mensaje",
				myNamespace);
		soapMensaje.addTextNode(mensaje);
	}

	public static Document toDocument(SOAPMessage soapMsg)
			throws TransformerConfigurationException, TransformerException,
			SOAPException, IOException {
		Source src = soapMsg.getSOAPPart().getContent();
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		DOMResult result = new DOMResult();
		transformer.transform(src, result);
		return (Document) result.getNode();
	}

}