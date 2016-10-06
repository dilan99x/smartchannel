package com.capsurfit.smartchannel.app.configuration.doctormanagement.web;

import java.util.List;

import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Doctor;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.service.DoctorManager;
import com.capsurfit.smartchannel.framework.base.web.BaseStruts2Support;
import com.capsurfit.smartchannel.framework.common.shared.CoreConstants.Symbol;
import com.opensymphony.xwork2.ModelDriven;


public class DoctorSupport extends BaseStruts2Support implements ModelDriven<Doctor> {
	private DoctorManager doctorManager;
	private List<Doctor> doctorList;

	public void setDoctorManager(final DoctorManager _doctorManager) {
		this.doctorManager = _doctorManager;
	}

	public List<Doctor> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

	private Doctor model = new Doctor();

	// Validation mechanism is still argumentative, since that it is using this
	// method
	public boolean validateDoctor() {
		if (model.getFirstName() == null || Symbol.EMPTY_STRING.equals(model.getFirstName())
				|| model.getLastName() == null || Symbol.EMPTY_STRING.equals(model.getLastName())
				|| model.getNameWithInnitials() == null || Symbol.EMPTY_STRING.equals(model.getNameWithInnitials())
				|| model.getNic() == null || Symbol.EMPTY_STRING.equals(model.getNic()) || model.getEmail() == null
				|| Symbol.EMPTY_STRING.equals(model.getEmail()) || model.getMobile() == null
				|| Symbol.EMPTY_STRING.getValue().equals(model.getMobile()) || model.getRegistrationNumber() == null
				|| Symbol.EMPTY_STRING.equals(model.getRegistrationNumber())) {
			return false;
		} else {
			return true;
		}
	}

	public String addDoctor() {
		if (validateDoctor()) {
			try {
				doctorManager.addDoctor(model);
			} catch (Exception ex) {
				ex.printStackTrace();
				return INPUT;
			}
			return SUCCESS;
		} else {
			return INPUT;
		}

	}

	public String updateDoctor() {
		try {
			doctorManager.updateDoctor(model);
		} catch (Exception exception) {
			exception.printStackTrace();
			return INPUT;
		}
		return SUCCESS;
	}

	public String deleteDoctor() {
		try {
			doctorManager.deleteDoctor(model);
			model = new Doctor();

		} catch (Exception exception) {
			exception.printStackTrace();
			return INPUT;
		}
		return SUCCESS;
	}

	public String fetchDoctors() {
		try {
			doctorList = doctorManager.fetchDoctors();
		} catch (Exception ex) {
			ex.printStackTrace();
			return INPUT;
		}
		return SUCCESS;
	}

	@Override
	public Doctor getModel() {
		return model;
	}

}
