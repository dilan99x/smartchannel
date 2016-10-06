package com.capsurfit.smartchannel.app.common.service;

import com.capsurfit.smartchannel.app.common.domain.AppointmentSupportiveData;

public interface AppointmentSupportiveDataManager {
	AppointmentSupportiveData fetchSupportiveData(final AppointmentSupportiveData _supportiveData);
	
	AppointmentSupportiveData fetchSupportiveData(final Integer _clinicId, final Integer _appointmentNo);

	void addSupportiveData(final AppointmentSupportiveData _supportiveData);

	void deleteSupportiveData(final AppointmentSupportiveData _supportiveData);
}
