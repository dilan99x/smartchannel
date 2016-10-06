package com.capsurfit.smartchannel.app.common.service;

import com.capsurfit.smartchannel.app.common.dao.AppointmentSupportiveDataDao;
import com.capsurfit.smartchannel.app.common.domain.AppointmentSupportiveData;

public class AppointmentSupportiveDataManagerImpl implements AppointmentSupportiveDataManager {
	private AppointmentSupportiveDataDao appointmentSupportiveDataDao;


	public void setAppointmentSupportiveDataDao(AppointmentSupportiveDataDao appointmentSupportiveDataDao) {
		this.appointmentSupportiveDataDao = appointmentSupportiveDataDao;
	}

	@Override
	public AppointmentSupportiveData fetchSupportiveData(final AppointmentSupportiveData _supportiveData) {
		return appointmentSupportiveDataDao.fetchSupportiveData(_supportiveData);
	}

	@Override
	public void addSupportiveData(final AppointmentSupportiveData _supportiveData) {
		appointmentSupportiveDataDao.addSupportiveData(_supportiveData);
	}

	@Override
	public void deleteSupportiveData(final AppointmentSupportiveData _supportiveData) {
		appointmentSupportiveDataDao.deleteSupportiveData(_supportiveData);
	}

	@Override
	public AppointmentSupportiveData fetchSupportiveData(final Integer _clinicId, final Integer _appointmentNo) {
		return appointmentSupportiveDataDao.fetchSupportiveData(_clinicId, _appointmentNo);
	}

}
