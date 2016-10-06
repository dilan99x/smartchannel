package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.capsurfit.smartchannel.app.common.domain.Lookup;
import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

public class Appointment extends BaseEntity implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer appoinmentId;
	private Patient patient;
	private Clinic clinic;
	private Integer appoinmentNumber;
	private Date appoinmentDate;
	private String appoinmentTime;
	private String description;
	private Double totalAppoinmentFee;
	private Date createdDatetime;
	private Date modifiedDatetime;
	private List<Lookup> speciality;
	private List<Lookup> doctors;
	private List<Lookup> channelCenters;
	private Set appoinmentStates = new HashSet(0);
	private Integer specialityId;
	private Integer doctorId;
	private Integer channelCenterId;
	private String isAvailable;

	// join fields
	private String specialityCode;
	private String doctorName;
	private String channelCenterName;
	private String address;
	private String startTime;
	private Integer clinicId; //TODO this field should be removed and try to bind this through the clinic object
	
	//ui fields
	private Date fromDate;
	private Date toDate; 

	//getter setters 
	public Integer getAppoinmentId() {
		return this.appoinmentId;
	}

	public void setAppoinmentId(Integer appoinmentId) {
		this.appoinmentId = appoinmentId;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Clinic getClinic() {
		return this.clinic;
	}

	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}

	public Integer getAppoinmentNumber() {
		return this.appoinmentNumber;
	}

	public void setAppoinmentNumber(Integer appoinmentNumber) {
		this.appoinmentNumber = appoinmentNumber;
	}

	public Date getAppoinmentDate() {
		return appoinmentDate;
	}

	public void setAppoinmentDate(Date appoinmentDate) {
		this.appoinmentDate = appoinmentDate;
	}

	public String getAppoinmentTime() {
		return appoinmentTime;
	}

	public void setAppoinmentTime(String appoinmentTime) {
		this.appoinmentTime = appoinmentTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getTotalAppoinmentFee() {
		return this.totalAppoinmentFee;
	}

	public void setTotalAppoinmentFee(Double totalAppoinmentFee) {
		this.totalAppoinmentFee = totalAppoinmentFee;
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

	public Set getAppoinmentStates() {
		return this.appoinmentStates;
	}

	public void setAppoinmentStates(Set appoinmentStates) {
		this.appoinmentStates = appoinmentStates;
	}

	public List<Lookup> getSpeciality() {
		return speciality;
	}

	public void setSpeciality(List<Lookup> speciality) {
		this.speciality = speciality;
	}
	
	public List<Lookup> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Lookup> doctors) {
		this.doctors = doctors;
	}

	public List<Lookup> getChannelCenters() {
		return channelCenters;
	}

	public void setChannelCenters(List<Lookup> channelCenters) {
		this.channelCenters = channelCenters;
	}

	public Integer getSpecialityId() {
		return specialityId;
	}

	@TypeConversion(converter = "net.lavanya.framework.lav.common.util.IdConverter")
	public void setSpecialityId(Integer specialityId) {
		this.specialityId = specialityId;
	}
	
	public Integer getDoctorId() {
		return doctorId;
	}

	@TypeConversion(converter = "net.lavanya.framework.lav.common.util.IdConverter")
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Integer getChannelCenterId() {
		return channelCenterId;
	}

	@TypeConversion(converter = "net.lavanya.framework.lav.common.util.IdConverter")
	public void setChannelCenterId(Integer channelCenterId) {
		this.channelCenterId = channelCenterId;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getSpecialityCode() {
		return specialityCode;
	}

	public void setSpecialityCode(String specialityCode) {
		this.specialityCode = specialityCode;
	}
	
	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getChannelCenterName() {
		return channelCenterName;
	}

	public void setChannelCenterName(String channelCenterName) {
		this.channelCenterName = channelCenterName;
	}

	public Date getFromDate() {
		return fromDate;
	}

	@TypeConversion(converter = "net.lavanya.framework.lav.common.util.TimeConverter")
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	@TypeConversion(converter = "net.lavanya.framework.lav.common.util.TimeConverter")
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Integer getClinicId() {
		return clinicId;
	}

	@TypeConversion(converter = "net.lavanya.framework.lav.common.util.IdConverter")
	public void setClinicId(Integer clinicId) {
		this.clinicId = clinicId;
	}
	
	@Override
	public Object getEntityId() {
		return appoinmentId;
	}
}
