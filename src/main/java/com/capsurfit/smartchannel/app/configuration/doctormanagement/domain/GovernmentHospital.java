package com.capsurfit.smartchannel.app.configuration.doctormanagement.domain;

// Generated Nov 29, 2013 2:27:46 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;

public class GovernmentHospital implements java.io.Serializable {

	private int hospitalId;
	private Doctor doctor;
	private String hospitalName;
	private String city;
	private Date joinedDatetime;
	private String resignedDatetime;
	private Byte isActive;
	private String description;
	private String designation;

	public GovernmentHospital() {
	}

	public GovernmentHospital(int hospitalId, Doctor doctor) {
		this.hospitalId = hospitalId;
		this.doctor = doctor;
	}

	public GovernmentHospital(int hospitalId, Doctor doctor,
			String hospitalName, String city, Date joinedDatetime,
			String resignedDatetime, Byte isActive, String description,
			String designation) {
		this.hospitalId = hospitalId;
		this.doctor = doctor;
		this.hospitalName = hospitalName;
		this.city = city;
		this.joinedDatetime = joinedDatetime;
		this.resignedDatetime = resignedDatetime;
		this.isActive = isActive;
		this.description = description;
		this.designation = designation;
	}

	public int getHospitalId() {
		return this.hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getJoinedDatetime() {
		return this.joinedDatetime;
	}

	public void setJoinedDatetime(Date joinedDatetime) {
		this.joinedDatetime = joinedDatetime;
	}

	public String getResignedDatetime() {
		return this.resignedDatetime;
	}

	public void setResignedDatetime(String resignedDatetime) {
		this.resignedDatetime = resignedDatetime;
	}

	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
