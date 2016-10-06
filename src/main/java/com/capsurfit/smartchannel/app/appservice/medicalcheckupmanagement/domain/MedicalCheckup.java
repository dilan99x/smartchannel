package com.capsurfit.smartchannel.app.appservice.medicalcheckupmanagement.domain;

// Generated Nov 29, 2013 2:27:46 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MedicalCheckup implements java.io.Serializable {
    private Integer checkupId;
    private CheckupType checkupType;
    private Date checkupDatetime;
    private Double totalPrice;
    private Date createdDatetime;
    private Date modifiedDatetime;
    private Set channelCenters = new HashSet(0);

    public MedicalCheckup() {
    }

    public MedicalCheckup(CheckupType checkupType) {
        this.checkupType = checkupType;
    }

    public MedicalCheckup(CheckupType checkupType, Date checkupDatetime,
                          Double totalPrice, Date createdDatetime, Date modifiedDatetime,
                          Set channelCenters) {
        this.checkupType = checkupType;
        this.checkupDatetime = checkupDatetime;
        this.totalPrice = totalPrice;
        this.createdDatetime = createdDatetime;
        this.modifiedDatetime = modifiedDatetime;
        this.channelCenters = channelCenters;
    }

    public Integer getCheckupId() {
        return this.checkupId;
    }

    public void setCheckupId(Integer checkupId) {
        this.checkupId = checkupId;
    }

    public CheckupType getCheckupType() {
        return this.checkupType;
    }

    public void setCheckupType(CheckupType checkupType) {
        this.checkupType = checkupType;
    }

    public Date getCheckupDatetime() {
        return this.checkupDatetime;
    }

    public void setCheckupDatetime(Date checkupDatetime) {
        this.checkupDatetime = checkupDatetime;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
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

    public Set getChannelCenters() {
        return this.channelCenters;
    }

    public void setChannelCenters(Set channelCenters) {
        this.channelCenters = channelCenters;
    }

}
