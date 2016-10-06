package com.capsurfit.smartchannel.app.appservice.medicalcheckupmanagement.domain;

// Generated Nov 29, 2013 2:27:46 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class CheckupType implements java.io.Serializable {
	private Integer checkupTypeId;
	private String checkupTypeCode;
	private String description;
	private Date dateAdded;
	private Date createdDatetime;
	private Date modifiedDatetime;
	private Set medicalCheckups = new HashSet(0);

	public CheckupType() {
	}

	public CheckupType(String checkupTypeCode, String description,
			Date dateAdded, Date createdDatetime, Date modifiedDatetime,
			Set medicalCheckups) {
		this.checkupTypeCode = checkupTypeCode;
		this.description = description;
		this.dateAdded = dateAdded;
		this.createdDatetime = createdDatetime;
		this.modifiedDatetime = modifiedDatetime;
		this.medicalCheckups = medicalCheckups;
	}

	public Integer getCheckupTypeId() {
		return this.checkupTypeId;
	}

	public void setCheckupTypeId(Integer checkupTypeId) {
		this.checkupTypeId = checkupTypeId;
	}

	public String getCheckupTypeCode() {
		return this.checkupTypeCode;
	}

	public void setCheckupTypeCode(String checkupTypeCode) {
		this.checkupTypeCode = checkupTypeCode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getCreatedDatetime() {
		return this.createdDatetime;
	}

	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Date getModifiedDatetime() {
		return this.modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	public Set getMedicalCheckups() {
		return this.medicalCheckups;
	}

	public void setMedicalCheckups(Set medicalCheckups) {
		this.medicalCheckups = medicalCheckups;
	}

}
