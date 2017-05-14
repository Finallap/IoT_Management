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
	private static final long serialVersionUID = 1L;
	private Integer AlarmRuleID;
	private Integer SensingDeviceID;
	private Integer UserID;
	private Integer DataTypeID;
	private String Rule;
	private Float Threshold;

	// Constructors

	/** default constructor */
	public AlarmRule() {
	}

	/** full constructor */
	public AlarmRule(Integer alarmRuleID, Integer sensingDeviceID,
			Integer userID, Integer dataTypeID, String rule, Float threshold) {
		super();
		AlarmRuleID = alarmRuleID;
		SensingDeviceID = sensingDeviceID;
		UserID = userID;
		DataTypeID = dataTypeID;
		Rule = rule;
		Threshold = threshold;
	}

	public Integer getAlarmRuleID() {
		return AlarmRuleID;
	}

	public void setAlarmRuleID(Integer alarmRuleID) {
		AlarmRuleID = alarmRuleID;
	}

	public Integer getSensingDeviceID() {
		return SensingDeviceID;
	}

	public void setSensingDeviceID(Integer sensingDeviceID) {
		SensingDeviceID = sensingDeviceID;
	}

	public Integer getUserID() {
		return UserID;
	}

	public void setUserID(Integer userID) {
		UserID = userID;
	}

	public Integer getDataTypeID() {
		return DataTypeID;
	}

	public void setDataTypeID(Integer dataTypeID) {
		DataTypeID = dataTypeID;
	}

	public String getRule() {
		return Rule;
	}

	public void setRule(String rule) {
		Rule = rule;
	}

	public Float getThreshold() {
		return Threshold;
	}

	public void setThreshold(Float threshold) {
		Threshold = threshold;
	}

}