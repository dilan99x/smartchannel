package com.capsurfit.smartchannel.app.appservice.paymentgateway.web;

import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;

public class PaymentCredential extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private String creditCardNumber;
	private Integer cvc2;
	private Integer expireMonth;
	private Integer expireYear;
	private String cardName;

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public Integer getCvc2() {
		return cvc2;
	}

	public void setCvc2(Integer cvc2) {
		this.cvc2 = cvc2;
	}

	public Integer getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(Integer expireMonth) {
		this.expireMonth = expireMonth;
	}

	public Integer getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(Integer expireYear) {
		this.expireYear = expireYear;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	@Override
	public Object getEntityId() {
		return null;
	}

}
