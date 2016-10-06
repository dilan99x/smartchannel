package com.capsurfit.smartchannel.app.appservice.paymentgateway.domain;

import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;

import java.util.Date;


public class AppointmentFeedBack extends BaseEntity implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer clinicId;
	private String clinicName;
	private String doctorname;
	private String channelCenterName;
	private Integer appoinmtmentNumber;
	private String channelCenterAddress;
	private Date appointmentTime;
	private String patientName;
	private String nic;
	private String contactNumber;
	private String emailAddress;

	public Integer getClinicId() {
		return clinicId;
	}

	public void setClinicId(Integer clinicId) {
		this.clinicId = clinicId;
	}

	public String getClinicName() {
		return clinicName;
	}

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public String getChannelCenterName() {
		return channelCenterName;
	}

	public void setChannelCenterName(String channelCenterName) {
		this.channelCenterName = channelCenterName;
	}

	public Integer getAppoinmtmentNumber() {
		return appoinmtmentNumber;
	}

	public void setAppoinmtmentNumber(Integer appoinmtmentNumber) {
		this.appoinmtmentNumber = appoinmtmentNumber;
	}

	public String getChannelCenterAddress() {
		return channelCenterAddress;
	}

	public void setChannelCenterAddress(String channelCenterAddress) {
		this.channelCenterAddress = channelCenterAddress;
	}

	public Date getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public Object getEntityId() {
		return null;
	}

}
