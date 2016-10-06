package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain;

// Generated Nov 29, 2013 2:27:46 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ClinicType implements java.io.Serializable {
	private Integer clinicTypeId;
	private String clinicTypeCode;
	private String description;
	private Byte isActive;
	private Date createdDatetime;
	private Date modifiedDatetime;
	private Set clinics = new HashSet(0);

	public ClinicType() {
	}

	public ClinicType(String clinicTypeCode, String description, Byte isActive,
			Date createdDatetime, Date modifiedDatetime, Set clinics) {
		this.clinicTypeCode = clinicTypeCode;
		this.description = description;
		this.isActive = isActive;
		this.createdDatetime = createdDatetime;
		this.modifiedDatetime = modifiedDatetime;
		this.clinics = clinics;
	}

	public Integer getClinicTypeId() {
		return this.clinicTypeId;
	}

	public void setClinicTypeId(Integer clinicTypeId) {
		this.clinicTypeId = clinicTypeId;
	}

	public String getClinicTypeCode() {
		return this.clinicTypeCode;
	}

	public void setClinicTypeCode(String clinicTypeCode) {
		this.clinicTypeCode = clinicTypeCode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
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

	public Set getClinics() {
		return this.clinics;
	}

	public void setClinics(Set clinics) {
		this.clinics = clinics;
	}

}
