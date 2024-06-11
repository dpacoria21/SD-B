package es.rosamarfil;

import javax.xml.ws.Endpoint;
import es.rosamarfil.soap.SOAPImpl;

public class PublishServices {
	public static void main(String[] args) {
		/*
		 * Se publican los servicios a través de un servidor virtual. El puerto puede
		 * ser cualquiera. Un vez ejecutada la aplicación, se publica el contrato WSDL
		 */
		Endpoint.publish("http://localhost:8080/WSSOAP/Users", new SOAPImpl());
	}
}
