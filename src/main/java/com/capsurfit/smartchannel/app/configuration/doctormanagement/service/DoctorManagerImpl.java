package com.capsurfit.smartchannel.app.configuration.doctormanagement.service;

import com.capsurfit.smartchannel.app.configuration.contactmanagement.dao.DoctorContactDao;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.dao.DoctorDao;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Doctor;
import com.capsurfit.smartchannel.framework.common.shared.EntityConstants.EntitySymbol;

import java.util.List;

public class DoctorManagerImpl implements DoctorManager {
	private DoctorDao doctorDao;
	private DoctorContactDao doctorContactDao;

	public void setDoctorDao(final DoctorDao _doctorDao) {
		this.doctorDao = _doctorDao;
	}

	public DoctorContactDao getDoctorContactDao() {
		return doctorContactDao;
	}

	public void setDoctorContactDao(DoctorContactDao doctorContactDao) {
		this.doctorContactDao = doctorContactDao;
	}

	public DoctorDao getDoctorDao() {
		return doctorDao;
	}

	@Override
	public void addDoctor(final Doctor _doctor) {
		List<Doctor> doctors = doctorDao.findDoctorByUniqueFields(_doctor);
		if (doctors.isEmpty()) {
			_doctor.setContactType(EntitySymbol.DOCTOR.getValue());
			doctorDao.saveOrUpdateDoctor(_doctor);
		} else {
			throw new RuntimeException("Doctor is already added...!");
		}
	}

	public void updateDoctor(final Doctor _doctor) {
		List<Doctor> doctors = doctorDao.findDoctorByUniqueFields(_doctor);
		if (doctors.isEmpty()) {
			doctorDao.saveOrUpdateDoctor(_doctor);
		} else {
			if (_doctor.getDoctorId().equals(doctors.get(0).getDoctorId())) {
				doctorDao.saveOrUpdateDoctor(_doctor);
			} else {
				throw new RuntimeException("Doctor is already added...!");
			}
		}

	}

	@Override
	public List<Doctor> fetchDoctors() {
		return doctorDao.fetchDoctors();
	}

	@Override
	public void deleteDoctor(final Doctor _doctor) {
		doctorDao.deleteDoctor(_doctor);
	}

}
