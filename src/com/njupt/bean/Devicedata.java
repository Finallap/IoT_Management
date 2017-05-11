package com.njupt.bean;
// default package

/**
 * Devicedata entity. @author MyEclipse Persistence Tools
 */

public class Devicedata implements java.io.Serializable {

	// Fields

	private Integer deviceDataID;
	private Integer dataTypeID;
	private Float value;
	private String saveTime;
	private String type;
	private String mark;
	private String symbol;
	
	public Devicedata() {}
	
	public Devicedata(Integer deviceDataID, Integer dataTypeID, Float value,
			String saveTime, String type, String mark, String symbol) {
		super();
		this.deviceDataID = deviceDataID;
		this.dataTypeID = dataTypeID;
		this.value = value;
		this.saveTime = saveTime;
		this.type = type;
		this.mark = mark;
		this.symbol = symbol;
	}
	public Integer getDeviceDataID() {
		return deviceDataID;
	}
	public void setDeviceDataID(Integer deviceDataID) {
		this.deviceDataID = deviceDataID;
	}
	public Integer getDataTypeID() {
		return dataTypeID;
	}
	public void setDataTypeID(Integer dataTypeID) {
		this.dataTypeID = dataTypeID;
	}
	public Float getValue() {
		return value;
	}
	public void setValue(Float value) {
		this.value = value;
	}
	public String getSaveTime() {
		return saveTime;
	}
	public void setSaveTime(String saveTime) {
		this.saveTime = saveTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}