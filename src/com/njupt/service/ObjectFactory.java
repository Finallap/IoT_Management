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

	private final static QName _CountControllingDevice_QNAME = new QName(
			"http://service.njupt.com/", "countControllingDevice");
	private final static QName _AddControllingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "addControllingDeviceResponse");
	private final static QName _AddProject_QNAME = new QName(
			"http://service.njupt.com/", "addProject");
	private final static QName _CountConfigTypeResponse_QNAME = new QName(
			"http://service.njupt.com/", "countConfigTypeResponse");
	private final static QName _GetPermissionResponse_QNAME = new QName(
			"http://service.njupt.com/", "getPermissionResponse");
	private final static QName _DeleteControllingDevice_QNAME = new QName(
			"http://service.njupt.com/", "deleteControllingDevice");
	private final static QName _AddDataType_QNAME = new QName(
			"http://service.njupt.com/", "addDataType");
	private final static QName _DeleteProjectResponse_QNAME = new QName(
			"http://service.njupt.com/", "deleteProjectResponse");
	private final static QName _AddConfigTypeResponse_QNAME = new QName(
			"http://service.njupt.com/", "addConfigTypeResponse");
	private final static QName _CountSensingDevice_QNAME = new QName(
			"http://service.njupt.com/", "countSensingDevice");
	private final static QName _UserRegister_QNAME = new QName(
			"http://service.njupt.com/", "userRegister");
	private final static QName _AddSensingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "addSensingDeviceResponse");
	private final static QName _AddProjectResponse_QNAME = new QName(
			"http://service.njupt.com/", "addProjectResponse");
	private final static QName _CountProjectResponse_QNAME = new QName(
			"http://service.njupt.com/", "countProjectResponse");
	private final static QName _UpdateProjectResponse_QNAME = new QName(
			"http://service.njupt.com/", "updateProjectResponse");
	private final static QName _UpdateProject_QNAME = new QName(
			"http://service.njupt.com/", "updateProject");
	private final static QName _AddDataTypeResponse_QNAME = new QName(
			"http://service.njupt.com/", "addDataTypeResponse");
	private final static QName _CountControllingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "countControllingDeviceResponse");
	private final static QName _CountSensingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "countSensingDeviceResponse");
	private final static QName _DeleteSensingDevice_QNAME = new QName(
			"http://service.njupt.com/", "deleteSensingDevice");
	private final static QName _DeleteProject_QNAME = new QName(
			"http://service.njupt.com/", "deleteProject");
	private final static QName _AddControllingDevice_QNAME = new QName(
			"http://service.njupt.com/", "addControllingDevice");
	private final static QName _CountDataTypeResponse_QNAME = new QName(
			"http://service.njupt.com/", "countDataTypeResponse");
	private final static QName _AddConfigType_QNAME = new QName(
			"http://service.njupt.com/", "addConfigType");
	private final static QName _UserRegisterResponse_QNAME = new QName(
			"http://service.njupt.com/", "userRegisterResponse");
	private final static QName _DeleteControllingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "deleteControllingDeviceResponse");
	private final static QName _AddSensingDevice_QNAME = new QName(
			"http://service.njupt.com/", "addSensingDevice");
	private final static QName _DeleteSensingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "deleteSensingDeviceResponse");
	private final static QName _CountConfigType_QNAME = new QName(
			"http://service.njupt.com/", "countConfigType");
	private final static QName _CountDataType_QNAME = new QName(
			"http://service.njupt.com/", "countDataType");
	private final static QName _CountProject_QNAME = new QName(
			"http://service.njupt.com/", "countProject");
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
	 * Create an instance of {@link UserRegister }
	 * 
	 */
	public UserRegister createUserRegister() {
		return new UserRegister();
	}

	/**
	 * Create an instance of {@link DeleteControllingDeviceResponse }
	 * 
	 */
	public DeleteControllingDeviceResponse createDeleteControllingDeviceResponse() {
		return new DeleteControllingDeviceResponse();
	}

	/**
	 * Create an instance of {@link DeleteProjectResponse }
	 * 
	 */
	public DeleteProjectResponse createDeleteProjectResponse() {
		return new DeleteProjectResponse();
	}

	/**
	 * Create an instance of {@link DeleteSensingDevice }
	 * 
	 */
	public DeleteSensingDevice createDeleteSensingDevice() {
		return new DeleteSensingDevice();
	}

	/**
	 * Create an instance of {@link AddProjectResponse }
	 * 
	 */
	public AddProjectResponse createAddProjectResponse() {
		return new AddProjectResponse();
	}

	/**
	 * Create an instance of {@link AddSensingDeviceResponse }
	 * 
	 */
	public AddSensingDeviceResponse createAddSensingDeviceResponse() {
		return new AddSensingDeviceResponse();
	}

	/**
	 * Create an instance of {@link AddControllingDeviceResponse }
	 * 
	 */
	public AddControllingDeviceResponse createAddControllingDeviceResponse() {
		return new AddControllingDeviceResponse();
	}

	/**
	 * Create an instance of {@link CountProject }
	 * 
	 */
	public CountProject createCountProject() {
		return new CountProject();
	}

	/**
	 * Create an instance of {@link AddConfigTypeResponse }
	 * 
	 */
	public AddConfigTypeResponse createAddConfigTypeResponse() {
		return new AddConfigTypeResponse();
	}

	/**
	 * Create an instance of {@link CountConfigTypeResponse }
	 * 
	 */
	public CountConfigTypeResponse createCountConfigTypeResponse() {
		return new CountConfigTypeResponse();
	}

	/**
	 * Create an instance of {@link DeleteControllingDevice }
	 * 
	 */
	public DeleteControllingDevice createDeleteControllingDevice() {
		return new DeleteControllingDevice();
	}

	/**
	 * Create an instance of {@link CountSensingDeviceResponse }
	 * 
	 */
	public CountSensingDeviceResponse createCountSensingDeviceResponse() {
		return new CountSensingDeviceResponse();
	}

	/**
	 * Create an instance of {@link DeleteSensingDeviceResponse }
	 * 
	 */
	public DeleteSensingDeviceResponse createDeleteSensingDeviceResponse() {
		return new DeleteSensingDeviceResponse();
	}

	/**
	 * Create an instance of {@link GetPermission }
	 * 
	 */
	public GetPermission createGetPermission() {
		return new GetPermission();
	}

	/**
	 * Create an instance of {@link AddSensingDevice }
	 * 
	 */
	public AddSensingDevice createAddSensingDevice() {
		return new AddSensingDevice();
	}

	/**
	 * Create an instance of {@link CountDataType }
	 * 
	 */
	public CountDataType createCountDataType() {
		return new CountDataType();
	}

	/**
	 * Create an instance of {@link CountProjectResponse }
	 * 
	 */
	public CountProjectResponse createCountProjectResponse() {
		return new CountProjectResponse();
	}

	/**
	 * Create an instance of {@link UpdateProjectResponse }
	 * 
	 */
	public UpdateProjectResponse createUpdateProjectResponse() {
		return new UpdateProjectResponse();
	}

	/**
	 * Create an instance of {@link GetPermissionResponse }
	 * 
	 */
	public GetPermissionResponse createGetPermissionResponse() {
		return new GetPermissionResponse();
	}

	/**
	 * Create an instance of {@link CountDataTypeResponse }
	 * 
	 */
	public CountDataTypeResponse createCountDataTypeResponse() {
		return new CountDataTypeResponse();
	}

	/**
	 * Create an instance of {@link CountSensingDevice }
	 * 
	 */
	public CountSensingDevice createCountSensingDevice() {
		return new CountSensingDevice();
	}

	/**
	 * Create an instance of {@link CountConfigType }
	 * 
	 */
	public CountConfigType createCountConfigType() {
		return new CountConfigType();
	}

	/**
	 * Create an instance of {@link CountControllingDeviceResponse }
	 * 
	 */
	public CountControllingDeviceResponse createCountControllingDeviceResponse() {
		return new CountControllingDeviceResponse();
	}

	/**
	 * Create an instance of {@link AddConfigType }
	 * 
	 */
	public AddConfigType createAddConfigType() {
		return new AddConfigType();
	}

	/**
	 * Create an instance of {@link AddControllingDevice }
	 * 
	 */
	public AddControllingDevice createAddControllingDevice() {
		return new AddControllingDevice();
	}

	/**
	 * Create an instance of {@link AddProject }
	 * 
	 */
	public AddProject createAddProject() {
		return new AddProject();
	}

	/**
	 * Create an instance of {@link UpdateProject }
	 * 
	 */
	public UpdateProject createUpdateProject() {
		return new UpdateProject();
	}

	/**
	 * Create an instance of {@link UserRegisterResponse }
	 * 
	 */
	public UserRegisterResponse createUserRegisterResponse() {
		return new UserRegisterResponse();
	}

	/**
	 * Create an instance of {@link DeleteProject }
	 * 
	 */
	public DeleteProject createDeleteProject() {
		return new DeleteProject();
	}

	/**
	 * Create an instance of {@link AddDataTypeResponse }
	 * 
	 */
	public AddDataTypeResponse createAddDataTypeResponse() {
		return new AddDataTypeResponse();
	}

	/**
	 * Create an instance of {@link CountControllingDevice }
	 * 
	 */
	public CountControllingDevice createCountControllingDevice() {
		return new CountControllingDevice();
	}

	/**
	 * Create an instance of {@link AddDataType }
	 * 
	 */
	public AddDataType createAddDataType() {
		return new AddDataType();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CountControllingDevice }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countControllingDevice")
	public JAXBElement<CountControllingDevice> createCountControllingDevice(
			CountControllingDevice value) {
		return new JAXBElement<CountControllingDevice>(
				_CountControllingDevice_QNAME, CountControllingDevice.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AddControllingDeviceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "addControllingDeviceResponse")
	public JAXBElement<AddControllingDeviceResponse> createAddControllingDeviceResponse(
			AddControllingDeviceResponse value) {
		return new JAXBElement<AddControllingDeviceResponse>(
				_AddControllingDeviceResponse_QNAME,
				AddControllingDeviceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AddProject }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "addProject")
	public JAXBElement<AddProject> createAddProject(AddProject value) {
		return new JAXBElement<AddProject>(_AddProject_QNAME, AddProject.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CountConfigTypeResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countConfigTypeResponse")
	public JAXBElement<CountConfigTypeResponse> createCountConfigTypeResponse(
			CountConfigTypeResponse value) {
		return new JAXBElement<CountConfigTypeResponse>(
				_CountConfigTypeResponse_QNAME, CountConfigTypeResponse.class,
				null, value);
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
	 * {@link DeleteControllingDevice }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "deleteControllingDevice")
	public JAXBElement<DeleteControllingDevice> createDeleteControllingDevice(
			DeleteControllingDevice value) {
		return new JAXBElement<DeleteControllingDevice>(
				_DeleteControllingDevice_QNAME, DeleteControllingDevice.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AddDataType }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "addDataType")
	public JAXBElement<AddDataType> createAddDataType(AddDataType value) {
		return new JAXBElement<AddDataType>(_AddDataType_QNAME,
				AddDataType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteProjectResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "deleteProjectResponse")
	public JAXBElement<DeleteProjectResponse> createDeleteProjectResponse(
			DeleteProjectResponse value) {
		return new JAXBElement<DeleteProjectResponse>(
				_DeleteProjectResponse_QNAME, DeleteProjectResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AddConfigTypeResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "addConfigTypeResponse")
	public JAXBElement<AddConfigTypeResponse> createAddConfigTypeResponse(
			AddConfigTypeResponse value) {
		return new JAXBElement<AddConfigTypeResponse>(
				_AddConfigTypeResponse_QNAME, AddConfigTypeResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CountSensingDevice }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countSensingDevice")
	public JAXBElement<CountSensingDevice> createCountSensingDevice(
			CountSensingDevice value) {
		return new JAXBElement<CountSensingDevice>(_CountSensingDevice_QNAME,
				CountSensingDevice.class, null, value);
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
	 * {@link AddSensingDeviceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "addSensingDeviceResponse")
	public JAXBElement<AddSensingDeviceResponse> createAddSensingDeviceResponse(
			AddSensingDeviceResponse value) {
		return new JAXBElement<AddSensingDeviceResponse>(
				_AddSensingDeviceResponse_QNAME,
				AddSensingDeviceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AddProjectResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "addProjectResponse")
	public JAXBElement<AddProjectResponse> createAddProjectResponse(
			AddProjectResponse value) {
		return new JAXBElement<AddProjectResponse>(_AddProjectResponse_QNAME,
				AddProjectResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CountProjectResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countProjectResponse")
	public JAXBElement<CountProjectResponse> createCountProjectResponse(
			CountProjectResponse value) {
		return new JAXBElement<CountProjectResponse>(
				_CountProjectResponse_QNAME, CountProjectResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateProjectResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "updateProjectResponse")
	public JAXBElement<UpdateProjectResponse> createUpdateProjectResponse(
			UpdateProjectResponse value) {
		return new JAXBElement<UpdateProjectResponse>(
				_UpdateProjectResponse_QNAME, UpdateProjectResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProject }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "updateProject")
	public JAXBElement<UpdateProject> createUpdateProject(UpdateProject value) {
		return new JAXBElement<UpdateProject>(_UpdateProject_QNAME,
				UpdateProject.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AddDataTypeResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "addDataTypeResponse")
	public JAXBElement<AddDataTypeResponse> createAddDataTypeResponse(
			AddDataTypeResponse value) {
		return new JAXBElement<AddDataTypeResponse>(_AddDataTypeResponse_QNAME,
				AddDataTypeResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CountControllingDeviceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countControllingDeviceResponse")
	public JAXBElement<CountControllingDeviceResponse> createCountControllingDeviceResponse(
			CountControllingDeviceResponse value) {
		return new JAXBElement<CountControllingDeviceResponse>(
				_CountControllingDeviceResponse_QNAME,
				CountControllingDeviceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CountSensingDeviceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countSensingDeviceResponse")
	public JAXBElement<CountSensingDeviceResponse> createCountSensingDeviceResponse(
			CountSensingDeviceResponse value) {
		return new JAXBElement<CountSensingDeviceResponse>(
				_CountSensingDeviceResponse_QNAME,
				CountSensingDeviceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteSensingDevice }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "deleteSensingDevice")
	public JAXBElement<DeleteSensingDevice> createDeleteSensingDevice(
			DeleteSensingDevice value) {
		return new JAXBElement<DeleteSensingDevice>(_DeleteSensingDevice_QNAME,
				DeleteSensingDevice.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProject }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "deleteProject")
	public JAXBElement<DeleteProject> createDeleteProject(DeleteProject value) {
		return new JAXBElement<DeleteProject>(_DeleteProject_QNAME,
				DeleteProject.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AddControllingDevice }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "addControllingDevice")
	public JAXBElement<AddControllingDevice> createAddControllingDevice(
			AddControllingDevice value) {
		return new JAXBElement<AddControllingDevice>(
				_AddControllingDevice_QNAME, AddControllingDevice.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CountDataTypeResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countDataTypeResponse")
	public JAXBElement<CountDataTypeResponse> createCountDataTypeResponse(
			CountDataTypeResponse value) {
		return new JAXBElement<CountDataTypeResponse>(
				_CountDataTypeResponse_QNAME, CountDataTypeResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AddConfigType }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "addConfigType")
	public JAXBElement<AddConfigType> createAddConfigType(AddConfigType value) {
		return new JAXBElement<AddConfigType>(_AddConfigType_QNAME,
				AddConfigType.class, null, value);
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
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteControllingDeviceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "deleteControllingDeviceResponse")
	public JAXBElement<DeleteControllingDeviceResponse> createDeleteControllingDeviceResponse(
			DeleteControllingDeviceResponse value) {
		return new JAXBElement<DeleteControllingDeviceResponse>(
				_DeleteControllingDeviceResponse_QNAME,
				DeleteControllingDeviceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AddSensingDevice }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "addSensingDevice")
	public JAXBElement<AddSensingDevice> createAddSensingDevice(
			AddSensingDevice value) {
		return new JAXBElement<AddSensingDevice>(_AddSensingDevice_QNAME,
				AddSensingDevice.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteSensingDeviceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "deleteSensingDeviceResponse")
	public JAXBElement<DeleteSensingDeviceResponse> createDeleteSensingDeviceResponse(
			DeleteSensingDeviceResponse value) {
		return new JAXBElement<DeleteSensingDeviceResponse>(
				_DeleteSensingDeviceResponse_QNAME,
				DeleteSensingDeviceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CountConfigType }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countConfigType")
	public JAXBElement<CountConfigType> createCountConfigType(
			CountConfigType value) {
		return new JAXBElement<CountConfigType>(_CountConfigType_QNAME,
				CountConfigType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CountDataType }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countDataType")
	public JAXBElement<CountDataType> createCountDataType(CountDataType value) {
		return new JAXBElement<CountDataType>(_CountDataType_QNAME,
				CountDataType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CountProject }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countProject")
	public JAXBElement<CountProject> createCountProject(CountProject value) {
		return new JAXBElement<CountProject>(_CountProject_QNAME,
				CountProject.class, null, value);
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
