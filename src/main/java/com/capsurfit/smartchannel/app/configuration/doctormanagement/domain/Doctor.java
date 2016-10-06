package com.capsurfit.smartchannel.app.configuration.doctormanagement.domain;

//Generated Jan 4, 2014 9:45:22 PM by Hibernate Tools 3.2.1.GA
import java.io.File;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@SuppressWarnings("serial")
public class Doctor extends BaseEntity implements java.io.Serializable {
	private Integer doctorId;
	private Speciality speciality;
	private String firstName;
	private String lastName;
	private String nameWithInnitials;
	private String registrationNumber;
	private String nic;
	private Integer age;
	private String address;
	private Byte isActive;
	private String description;
	private Date createdDatetime;
	private Date modifiedDatetime;
	private Set governmentHospitals = new HashSet(0);
	private Set doctorContacts = new HashSet(0);
	private Set channelCenterDoctors = new HashSet(0);
	private Set clinics = new HashSet(0);

	// joined Fields
	private String email;
	private String web;
	private String mobile;
	private String residence;
	private String fax;
	private File imageFile;
	private String contactType;
	private String specialityCode;

	public Doctor() {
	}

	public Doctor(Speciality speciality, String firstName, String lastName, String nameWithInnitials,
			String registrationNumber, String nic, Integer age, String address, Byte isActive, String description,
			Date createdDatetime, Date modifiedDatetime, Set governmentHospitals, Set doctorContacts,
			Set channelCenterDoctors) {
		this.speciality = speciality;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nameWithInnitials = nameWithInnitials;
		this.registrationNumber = registrationNumber;
		this.nic = nic;
		this.age = age;
		this.address = address;
		this.isActive = isActive;
		this.description = description;
		this.createdDatetime = createdDatetime;
		this.modifiedDatetime = modifiedDatetime;
		this.governmentHospitals = governmentHospitals;
		this.doctorContacts = doctorContacts;
		this.channelCenterDoctors = channelCenterDoctors;
	}

	public Integer getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Speciality getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNameWithInnitials() {
		return this.nameWithInnitials;
	}

	public void setNameWithInnitials(String nameWithInnitials) {
		this.nameWithInnitials = nameWithInnitials;
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getNic() {
		return this.nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Set getGovernmentHospitals() {
		return this.governmentHospitals;
	}

	public void setGovernmentHospitals(Set governmentHospitals) {
		this.governmentHospitals = governmentHospitals;
	}

	public Set getDoctorContacts() {
		return this.doctorContacts;
	}

	public void setDoctorContacts(Set doctorContacts) {
		this.doctorContacts = doctorContacts;
	}

	public Set getChannelCenterDoctors() {
		return this.channelCenterDoctors;
	}

	public void setChannelCenterDoctors(Set channelCenterDoctors) {
		this.channelCenterDoctors = channelCenterDoctors;
	}

	public Set getClinics() {
		return this.clinics;
	}

	public void setClinics(Set clinics) {
		this.clinics = clinics;
	}

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public File getImageFile() {
		return imageFile;
	}

	public void setImageFile(File imageFile) {
		this.imageFile = imageFile;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getSpecialityCode() {
		return specialityCode;
	}

	public void setSpecialityCode(String specialityCode) {
		this.specialityCode = specialityCode;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null || !(object instanceof Doctor)) {
			return false;
		}

		Doctor other = (Doctor) object;
		return new EqualsBuilder().append(this.registrationNumber, other.registrationNumber).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(this.registrationNumber).toHashCode();
	}

	@Override
	public Object getEntityId() {
		// TODO Auto-generated method stub
		return null;
	}
}