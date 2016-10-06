package com.capsurfit.smartchannel.app.common.dao;

import java.util.List;

import com.capsurfit.smartchannel.app.common.domain.AppointmentSupportiveData;
import com.capsurfit.smartchannel.framework.base.dao.BasePersistanceDaoSupport;
import com.capsurfit.smartchannel.framework.common.domain.QueryContext;
import org.hibernate.Query;

public class AppointmentSupportiveDataDaoHibernate extends BasePersistanceDaoSupport implements
		AppointmentSupportiveDataDao {

	@Override
	public AppointmentSupportiveData fetchSupportiveData(final AppointmentSupportiveData _supportiveData) {
		QueryContext queryContext = new QueryContext() {
			@Override
			public void applyQueryParameters(Query query) {
				query.setParameter("clinicId", _supportiveData.getClinicId());
				query.setParameter("appointmentNo", _supportiveData.getAppointmentNo());
			}
		};

		queryContext.setQueryName("fetchAppoinmentSupportiveDataByCriteria");

		List<AppointmentSupportiveData> supportiveDataList = getResults(queryContext);
		if (supportiveDataList.size() > 0) {
			return supportiveDataList.get(0);
		}

		return null;
	}
	
	@Override
	public AppointmentSupportiveData fetchSupportiveData(final Integer _clinicId, final Integer _appointmentNo) {
		QueryContext queryContext = new QueryContext() {
			@Override
			public void applyQueryParameters(Query query) {
				query.setParameter("clinicId", _clinicId);
				query.setParameter("appointmentNo", _appointmentNo);
			}
		};

		queryContext.setQueryName("fetchAppoinmentSupportiveDataByCriteria");

		List<AppointmentSupportiveData> supportiveDataList = getResults(queryContext);
		if (supportiveDataList.size() > 0) {
			return supportiveDataList.get(0);
		}

		return null;
	}

	@Override
	public void addSupportiveData(final AppointmentSupportiveData _supportiveData) {
		if (_supportiveData != null) {
			addOrUpdateEntity(_supportiveData);
		} else {
			// TODO
			throw new RuntimeException("AppointmentSupportiveData is empty");
		}
	}

	@Override
	public void deleteSupportiveData(final AppointmentSupportiveData _supportiveData) {
		if (_supportiveData != null) {
			deleteEntity(_supportiveData);
		} else {
			// TODO
			throw new RuntimeException("AppointmentSupportiveData is empty");
		}

	}

}
