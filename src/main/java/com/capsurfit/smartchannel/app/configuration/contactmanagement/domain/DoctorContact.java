package com.capsurfit.smartchannel.app.configuration.contactmanagement.domain;

//Generated Jan 4, 2014 9:45:22 PM by Hibernate Tools 3.2.1.GA
import com.capsurfit.smartchannel.app.configuration.doctormanagement.domain.Doctor;
import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;

import java.util.Date;

public class DoctorContact extends BaseEntity implements java.io.Serializable {
  private Integer doctorContactId;
  private Doctor doctor;
  private String contactType;
  private String mobile;
  private String residence;
  private String fax;
  private String email;
  private String web;
  private Byte isActive;
  private Date createdDatetime;
  private Date modifiedDatetime;

 public DoctorContact() {
 }

 public DoctorContact(Doctor doctor, String contactType, String mobile, String residence, String fax, String email, String web, Byte isActive, Date createdDatetime, Date modifiedDatetime) {
    this.doctor = doctor;
    this.contactType = contactType;
    this.mobile = mobile;
    this.residence = residence;
    this.fax = fax;
    this.email = email;
    this.web = web;
    this.isActive = isActive;
    this.createdDatetime = createdDatetime;
    this.modifiedDatetime = modifiedDatetime;
 }

 public Integer getDoctorContactId() {
     return this.doctorContactId;
 }
 
 public void setDoctorContactId(Integer doctorContactId) {
     this.doctorContactId = doctorContactId;
 }
 public Doctor getDoctor() {
     return this.doctor;
 }
 
 public void setDoctor(Doctor doctor) {
     this.doctor = doctor;
 }
 public String getContactType() {
     return this.contactType;
 }
 
 public void setContactType(String contactType) {
     this.contactType = contactType;
 }
 public String getMobile() {
     return this.mobile;
 }
 
 public void setMobile(String mobile) {
     this.mobile = mobile;
 }
 public String getResidence() {
     return this.residence;
 }
 
 public void setResidence(String residence) {
     this.residence = residence;
 }
 public String getFax() {
     return this.fax;
 }
 
 public void setFax(String fax) {
     this.fax = fax;
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
