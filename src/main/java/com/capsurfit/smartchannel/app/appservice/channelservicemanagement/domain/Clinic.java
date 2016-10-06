package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.capsurfit.smartchannel.app.common.domain.Lookup;
import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain.ChannelCenter;
import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain.ChannelCenterDoctor;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Doctor;
import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

public class Clinic extends BaseEntity implements java.io.Serializable {
	private Integer clinicId;
	private ChannelCenterDoctor channelCenterDoctor;
	private ClinicType clinicType;
	private String clinicCode;
	private String startTime;
	private String endTime;
	private String isActive = "Y";
	private Double clinicalFee;
	private Double consultationFee;
	private Date createdDatetime;
	private Date modifiedDatetime;
	private Set appoinments = new HashSet(0);
	private Set clinicProperties = new HashSet(0);
	private List<Lookup> doctors;
	private List<Lookup> channelCenters;
	private List<Lookup> clinicTypes;
	private Integer clinicTypeId;
	private Integer doctorId;
	private Integer channelCenterId;
	private Date dateFrom;
	private Date dateTo;
	private String startHrs;
	private String startMins;
	private String endHrs;
	private String endMins;
	private String description;
	private Integer maxAppointments;
	private String radioDefaultValue;
	private Doctor doctor;
	private ChannelCenter channelCenter;

	// joined fields
	private String doctorName;
	private String clinicTypeCode;
	private String channelCenterName;
	private String specialityCode;
	private String registrationNumber;
	private String address;
	private Integer specialityId;

	public Integer getClinicId() {
		return this.clinicId;
	}

	public void setClinicId(Integer clinicId) {
		this.clinicId = clinicId;
	}

	public ChannelCenterDoctor getChannelCenterDoctor() {
		return this.channelCenterDoctor;
	}

	public void setChannelCenterDoctor(ChannelCenterDoctor channelCenterDoctor) {
		this.channelCenterDoctor = channelCenterDoctor;
	}

	public ClinicType getClinicType() {
		return this.clinicType;
	}

	public void setClinicType(ClinicType clinicType) {
		this.clinicType = clinicType;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Double getClinicalFee() {
		return this.clinicalFee;
	}

	public void setClinicalFee(Double clinicalFee) {
		this.clinicalFee = clinicalFee;
	}

	public Double getConsultationFee() {
		return this.consultationFee;
	}

	public void setConsultationFee(Double consultationFee) {
		this.consultationFee = consultationFee;
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

	public Set getAppoinments() {
		return this.appoinments;
	}

	public Integer getSpecialityId() {
		return specialityId;
	}

	public void setSpecialityId(Integer specialityId) {
		this.specialityId = specialityId;
	}

	public void setAppoinments(Set appoinments) {
		this.appoinments = appoinments;
	}

	public Set getClinicProperties() {
		return this.clinicProperties;
	}

	public void setClinicProperties(Set clinicProperties) {
		this.clinicProperties = clinicProperties;
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

	public List<Lookup> getClinicTypes() {
		return clinicTypes;
	}

	public void setClinicTypes(List<Lookup> clinicTypes) {
		this.clinicTypes = clinicTypes;
	}

	public Integer getClinicTypeId() {
		return clinicTypeId;
	}

	public void setClinicTypeId(Integer clinicTypeId) {
		this.clinicTypeId = clinicTypeId;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Integer getChannelCenterId() {
		return channelCenterId;
	}

	public void setChannelCenterId(Integer channelCenterId) {
		this.channelCenterId = channelCenterId;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	@TypeConversion(converter = "net.lavanya.framework.lav.common.util.TimeConverter")
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	@TypeConversion(converter = "net.lavanya.framework.lav.common.util.TimeConverter")
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getClinicCode() {
		return clinicCode;
	}

	public void setClinicCode(String clinicCode) {
		this.clinicCode = clinicCode;
	}

	public String getStartHrs() {
		return startHrs;
	}

	public void setStartHrs(String startHrs) {
		this.startHrs = startHrs;
	}

	public String getStartMins() {
		return startMins;
	}

	public void setStartMins(String startMins) {
		this.startMins = startMins;
	}

	public String getEndHrs() {
		return endHrs;
	}

	public void setEndHrs(String endHrs) {
		this.endHrs = endHrs;
	}

	public String getEndMins() {
		return endMins;
	}

	public void setEndMins(String endMins) {
		this.endMins = endMins;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getMaxAppointments() {
		return maxAppointments;
	}

	public void setMaxAppointments(Integer maxAppointments) {
		this.maxAppointments = maxAppointments;
	}

	public String getRadioDefaultValue() {
		return "Y";
	}

	public void setRadioDefaultValue(String radioDefaultValue) {
		this.radioDefaultValue = radioDefaultValue;
	}

	@Override
	public Object getEntityId() {
		return getClinicId();
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public ChannelCenter getChannelCenter() {
		return channelCenter;
	}

	public void setChannelCenter(ChannelCenter channelCenter) {
		this.channelCenter = channelCenter;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getClinicTypeCode() {
		return clinicTypeCode;
	}

	public void setClinicTypeCode(String clinicTypeCode) {
		this.clinicTypeCode = clinicTypeCode;
	}

	public String getChannelCenterName() {
		return channelCenterName;
	}

	public void setChannelCenterName(String channelCenterName) {
		this.channelCenterName = channelCenterName;
	}

	public String getSpecialityCode() {
		return specialityCode;
	}

	public void setSpecialityCode(String specialityCode) {
		this.specialityCode = specialityCode;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
