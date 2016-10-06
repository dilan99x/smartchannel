package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain;

import java.util.HashSet;
import java.util.Set;

import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;

public class UnitType extends BaseEntity implements java.io.Serializable {
	private int unitTypeId;
	private String unitTypeCode;
	private String description;
	private Set clinicProperties = new HashSet(0);

	public int getUnitTypeId() {
		return this.unitTypeId;
	}

	public void setUnitTypeId(int unitTypeId) {
		this.unitTypeId = unitTypeId;
	}

	public String getUnitTypeCode() {
		return this.unitTypeCode;
	}

	public void setUnitTypeCode(String unitTypeCode) {
		this.unitTypeCode = unitTypeCode;
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
		return getUnitTypeId();
	}

}
