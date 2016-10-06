package com.capsurfit.smartchannel.app.appservice.paymentgateway.web;

import com.capsurfit.smartchannel.app.appservice.paymentgateway.domain.PaymentGatewayData;
import com.capsurfit.smartchannel.app.appservice.paymentgateway.manager.PaymentGatewayManager;
import com.capsurfit.smartchannel.framework.base.web.BaseStruts2Support;
import com.opensymphony.xwork2.ModelDriven;

public class PaymentGatewaySupport extends BaseStruts2Support implements ModelDriven<PaymentGatewayData> {
	private static final long serialVersionUID = 1L;
	private PaymentGatewayManager paymentGatewayManager;
	private PaymentCredential paymentCredential;
	private PaymentGatewayData model;

	public void setPaymentGatewayManager(final PaymentGatewayManager _paymentGatewayManager) {
		this.paymentGatewayManager = _paymentGatewayManager;
	}

	public PaymentGatewaySupport() {
		model = new PaymentGatewayData();
	}

	public String processPayementGateway() {
		try {
			if (paymentGatewayManager.processPaymentGateway(model)) {
				return SUCCESS;
			}

			// TODO Exceptions should be placed under derived sub class of
			// Exception..Remove this
		} catch (Exception ex) {
			ex.printStackTrace();
			return INPUT;
		}
        return INPUT;
	}

	public String loadPaymentGateway() {
		return SUCCESS;
	}

	@Override
	public PaymentGatewayData getModel() {
		return model;
	}

}
