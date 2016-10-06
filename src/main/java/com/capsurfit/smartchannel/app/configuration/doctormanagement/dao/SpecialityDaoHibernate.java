package com.capsurfit.smartchannel.app.configuration.doctormanagement.dao;


import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Speciality;
import com.capsurfit.smartchannel.framework.base.dao.BasePersistanceDaoSupport;

public class SpecialityDaoHibernate extends BasePersistanceDaoSupport implements SpecialityDao {

	@Override
	public Speciality findSpecialityById(final Integer _specialityId) {
		return getHibernateTemplate().get(Speciality.class, _specialityId);
	}

}
