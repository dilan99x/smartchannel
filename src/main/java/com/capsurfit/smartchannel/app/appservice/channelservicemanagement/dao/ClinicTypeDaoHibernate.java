package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.ClinicType;
import com.capsurfit.smartchannel.framework.base.dao.BasePersistanceDaoSupport;

public class ClinicTypeDaoHibernate extends BasePersistanceDaoSupport implements ClinicTypeDao {

	@Override
	public ClinicType findClinicTypeById(final Integer _clinictypeId) {
		return getHibernateTemplate().get(ClinicType.class, _clinictypeId);
	}
}
