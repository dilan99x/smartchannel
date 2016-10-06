package com.capsurfit.smartchannel.app.configuration.doctormanagement.dao;

import java.util.List;

import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Doctor;
import com.capsurfit.smartchannel.framework.base.dao.BasePersistanceDaoSupport;
import com.capsurfit.smartchannel.framework.common.domain.QueryContext;
import org.hibernate.Query;

public class DoctorDaoHibernate extends BasePersistanceDaoSupport implements DoctorDao {
	@Override
	public void saveOrUpdateDoctor(final Doctor _doctor) {
		if (_doctor != null) {
			addOrUpdateEntity(_doctor);
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Doctor> fetchDoctors() {
		QueryContext queryContext = new QueryContext() {
			@Override
			public void applyQueryParameters(Query query) {
			}
		};

		queryContext.setQueryName("fetchDoctors");

		return getResults(queryContext);
	}

	@Override
	@SuppressWarnings("unchecked")
	public Doctor fetchDoctorsByCriteria(final Integer _doctorId) {
		QueryContext queryContext = new QueryContext() {
			@Override
			public void applyQueryParameters(Query query) {
				query.setParameter("doctorId", _doctorId);
			}
		};

		queryContext.setQueryName("fetchDoctorsByCriteria");

		if (getResults(queryContext).size() > 0) {
			return (Doctor) getResults(queryContext).get(0);
		}

		return null;
	}

	public List<Doctor> findDoctorByUniqueFields(final Doctor _doctor) {
		QueryContext queryContext = new QueryContext() {
			@Override
			public void applyQueryParameters(Query query) {
				query.setParameter("registrationNumber", _doctor.getRegistrationNumber());
			}
		};
		queryContext.setQueryName("findDoctorByUniqueFields");

		return getResults(queryContext);
	}

	public Doctor findDoctorById(final Doctor _doctor) {
		return (Doctor) getHibernateTemplate().get(Doctor.class, _doctor.getDoctorId());
	}

	public Doctor findDoctorById(final Integer _doctorId) {
		return (Doctor) getHibernateTemplate().get(Doctor.class, _doctorId);
	}

	@Override
	public void deleteDoctor(final Doctor _doctor) {
		deleteEntity(_doctor);
	}

}
