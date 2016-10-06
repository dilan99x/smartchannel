package com.capsurfit.smartchannel.app.appservice.paymentgateway.domain;

import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;

public class PaymentGatewayData extends BaseEntity {
	private static final long serialVersionUID = 1L;

	private Integer cardNumber1;
	private Integer cardNumber2;
	private Integer cardNumber3;
	private Integer cardNumber4;
	private String cardNumber;
	private Integer expirationMonth;
	private Integer expirationYear;
	private Integer ccv2;
	private String cardName;
	private String email;
	private String countryCode;
	private String mobileNumber;
	
	///////////////////////// Joined Fields /////////////////////////////////////////
	private Integer clinicId;
	private Integer appointmentNumber;

	public Integer getCardNumber1() {
		return cardNumber1;
	}

	public void setCardNumber1(Integer cardNumber1) {
		this.cardNumber1 = cardNumber1;
	}

	public Integer getCardNumber2() {
		return cardNumber2;
	}

	public void setCardNumber2(Integer cardNumber2) {
		this.cardNumber2 = cardNumber2;
	}

	public Integer getCardNumber3() {
		return cardNumber3;
	}

	public void setCardNumber3(Integer cardNumber3) {
		this.cardNumber3 = cardNumber3;
	}

	public Integer getCardNumber4() {
		return cardNumber4;
	}

	public void setCardNumber4(Integer cardNumber4) {
		this.cardNumber4 = cardNumber4;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Integer getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(Integer expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public Integer getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(Integer expirationYear) {
		this.expirationYear = expirationYear;
	}

	public Integer getCcv2() {
		return ccv2;
	}

	public void setCcv2(Integer ccv2) {
		this.ccv2 = ccv2;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getClinicId() {
		return clinicId;
	}

	public void setClinicId(Integer clinicId) {
		this.clinicId = clinicId;
	}

	public Integer getAppointmentNumber() {
		return appointmentNumber;
	}

	public void setAppointmentNumber(Integer appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public Object getEntityId() {
		return null;
	}

}
