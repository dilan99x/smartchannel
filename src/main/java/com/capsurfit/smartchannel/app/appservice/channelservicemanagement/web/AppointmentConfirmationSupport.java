package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.web;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.AppointmentResult;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.service.AppointmentConfirmationManager;
import com.capsurfit.smartchannel.framework.base.web.BaseStruts2Support;
import com.capsurfit.smartchannel.framework.common.shared.CoreConstants.Symbol;
import com.opensymphony.xwork2.ModelDriven;

public class AppointmentConfirmationSupport extends BaseStruts2Support implements ModelDriven<AppointmentResult> {
	private static final long serialVersionUID = 1L;
	private AppointmentResult model;
	private AppointmentConfirmationManager appointmentConfirmationManager;

	public AppointmentConfirmationSupport() {
		model = new AppointmentResult();
	}

	public void setAppointmentConfirmationManager(AppointmentConfirmationManager appointmentConfirmationManager) {
		this.appointmentConfirmationManager = appointmentConfirmationManager;
	}

	public String proceedSubmission() {
		appointmentConfirmationManager.confirmAppointment(model);
		return model.getConditionApproval() != null
				&& !model.getConditionApproval().equals(Symbol.EMPTY_STRING.getValue())
				&& model.getConditionApproval().equals(Symbol.Y.getValue()) ? SUCCESS : INPUT;
	}

	@Override
	public AppointmentResult getModel() {
		return model;
	}

}
