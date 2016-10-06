package com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain;

// Generated Nov 30, 2013 1:28:53 PM by Hibernate Tools 3.2.1.GA

import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Doctor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ChannelCenterDoctor implements java.io.Serializable {
	private ChannelCenterDoctorId id;
	private ChannelCenter channelCenter;
	private Doctor doctor;
	private Date createdDatetime;
	private Date modifiedDatetime;
	private Set offers = new HashSet(0);

	public ChannelCenterDoctor() {
	}

	public ChannelCenterDoctor(ChannelCenterDoctorId id,
							   ChannelCenter channelCenter, Doctor doctor) {
		this.id = id;
		this.channelCenter = channelCenter;
		this.doctor = doctor;
	}

	public ChannelCenterDoctor(ChannelCenterDoctorId id,
							   ChannelCenter channelCenter, Doctor doctor, Date createdDatetime,
							   Date modifiedDatetime, Set offers) {
		this.id = id;
		this.channelCenter = channelCenter;
		this.doctor = doctor;
		this.createdDatetime = createdDatetime;
		this.modifiedDatetime = modifiedDatetime;
		this.offers = offers;
	}

	public ChannelCenterDoctorId getId() {
		return this.id;
	}

	public void setId(ChannelCenterDoctorId id) {
		this.id = id;
	}

	public ChannelCenter getChannelCenter() {
		return this.channelCenter;
	}

	public void setChannelCenter(ChannelCenter channelCenter) {
		this.channelCenter = channelCenter;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
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

	public Set getOffers() {
		return this.offers;
	}

	public void setOffers(Set offers) {
		this.offers = offers;
	}

}
