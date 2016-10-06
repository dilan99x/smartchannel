package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.web;

import java.util.ArrayList;
import java.util.List;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Clinic;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.service.ClinicManager;
import com.capsurfit.smartchannel.app.common.dao.LookupDao;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.dao.DoctorDao;
import com.capsurfit.smartchannel.framework.base.web.BaseStruts2Support;
import com.opensymphony.xwork2.ModelDriven;


public class ClinicSupport extends BaseStruts2Support implements ModelDriven<Clinic> {
	private LookupDao lookupDao;
	private Clinic model = new Clinic();
	private List<Clinic> clinicList = new ArrayList<Clinic>();
	private DoctorDao doctorDao;
	private ClinicManager clinicManager;
	
	public ClinicManager getClinicManager() {
		return clinicManager;
	}

	public void setClinicManager(ClinicManager clinicManager) {
		this.clinicManager = clinicManager;
	}

	public DoctorDao getDoctorDao() {
		return doctorDao;
	}

	public void setDoctorDao(DoctorDao doctorDao) {
		this.doctorDao = doctorDao;
	}

	public void setLookupDao(LookupDao lookupDao) {
		this.lookupDao = lookupDao;
	}

	public String addClinics() {
		try {
			clinicManager.addClinic(model);
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return SUCCESS;
	}

	public String updateClinic() {
		try {
			System.out.println(model);
			System.out.println("##############################");
			System.out.println(model.getDescription());
			clinicManager.updateClinic(model);
			return SUCCESS;
		} catch (Exception exception) {
			exception.printStackTrace();
			return INPUT;
		}
	}

	public String deleteClinic() {
		try {
            System.out.println("#############################################");
            System.out.println("delete operation");
            clinicManager.deleteClinic(model);
            model = new Clinic();
			return SUCCESS;
		} catch (Exception ex) {
			ex.fillInStackTrace();
			return INPUT;
		}
	}

	public String fetchClinics() {
		clinicList = clinicManager.fetchClinics();

		return SUCCESS;
	}

	@Override
	public void prepare() throws Exception {
		super.prepare();
		model.setDoctors(lookupDao.lookupDoctors());
		model.setChannelCenters(lookupDao.lookupChannelCenters());
		model.setClinicTypes(lookupDao.lookupClinicTypes());
	}

	@Override
	public Clinic getModel() {
		return model;
	}

	public List<Clinic> getClinicList() {
		return clinicList;
	}

	public void setClinicList(List<Clinic> clinicList) {
		this.clinicList = clinicList;
	}
}
