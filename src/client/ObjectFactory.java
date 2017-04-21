package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the client package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _Insertstudent_QNAME = new QName(
			"http://dao.ws_cxf_spring.njupt.com/", "insertstudent");
	private final static QName _SayHello_QNAME = new QName(
			"http://dao.ws_cxf_spring.njupt.com/", "sayHello");
	private final static QName _SayHelloResponse_QNAME = new QName(
			"http://dao.ws_cxf_spring.njupt.com/", "sayHelloResponse");
	private final static QName _GetStudentnamebyIDResponse_QNAME = new QName(
			"http://dao.ws_cxf_spring.njupt.com/", "getStudentnamebyIDResponse");
	private final static QName _GetStudentnamebyID_QNAME = new QName(
			"http://dao.ws_cxf_spring.njupt.com/", "getStudentnamebyID");
	private final static QName _InsertstudentResponse_QNAME = new QName(
			"http://dao.ws_cxf_spring.njupt.com/", "insertstudentResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: client
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link GetStudentnamebyIDResponse }
	 * 
	 */
	public GetStudentnamebyIDResponse createGetStudentnamebyIDResponse() {
		return new GetStudentnamebyIDResponse();
	}

	/**
	 * Create an instance of {@link SayHelloResponse }
	 * 
	 */
	public SayHelloResponse createSayHelloResponse() {
		return new SayHelloResponse();
	}

	/**
	 * Create an instance of {@link Insertstudent }
	 * 
	 */
	public Insertstudent createInsertstudent() {
		return new Insertstudent();
	}

	/**
	 * Create an instance of {@link InsertstudentResponse }
	 * 
	 */
	public InsertstudentResponse createInsertstudentResponse() {
		return new InsertstudentResponse();
	}

	/**
	 * Create an instance of {@link SayHello }
	 * 
	 */
	public SayHello createSayHello() {
		return new SayHello();
	}

	/**
	 * Create an instance of {@link GetStudentnamebyID }
	 * 
	 */
	public GetStudentnamebyID createGetStudentnamebyID() {
		return new GetStudentnamebyID();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Insertstudent }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://dao.ws_cxf_spring.njupt.com/", name = "insertstudent")
	public JAXBElement<Insertstudent> createInsertstudent(Insertstudent value) {
		return new JAXBElement<Insertstudent>(_Insertstudent_QNAME,
				Insertstudent.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://dao.ws_cxf_spring.njupt.com/", name = "sayHello")
	public JAXBElement<SayHello> createSayHello(SayHello value) {
		return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SayHelloResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://dao.ws_cxf_spring.njupt.com/", name = "sayHelloResponse")
	public JAXBElement<SayHelloResponse> createSayHelloResponse(
			SayHelloResponse value) {
		return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME,
				SayHelloResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetStudentnamebyIDResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://dao.ws_cxf_spring.njupt.com/", name = "getStudentnamebyIDResponse")
	public JAXBElement<GetStudentnamebyIDResponse> createGetStudentnamebyIDResponse(
			GetStudentnamebyIDResponse value) {
		return new JAXBElement<GetStudentnamebyIDResponse>(
				_GetStudentnamebyIDResponse_QNAME,
				GetStudentnamebyIDResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetStudentnamebyID }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://dao.ws_cxf_spring.njupt.com/", name = "getStudentnamebyID")
	public JAXBElement<GetStudentnamebyID> createGetStudentnamebyID(
			GetStudentnamebyID value) {
		return new JAXBElement<GetStudentnamebyID>(_GetStudentnamebyID_QNAME,
				GetStudentnamebyID.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertstudentResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://dao.ws_cxf_spring.njupt.com/", name = "insertstudentResponse")
	public JAXBElement<InsertstudentResponse> createInsertstudentResponse(
			InsertstudentResponse value) {
		return new JAXBElement<InsertstudentResponse>(
				_InsertstudentResponse_QNAME, InsertstudentResponse.class,
				null, value);
	}

}
