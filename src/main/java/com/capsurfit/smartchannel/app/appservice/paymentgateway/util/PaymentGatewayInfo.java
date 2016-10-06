package com.capsurfit.smartchannel.app.appservice.paymentgateway.util;

public enum PaymentGatewayInfo {
	CREDIT_CARD_NUMBER("4899 8079 0038 8921"), 
	CARD_NAME("Sampath"),
	CVC2(4899), 
	EXPIRE_MONTH(12), 
	EXPIRE_YEAR(2014);
	
	private String cardInfo;
	private Integer cardInforNumeric;

	private PaymentGatewayInfo(String cardInfo) {
		this.cardInfo = cardInfo;
	}

	private PaymentGatewayInfo(Integer cardInteger) {
		this.cardInforNumeric = cardInteger;
	}

	public String getCardInfo() {
		return cardInfo;
	}

	public Integer getCardInforNumeric() {
		return cardInforNumeric;
	}
}
