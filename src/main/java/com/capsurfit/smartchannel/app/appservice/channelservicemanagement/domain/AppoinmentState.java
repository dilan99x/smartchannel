package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain;

// Generated Nov 29, 2013 2:27:46 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;

public class AppoinmentState implements java.io.Serializable {
    private Integer appoinmentStateId;
    private Appointment appoinment;
    private Byte isChanged;
    private Byte isCancelled;
    private Date changedDatetime;
    private Date effectiveDatetime;
    private String description;
    private Date createdDatetime;
    private Date modifiedDatetime;

    public AppoinmentState() {
    }

    public AppoinmentState(Appointment appoinment) {
        this.appoinment = appoinment;
    }

    public AppoinmentState(Appointment appoinment, Byte isChanged,
                           Byte isCancelled, Date changedDatetime, Date effectiveDatetime,
                           String description, Date createdDatetime, Date modifiedDatetime) {
        this.appoinment = appoinment;
        this.isChanged = isChanged;
        this.isCancelled = isCancelled;
        this.changedDatetime = changedDatetime;
        this.effectiveDatetime = effectiveDatetime;
        this.description = description;
        this.createdDatetime = createdDatetime;
        this.modifiedDatetime = modifiedDatetime;
    }

    public Integer getAppoinmentStateId() {
        return this.appoinmentStateId;
    }

    public void setAppoinmentStateId(Integer appoinmentStateId) {
        this.appoinmentStateId = appoinmentStateId;
    }

    public Appointment getAppoinment() {
        return this.appoinment;
    }

    public void setAppoinment(Appointment appoinment) {
        this.appoinment = appoinment;
    }

    public Byte getIsChanged() {
        return this.isChanged;
    }

    public void setIsChanged(Byte isChanged) {
        this.isChanged = isChanged;
    }

    public Byte getIsCancelled() {
        return this.isCancelled;
    }

    public void setIsCancelled(Byte isCancelled) {
        this.isCancelled = isCancelled;
    }

    public Date getChangedDatetime() {
        return this.changedDatetime;
    }

    public void setChangedDatetime(Date changedDatetime) {
        this.changedDatetime = changedDatetime;
    }

    public Date getEffectiveDatetime() {
        return this.effectiveDatetime;
    }

    public void setEffectiveDatetime(Date effectiveDatetime) {
        this.effectiveDatetime = effectiveDatetime;
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

}
