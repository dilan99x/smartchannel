package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.service;

import java.util.List;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Appointment;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Clinic;

public interface ClinicManager {

	void addClinic(final Clinic _clinic);

	List<Clinic> fetchClinics();

	Clinic updateClinic(final Clinic _clinic);

	void deleteClinic(final Clinic _clinic);

	List<Clinic> fetchAllClinics(final Appointment _appointment);
	
	Clinic fetchClinicInfoByParam(final Appointment appointment);

}
