package com.capsurfit.smartchannel.app.configuration.doctormanagement.dao;

import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Speciality;

public interface SpecialityDao {
	Speciality findSpecialityById(final Integer specialityId);
}
