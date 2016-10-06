package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.service;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.AppointmentResult;

public interface AppointmentConfirmationManager {
    boolean confirmAppointment(final AppointmentResult _appointmentResult);
}
