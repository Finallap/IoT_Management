package com.njupt.bean;
// default package

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Sensingdevice entity. @author MyEclipse Persistence Tools
 */

public class Sensingdevice implements java.io.Serializable {

	// Fields

	private Integer sensingDeviceId;
	private Integer projectID;
	private String deviceName;
	private String mac;
	private String protocol;
	private String description;
	private String localtion;
	private String deviceKey;
	private String createTime;

	// Constructors

	/** default constructor */
	public Sensingdevice() {
	}

	/** full constructor */
	public Sensingdevice(int projectID, String deviceName, String mac,
			String protocol, String description, String localtion,
			String deviceKey, String createTime) {
		this.projectID = projectID;
		this.deviceName = deviceName;
		this.mac = mac;
		this.protocol = protocol;
		this.description = description;
		this.localtion = localtion;
		this.deviceKey = deviceKey;
		this.createTime = createTime;
	}

	// Property accessors

	public Integer getSensingDeviceId() {
		return this.sensingDeviceId;
	}

	public void setSensingDeviceId(Integer sensingDeviceId) {
		this.sensingDeviceId = sensingDeviceId;
	}

	public Integer getProjectID() {
		return projectID;
	}

	public void setProjectID(Integer projectID) {
		this.projectID = projectID;
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getProtocol() {
		return this.protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocaltion() {
		return this.localtion;
	}

	public void setLocaltion(String localtion) {
		this.localtion = localtion;
	}

	public String getDeviceKey() {
		return this.deviceKey;
	}

	public void setDeviceKey(String deviceKey) {
		this.deviceKey = deviceKey;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}