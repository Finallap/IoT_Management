package com.njupt.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "ServiceDelegate", targetNamespace = "http://service.njupt.com/")
public interface ServiceDelegate {

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getPermission", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.GetPermission")
	@ResponseWrapper(localName = "getPermissionResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.GetPermissionResponse")
	public String getPermission(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1);

	/**
	 * 
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "addDataType", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.AddDataType")
	@ResponseWrapper(localName = "addDataTypeResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.AddDataTypeResponse")
	public String addDataType(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3);

	/**
	 * 
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "addConfigType", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.AddConfigType")
	@ResponseWrapper(localName = "addConfigTypeResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.AddConfigTypeResponse")
	public String addConfigType(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "deleteProject", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.DeleteProject")
	@ResponseWrapper(localName = "deleteProjectResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.DeleteProjectResponse")
	public String deleteProject(
			@WebParam(name = "arg0", targetNamespace = "") int arg0);

	/**
	 * 
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "queryProject", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.QueryProject")
	@ResponseWrapper(localName = "queryProjectResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.QueryProjectResponse")
	public String queryProject(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") int arg1,
			@WebParam(name = "arg2", targetNamespace = "") int arg2);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "countProject", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.CountProject")
	@ResponseWrapper(localName = "countProjectResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.CountProjectResponse")
	public String countProject(
			@WebParam(name = "arg0", targetNamespace = "") int arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "countDataType", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.CountDataType")
	@ResponseWrapper(localName = "countDataTypeResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.CountDataTypeResponse")
	public String countDataType(
			@WebParam(name = "arg0", targetNamespace = "") int arg0);

	/**
	 * 
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "updateProject", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.UpdateProject")
	@ResponseWrapper(localName = "updateProjectResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.UpdateProjectResponse")
	public String updateProject(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") Boolean arg2);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "countUserControllingDevice", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.CountUserControllingDevice")
	@ResponseWrapper(localName = "countUserControllingDeviceResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.CountUserControllingDeviceResponse")
	public String countUserControllingDevice(
			@WebParam(name = "arg0", targetNamespace = "") int arg0);

	/**
	 * 
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "queryUserControllingDevice", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.QueryUserControllingDevice")
	@ResponseWrapper(localName = "queryUserControllingDeviceResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.QueryUserControllingDeviceResponse")
	public String queryUserControllingDevice(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") int arg1,
			@WebParam(name = "arg2", targetNamespace = "") int arg2);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @param arg6
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "addSensingDevice", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.AddSensingDevice")
	@ResponseWrapper(localName = "addSensingDeviceResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.AddSensingDeviceResponse")
	public String addSensingDevice(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") String arg5,
			@WebParam(name = "arg6", targetNamespace = "") String arg6);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @param arg6
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "addControllingDevice", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.AddControllingDevice")
	@ResponseWrapper(localName = "addControllingDeviceResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.AddControllingDeviceResponse")
	public String addControllingDevice(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") String arg5,
			@WebParam(name = "arg6", targetNamespace = "") String arg6);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "deleteSensingDevice", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.DeleteSensingDevice")
	@ResponseWrapper(localName = "deleteSensingDeviceResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.DeleteSensingDeviceResponse")
	public String deleteSensingDevice(
			@WebParam(name = "arg0", targetNamespace = "") int arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "countUserSensingDevice", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.CountUserSensingDevice")
	@ResponseWrapper(localName = "countUserSensingDeviceResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.CountUserSensingDeviceResponse")
	public String countUserSensingDevice(
			@WebParam(name = "arg0", targetNamespace = "") int arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "deleteControllingDevice", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.DeleteControllingDevice")
	@ResponseWrapper(localName = "deleteControllingDeviceResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.DeleteControllingDeviceResponse")
	public String deleteControllingDevice(
			@WebParam(name = "arg0", targetNamespace = "") int arg0);

	/**
	 * 
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "queryUserSensingDevice", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.QueryUserSensingDevice")
	@ResponseWrapper(localName = "queryUserSensingDeviceResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.QueryUserSensingDeviceResponse")
	public String queryUserSensingDevice(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") int arg1,
			@WebParam(name = "arg2", targetNamespace = "") int arg2);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "deleteConfigType", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.DeleteConfigType")
	@ResponseWrapper(localName = "deleteConfigTypeResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.DeleteConfigTypeResponse")
	public String deleteConfigType(
			@WebParam(name = "arg0", targetNamespace = "") int arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "deleteDataType", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.DeleteDataType")
	@ResponseWrapper(localName = "deleteDataTypeResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.DeleteDataTypeResponse")
	public String deleteDataType(
			@WebParam(name = "arg0", targetNamespace = "") int arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "countConfigType", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.CountConfigType")
	@ResponseWrapper(localName = "countConfigTypeResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.CountConfigTypeResponse")
	public String countConfigType(
			@WebParam(name = "arg0", targetNamespace = "") int arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getUserByUserName", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.GetUserByUserName")
	@ResponseWrapper(localName = "getUserByUserNameResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.GetUserByUserNameResponse")
	public String getUserByUserName(
			@WebParam(name = "arg0", targetNamespace = "") String arg0);

	/**
	 * 
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "addProject", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.AddProject")
	@ResponseWrapper(localName = "addProjectResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.AddProjectResponse")
	public String addProject(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") Boolean arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3);

	/**
	 * 
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "userRegister", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.UserRegister")
	@ResponseWrapper(localName = "userRegisterResponse", targetNamespace = "http://service.njupt.com/", className = "com.njupt.service.UserRegisterResponse")
	public String userRegister(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2);

}
