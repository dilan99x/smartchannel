package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.service;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Appointment;

import java.util.List;

public interface AppointmentManager {
	List<Appointment> fetchSelectedAppoinment(final Appointment _appointment);

	List<Appointment> fetchSelectedAppoinmentsInOtherChannelCenters(final Appointment _appointment);
}
