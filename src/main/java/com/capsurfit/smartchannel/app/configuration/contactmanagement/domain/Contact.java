package com.capsurfit.smartchannel.app.configuration.contactmanagement.domain;

// Generated Nov 29, 2013 2:27:46 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;

import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain.ChannelCenter;
import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;

public class Contact extends BaseEntity implements java.io.Serializable {
	private Integer contactId;
	private ChannelCenter channelCenter;
	private String entityPkCode;
	private String contactType;
	private Integer contactNumber;
	private String email;
	private String web;
	private Integer fax;
	private Byte isActive;
	private Date createdDatetime;
	private Date modifiedDatetime;

	public Contact() {
	}

	public Contact(ChannelCenter channelCenter, String contactType) {
		this.channelCenter = channelCenter;
		this.contactType = contactType;
	}

	public Contact(ChannelCenter channelCenter, String entityPkCode, String contactType, Integer contactNumber,
			String email, String web, Byte isActive, Date createdDatetime, Date modifiedDatetime) {
		this.channelCenter = channelCenter;
		this.entityPkCode = entityPkCode;
		this.contactType = contactType;
		this.contactNumber = contactNumber;
		this.email = email;
		this.web = web;
		this.isActive = isActive;
		this.createdDatetime = createdDatetime;
		this.modifiedDatetime = modifiedDatetime;
	}

	public Integer getContactId() {
		return this.contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public ChannelCenter getChannelCenter() {
		return this.channelCenter;
	}

	public void setChannelCenter(ChannelCenter channelCenter) {
		this.channelCenter = channelCenter;
	}

	public String getEntityPkCode() {
		return this.entityPkCode;
	}

	public void setEntityPkCode(String entityPkCode) {
		this.entityPkCode = entityPkCode;
	}

	public String getContactType() {
		return this.contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public Integer getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeb() {
		return this.web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public Integer getFax() {
		return fax;
	}

	public void setFax(Integer fax) {
		this.fax = fax;
	}

	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
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

	@Override
	public Object getEntityId() {
		// TODO Auto-generated method stub
		return null;
	}

}
