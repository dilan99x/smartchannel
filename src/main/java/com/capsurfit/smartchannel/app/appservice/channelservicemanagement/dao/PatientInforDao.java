package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Patient;

import java.util.List;

public interface PatientInforDao {

	List<Patient> fetchPatientInformation(final Patient _patient);

	void addOrUpdatePatientInformation(final Patient _patient);

	void deletePatientInformation(final Patient _patient);

}
