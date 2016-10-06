package com.capsurfit.smartchannel.app.configuration.doctormanagement.domain;

// Generated Nov 29, 2013 2:27:46 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Speciality implements java.io.Serializable {

	private Integer specialityId;
	private String specialityCode;
	private String description;
	private Byte isActive;
	private Date createdDatetime;
	private Date modifiedDatetime;
	private Set doctors = new HashSet(0);

	public Speciality() {
	}

	public Speciality(String specialityCode, String description, Byte isActive,
			Date createdDatetime, Date modifiedDatetime, Set doctors) {
		this.specialityCode = specialityCode;
		this.description = description;
		this.isActive = isActive;
		this.createdDatetime = createdDatetime;
		this.modifiedDatetime = modifiedDatetime;
		this.doctors = doctors;
	}

	public Integer getSpecialityId() {
		return this.specialityId;
	}

	public void setSpecialityId(Integer specialityId) {
		this.specialityId = specialityId;
	}

	public String getSpecialityCode() {
		return this.specialityCode;
	}

	public void setSpecialityCode(String specialityCode) {
		this.specialityCode = specialityCode;
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

	public Set getDoctors() {
		return this.doctors;
	}

	public void setDoctors(Set doctors) {
		this.doctors = doctors;
	}

}
