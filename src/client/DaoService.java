package client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * DaoService service = new DaoService();
 * DaoDelegate portType = service.getDaoPort();
 * portType.sayHello(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "DaoService", targetNamespace = "http://dao.ws_cxf_spring.njupt.com/", wsdlLocation = "http://localhost:8080/IoT_Management_WebService/DaoPort?wsdl")
public class DaoService extends Service {

	private final static URL DAOSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(client.DaoService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = client.DaoService.class.getResource(".");
			url = new URL(baseUrl,
					"http://localhost:8080/IoT_Management_WebService/DaoPort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/IoT_Management_WebService/DaoPort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		DAOSERVICE_WSDL_LOCATION = url;
	}

	public DaoService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public DaoService() {
		super(DAOSERVICE_WSDL_LOCATION, new QName(
				"http://dao.ws_cxf_spring.njupt.com/", "DaoService"));
	}

	/**
	 * 
	 * @return returns DaoDelegate
	 */
	@WebEndpoint(name = "DaoPort")
	public DaoDelegate getDaoPort() {
		return super.getPort(new QName("http://dao.ws_cxf_spring.njupt.com/",
				"DaoPort"), DaoDelegate.class);
	}

}
