package com.capsurfit.smartchannel.app.report.web;

import java.sql.Timestamp;

public class Test {
    private Timestamp clinicDate;
    private String doctorName;
    private String governmentHospitalName;
    private String speciality;
    private Integer appoinmentNumber;

    public Timestamp getClinicDate() {
        return clinicDate;
    }

    public void setClinicDate(Timestamp clinicDate) {
        this.clinicDate = clinicDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getGovernmentHospitalName() {
        return governmentHospitalName;
    }

    public void setGovernmentHospitalName(String governmentHospitalName) {
        this.governmentHospitalName = governmentHospitalName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Integer getAppoinmentNumber() {
        return appoinmentNumber;
    }

    public void setAppoinmentNumber(Integer appoinmentNumber) {
        this.appoinmentNumber = appoinmentNumber;
    }
}
