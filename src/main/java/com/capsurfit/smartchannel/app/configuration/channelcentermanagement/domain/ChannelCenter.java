package com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain;

// Generated Nov 29, 2013 2:27:46 PM by Hibernate Tools 3.2.1.GA

import java.io.File;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;

public class ChannelCenter extends BaseEntity implements java.io.Serializable {
	// Persist fields
	private Integer channelCenterId;
	private String channelCenterName;
	private String address;
	private String residentialCity;
	private String mainCity;
	private String description;
	private Byte isActive;
	private String imageSource;
	private Date createdDatetime;
	private Date modifiedDatetime;
	private Set medicalCheckups = new HashSet(0);
	private Set channelCenterDoctors = new HashSet(0);
	private Set channelCenterContacts = new HashSet(0);
	private Set clinics = new HashSet(0);
	
	// joined Fields
	private String email;
	private String web;
	private Integer contactNumber;
	private Integer fax;
	private File imageFile;

	// other fields
	private String myMessage;

	public ChannelCenter() {
	}

	public ChannelCenter(String channelCenterName, String address,
			String residentialCity, String mainCity) {
		this.channelCenterName = channelCenterName;
		this.address = address;
		this.residentialCity = residentialCity;
		this.mainCity = mainCity;
	}

	public ChannelCenter(String channelCenterName, String address,
			String residentialCity, String mainCity, String description,
			Byte isActive, String imageSource, Date createdDatetime,
			Date modifiedDatetime, Set medicalCheckups,
			Set channelCenterDoctors, Set channelCenterContacts) {
		this.channelCenterName = channelCenterName;
		this.address = address;
		this.residentialCity = residentialCity;
		this.mainCity = mainCity;
		this.description = description;
		this.isActive = isActive;
		this.imageSource = imageSource;
		this.createdDatetime = createdDatetime;
		this.modifiedDatetime = modifiedDatetime;
		this.medicalCheckups = medicalCheckups;
		this.channelCenterDoctors = channelCenterDoctors;
		this.channelCenterContacts = channelCenterContacts;
	}

	// persist fields getters and setters
	public Integer getChannelCenterId() {
		return this.channelCenterId;
	}

	public void setChannelCenterId(Integer channelCenterId) {
		this.channelCenterId = channelCenterId;
	}

	public String getChannelCenterName() {
		return this.channelCenterName;
	}

	public void setChannelCenterName(String channelCenterName) {
		this.channelCenterName = channelCenterName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getResidentialCity() {
		return this.residentialCity;
	}

	public void setResidentialCity(String residentialCity) {
		this.residentialCity = residentialCity;
	}

	public String getMainCity() {
		return this.mainCity;
	}

	public void setMainCity(String mainCity) {
		this.mainCity = mainCity;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

	public String getImageSource() {
		return this.imageSource;
	}

	public void setImageSource(String imageSource) {
		this.imageSource = imageSource;
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

	public Set getMedicalCheckups() {
		return this.medicalCheckups;
	}

	public void setMedicalCheckups(Set medicalCheckups) {
		this.medicalCheckups = medicalCheckups;
	}

	public Set getChannelCenterDoctors() {
		return this.channelCenterDoctors;
	}

	public void setChannelCenterDoctors(Set channelCenterDoctors) {
		this.channelCenterDoctors = channelCenterDoctors;
	}

	public Set getChannelCenterContacts() {
		return this.channelCenterContacts;
	}

	public void setChannelCenterContacts(Set channelCenterContacts) {
		this.channelCenterContacts = channelCenterContacts;
	}
	
	public Set getClinics() {
		return clinics;
	}

	public void setClinics(Set clinics) {
		this.clinics = clinics;
	}

	// joined fields field getter setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public Integer getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Integer getFax() {
		return fax;
	}

	public void setFax(Integer fax) {
		this.fax = fax;
	}

	public File getImageFile() {
		return imageFile;
	}

	public void setImageFile(File imageFile) {
		this.imageFile = imageFile;
	}

	public String getMyMessage() {
		return myMessage;
	}

	public void setMyMessage(String myMessage) {
		this.myMessage = myMessage;
	}

	@Override
	public Object getEntityId() {
		// TODO Auto-generated method stub
		return null;
	}
}
