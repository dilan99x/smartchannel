package com.capsurfit.smartchannel.app.common.dao;

import java.util.List;

import com.capsurfit.smartchannel.app.common.domain.Lookup;
import com.capsurfit.smartchannel.framework.base.dao.BaseHibernateDaoSupport;
import com.capsurfit.smartchannel.framework.common.domain.QueryContext;
import org.hibernate.Query;

public class LookupDaoHibernate extends BaseHibernateDaoSupport implements LookupDao {
	@Override
	public List<Lookup> lookupDoctors() {
		QueryContext queryContext = new QueryContext() {

			@Override
			public void applyQueryParameters(Query query) {
			}
		};

		queryContext.setQueryName("lookupDoctors");
		return getResults(queryContext);
	}

	@Override
	public List<Lookup> lookupChannelCenters() {
		QueryContext queryContext = new QueryContext() {

			@Override
			public void applyQueryParameters(Query query) {
			}
		};

		queryContext.setQueryName("lookupChannelCenters");
		return getResults(queryContext);
	}

	@Override
	public List<Lookup> lookupClinicTypes() {
		QueryContext queryContext = new QueryContext() {

			@Override
			public void applyQueryParameters(Query query) {
			}
		};

		queryContext.setQueryName("lookupClinicTypes");
		return getResults(queryContext);
	}

	@Override
	public List<Lookup> lookupSpeciality() {
		QueryContext queryContext = new QueryContext() {
			@Override
			public void applyQueryParameters(Query query) {

			}
		};
		queryContext.setQueryName("lookupDoctorSpeciality");
		return getResults(queryContext);
	}

}
