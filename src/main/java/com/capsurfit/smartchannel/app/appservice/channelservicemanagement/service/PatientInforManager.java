package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.service;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Patient;
import com.capsurfit.smartchannel.app.common.domain.AppointmentSupportiveData;

import java.util.List;

public interface PatientInforManager {

	AppointmentSupportiveData processPatientInformation(final Patient _patient);

	List<Patient> fetchPatientInformation(final Patient _patient);
	
	Patient fetchClinicByCriteria(final Patient _patient, final Integer clinicId);

	void addOrUpdatePatientInformation(final Patient _patient);

	void deletePatientInformation(final Patient _patient);
}
