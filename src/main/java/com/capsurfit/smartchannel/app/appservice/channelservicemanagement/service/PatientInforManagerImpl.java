package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.service;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao.ClinicDao;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao.PatientInforDao;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Clinic;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Patient;
import com.capsurfit.smartchannel.app.common.domain.AppointmentSupportiveData;
import com.capsurfit.smartchannel.app.common.service.AppointmentSupportiveDataManager;
import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.dao.ChannelCenterDao;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.dao.DoctorDao;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.dao.SpecialityDao;

import java.util.List;

@SuppressWarnings("unchecked")
public class PatientInforManagerImpl implements PatientInforManager {
	private PatientInforDao patientInforDao;
	private ClinicDao clinicDao;
	private DoctorDao doctorDao;
	private ChannelCenterDao channelCenterDao;
	private SpecialityDao specialityDao;

	private AppointmentSupportiveDataManager appointmentSupportiveDataManager;

	public void setPatientInforDao(PatientInforDao patientInforDao) {
		this.patientInforDao = patientInforDao;
	}

	public void setClinicDao(ClinicDao clinicDao) {
		this.clinicDao = clinicDao;
	}

	public void setDoctorDao(DoctorDao doctorDao) {
		this.doctorDao = doctorDao;
	}

	public void setChannelCenterDao(ChannelCenterDao channelCenterDao) {
		this.channelCenterDao = channelCenterDao;
	}

	public void setSpecialityDao(SpecialityDao specialityDao) {
		this.specialityDao = specialityDao;
	}

	public void setAppointmentSupportiveDataManager(AppointmentSupportiveDataManager appointmentSupportiveDataManager) {
		this.appointmentSupportiveDataManager = appointmentSupportiveDataManager;
	}

	@Override
	public AppointmentSupportiveData processPatientInformation(Patient _patient) {
		AppointmentSupportiveData supportiveData = new AppointmentSupportiveData();
		supportiveData.setClinicId(_patient.getClinicId());
		supportiveData.setAppointmentNo(_patient.getAppointmentNumber());
		AppointmentSupportiveData supportiveData1 = appointmentSupportiveDataManager
				.fetchSupportiveData(supportiveData);

		if (supportiveData1 != null) {
			return supportiveData1;
		}
		supportiveData.setAppointmentTime(_patient.getAppointmentTime());
		supportiveData.setAppointmentDate(_patient.getAppointmentDate());
		supportiveData.setPatientAddress(_patient.getPatientAddress());
		supportiveData.setPatientFirstName(_patient.getPatientFirstName());
		supportiveData.setPatientLastName(_patient.getPatientLastName());
		supportiveData.setPatientGender(_patient.getPatientGender());
		supportiveData.setPatientMobileNumber(_patient.getPatientMobileNumber());
		supportiveData.setPatientNic(_patient.getPatientNic());
		supportiveData.setPatientEmail(_patient.getPatientEmail());
		appointmentSupportiveDataManager.addSupportiveData(supportiveData);
		patientInforDao.addOrUpdatePatientInformation(_patient);

		return supportiveData;
	}

	@Override
	public List<Patient> fetchPatientInformation(Patient _patient) {
		//appointmentSupportiveDataManager.fetchSupportiveData(_patient.getClinicId(), _patient.getAppointmentNumber());
		return null;
	
	}

	@Override
	public void addOrUpdatePatientInformation(Patient _patient) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePatientInformation(Patient _patient) {
		// TODO Auto-generated method stub

	}

	@Override
	public Patient fetchClinicByCriteria(final Patient _patient, final Integer _clinicId) {
		Clinic clinic = clinicDao.findClinicById(_clinicId);
		if (clinic != null) {
			// TODO specialityCode has been fetched using query bounded to
			// fetchDoctorsByCriteria
			// this should be removed and it should be fetched using
			// Doctor-Speciality association
			_patient.setAppointmentDate(clinic.getDateFrom());
			_patient.setDoctor(doctorDao.fetchDoctorsByCriteria(clinic.getDoctorId()));
			_patient.setChannelCenter(channelCenterDao.findChannelCenterById(clinic.getChannelCenterId()));
			_patient.setClinic(clinic);
		}

		return _patient;
	}
}
