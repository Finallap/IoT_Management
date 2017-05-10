package com.njupt.bean;
// default package

/**
 * Datatype entity. @author MyEclipse Persistence Tools
 */

public class Datatype implements java.io.Serializable {

	// Fields

	private Integer dataTypeId;
	private Integer sensingDeviceID;
	private String type;
	private String mark;
	private String symbol;
	private String createTime;

	// Constructors

	/** default constructor */
	public Datatype() {
	}

	/** full constructor */
	public Datatype(int dataTypeId,int sensingDeviceID, String type, String mark,
			String symbol, String createTime) {
		this.dataTypeId = dataTypeId;
		this.sensingDeviceID = sensingDeviceID;
		this.type = type;
		this.mark = mark;
		this.symbol = symbol;
		this.createTime = createTime;
	}

	// Property accessors

	public Integer getDataTypeId() {
		return this.dataTypeId;
	}

	public void setDataTypeId(Integer dataTypeId) {
		this.dataTypeId = dataTypeId;
	}

	public Integer getSensingDeviceID() {
		return sensingDeviceID;
	}

	public void setSensingDeviceID(Integer sensingDeviceID) {
		this.sensingDeviceID = sensingDeviceID;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}