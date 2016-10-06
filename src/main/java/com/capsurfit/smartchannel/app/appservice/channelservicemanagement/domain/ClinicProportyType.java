package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain;

import java.util.HashSet;
import java.util.Set;

import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;

public class ClinicProportyType extends BaseEntity implements java.io.Serializable {
	private int clinicProportyTypeId;
	private String clinicProportyTypeCode;
	private String description;
	private Set clinicProperties = new HashSet(0);

	public int getClinicProportyTypeId() {
		return this.clinicProportyTypeId;
	}

	public void setClinicProportyTypeId(int clinicProportyTypeId) {
		this.clinicProportyTypeId = clinicProportyTypeId;
	}

	public String getClinicProportyTypeCode() {
		return this.clinicProportyTypeCode;
	}

	public void setClinicProportyTypeCode(String clinicProportyTypeCode) {
		this.clinicProportyTypeCode = clinicProportyTypeCode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getClinicProperties() {
		return this.clinicProperties;
	}

	public void setClinicProperties(Set clinicProperties) {
		this.clinicProperties = clinicProperties;
	}

	@Override
	public Object getEntityId() {
		return getClinicProportyTypeId();
	}

}
