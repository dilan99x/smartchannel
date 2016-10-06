package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain;

import java.util.Date;

import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;

public class ClinicProperty extends BaseEntity implements java.io.Serializable {
    private int clinicPropertyId;
    private UnitType unitType;
    private Clinic clinic;
    private ClinicProportyType clinicProportyType;
    private Date startDate;
    private Date endDate;
    private Integer unitQuantity;
    private String isActive;

    public int getClinicPropertyId() {
        return this.clinicPropertyId;
    }

    public void setClinicPropertyId(int clinicPropertyId) {
        this.clinicPropertyId = clinicPropertyId;
    }

    public UnitType getUnitType() {
        return this.unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public Clinic getClinic() {
        return this.clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public ClinicProportyType getClinicProportyType() {
        return this.clinicProportyType;
    }

    public void setClinicProportyType(ClinicProportyType clinicProportyType) {
        this.clinicProportyType = clinicProportyType;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getUnitQuantity() {
        return this.unitQuantity;
    }

    public void setUnitQuantity(Integer unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    public String getIsActive() {
        return this.isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Override
    public Object getEntityId() {
        return getClinicPropertyId();
    }

}
