package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.service;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao.ClinicDao;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao.ClinicTypeDao;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Appointment;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Clinic;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.ClinicType;
import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.dao.ChannelCenterDao;
import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain.ChannelCenter;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.dao.DoctorDao;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Doctor;
import com.capsurfit.smartchannel.framework.common.shared.CoreConstants.Symbol;

import java.util.List;


public class ClinicManagerImpl implements ClinicManager {
	private ClinicDao clinicDao;
	private DoctorDao doctorDao;
	private ChannelCenterDao channelCenterDao;
	private ClinicTypeDao clinicTypeDao;

	public void setClinicDao(final ClinicDao _clinicDao) {
		this.clinicDao = _clinicDao;
	}

	public DoctorDao getDoctorDao() {
		return doctorDao;
	}

	public void setDoctorDao(final DoctorDao _doctorDao) {
		this.doctorDao = _doctorDao;
	}

	public ClinicDao getClinicDao() {
		return clinicDao;
	}

	@Override
	public void addClinic(final Clinic _clinic) {
		if (_clinic != null) {
			Doctor doctor = doctorDao.findDoctorById(_clinic.getDoctorId());
			ChannelCenter channelCenter = channelCenterDao.findChannelCenterById(_clinic.getChannelCenterId());
			ClinicType clinicType = clinicTypeDao.findClinicTypeById(_clinic.getClinicTypeId());

			_clinic.setDoctor(doctor);
			_clinic.setChannelCenter(channelCenter);
			_clinic.setClinicType(clinicType);
			_clinic.setStartTime(makeClinicTime(_clinic.getStartHrs(), _clinic.getStartMins()));
			_clinic.setEndTime(makeClinicTime(_clinic.getEndHrs(), _clinic.getEndMins()));

			clinicDao.addClinic(_clinic);
		} else {
			throw new RuntimeException("Clinic object is empty!");
		}

	}

	private String makeClinicTime(final String hrs, final String mins) {
		StringBuilder builder = new StringBuilder();
		builder.append(hrs);
		builder.append(Symbol.COLON.getValue());
		builder.append(mins);

		return builder.toString();
	}

	public ChannelCenterDao getChannelCenterDao() {
		return channelCenterDao;
	}

	public void setChannelCenterDao(ChannelCenterDao channelCenterDao) {
		this.channelCenterDao = channelCenterDao;
	}

	public ClinicTypeDao getClinicTypeDao() {
		return clinicTypeDao;
	}

	public void setClinicTypeDao(ClinicTypeDao clinicTypeDao) {
		this.clinicTypeDao = clinicTypeDao;
	}

	@Override
	public List<Clinic> fetchClinics() {
		return clinicDao.fetchClinics();
	}

	@Override
	public Clinic updateClinic(final Clinic _clinic) {
		Clinic clinic = clinicDao.findClinicById(_clinic.getClinicId());
		Doctor doctor = doctorDao.findDoctorById(_clinic.getDoctorId());
		ChannelCenter channelCenter = channelCenterDao.findChannelCenterById(_clinic.getChannelCenterId());
		ClinicType clinicType = clinicTypeDao.findClinicTypeById(_clinic.getClinicTypeId());

		if (_clinic.getClinicId().equals(clinic.getClinicId())) {
			_clinic.setChannelCenter(channelCenter);
			_clinic.setDoctor(doctor);
			_clinic.setClinicType(clinicType);
			_clinic.setStartTime(makeClinicTime(_clinic.getStartHrs(), _clinic.getStartMins()));
			_clinic.setEndTime(makeClinicTime(_clinic.getEndHrs(), _clinic.getEndMins()));
			_clinic.setMergeRequired(true);
			clinicDao.saveOrUpdateClinic(_clinic);
		} else {
			throw new RuntimeException("Invalid object in the session!");
		}

		return clinic;
	}

	@Override
	public void deleteClinic(Clinic _clinic) {
		if (_clinic != null) {
			Clinic clinic = clinicDao.findClinicById(_clinic.getClinicId());
			if (clinic != null) {
				clinicDao.deleteClinic(_clinic);
			} else {
				throw new RuntimeException(
						"Invalid clinic object, it does not exist such a clinic object in the database!");
			}
		} else {
			throw new RuntimeException("Clinic object is null!");
		}
	}

	@Override
	public List<Clinic> fetchAllClinics(final Appointment _appointment) {
		return clinicDao.fetchAllClinics(_appointment);
	}

	@Override
	public Clinic fetchClinicInfoByParam(final Appointment appointment) {
		
		return clinicDao.fetchClinicInfoByParam(appointment);
	}

}
