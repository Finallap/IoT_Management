package com.njupt.bean;
// default package


/**
 * Configlog entity. @author MyEclipse Persistence Tools
 */

public class Configlog implements java.io.Serializable {

	// Fields

	private Integer configLogID;
	private Integer configTypeID;
	private String configContent;
	private String saveTime;
	private String configTypeName;
	private String mark;
	

	// Constructors

	/** default constructor */
	public Configlog() {
	}


	public Configlog(Integer configLogID, Integer configTypeID,
			String configContent, String saveTime, String configTypeName,
			String mark) {
		super();
		this.configLogID = configLogID;
		this.configTypeID = configTypeID;
		this.configContent = configContent;
		this.saveTime = saveTime;
		this.configTypeName = configTypeName;
		this.mark = mark;
	}


	public Integer getConfigLogID() {
		return configLogID;
	}

	public void setConfigLogID(Integer configLogID) {
		this.configLogID = configLogID;
	}


	public Integer getConfigTypeID() {
		return configTypeID;
	}


	public void setConfigTypeID(Integer configTypeID) {
		this.configTypeID = configTypeID;
	}


	public String getConfigContent() {
		return configContent;
	}


	public void setConfigContent(String configContent) {
		this.configContent = configContent;
	}


	public String getSaveTime() {
		return saveTime;
	}


	public void setSaveTime(String saveTime) {
		this.saveTime = saveTime;
	}


	public String getConfigTypeName() {
		return configTypeName;
	}


	public void setConfigTypeName(String configTypeName) {
		this.configTypeName = configTypeName;
	}


	public String getMark() {
		return mark;
	}


	public void setMark(String mark) {
		this.mark = mark;
	}
	
}