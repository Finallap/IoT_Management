package com.njupt.bean;
// default package

/**
 * Configtype entity. @author MyEclipse Persistence Tools
 */

public class AlarmRule implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private Integer alarmRuleID;
	private Integer sensingDeviceID;
	private Integer userID;
	private Integer dataTypeID;
	private String rule;
	private Float threshold;

	// Constructors

	/** default constructor */
	public AlarmRule() {
	}

	/** full constructor */
	public AlarmRule(Integer alarmRuleID, Integer sensingDeviceID,
			Integer userID, Integer dataTypeID, String rule, Float threshold) {
		super();
		this.alarmRuleID = alarmRuleID;
		this.sensingDeviceID = sensingDeviceID;
		this.userID = userID;
		this.dataTypeID = dataTypeID;
		this.rule = rule;
		this.threshold = threshold;
	}

	public Integer getAlarmRuleID() {
		return alarmRuleID;
	}

	public void setAlarmRuleID(Integer alarmRuleID) {
		this.alarmRuleID = alarmRuleID;
	}

	public Integer getSensingDeviceID() {
		return sensingDeviceID;
	}

	public void setSensingDeviceID(Integer sensingDeviceID) {
		this.sensingDeviceID = sensingDeviceID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getDataTypeID() {
		return dataTypeID;
	}

	public void setDataTypeID(Integer dataTypeID) {
		this.dataTypeID = dataTypeID;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public Float getThreshold() {
		return threshold;
	}

	public void setThreshold(Float threshold) {
		this.threshold = threshold;
	}
	
}