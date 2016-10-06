package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.web;

import java.util.List;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Appointment;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Clinic;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.service.AppointmentManager;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.service.ClinicManager;
import com.capsurfit.smartchannel.app.common.dao.LookupDao;
import com.capsurfit.smartchannel.framework.base.web.BaseStruts2Support;
import com.opensymphony.xwork2.ModelDriven;

public class AppointmentSupport extends BaseStruts2Support implements ModelDriven<Appointment> {
	private static final long serialVersionUID = 1L;
	private LookupDao lookupDao;
	private ClinicManager clinicManager;
	private AppointmentManager appointmentManager;
	private Appointment model = new Appointment();
	private List<Clinic> allClinicList;
	private List<Appointment> allAppointments;
	private List<Appointment> allOtherAppointments;

	public ClinicManager getClinicManager() {
		return clinicManager;
	}

	public AppointmentManager getAppointmentManager() {
		return appointmentManager;
	}

	public LookupDao getLookupDao() {
		return lookupDao;
	}

	public void setLookupDao(LookupDao lookupDao) {
		this.lookupDao = lookupDao;
	}

	public void setModel(Appointment model) {
		this.model = model;
	}

	public void setClinicManager(ClinicManager clinicManager) {
		this.clinicManager = clinicManager;
	}

	public void setAppointmentManager(AppointmentManager appointmentManager) {
		this.appointmentManager = appointmentManager;
	}

	public List<Appointment> getAllOtherAppointments() {
		return allOtherAppointments;
	}

	public void setAllOtherAppointments(List<Appointment> allOtherAppointments) {
		this.allOtherAppointments = allOtherAppointments;
	}

	public List<Clinic> getAllClinicList() {
		return allClinicList;
	}

	public void setAllClinicList(List<Clinic> allClinicList) {
		this.allClinicList = allClinicList;
	}

	public List<Appointment> getAllAppointments() {
		return allAppointments;
	}

	public void setAllAppointments(List<Appointment> allAppointments) {
		this.allAppointments = allAppointments;
	}

	public String fetchAppointments() {
		allClinicList = clinicManager.fetchAllClinics(model);
		return SUCCESS;
	}

	public String searchDoctorOnAnotherChannelCenter() {
		allAppointments = appointmentManager.fetchSelectedAppoinment(model);
		allOtherAppointments = appointmentManager.fetchSelectedAppoinmentsInOtherChannelCenters(model);
		Clinic clinic = clinicManager.fetchClinicInfoByParam(model);

		//TODO set these fields to model rather than directly setting it to model.setField
		model.setDoctorName(clinic.getDoctorName());
		model.setChannelCenterName(clinic.getChannelCenterName());
		model.setSpecialityCode(clinic.getSpecialityCode());
		model.setAppoinmentNumber(300);
		model.setAddress(clinic.getAddress());
		model.setFromDate(clinic.getDateFrom());
		return SUCCESS;
	}

	public String fetchSelectedAppoinment() {
		allAppointments = appointmentManager.fetchSelectedAppoinment(model);
		allOtherAppointments = appointmentManager.fetchSelectedAppoinmentsInOtherChannelCenters(model);
		Clinic clinic = clinicManager.fetchClinicInfoByParam(model);

		//TODO set these fields to model rather than directly setting it to model.setField
		model.setDoctorName(clinic.getDoctorName());
		model.setChannelCenterName(clinic.getChannelCenterName());
		model.setSpecialityCode(clinic.getSpecialityCode());
		model.setAppoinmentNumber(300);
		model.setAddress(clinic.getAddress());
		model.setFromDate(clinic.getDateFrom());

		return SUCCESS;
	}
	
	@Override
	public Appointment getModel() {
		return model;
	}

	@Override
	public void prepare() throws Exception {
		super.prepare();
		model.setSpeciality(lookupDao.lookupSpeciality());
		model.setDoctors(lookupDao.lookupDoctors());
		model.setChannelCenters(lookupDao.lookupChannelCenters());
	}
}
