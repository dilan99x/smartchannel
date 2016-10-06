package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao;

import java.util.List;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Appointment;
import com.capsurfit.smartchannel.framework.base.dao.BasePersistanceDaoSupport;
import com.capsurfit.smartchannel.framework.common.domain.QueryContext;
import org.hibernate.Query;


public class AppointmentDaoHibernate extends BasePersistanceDaoSupport implements AppointmentDao {
	
	public Appointment fetchAppointmentByCriteria(final Integer _clinicId, final Integer _appointmentNumber) {
		QueryContext queryContext = new QueryContext() {
			@Override
			// TODO Need to find a way to access clinicId as
			// _appointment.getClinic().getClinicId()
			public void applyQueryParameters(Query query) {
				query.setParameter("clinicId", _clinicId);
				query.setParameter("appointmentNumber", _appointmentNumber);
			}
		};

		queryContext.setQueryName("fetchAppointmentByCriteria");
		
		return (Appointment) ((getResults(queryContext).size()>0) ? getResults(queryContext).get(0):null);

	}

	@Override
	public List<Appointment> fetchSelectedAppoinment(final Appointment _appointment) {
		QueryContext queryContext = new QueryContext() {
			@Override
			// TODO Need to find a way to access clinicId as
			// _appointment.getClinic().getClinicId()
			public void applyQueryParameters(Query query) {
				query.setParameter("clinicId", _appointment.getClinicId());
			}
		};

		queryContext.setQueryName("fetchSelectedAppoinments");

		return getResults(queryContext);
	}

	@Override
	public List<Appointment> fetchSelectedAppoinmentsInOtherChannelCenters(final Appointment _appointment) {
		QueryContext queryContext = new QueryContext() {
			@Override
			// TODO Need to find a way to access clinicId as
			// _appointment.getClinic().getClinicId()
			public void applyQueryParameters(Query query) {
				query.setParameter("doctorId", _appointment.getDoctorId());
				query.setParameter("channelCenterId", _appointment.getChannelCenterId());
			}
		};

		queryContext.setQueryName("fetchSelectedDoctorInOtherChannelCenters");

		return getResults(queryContext);
	}

	@Override
	public void addOrUpdateAppointment(final Appointment _appointment) {
	   if(_appointment != null){
		   addOrUpdateEntity(_appointment);
	   }
	}

}
