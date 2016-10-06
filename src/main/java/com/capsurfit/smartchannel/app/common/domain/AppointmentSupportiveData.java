package com.capsurfit.smartchannel.app.common.domain;

import java.util.Date;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Patient;
import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class AppointmentSupportiveData extends BaseEntity implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private int supportId;
	private Integer clinicId;
	private Integer appointmentNo;
	private String appointmentTime;
	private Date appointmentDate;
	private String patientFirstName;
	private String patientLastName;
	private String patientNic;
	private String patientGender;
	private String patientMobileNumber;
	private String patientAddress;
	private String patientEmail;
	private Patient patient;
	private Integer patientId;

	public int getSupportId() {
		return this.supportId;
	}

	public void setSupportId(int supportId) {
		this.supportId = supportId;
	}

	public Integer getClinicId() {
		return this.clinicId;
	}

	public void setClinicId(Integer clinicId) {
		this.clinicId = clinicId;
	}

	public Integer getAppointmentNo() {
		return this.appointmentNo;
	}

	public void setAppointmentNo(Integer appointmentNo) {
		this.appointmentNo = appointmentNo;
	}

	public String getAppointmentTime() {
		return this.appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public Date getAppointmentDate() {
		return this.appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getPatientFirstName() {
		return this.patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientLastName() {
		return this.patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public String getPatientNic() {
		return this.patientNic;
	}

	public void setPatientNic(String patientNic) {
		this.patientNic = patientNic;
	}

	public String getPatientGender() {
		return this.patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientMobileNumber() {
		return this.patientMobileNumber;
	}

	public void setPatientMobileNumber(String patientMobileNumber) {
		this.patientMobileNumber = patientMobileNumber;
	}

	public String getPatientAddress() {
		return this.patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	@Override
	public Object getEntityId() {
		return supportId;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (!(object instanceof AppointmentSupportiveData)) {
			return false;
		}
		AppointmentSupportiveData supportiveData = (AppointmentSupportiveData) object;
		
		return new EqualsBuilder().append(this.clinicId, supportiveData.clinicId)
				.append(this.appointmentNo, supportiveData.appointmentNo).isEquals();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(clinicId).append(appointmentNo).hashCode();
	}

}
