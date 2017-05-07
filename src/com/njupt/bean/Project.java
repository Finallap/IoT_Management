package com.njupt.bean;
// default package

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Project entity. @author MyEclipse Persistence Tools
 */

public class Project implements java.io.Serializable {

	// Fields

	private Integer projectId;
	private Integer userID;
	private String projectName;
	private Boolean isPublic;
	private String projectKey;
	private String createTime;
	private Integer sensingDeviceNum;
	private Integer controllingDeviceNum;

	// Constructors

	/** default constructor */
	public Project() {
	}

	/** full constructor */
	public Project(int userID, String projectName, Boolean isPublic,
			String projectKey, String createTime, int sensingDeviceNum,
			int controllingDeviceNum) {
		this.userID = userID;
		this.projectName = projectName;
		this.isPublic = isPublic;
		this.projectKey = projectKey;
		this.createTime = createTime;
		this.sensingDeviceNum = sensingDeviceNum;
		this.controllingDeviceNum = controllingDeviceNum;
	}

	// Property accessors

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	
	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Boolean getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

	public String getProjectKey() {
		return this.projectKey;
	}

	public void setProjectKey(String projectKey) {
		this.projectKey = projectKey;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getSensingDeviceNum() {
		return sensingDeviceNum;
	}

	public void setSensingDeviceNum(Integer sensingDeviceNum) {
		this.sensingDeviceNum = sensingDeviceNum;
	}

	public Integer getControllingDeviceNum() {
		return controllingDeviceNum;
	}

	public void setControllingDeviceNum(Integer controllingDeviceNum) {
		this.controllingDeviceNum = controllingDeviceNum;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", userID=" + userID
				+ ", projectName=" + projectName + ", isPublic=" + isPublic
				+ ", projectKey=" + projectKey + ", createTime=" + createTime
				+ ", sensingDeviceNum=" + sensingDeviceNum
				+ ", controllingDeviceNum=" + controllingDeviceNum + "]";
	}

}