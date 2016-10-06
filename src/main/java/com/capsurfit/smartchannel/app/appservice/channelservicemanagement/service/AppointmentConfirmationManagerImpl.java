package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.service;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao.AppointmentConfirmationDao;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao.AppointmentDao;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao.ClinicDao;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao.PatientInforDao;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Appointment;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.AppointmentResult;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Clinic;
import com.capsurfit.smartchannel.app.common.dao.AppointmentSupportiveDataDao;
import com.capsurfit.smartchannel.app.common.domain.AppointmentSupportiveData;
import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.dao.ChannelCenterDao;
import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain.ChannelCenter;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.dao.DoctorDao;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.dao.SpecialityDao;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Doctor;
import com.capsurfit.smartchannel.framework.common.shared.CoreConstants.Symbol;

import java.util.Date;

public class AppointmentConfirmationManagerImpl implements AppointmentConfirmationManager {
	private ClinicDao clinicDao;
	private DoctorDao doctorDao;
	private AppointmentDao appointmentDao;
	private PatientInforDao patientInforDao;
	private SpecialityDao specialityDao;
	private ChannelCenterDao channelCenterDao;
	private AppointmentSupportiveDataDao appointmentSupportiveDataDao;

	public void setAppointmentConfirmationDao(AppointmentConfirmationDao appointmentConfirmationDao) {
	}

	public void setClinicDao(ClinicDao clinicDao) {
		this.clinicDao = clinicDao;
	}

	public void setDoctorDao(DoctorDao doctorDao) {
		this.doctorDao = doctorDao;
	}

	public void setAppointmentDao(AppointmentDao appointmentDao) {
		this.appointmentDao = appointmentDao;
	}

	public void setPatientInforDao(PatientInforDao patientInforDao) {
		this.patientInforDao = patientInforDao;
	}

	public void setSpecialityDao(SpecialityDao specialityDao) {
		this.specialityDao = specialityDao;
	}

	public void setChannelCenterDao(ChannelCenterDao channelCenterDao) {
		this.channelCenterDao = channelCenterDao;
	}

	public void setAppointmentSupportiveDataDao(AppointmentSupportiveDataDao appointmentSupportiveDataDao) {
		this.appointmentSupportiveDataDao = appointmentSupportiveDataDao;
	}

	@Override
	public boolean confirmAppointment(final AppointmentResult _appointmentResult) {
		Clinic clinic = clinicDao.findClinicById(_appointmentResult.getClinicId());
		Doctor doctor = doctorDao.fetchDoctorsByCriteria(clinic.getDoctorId());
		ChannelCenter channelCenter = channelCenterDao.findChannelCenterById(clinic.getChannelCenterId());
		//Here the AppointmentSupportive Data has been persisted will be fetched from the DB.
		AppointmentSupportiveData appointmentSupportiveData = appointmentSupportiveDataDao.fetchSupportiveData(
				clinic.getClinicId(), _appointmentResult.getAppointmentNumber());

		if (appointmentSupportiveData != null) {
			Appointment appointment = appointmentDao.fetchAppointmentByCriteria(_appointmentResult.getClinicId(),
					_appointmentResult.getAppointmentNumber());
			if (appointment == null) {
				appointment = new Appointment();
				appointment.setIsAvailable(Symbol.N.getValue());
				appointment.setClinicId(clinic.getClinicId());
				appointment.setClinic(clinic);				
				appointment.setAppoinmentDate(clinic.getDateFrom());
				appointment.setAppoinmentNumber(_appointmentResult.getAppointmentNumber());
				appointment.setAppoinmentTime(appointmentSupportiveData.getAppointmentTime());
				appointment.setModifiedDatetime(new Date());

				appointmentDao.addOrUpdateAppointment(appointment);

				_appointmentResult.setDoctor(doctor);
				_appointmentResult.setChannelCenter(channelCenter);
				_appointmentResult.setAppointmentSupportiveData(appointmentSupportiveData);
			} 

			return true;
		}
		return false;
	}
}
