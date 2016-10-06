package com.capsurfit.smartchannel.app.configuration.contactmanagement.dao;

import com.capsurfit.smartchannel.app.configuration.contactmanagement.domain.DoctorContact;

public interface DoctorContactDao {
	void saveDoctorContact(final DoctorContact _doctorContact);

	void deleteDoctorContact(final DoctorContact _doctorContact);

}
