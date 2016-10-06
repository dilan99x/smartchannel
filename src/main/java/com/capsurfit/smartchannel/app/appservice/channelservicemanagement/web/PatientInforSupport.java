package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.web;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Patient;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.service.PatientInforManager;
import com.capsurfit.smartchannel.app.common.domain.AppointmentSupportiveData;
import com.capsurfit.smartchannel.framework.base.web.BaseStruts2Support;
import com.capsurfit.smartchannel.framework.common.shared.CoreConstants.Symbol;
import com.opensymphony.xwork2.ModelDriven;

public class PatientInforSupport extends BaseStruts2Support implements ModelDriven<Patient> {
	private static final long serialVersionUID = 1L;

	private PatientInforManager patientInforManager;
	private Patient model;

	public PatientInforSupport() {
		model = new Patient();
	}

	public void setPatientInforManager(final PatientInforManager _patientInforManager) {
		this.patientInforManager = _patientInforManager;
	}

	public void setModel(final Patient _model) {
		this.model = _model;
	}

	public String loadPatientsInfor() {
		// TODO C1- Check for arbitrarily invocation
		if (true) {
			patientInforManager.fetchClinicByCriteria(model, model.getClinicId());
			return SUCCESS;
		}
		return INPUT;
	}

	public String processPatientInfor() {
		if ((model.getPatientFirstName() == null || Symbol.EMPTY_STRING.getValue().equals(model.getPatientFirstName()))
				|| model.getPatientGender() == null || Symbol.EMPTY_STRING.getValue().equals(model.getPatientGender())
				|| model.getPatientNic() == null || Symbol.EMPTY_STRING.getValue().equals(model.getPatientNic())
				|| model.getPatientMobileNumber() == null
				|| Symbol.EMPTY_STRING.getValue().equals(model.getPatientMobileNumber())) {
			return INPUT;
		}
		AppointmentSupportiveData supportiveData = patientInforManager.processPatientInformation(model);
		model.setAppointmentNumber(supportiveData.getAppointmentNo());
		model.setClinicId(supportiveData.getClinicId());
		return SUCCESS;
	}

	@Override
	public Patient getModel() {
		return model;
	}
}
