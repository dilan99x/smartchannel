package com.capsurfit.smartchannel.app.configuration.contactmanagement.dao;

import com.capsurfit.smartchannel.app.configuration.contactmanagement.domain.DoctorContact;
import com.capsurfit.smartchannel.framework.base.dao.BasePersistanceDaoSupport;

public class DoctorContactDaoHibernate extends BasePersistanceDaoSupport implements DoctorContactDao {

	@Override
	public void saveDoctorContact(final DoctorContact _doctorContact) {
		addOrUpdateEntity(_doctorContact);
	}

	@Override
	public void deleteDoctorContact(final DoctorContact _doctorContact) {
		deleteEntity(_doctorContact);
	}

}
