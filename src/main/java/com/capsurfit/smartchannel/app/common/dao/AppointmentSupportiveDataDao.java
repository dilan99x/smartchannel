package com.capsurfit.smartchannel.app.common.dao;

import com.capsurfit.smartchannel.app.common.domain.AppointmentSupportiveData;

public interface AppointmentSupportiveDataDao {
	AppointmentSupportiveData fetchSupportiveData(final AppointmentSupportiveData _supportiveData);
	
	AppointmentSupportiveData fetchSupportiveData(final Integer _clinicId, final Integer _appointmentNo);

	void addSupportiveData(final AppointmentSupportiveData _supportiveData);

	void deleteSupportiveData(final AppointmentSupportiveData _supportiveData);
}
