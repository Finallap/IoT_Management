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

	private final static QName _AddControllingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "addControllingDeviceResponse");
	private final static QName _AddProject_QNAME = new QName(
			"http://service.njupt.com/", "addProject");
	private final static QName _GetDataTypeListByDeviceIDResponse_QNAME = new QName(
			"http://service.njupt.com/", "getDataTypeListByDeviceIDResponse");
	private final static QName _QueryProject_QNAME = new QName(
			"http://service.njupt.com/", "queryProject");
	private final static QName _GetUserByUserName_QNAME = new QName(
			"http://service.njupt.com/", "getUserByUserName");
	private final static QName _AddAlarmRuleResponse_QNAME = new QName(
			"http://service.njupt.com/", "addAlarmRuleResponse");
	private final static QName _CountUserControllingDevice_QNAME = new QName(
			"http://service.njupt.com/", "countUserControllingDevice");
	private final static QName _DeleteControllingDevice_QNAME = new QName(
			"http://service.njupt.com/", "deleteControllingDevice");
	private final static QName _UpdateSensingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "updateSensingDeviceResponse");
	private final static QName _DeleteProjectResponse_QNAME = new QName(
			"http://service.njupt.com/", "deleteProjectResponse");
	private final static QName _AddDataType_QNAME = new QName(
			"http://service.njupt.com/", "addDataType");
	private final static QName _GetSensingDeviceByDeviceIDResponse_QNAME = new QName(
			"http://service.njupt.com/", "getSensingDeviceByDeviceIDResponse");
	private final static QName _GetProjectByProjectID_QNAME = new QName(
			"http://service.njupt.com/", "getProjectByProjectID");
	private final static QName _GetSensingDeviceListByProjectIDResponse_QNAME = new QName(
			"http://service.njupt.com/",
			"getSensingDeviceListByProjectIDResponse");
	private final static QName _QueryUserControllingDevice_QNAME = new QName(
			"http://service.njupt.com/", "queryUserControllingDevice");
	private final static QName _CountProjectResponse_QNAME = new QName(
			"http://service.njupt.com/", "countProjectResponse");
	private final static QName _GetDataTypeListByDeviceID_QNAME = new QName(
			"http://service.njupt.com/", "getDataTypeListByDeviceID");
	private final static QName _AddDataTypeResponse_QNAME = new QName(
			"http://service.njupt.com/", "addDataTypeResponse");
	private final static QName _GetConfigTypeListByDeviceID_QNAME = new QName(
			"http://service.njupt.com/", "getConfigTypeListByDeviceID");
	private final static QName _DeleteAlarmRuleResponse_QNAME = new QName(
			"http://service.njupt.com/", "deleteAlarmRuleResponse");
	private final static QName _UpdateControllingDevice_QNAME = new QName(
			"http://service.njupt.com/", "updateControllingDevice");
	private final static QName _AddControllingDevice_QNAME = new QName(
			"http://service.njupt.com/", "addControllingDevice");
	private final static QName _GetConfigLogByDeviceIDResponse_QNAME = new QName(
			"http://service.njupt.com/", "getConfigLogByDeviceIDResponse");
	private final static QName _UpdateConfigType_QNAME = new QName(
			"http://service.njupt.com/", "updateConfigType");
	private final static QName _UpdateAlarmRuleResponse_QNAME = new QName(
			"http://service.njupt.com/", "updateAlarmRuleResponse");
	private final static QName _DeleteControllingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "deleteControllingDeviceResponse");
	private final static QName _GetConfigTypeListByDeviceIDResponse_QNAME = new QName(
			"http://service.njupt.com/", "getConfigTypeListByDeviceIDResponse");
	private final static QName _QueryUserSensingDevice_QNAME = new QName(
			"http://service.njupt.com/", "queryUserSensingDevice");
	private final static QName _GetControllingDeviceByDeviceID_QNAME = new QName(
			"http://service.njupt.com/", "getControllingDeviceByDeviceID");
	private final static QName _DeleteSensingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "deleteSensingDeviceResponse");
	private final static QName _GetControllingDeviceListByProjectIDResponse_QNAME = new QName(
			"http://service.njupt.com/",
			"getControllingDeviceListByProjectIDResponse");
	private final static QName _CountUserSensingDevice_QNAME = new QName(
			"http://service.njupt.com/", "countUserSensingDevice");
	private final static QName _GetAlarmRuleListByDeviceIDResponse_QNAME = new QName(
			"http://service.njupt.com/", "getAlarmRuleListByDeviceIDResponse");
	private final static QName _GetControllingDeviceListByProjectID_QNAME = new QName(
			"http://service.njupt.com/", "getControllingDeviceListByProjectID");
	private final static QName _CountProject_QNAME = new QName(
			"http://service.njupt.com/", "countProject");
	private final static QName _GetProjectByProjectIDResponse_QNAME = new QName(
			"http://service.njupt.com/", "getProjectByProjectIDResponse");
	private final static QName _GetSensingDeviceByDeviceID_QNAME = new QName(
			"http://service.njupt.com/", "getSensingDeviceByDeviceID");
	private final static QName _DeleteAlarmRule_QNAME = new QName(
			"http://service.njupt.com/", "deleteAlarmRule");
	private final static QName _CountUserSensingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "countUserSensingDeviceResponse");
	private final static QName _GetPermission_QNAME = new QName(
			"http://service.njupt.com/", "getPermission");
	private final static QName _UpdateAlarmRule_QNAME = new QName(
			"http://service.njupt.com/", "updateAlarmRule");
	private final static QName _GetUserByUserNameResponse_QNAME = new QName(
			"http://service.njupt.com/", "getUserByUserNameResponse");
	private final static QName _QueryUserControllingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "queryUserControllingDeviceResponse");
	private final static QName _UpdateControllingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "updateControllingDeviceResponse");
	private final static QName _QueryProjectResponse_QNAME = new QName(
			"http://service.njupt.com/", "queryProjectResponse");
	private final static QName _QueryUserSensingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "queryUserSensingDeviceResponse");
	private final static QName _UpdateConfigTypeResponse_QNAME = new QName(
			"http://service.njupt.com/", "updateConfigTypeResponse");
	private final static QName _GetPermissionResponse_QNAME = new QName(
			"http://service.njupt.com/", "getPermissionResponse");
	private final static QName _GetControllingDeviceByDeviceIDResponse_QNAME = new QName(
			"http://service.njupt.com/",
			"getControllingDeviceByDeviceIDResponse");
	private final static QName _AddConfigTypeResponse_QNAME = new QName(
			"http://service.njupt.com/", "addConfigTypeResponse");
	private final static QName _UserRegister_QNAME = new QName(
			"http://service.njupt.com/", "userRegister");
	private final static QName _GetAlarmRuleListByDeviceID_QNAME = new QName(
			"http://service.njupt.com/", "getAlarmRuleListByDeviceID");
	private final static QName _GetDataLogByDeviceIDResponse_QNAME = new QName(
			"http://service.njupt.com/", "getDataLogByDeviceIDResponse");
	private final static QName _AddSensingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "addSensingDeviceResponse");
	private final static QName _DeleteConfigTypeResponse_QNAME = new QName(
			"http://service.njupt.com/", "deleteConfigTypeResponse");
	private final static QName _AddProjectResponse_QNAME = new QName(
			"http://service.njupt.com/", "addProjectResponse");
	private final static QName _UpdateProjectResponse_QNAME = new QName(
			"http://service.njupt.com/", "updateProjectResponse");
	private final static QName _DeleteConfigType_QNAME = new QName(
			"http://service.njupt.com/", "deleteConfigType");
	private final static QName _UpdateProject_QNAME = new QName(
			"http://service.njupt.com/", "updateProject");
	private final static QName _DeleteDataType_QNAME = new QName(
			"http://service.njupt.com/", "deleteDataType");
	private final static QName _DeleteSensingDevice_QNAME = new QName(
			"http://service.njupt.com/", "deleteSensingDevice");
	private final static QName _DeleteProject_QNAME = new QName(
			"http://service.njupt.com/", "deleteProject");
	private final static QName _CountUserControllingDeviceResponse_QNAME = new QName(
			"http://service.njupt.com/", "countUserControllingDeviceResponse");
	private final static QName _AddConfigType_QNAME = new QName(
			"http://service.njupt.com/", "addConfigType");
	private final static QName _UserRegisterResponse_QNAME = new QName(
			"http://service.njupt.com/", "userRegisterResponse");
	private final static QName _UpdateDataTypeResponse_QNAME = new QName(
			"http://service.njupt.com/", "updateDataTypeResponse");
	private final static QName _AddAlarmRule_QNAME = new QName(
			"http://service.njupt.com/", "addAlarmRule");
	private final static QName _AddSensingDevice_QNAME = new QName(
			"http://service.njupt.com/", "addSensingDevice");
	private final static QName _GetDataLogByDeviceID_QNAME = new QName(
			"http://service.njupt.com/", "getDataLogByDeviceID");
	private final static QName _UpdateSensingDevice_QNAME = new QName(
			"http://service.njupt.com/", "updateSensingDevice");
	private final static QName _UpdateDataType_QNAME = new QName(
			"http://service.njupt.com/", "updateDataType");
	private final static QName _GetConfigLogByDeviceID_QNAME = new QName(
			"http://service.njupt.com/", "getConfigLogByDeviceID");
	private final static QName _DeleteDataTypeResponse_QNAME = new QName(
			"http://service.njupt.com/", "deleteDataTypeResponse");
	private final static QName _GetSensingDeviceListByProjectID_QNAME = new QName(
			"http://service.njupt.com/", "getSensingDeviceListByProjectID");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.njupt.service
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link AddConfigType }
	 * 
	 */
	public AddConfigType createAddConfigType() {
		return new AddConfigType();
	}

	/**
	 * Create an instance of {@link QueryUserSensingDeviceResponse }
	 * 
	 */
	public QueryUserSensingDeviceResponse createQueryUserSensingDeviceResponse() {
		return new QueryUserSensingDeviceResponse();
	}

	/**
	 * Create an instance of {@link DeleteProjectResponse }
	 * 
	 */
	public DeleteProjectResponse createDeleteProjectResponse() {
		return new DeleteProjectResponse();
	}

	/**
	 * Create an instance of {@link CountProjectResponse }
	 * 
	 */
	public CountProjectResponse createCountProjectResponse() {
		return new CountProjectResponse();
	}

	/**
	 * Create an instance of {@link UpdateSensingDevice }
	 * 
	 */
	public UpdateSensingDevice createUpdateSensingDevice() {
		return new UpdateSensingDevice();
	}

	/**
	 * Create an instance of {@link QueryUserControllingDeviceResponse }
	 * 
	 */
	public QueryUserControllingDeviceResponse createQueryUserControllingDeviceResponse() {
		return new QueryUserControllingDeviceResponse();
	}

	/**
	 * Create an instance of {@link DeleteSensingDevice }
	 * 
	 */
	public DeleteSensingDevice createDeleteSensingDevice() {
		return new DeleteSensingDevice();
	}

	/**
	 * Create an instance of {@link QueryProjectResponse }
	 * 
	 */
	public QueryProjectResponse createQueryProjectResponse() {
		return new QueryProjectResponse();
	}

	/**
	 * Create an instance of {@link GetControllingDeviceListByProjectIDResponse }
	 * 
	 */
	public GetControllingDeviceListByProjectIDResponse createGetControllingDeviceListByProjectIDResponse() {
		return new GetControllingDeviceListByProjectIDResponse();
	}

	/**
	 * Create an instance of {@link DeleteSensingDeviceResponse }
	 * 
	 */
	public DeleteSensingDeviceResponse createDeleteSensingDeviceResponse() {
		return new DeleteSensingDeviceResponse();
	}

	/**
	 * Create an instance of {@link GetProjectByProjectID }
	 * 
	 */
	public GetProjectByProjectID createGetProjectByProjectID() {
		return new GetProjectByProjectID();
	}

	/**
	 * Create an instance of {@link UpdateControllingDevice }
	 * 
	 */
	public UpdateControllingDevice createUpdateControllingDevice() {
		return new UpdateControllingDevice();
	}

	/**
	 * Create an instance of {@link GetSensingDeviceByDeviceID }
	 * 
	 */
	public GetSensingDeviceByDeviceID createGetSensingDeviceByDeviceID() {
		return new GetSensingDeviceByDeviceID();
	}

	/**
	 * Create an instance of {@link CountUserControllingDeviceResponse }
	 * 
	 */
	public CountUserControllingDeviceResponse createCountUserControllingDeviceResponse() {
		return new CountUserControllingDeviceResponse();
	}

	/**
	 * Create an instance of {@link AddDataTypeResponse }
	 * 
	 */
	public AddDataTypeResponse createAddDataTypeResponse() {
		return new AddDataTypeResponse();
	}

	/**
	 * Create an instance of {@link DeleteDataTypeResponse }
	 * 
	 */
	public DeleteDataTypeResponse createDeleteDataTypeResponse() {
		return new DeleteDataTypeResponse();
	}

	/**
	 * Create an instance of {@link UserRegisterResponse }
	 * 
	 */
	public UserRegisterResponse createUserRegisterResponse() {
		return new UserRegisterResponse();
	}

	/**
	 * Create an instance of {@link GetDataTypeListByDeviceIDResponse }
	 * 
	 */
	public GetDataTypeListByDeviceIDResponse createGetDataTypeListByDeviceIDResponse() {
		return new GetDataTypeListByDeviceIDResponse();
	}

	/**
	 * Create an instance of {@link AddDataType }
	 * 
	 */
	public AddDataType createAddDataType() {
		return new AddDataType();
	}

	/**
	 * Create an instance of {@link QueryUserSensingDevice }
	 * 
	 */
	public QueryUserSensingDevice createQueryUserSensingDevice() {
		return new QueryUserSensingDevice();
	}

	/**
	 * Create an instance of {@link DeleteControllingDeviceResponse }
	 * 
	 */
	public DeleteControllingDeviceResponse createDeleteControllingDeviceResponse() {
		return new DeleteControllingDeviceResponse();
	}

	/**
	 * Create an instance of {@link CountProject }
	 * 
	 */
	public CountProject createCountProject() {
		return new CountProject();
	}

	/**
	 * Create an instance of {@link DeleteDataType }
	 * 
	 */
	public DeleteDataType createDeleteDataType() {
		return new DeleteDataType();
	}

	/**
	 * Create an instance of {@link GetDataLogByDeviceIDResponse }
	 * 
	 */
	public GetDataLogByDeviceIDResponse createGetDataLogByDeviceIDResponse() {
		return new GetDataLogByDeviceIDResponse();
	}

	/**
	 * Create an instance of {@link AddAlarmRuleResponse }
	 * 
	 */
	public AddAlarmRuleResponse createAddAlarmRuleResponse() {
		return new AddAlarmRuleResponse();
	}

	/**
	 * Create an instance of {@link AddControllingDevice }
	 * 
	 */
	public AddControllingDevice createAddControllingDevice() {
		return new AddControllingDevice();
	}

	/**
	 * Create an instance of {@link UpdateSensingDeviceResponse }
	 * 
	 */
	public UpdateSensingDeviceResponse createUpdateSensingDeviceResponse() {
		return new UpdateSensingDeviceResponse();
	}

	/**
	 * Create an instance of {@link GetSensingDeviceListByProjectIDResponse }
	 * 
	 */
	public GetSensingDeviceListByProjectIDResponse createGetSensingDeviceListByProjectIDResponse() {
		return new GetSensingDeviceListByProjectIDResponse();
	}

	/**
	 * Create an instance of {@link UserRegister }
	 * 
	 */
	public UserRegister createUserRegister() {
		return new UserRegister();
	}

	/**
	 * Create an instance of {@link AddSensingDeviceResponse }
	 * 
	 */
	public AddSensingDeviceResponse createAddSensingDeviceResponse() {
		return new AddSensingDeviceResponse();
	}

	/**
	 * Create an instance of {@link UpdateConfigTypeResponse }
	 * 
	 */
	public UpdateConfigTypeResponse createUpdateConfigTypeResponse() {
		return new UpdateConfigTypeResponse();
	}

	/**
	 * Create an instance of {@link GetSensingDeviceByDeviceIDResponse }
	 * 
	 */
	public GetSensingDeviceByDeviceIDResponse createGetSensingDeviceByDeviceIDResponse() {
		return new GetSensingDeviceByDeviceIDResponse();
	}

	/**
	 * Create an instance of {@link GetConfigLogByDeviceID }
	 * 
	 */
	public GetConfigLogByDeviceID createGetConfigLogByDeviceID() {
		return new GetConfigLogByDeviceID();
	}

	/**
	 * Create an instance of {@link DeleteConfigTypeResponse }
	 * 
	 */
	public DeleteConfigTypeResponse createDeleteConfigTypeResponse() {
		return new DeleteConfigTypeResponse();
	}

	/**
	 * Create an instance of {@link GetConfigLogByDeviceIDResponse }
	 * 
	 */
	public GetConfigLogByDeviceIDResponse createGetConfigLogByDeviceIDResponse() {
		return new GetConfigLogByDeviceIDResponse();
	}

	/**
	 * Create an instance of {@link UpdateControllingDeviceResponse }
	 * 
	 */
	public UpdateControllingDeviceResponse createUpdateControllingDeviceResponse() {
		return new UpdateControllingDeviceResponse();
	}

	/**
	 * Create an instance of {@link GetControllingDeviceByDeviceIDResponse }
	 * 
	 */
	public GetControllingDeviceByDeviceIDResponse createGetControllingDeviceByDeviceIDResponse() {
		return new GetControllingDeviceByDeviceIDResponse();
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
	 * Create an instance of {@link GetControllingDeviceListByProjectID }
	 * 
	 */
	public GetControllingDeviceListByProjectID createGetControllingDeviceListByProjectID() {
		return new GetControllingDeviceListByProjectID();
	}

	/**
	 * Create an instance of {@link GetUserByUserNameResponse }
	 * 
	 */
	public GetUserByUserNameResponse createGetUserByUserNameResponse() {
		return new GetUserByUserNameResponse();
	}

	/**
	 * Create an instance of {@link GetProjectByProjectIDResponse }
	 * 
	 */
	public GetProjectByProjectIDResponse createGetProjectByProjectIDResponse() {
		return new GetProjectByProjectIDResponse();
	}

	/**
	 * Create an instance of {@link GetDataLogByDeviceID }
	 * 
	 */
	public GetDataLogByDeviceID createGetDataLogByDeviceID() {
		return new GetDataLogByDeviceID();
	}

	/**
	 * Create an instance of {@link DeleteAlarmRule }
	 * 
	 */
	public DeleteAlarmRule createDeleteAlarmRule() {
		return new DeleteAlarmRule();
	}

	/**
	 * Create an instance of {@link UpdateAlarmRule }
	 * 
	 */
	public UpdateAlarmRule createUpdateAlarmRule() {
		return new UpdateAlarmRule();
	}

	/**
	 * Create an instance of {@link CountUserSensingDeviceResponse }
	 * 
	 */
	public CountUserSensingDeviceResponse createCountUserSensingDeviceResponse() {
		return new CountUserSensingDeviceResponse();
	}

	/**
	 * Create an instance of {@link AddProjectResponse }
	 * 
	 */
	public AddProjectResponse createAddProjectResponse() {
		return new AddProjectResponse();
	}

	/**
	 * Create an instance of {@link GetDataTypeListByDeviceID }
	 * 
	 */
	public GetDataTypeListByDeviceID createGetDataTypeListByDeviceID() {
		return new GetDataTypeListByDeviceID();
	}

	/**
	 * Create an instance of {@link GetUserByUserName }
	 * 
	 */
	public GetUserByUserName createGetUserByUserName() {
		return new GetUserByUserName();
	}

	/**
	 * Create an instance of {@link GetConfigTypeListByDeviceID }
	 * 
	 */
	public GetConfigTypeListByDeviceID createGetConfigTypeListByDeviceID() {
		return new GetConfigTypeListByDeviceID();
	}

	/**
	 * Create an instance of {@link AddControllingDeviceResponse }
	 * 
	 */
	public AddControllingDeviceResponse createAddControllingDeviceResponse() {
		return new AddControllingDeviceResponse();
	}

	/**
	 * Create an instance of {@link GetConfigTypeListByDeviceIDResponse }
	 * 
	 */
	public GetConfigTypeListByDeviceIDResponse createGetConfigTypeListByDeviceIDResponse() {
		return new GetConfigTypeListByDeviceIDResponse();
	}

	/**
	 * Create an instance of {@link UpdateDataType }
	 * 
	 */
	public UpdateDataType createUpdateDataType() {
		return new UpdateDataType();
	}

	/**
	 * Create an instance of {@link UpdateProject }
	 * 
	 */
	public UpdateProject createUpdateProject() {
		return new UpdateProject();
	}

	/**
	 * Create an instance of {@link CountUserControllingDevice }
	 * 
	 */
	public CountUserControllingDevice createCountUserControllingDevice() {
		return new CountUserControllingDevice();
	}

	/**
	 * Create an instance of {@link UpdateAlarmRuleResponse }
	 * 
	 */
	public UpdateAlarmRuleResponse createUpdateAlarmRuleResponse() {
		return new UpdateAlarmRuleResponse();
	}

	/**
	 * Create an instance of {@link DeleteProject }
	 * 
	 */
	public DeleteProject createDeleteProject() {
		return new DeleteProject();
	}

	/**
	 * Create an instance of {@link DeleteControllingDevice }
	 * 
	 */
	public DeleteControllingDevice createDeleteControllingDevice() {
		return new DeleteControllingDevice();
	}

	/**
	 * Create an instance of {@link GetAlarmRuleListByDeviceIDResponse }
	 * 
	 */
	public GetAlarmRuleListByDeviceIDResponse createGetAlarmRuleListByDeviceIDResponse() {
		return new GetAlarmRuleListByDeviceIDResponse();
	}

	/**
	 * Create an instance of {@link UpdateProjectResponse }
	 * 
	 */
	public UpdateProjectResponse createUpdateProjectResponse() {
		return new UpdateProjectResponse();
	}

	/**
	 * Create an instance of {@link CountUserSensingDevice }
	 * 
	 */
	public CountUserSensingDevice createCountUserSensingDevice() {
		return new CountUserSensingDevice();
	}

	/**
	 * Create an instance of {@link DeleteConfigType }
	 * 
	 */
	public DeleteConfigType createDeleteConfigType() {
		return new DeleteConfigType();
	}

	/**
	 * Create an instance of {@link GetAlarmRuleListByDeviceID }
	 * 
	 */
	public GetAlarmRuleListByDeviceID createGetAlarmRuleListByDeviceID() {
		return new GetAlarmRuleListByDeviceID();
	}

	/**
	 * Create an instance of {@link GetSensingDeviceListByProjectID }
	 * 
	 */
	public GetSensingDeviceListByProjectID createGetSensingDeviceListByProjectID() {
		return new GetSensingDeviceListByProjectID();
	}

	/**
	 * Create an instance of {@link DeleteAlarmRuleResponse }
	 * 
	 */
	public DeleteAlarmRuleResponse createDeleteAlarmRuleResponse() {
		return new DeleteAlarmRuleResponse();
	}

	/**
	 * Create an instance of {@link AddProject }
	 * 
	 */
	public AddProject createAddProject() {
		return new AddProject();
	}

	/**
	 * Create an instance of {@link QueryProject }
	 * 
	 */
	public QueryProject createQueryProject() {
		return new QueryProject();
	}

	/**
	 * Create an instance of {@link AddConfigTypeResponse }
	 * 
	 */
	public AddConfigTypeResponse createAddConfigTypeResponse() {
		return new AddConfigTypeResponse();
	}

	/**
	 * Create an instance of {@link QueryUserControllingDevice }
	 * 
	 */
	public QueryUserControllingDevice createQueryUserControllingDevice() {
		return new QueryUserControllingDevice();
	}

	/**
	 * Create an instance of {@link AddSensingDevice }
	 * 
	 */
	public AddSensingDevice createAddSensingDevice() {
		return new AddSensingDevice();
	}

	/**
	 * Create an instance of {@link UpdateConfigType }
	 * 
	 */
	public UpdateConfigType createUpdateConfigType() {
		return new UpdateConfigType();
	}

	/**
	 * Create an instance of {@link AddAlarmRule }
	 * 
	 */
	public AddAlarmRule createAddAlarmRule() {
		return new AddAlarmRule();
	}

	/**
	 * Create an instance of {@link UpdateDataTypeResponse }
	 * 
	 */
	public UpdateDataTypeResponse createUpdateDataTypeResponse() {
		return new UpdateDataTypeResponse();
	}

	/**
	 * Create an instance of {@link GetControllingDeviceByDeviceID }
	 * 
	 */
	public GetControllingDeviceByDeviceID createGetControllingDeviceByDeviceID() {
		return new GetControllingDeviceByDeviceID();
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
	 * {@link GetDataTypeListByDeviceIDResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getDataTypeListByDeviceIDResponse")
	public JAXBElement<GetDataTypeListByDeviceIDResponse> createGetDataTypeListByDeviceIDResponse(
			GetDataTypeListByDeviceIDResponse value) {
		return new JAXBElement<GetDataTypeListByDeviceIDResponse>(
				_GetDataTypeListByDeviceIDResponse_QNAME,
				GetDataTypeListByDeviceIDResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link QueryProject }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "queryProject")
	public JAXBElement<QueryProject> createQueryProject(QueryProject value) {
		return new JAXBElement<QueryProject>(_QueryProject_QNAME,
				QueryProject.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetUserByUserName }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getUserByUserName")
	public JAXBElement<GetUserByUserName> createGetUserByUserName(
			GetUserByUserName value) {
		return new JAXBElement<GetUserByUserName>(_GetUserByUserName_QNAME,
				GetUserByUserName.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AddAlarmRuleResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "addAlarmRuleResponse")
	public JAXBElement<AddAlarmRuleResponse> createAddAlarmRuleResponse(
			AddAlarmRuleResponse value) {
		return new JAXBElement<AddAlarmRuleResponse>(
				_AddAlarmRuleResponse_QNAME, AddAlarmRuleResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CountUserControllingDevice }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countUserControllingDevice")
	public JAXBElement<CountUserControllingDevice> createCountUserControllingDevice(
			CountUserControllingDevice value) {
		return new JAXBElement<CountUserControllingDevice>(
				_CountUserControllingDevice_QNAME,
				CountUserControllingDevice.class, null, value);
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
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateSensingDeviceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "updateSensingDeviceResponse")
	public JAXBElement<UpdateSensingDeviceResponse> createUpdateSensingDeviceResponse(
			UpdateSensingDeviceResponse value) {
		return new JAXBElement<UpdateSensingDeviceResponse>(
				_UpdateSensingDeviceResponse_QNAME,
				UpdateSensingDeviceResponse.class, null, value);
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
	 * {@link GetSensingDeviceByDeviceIDResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getSensingDeviceByDeviceIDResponse")
	public JAXBElement<GetSensingDeviceByDeviceIDResponse> createGetSensingDeviceByDeviceIDResponse(
			GetSensingDeviceByDeviceIDResponse value) {
		return new JAXBElement<GetSensingDeviceByDeviceIDResponse>(
				_GetSensingDeviceByDeviceIDResponse_QNAME,
				GetSensingDeviceByDeviceIDResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetProjectByProjectID }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getProjectByProjectID")
	public JAXBElement<GetProjectByProjectID> createGetProjectByProjectID(
			GetProjectByProjectID value) {
		return new JAXBElement<GetProjectByProjectID>(
				_GetProjectByProjectID_QNAME, GetProjectByProjectID.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetSensingDeviceListByProjectIDResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getSensingDeviceListByProjectIDResponse")
	public JAXBElement<GetSensingDeviceListByProjectIDResponse> createGetSensingDeviceListByProjectIDResponse(
			GetSensingDeviceListByProjectIDResponse value) {
		return new JAXBElement<GetSensingDeviceListByProjectIDResponse>(
				_GetSensingDeviceListByProjectIDResponse_QNAME,
				GetSensingDeviceListByProjectIDResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryUserControllingDevice }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "queryUserControllingDevice")
	public JAXBElement<QueryUserControllingDevice> createQueryUserControllingDevice(
			QueryUserControllingDevice value) {
		return new JAXBElement<QueryUserControllingDevice>(
				_QueryUserControllingDevice_QNAME,
				QueryUserControllingDevice.class, null, value);
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
	 * {@link GetDataTypeListByDeviceID }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getDataTypeListByDeviceID")
	public JAXBElement<GetDataTypeListByDeviceID> createGetDataTypeListByDeviceID(
			GetDataTypeListByDeviceID value) {
		return new JAXBElement<GetDataTypeListByDeviceID>(
				_GetDataTypeListByDeviceID_QNAME,
				GetDataTypeListByDeviceID.class, null, value);
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
	 * {@link GetConfigTypeListByDeviceID }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getConfigTypeListByDeviceID")
	public JAXBElement<GetConfigTypeListByDeviceID> createGetConfigTypeListByDeviceID(
			GetConfigTypeListByDeviceID value) {
		return new JAXBElement<GetConfigTypeListByDeviceID>(
				_GetConfigTypeListByDeviceID_QNAME,
				GetConfigTypeListByDeviceID.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteAlarmRuleResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "deleteAlarmRuleResponse")
	public JAXBElement<DeleteAlarmRuleResponse> createDeleteAlarmRuleResponse(
			DeleteAlarmRuleResponse value) {
		return new JAXBElement<DeleteAlarmRuleResponse>(
				_DeleteAlarmRuleResponse_QNAME, DeleteAlarmRuleResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateControllingDevice }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "updateControllingDevice")
	public JAXBElement<UpdateControllingDevice> createUpdateControllingDevice(
			UpdateControllingDevice value) {
		return new JAXBElement<UpdateControllingDevice>(
				_UpdateControllingDevice_QNAME, UpdateControllingDevice.class,
				null, value);
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
	 * {@link GetConfigLogByDeviceIDResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getConfigLogByDeviceIDResponse")
	public JAXBElement<GetConfigLogByDeviceIDResponse> createGetConfigLogByDeviceIDResponse(
			GetConfigLogByDeviceIDResponse value) {
		return new JAXBElement<GetConfigLogByDeviceIDResponse>(
				_GetConfigLogByDeviceIDResponse_QNAME,
				GetConfigLogByDeviceIDResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateConfigType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "updateConfigType")
	public JAXBElement<UpdateConfigType> createUpdateConfigType(
			UpdateConfigType value) {
		return new JAXBElement<UpdateConfigType>(_UpdateConfigType_QNAME,
				UpdateConfigType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateAlarmRuleResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "updateAlarmRuleResponse")
	public JAXBElement<UpdateAlarmRuleResponse> createUpdateAlarmRuleResponse(
			UpdateAlarmRuleResponse value) {
		return new JAXBElement<UpdateAlarmRuleResponse>(
				_UpdateAlarmRuleResponse_QNAME, UpdateAlarmRuleResponse.class,
				null, value);
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
	 * {@link GetConfigTypeListByDeviceIDResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getConfigTypeListByDeviceIDResponse")
	public JAXBElement<GetConfigTypeListByDeviceIDResponse> createGetConfigTypeListByDeviceIDResponse(
			GetConfigTypeListByDeviceIDResponse value) {
		return new JAXBElement<GetConfigTypeListByDeviceIDResponse>(
				_GetConfigTypeListByDeviceIDResponse_QNAME,
				GetConfigTypeListByDeviceIDResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryUserSensingDevice }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "queryUserSensingDevice")
	public JAXBElement<QueryUserSensingDevice> createQueryUserSensingDevice(
			QueryUserSensingDevice value) {
		return new JAXBElement<QueryUserSensingDevice>(
				_QueryUserSensingDevice_QNAME, QueryUserSensingDevice.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetControllingDeviceByDeviceID }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getControllingDeviceByDeviceID")
	public JAXBElement<GetControllingDeviceByDeviceID> createGetControllingDeviceByDeviceID(
			GetControllingDeviceByDeviceID value) {
		return new JAXBElement<GetControllingDeviceByDeviceID>(
				_GetControllingDeviceByDeviceID_QNAME,
				GetControllingDeviceByDeviceID.class, null, value);
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
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetControllingDeviceListByProjectIDResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getControllingDeviceListByProjectIDResponse")
	public JAXBElement<GetControllingDeviceListByProjectIDResponse> createGetControllingDeviceListByProjectIDResponse(
			GetControllingDeviceListByProjectIDResponse value) {
		return new JAXBElement<GetControllingDeviceListByProjectIDResponse>(
				_GetControllingDeviceListByProjectIDResponse_QNAME,
				GetControllingDeviceListByProjectIDResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CountUserSensingDevice }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countUserSensingDevice")
	public JAXBElement<CountUserSensingDevice> createCountUserSensingDevice(
			CountUserSensingDevice value) {
		return new JAXBElement<CountUserSensingDevice>(
				_CountUserSensingDevice_QNAME, CountUserSensingDevice.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetAlarmRuleListByDeviceIDResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getAlarmRuleListByDeviceIDResponse")
	public JAXBElement<GetAlarmRuleListByDeviceIDResponse> createGetAlarmRuleListByDeviceIDResponse(
			GetAlarmRuleListByDeviceIDResponse value) {
		return new JAXBElement<GetAlarmRuleListByDeviceIDResponse>(
				_GetAlarmRuleListByDeviceIDResponse_QNAME,
				GetAlarmRuleListByDeviceIDResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetControllingDeviceListByProjectID }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getControllingDeviceListByProjectID")
	public JAXBElement<GetControllingDeviceListByProjectID> createGetControllingDeviceListByProjectID(
			GetControllingDeviceListByProjectID value) {
		return new JAXBElement<GetControllingDeviceListByProjectID>(
				_GetControllingDeviceListByProjectID_QNAME,
				GetControllingDeviceListByProjectID.class, null, value);
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
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetProjectByProjectIDResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getProjectByProjectIDResponse")
	public JAXBElement<GetProjectByProjectIDResponse> createGetProjectByProjectIDResponse(
			GetProjectByProjectIDResponse value) {
		return new JAXBElement<GetProjectByProjectIDResponse>(
				_GetProjectByProjectIDResponse_QNAME,
				GetProjectByProjectIDResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetSensingDeviceByDeviceID }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getSensingDeviceByDeviceID")
	public JAXBElement<GetSensingDeviceByDeviceID> createGetSensingDeviceByDeviceID(
			GetSensingDeviceByDeviceID value) {
		return new JAXBElement<GetSensingDeviceByDeviceID>(
				_GetSensingDeviceByDeviceID_QNAME,
				GetSensingDeviceByDeviceID.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAlarmRule }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "deleteAlarmRule")
	public JAXBElement<DeleteAlarmRule> createDeleteAlarmRule(
			DeleteAlarmRule value) {
		return new JAXBElement<DeleteAlarmRule>(_DeleteAlarmRule_QNAME,
				DeleteAlarmRule.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CountUserSensingDeviceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countUserSensingDeviceResponse")
	public JAXBElement<CountUserSensingDeviceResponse> createCountUserSensingDeviceResponse(
			CountUserSensingDeviceResponse value) {
		return new JAXBElement<CountUserSensingDeviceResponse>(
				_CountUserSensingDeviceResponse_QNAME,
				CountUserSensingDeviceResponse.class, null, value);
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

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAlarmRule }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "updateAlarmRule")
	public JAXBElement<UpdateAlarmRule> createUpdateAlarmRule(
			UpdateAlarmRule value) {
		return new JAXBElement<UpdateAlarmRule>(_UpdateAlarmRule_QNAME,
				UpdateAlarmRule.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetUserByUserNameResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getUserByUserNameResponse")
	public JAXBElement<GetUserByUserNameResponse> createGetUserByUserNameResponse(
			GetUserByUserNameResponse value) {
		return new JAXBElement<GetUserByUserNameResponse>(
				_GetUserByUserNameResponse_QNAME,
				GetUserByUserNameResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryUserControllingDeviceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "queryUserControllingDeviceResponse")
	public JAXBElement<QueryUserControllingDeviceResponse> createQueryUserControllingDeviceResponse(
			QueryUserControllingDeviceResponse value) {
		return new JAXBElement<QueryUserControllingDeviceResponse>(
				_QueryUserControllingDeviceResponse_QNAME,
				QueryUserControllingDeviceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateControllingDeviceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "updateControllingDeviceResponse")
	public JAXBElement<UpdateControllingDeviceResponse> createUpdateControllingDeviceResponse(
			UpdateControllingDeviceResponse value) {
		return new JAXBElement<UpdateControllingDeviceResponse>(
				_UpdateControllingDeviceResponse_QNAME,
				UpdateControllingDeviceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryProjectResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "queryProjectResponse")
	public JAXBElement<QueryProjectResponse> createQueryProjectResponse(
			QueryProjectResponse value) {
		return new JAXBElement<QueryProjectResponse>(
				_QueryProjectResponse_QNAME, QueryProjectResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryUserSensingDeviceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "queryUserSensingDeviceResponse")
	public JAXBElement<QueryUserSensingDeviceResponse> createQueryUserSensingDeviceResponse(
			QueryUserSensingDeviceResponse value) {
		return new JAXBElement<QueryUserSensingDeviceResponse>(
				_QueryUserSensingDeviceResponse_QNAME,
				QueryUserSensingDeviceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateConfigTypeResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "updateConfigTypeResponse")
	public JAXBElement<UpdateConfigTypeResponse> createUpdateConfigTypeResponse(
			UpdateConfigTypeResponse value) {
		return new JAXBElement<UpdateConfigTypeResponse>(
				_UpdateConfigTypeResponse_QNAME,
				UpdateConfigTypeResponse.class, null, value);
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
	 * {@link GetControllingDeviceByDeviceIDResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getControllingDeviceByDeviceIDResponse")
	public JAXBElement<GetControllingDeviceByDeviceIDResponse> createGetControllingDeviceByDeviceIDResponse(
			GetControllingDeviceByDeviceIDResponse value) {
		return new JAXBElement<GetControllingDeviceByDeviceIDResponse>(
				_GetControllingDeviceByDeviceIDResponse_QNAME,
				GetControllingDeviceByDeviceIDResponse.class, null, value);
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
	 * {@link GetAlarmRuleListByDeviceID }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getAlarmRuleListByDeviceID")
	public JAXBElement<GetAlarmRuleListByDeviceID> createGetAlarmRuleListByDeviceID(
			GetAlarmRuleListByDeviceID value) {
		return new JAXBElement<GetAlarmRuleListByDeviceID>(
				_GetAlarmRuleListByDeviceID_QNAME,
				GetAlarmRuleListByDeviceID.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDataLogByDeviceIDResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getDataLogByDeviceIDResponse")
	public JAXBElement<GetDataLogByDeviceIDResponse> createGetDataLogByDeviceIDResponse(
			GetDataLogByDeviceIDResponse value) {
		return new JAXBElement<GetDataLogByDeviceIDResponse>(
				_GetDataLogByDeviceIDResponse_QNAME,
				GetDataLogByDeviceIDResponse.class, null, value);
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
	 * {@link DeleteConfigTypeResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "deleteConfigTypeResponse")
	public JAXBElement<DeleteConfigTypeResponse> createDeleteConfigTypeResponse(
			DeleteConfigTypeResponse value) {
		return new JAXBElement<DeleteConfigTypeResponse>(
				_DeleteConfigTypeResponse_QNAME,
				DeleteConfigTypeResponse.class, null, value);
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
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteConfigType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "deleteConfigType")
	public JAXBElement<DeleteConfigType> createDeleteConfigType(
			DeleteConfigType value) {
		return new JAXBElement<DeleteConfigType>(_DeleteConfigType_QNAME,
				DeleteConfigType.class, null, value);
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
	 * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDataType }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "deleteDataType")
	public JAXBElement<DeleteDataType> createDeleteDataType(DeleteDataType value) {
		return new JAXBElement<DeleteDataType>(_DeleteDataType_QNAME,
				DeleteDataType.class, null, value);
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
	 * {@link CountUserControllingDeviceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "countUserControllingDeviceResponse")
	public JAXBElement<CountUserControllingDeviceResponse> createCountUserControllingDeviceResponse(
			CountUserControllingDeviceResponse value) {
		return new JAXBElement<CountUserControllingDeviceResponse>(
				_CountUserControllingDeviceResponse_QNAME,
				CountUserControllingDeviceResponse.class, null, value);
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
	 * {@link UpdateDataTypeResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "updateDataTypeResponse")
	public JAXBElement<UpdateDataTypeResponse> createUpdateDataTypeResponse(
			UpdateDataTypeResponse value) {
		return new JAXBElement<UpdateDataTypeResponse>(
				_UpdateDataTypeResponse_QNAME, UpdateDataTypeResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AddAlarmRule }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "addAlarmRule")
	public JAXBElement<AddAlarmRule> createAddAlarmRule(AddAlarmRule value) {
		return new JAXBElement<AddAlarmRule>(_AddAlarmRule_QNAME,
				AddAlarmRule.class, null, value);
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
	 * {@link GetDataLogByDeviceID }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getDataLogByDeviceID")
	public JAXBElement<GetDataLogByDeviceID> createGetDataLogByDeviceID(
			GetDataLogByDeviceID value) {
		return new JAXBElement<GetDataLogByDeviceID>(
				_GetDataLogByDeviceID_QNAME, GetDataLogByDeviceID.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateSensingDevice }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "updateSensingDevice")
	public JAXBElement<UpdateSensingDevice> createUpdateSensingDevice(
			UpdateSensingDevice value) {
		return new JAXBElement<UpdateSensingDevice>(_UpdateSensingDevice_QNAME,
				UpdateSensingDevice.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDataType }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "updateDataType")
	public JAXBElement<UpdateDataType> createUpdateDataType(UpdateDataType value) {
		return new JAXBElement<UpdateDataType>(_UpdateDataType_QNAME,
				UpdateDataType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetConfigLogByDeviceID }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getConfigLogByDeviceID")
	public JAXBElement<GetConfigLogByDeviceID> createGetConfigLogByDeviceID(
			GetConfigLogByDeviceID value) {
		return new JAXBElement<GetConfigLogByDeviceID>(
				_GetConfigLogByDeviceID_QNAME, GetConfigLogByDeviceID.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteDataTypeResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "deleteDataTypeResponse")
	public JAXBElement<DeleteDataTypeResponse> createDeleteDataTypeResponse(
			DeleteDataTypeResponse value) {
		return new JAXBElement<DeleteDataTypeResponse>(
				_DeleteDataTypeResponse_QNAME, DeleteDataTypeResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetSensingDeviceListByProjectID }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.njupt.com/", name = "getSensingDeviceListByProjectID")
	public JAXBElement<GetSensingDeviceListByProjectID> createGetSensingDeviceListByProjectID(
			GetSensingDeviceListByProjectID value) {
		return new JAXBElement<GetSensingDeviceListByProjectID>(
				_GetSensingDeviceListByProjectID_QNAME,
				GetSensingDeviceListByProjectID.class, null, value);
	}

}
