package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao;

import java.util.List;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Appointment;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Clinic;
import com.capsurfit.smartchannel.framework.base.dao.BasePersistanceDaoSupport;
import com.capsurfit.smartchannel.framework.common.domain.QueryContext;
import org.hibernate.Query;



public class ClinicDaoHibernate extends BasePersistanceDaoSupport implements ClinicDao {

	@Override
	public void addClinic(final Clinic _clinic) {
		addOrUpdateEntity(_clinic);
	}

	@Override
	public List<Clinic> fetchClinics() {
		QueryContext queryContext = new QueryContext() {
			@Override
			public void applyQueryParameters(Query query) {
			}
		};

		queryContext.setQueryName("findClinicsByCriteria");

		return getResults(queryContext);
	}

	@Override
	public void saveOrUpdateClinic(Clinic _clinic) {
		addOrUpdateEntity(_clinic);
	}

	@Override
	public Clinic findClinicById(final Integer _clinicId) {
		try {
			return getHibernateTemplate().get(Clinic.class, _clinicId);
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}

	@Override
	public void deleteClinic(final Clinic _clinic) {
		try {
			getHibernateTemplate().delete(_clinic);
		} catch (Exception ex) {
			ex.fillInStackTrace();
		}
	}

	@Override
	public List<Clinic> fetchAllClinics(final Appointment _appointment) {
		System.out.println("From Date "+_appointment.getFromDate());
		System.out.println("To Date "+_appointment.getToDate());
		QueryContext queryContext = new QueryContext() {
			@Override
			public void applyQueryParameters(Query query) {
				query.setParameter("specialityId",
						_appointment.getSpecialityId() != null ? _appointment.getSpecialityId() : null);
				query.setParameter("doctorId", _appointment.getDoctorId() != null ? _appointment.getDoctorId() : null);
				query.setParameter("channelCenterId",
						_appointment.getChannelCenterId() != null ? _appointment.getChannelCenterId() : null);
				query.setParameter("fromDate", _appointment.getFromDate()!= null ? _appointment.getFromDate() : null);
				query.setParameter("toDate", _appointment.getToDate()!= null ? _appointment.getToDate() : null);
			}
		};

		queryContext.setQueryName("findAllClinicsByCriteria");

		return getResults(queryContext);
	}

	@Override
	public Clinic fetchClinicInfoByParam(final Appointment _appointment) {
		QueryContext queryContext = new QueryContext() {
			@Override
			public void applyQueryParameters(Query query) {
				query.setParameter("specialityId",
						_appointment.getSpecialityId() != null ? _appointment.getSpecialityId() : 0);
				query.setParameter("doctorId", _appointment.getDoctorId() != null ? _appointment.getDoctorId() : 0);
				query.setParameter("channelCenterId",
						_appointment.getChannelCenterId() != null ? _appointment.getChannelCenterId() : 0);
			}
		};

		queryContext.setQueryName("findAllClinicsByCriteriaWithParam");

		return (Clinic) getResults(queryContext).get(0);
	}
}
