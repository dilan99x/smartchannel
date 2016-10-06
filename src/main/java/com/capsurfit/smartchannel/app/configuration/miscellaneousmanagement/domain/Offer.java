package com.capsurfit.smartchannel.app.configuration.miscellaneousmanagement.domain;

// Generated Nov 29, 2013 2:27:46 PM by Hibernate Tools 3.2.1.GA

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Patient;
import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain.ChannelCenterDoctor;

import java.util.Date;

public class Offer implements java.io.Serializable {
	private int offerId;
	private Patient patient;
	private ChannelCenterDoctor channelCenterDoctor;
	private Double additionApplied;
	private Double diductionGiven;
	private Date createdDatetime;
	private Date modifiedDatetime;
	private Byte isActive;

	public Offer() {
	}

	public Offer(int offerId, Patient patient,
			ChannelCenterDoctor channelCenterDoctor) {
		this.offerId = offerId;
		this.patient = patient;
		this.channelCenterDoctor = channelCenterDoctor;
	}

	public Offer(int offerId, Patient patient,
			ChannelCenterDoctor channelCenterDoctor, Double additionApplied,
			Double diductionGiven, Date createdDatetime, Date modifiedDatetime,
			Byte isActive) {
		this.offerId = offerId;
		this.patient = patient;
		this.channelCenterDoctor = channelCenterDoctor;
		this.additionApplied = additionApplied;
		this.diductionGiven = diductionGiven;
		this.createdDatetime = createdDatetime;
		this.modifiedDatetime = modifiedDatetime;
		this.isActive = isActive;
	}

	public int getOfferId() {
		return this.offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public ChannelCenterDoctor getChannelCenterDoctor() {
		return this.channelCenterDoctor;
	}

	public void setChannelCenterDoctor(ChannelCenterDoctor channelCenterDoctor) {
		this.channelCenterDoctor = channelCenterDoctor;
	}

	public Double getAdditionApplied() {
		return this.additionApplied;
	}

	public void setAdditionApplied(Double additionApplied) {
		this.additionApplied = additionApplied;
	}

	public Double getDiductionGiven() {
		return this.diductionGiven;
	}

	public void setDiductionGiven(Double diductionGiven) {
		this.diductionGiven = diductionGiven;
	}

	public Date getCreatedDatetime() {
		return this.createdDatetime;
	}

	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public Date getModifiedDatetime() {
		return this.modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

}
