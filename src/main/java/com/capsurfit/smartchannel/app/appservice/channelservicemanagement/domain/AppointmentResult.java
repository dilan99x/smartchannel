package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain;

import com.capsurfit.smartchannel.app.common.domain.AppointmentSupportiveData;
import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain.ChannelCenter;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Doctor;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Speciality;

import java.io.Serializable;

public class AppointmentResult implements Serializable {
	private String conditionApproval;
	private Integer clinicId;
	private Integer appointmentNumber;
	private Doctor doctor;
	private ChannelCenter channelCenter;
	private Speciality speciality;
	private AppointmentSupportiveData appointmentSupportiveData;

	public String getConditionApproval() {
		return conditionApproval;
	}

	public void setConditionApproval(String conditionApproval) {
		this.conditionApproval = conditionApproval;
	}

	public Integer getClinicId() {
		return clinicId;
	}

	public void setClinicId(Integer clinicId) {
		this.clinicId = clinicId;
	}

	public Integer getAppointmentNumber() {
		return appointmentNumber;
	}

	public void setAppointmentNumber(Integer appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
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

	public Speciality getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}

	public AppointmentSupportiveData getAppointmentSupportiveData() {
		return appointmentSupportiveData;
	}

	public void setAppointmentSupportiveData(AppointmentSupportiveData appointmentSupportiveData) {
		this.appointmentSupportiveData = appointmentSupportiveData;
	}
}
