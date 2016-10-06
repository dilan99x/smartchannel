package com.capsurfit.smartchannel.app.appservice.paymentgateway.manager;

import com.capsurfit.smartchannel.app.appservice.paymentgateway.domain.PaymentGatewayData;

public interface PaymentGatewayManager {
	public boolean processPaymentGateway(final PaymentGatewayData _paymentGatewayData);

	public boolean validatePaymentCredentials(final PaymentGatewayData _paymentGatewayData);
}
