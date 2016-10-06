package com.capsurfit.smartchannel.app.configuration.doctormanagement.service;

import java.util.List;

import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Doctor;

public interface DoctorManager {
	void addDoctor(final Doctor _Doctor);
	void updateDoctor(final Doctor _doctor);
	void deleteDoctor(final Doctor _doctor);
	public List<Doctor> fetchDoctors();
}
