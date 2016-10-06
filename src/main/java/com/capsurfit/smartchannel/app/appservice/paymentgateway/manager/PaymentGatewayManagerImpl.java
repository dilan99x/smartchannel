package com.capsurfit.smartchannel.app.appservice.paymentgateway.manager;

import com.capsurfit.smartchannel.app.appservice.paymentgateway.domain.PaymentGatewayData;
import com.capsurfit.smartchannel.app.appservice.paymentgateway.util.PaymentGatewayInfo;

public class PaymentGatewayManagerImpl implements PaymentGatewayManager {
	private static final String SUCCESS = "success";
	private static final String INPUT = "input";

	@Override
	public boolean processPaymentGateway(final PaymentGatewayData _paymentGatewayData) {
		return validatePaymentCredentials(_paymentGatewayData);
	}

	@Override
	public boolean validatePaymentCredentials(final PaymentGatewayData _paymentGatewayData) {
		//TODO This mock implementation must be removed and plugged with payment gateway. 
		
		if (PaymentGatewayInfo.CREDIT_CARD_NUMBER.getCardInfo().equals(_paymentGatewayData.getCardNumber())
				&& PaymentGatewayInfo.CARD_NAME.getCardInfo().equals(_paymentGatewayData.getCardName())
				&& PaymentGatewayInfo.CVC2.getCardInforNumeric().equals(_paymentGatewayData.getCcv2())
				&& PaymentGatewayInfo.EXPIRE_MONTH.getCardInforNumeric().equals(_paymentGatewayData.getExpirationMonth())
				&& PaymentGatewayInfo.EXPIRE_YEAR.getCardInforNumeric().equals(_paymentGatewayData.getExpirationYear())) {
			return true;
		}
		return false;
	}

}
