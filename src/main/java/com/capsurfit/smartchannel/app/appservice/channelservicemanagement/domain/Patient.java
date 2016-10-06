package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain;

import com.capsurfit.smartchannel.app.common.domain.AppointmentSupportiveData;
import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain.ChannelCenter;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Doctor;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Speciality;
import com.capsurfit.smartchannel.app.configuration.miscellaneousmanagement.domain.Offer;
import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unchecked")
public class Patient extends BaseEntity implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    // /////Persistent fields///////
    private Integer patientId;
    private String patientFirstName;
    private String patientLastName;
    private Integer patientAge;
    private String patientDescription;
    private String patientMobileNumber;
    private String patientEmail;
    private Date patientCreatedDatetime;
    private Date patientModifiedDatetime;
    private String patientGender;
    private String patientAddress;
    private String patientNic;

    // ///// Joined fields ///////
    private Doctor doctor;
    private ChannelCenter channelCenter;
    private Speciality speciality;
    private Clinic clinic;

    // ///// UI fields ///////
    private Integer clinicId;
    private Integer appointmentNumber;
    private String appointmentTime;
    private Date appointmentDate;

    // ///// Other fields //////
    private Set<Appointment> appoinments;
    private Set<Offer> offers;
    private Set<AppointmentSupportiveData> appointmentSupportivedata;

    public Patient() {
        appoinments = new HashSet<Appointment>(0);
        offers = new HashSet<Offer>(0);
        appointmentSupportivedata = new HashSet<AppointmentSupportiveData>(0);
    }

    public Integer getPatientId() {
        return this.patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
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

    public Integer getPatientAge() {
        return this.patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientDescription() {
        return this.patientDescription;
    }

    public void setPatientDescription(String patientDescription) {
        this.patientDescription = patientDescription;
    }

    public String getPatientMobileNumber() {
        return this.patientMobileNumber;
    }

    public void setPatientMobileNumber(String patientMobileNumber) {
        this.patientMobileNumber = patientMobileNumber;
    }

    public String getPatientEmail() {
        return this.patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public Date getPatientCreatedDatetime() {
        return this.patientCreatedDatetime;
    }

    public void setPatientCreatedDatetime(Date patientCreatedDatetime) {
        this.patientCreatedDatetime = patientCreatedDatetime;
    }

    public Date getPatientModifiedDatetime() {
        return this.patientModifiedDatetime;
    }

    public void setPatientModifiedDatetime(Date patientModifiedDatetime) {
        this.patientModifiedDatetime = patientModifiedDatetime;
    }

    public String getPatientGender() {
        return this.patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientAddress() {
        return this.patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public Set<Appointment> getAppoinments() {
        return this.appoinments;
    }

    public void setAppoinments(Set<Appointment> appoinments) {
        this.appoinments = appoinments;
    }

    public Set<Offer> getOffers() {
        return this.offers;
    }

    public void setOffers(Set<Offer> offers) {
        this.offers = offers;
    }

    public String getPatientNic() {
        return patientNic;
    }

    public void setPatientNic(String patientNic) {
        this.patientNic = patientNic;
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

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Set<AppointmentSupportiveData> getAppointmentSupportivedata() {
        return appointmentSupportivedata;
    }

    public void setAppointmentSupportivedata(Set<AppointmentSupportiveData> appointmentSupportivedata) {
        this.appointmentSupportivedata = appointmentSupportivedata;
    }

    @Override
    public Object getEntityId() {
        return this.patientId;
    }

}