package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Appointment;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Clinic;

import java.util.List;

public interface ClinicDao {
	void addClinic(final Clinic _clinic);

	List<Clinic> fetchClinics();

	void saveOrUpdateClinic(final Clinic _clinic);

	Clinic findClinicById(final Integer _clinicId);

	void deleteClinic(final Clinic __clinic);

	List<Clinic> fetchAllClinics(final Appointment _appointment);

	Clinic fetchClinicInfoByParam(final Appointment _appointment);
}
