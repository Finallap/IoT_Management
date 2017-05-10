package com.njupt.bean;
// default package

/**
 * Configtype entity. @author MyEclipse Persistence Tools
 */

public class Configtype implements java.io.Serializable {

	// Fields

	private Integer configTypeId;
	private Integer controllingDeviceID;
	private String configTypeName;
	private String mark;
	private String createTime;

	// Constructors

	/** default constructor */
	public Configtype() {
	}

	/** full constructor */
	public Configtype(int configTypeId,int controllingDeviceID,
			String configTypeName, String mark, String createTime) {
		this.configTypeId = configTypeId;
		this.controllingDeviceID = controllingDeviceID;
		this.configTypeName = configTypeName;
		this.mark = mark;
		this.createTime = createTime;
	}

	// Property accessors

	public Integer getConfigTypeId() {
		return this.configTypeId;
	}

	public void setConfigTypeId(Integer configTypeId) {
		this.configTypeId = configTypeId;
	}

	public Integer getControllingDeviceID() {
		return controllingDeviceID;
	}

	public void setControllingDeviceID(Integer controllingDeviceID) {
		this.controllingDeviceID = controllingDeviceID;
	}

	public String getConfigTypeName() {
		return this.configTypeName;
	}

	public void setConfigTypeName(String configTypeName) {
		this.configTypeName = configTypeName;
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}