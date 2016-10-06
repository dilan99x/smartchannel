package com.capsurfit.smartchannel.app.configuration.doctormanagement.dao;

import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Doctor;

import java.util.List;


public interface DoctorDao {
	void saveOrUpdateDoctor(final Doctor _doctor);

	List<Doctor> fetchDoctors();
	
	Doctor fetchDoctorsByCriteria(final Integer _doctorId);

	void deleteDoctor(final Doctor _doctor);

	Doctor findDoctorById(final Doctor _doctor);

	Doctor findDoctorById(final Integer _doctorId);

	List<Doctor> findDoctorByUniqueFields(final Doctor _doctor);
}
