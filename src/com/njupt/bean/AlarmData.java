package com.njupt.bean;
// default package

/**
 * Configtype entity. @author MyEclipse Persistence Tools
 */

public class AlarmData implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private Integer alarmListID;
	private Integer alarmRuleID;
	private String alarmRuleContent;
	private Float actualValue;
	private Integer isRead;
	private String saveTime;
	private Integer sensingDeviceId;
	private String deviceName;
	private Integer dataTypeID;
	private String type;
	private String symbol;

	// Constructors

	/** default constructor */
	public AlarmData() {
	}

	public AlarmData(Integer alarmListID, Integer alarmRuleID,
			String alarmRuleContent, Float actualValue, Integer isRead,
			String saveTime, Integer sensingDeviceId, String deviceName,
			Integer dataTypeID, String type, String symbol) {
		super();
		this.alarmListID = alarmListID;
		this.alarmRuleID = alarmRuleID;
		this.alarmRuleContent = alarmRuleContent;
		this.actualValue = actualValue;
		this.isRead = isRead;
		this.saveTime = saveTime;
		this.sensingDeviceId = sensingDeviceId;
		this.deviceName = deviceName;
		this.dataTypeID = dataTypeID;
		this.type = type;
		this.symbol = symbol;
	}

	public Integer getAlarmListID() {
		return alarmListID;
	}

	public void setAlarmListID(Integer alarmListID) {
		this.alarmListID = alarmListID;
	}

	public Integer getAlarmRuleID() {
		return alarmRuleID;
	}

	public void setAlarmRuleID(Integer alarmRuleID) {
		this.alarmRuleID = alarmRuleID;
	}

	public String getAlarmRuleContent() {
		return alarmRuleContent;
	}

	public void setAlarmRuleContent(String alarmRuleContent) {
		this.alarmRuleContent = alarmRuleContent;
	}

	public Float getActualValue() {
		return actualValue;
	}

	public void setActualValue(Float actualValue) {
		this.actualValue = actualValue;
	}

	public Integer getIsRead() {
		return isRead;
	}

	public void setIsRead(Integer isRead) {
		this.isRead = isRead;
	}

	public String getSaveTime() {
		return saveTime;
	}

	public void setSaveTime(String saveTime) {
		this.saveTime = saveTime;
	}

	public Integer getSensingDeviceId() {
		return sensingDeviceId;
	}

	public void setSensingDeviceId(Integer sensingDeviceId) {
		this.sensingDeviceId = sensingDeviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public Integer getDataTypeID() {
		return dataTypeID;
	}

	public void setDataTypeID(Integer dataTypeID) {
		this.dataTypeID = dataTypeID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}