package com.njupt.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.njupt.service package.
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

	private final static QName _UserRegister_QNAME = new QName(
			"http://service.njupt.com/", "userRegister");
	private final static QName _GetPermissionResponse_QNAME = new QName(
			"http://service.njupt.com/", "getPermissionResponse");
	private final static QName _UserRegisterResponse_QNAME = new QName(
			"http://service.njupt.com/", "userRegisterResponse");
	private final static QName _GetPermission_QNAME = new QName(
			"http://service.njupt.com/", "getPermission");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.njupt.service
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link UserRegisterResponse }
	 * 
	 */
	public UserRegisterResponse createUserRegisterResponse() {
		return new UserRegisterResponse();
	}

	/**
	 * Create an instance of {@link UserRegister }
	 * 
	 */
	public UserRegister createUserRegister() {
		return new UserRegister();
	}

	/**
	 * Create an instance of {@link GetPermissionResponse }
	 * 
	 */
	public GetPermissionResponse createGetPermissionResponse() {
		return new GetPermissionResponse();
	}

	/**
	 * Create an instance of {@link GetPermission }
	 * 
	 */
	public GetPermission createGetPermission() {
		return new GetPermission();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UserRegister }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "userRegister")
	public JAXBElement<UserRegister> createUserRegister(UserRegister value) {
		return new JAXBElement<UserRegister>(_UserRegister_QNAME,
				UserRegister.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetPermissionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getPermissionResponse")
	public JAXBElement<GetPermissionResponse> createGetPermissionResponse(
			GetPermissionResponse value) {
		return new JAXBElement<GetPermissionResponse>(
				_GetPermissionResponse_QNAME, GetPermissionResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UserRegisterResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "userRegisterResponse")
	public JAXBElement<UserRegisterResponse> createUserRegisterResponse(
			UserRegisterResponse value) {
		return new JAXBElement<UserRegisterResponse>(
				_UserRegisterResponse_QNAME, UserRegisterResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetPermission }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getPermission")
	public JAXBElement<GetPermission> createGetPermission(GetPermission value) {
		return new JAXBElement<GetPermission>(_GetPermission_QNAME,
				GetPermission.class, null, value);
	}

}
