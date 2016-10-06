package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao;

import java.util.List;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.ClinicProperty;
import com.capsurfit.smartchannel.framework.base.dao.BasePersistanceDaoSupport;
import org.hibernate.Query;

public class ClinicPropertyDaoHibernate extends BasePersistanceDaoSupport implements ClinicPropertyDao {

	@Override
	public ClinicProperty getClinicPropertyByClinicId(final Integer _clinicId) {
		Query query = getSession().getNamedQuery("fetchClinicPropertyByCriteria").setParameter("clinicId", _clinicId);
		List<ClinicProperty> clinicPropertyList = query.list();
		if (clinicPropertyList.size() > 0) {
			return clinicPropertyList.get(0);
		} else {
			return null;
		}

	}

}
