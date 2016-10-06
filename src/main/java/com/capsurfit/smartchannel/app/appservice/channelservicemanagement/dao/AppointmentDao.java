package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Appointment;

import java.util.List;


public interface AppointmentDao {
	Appointment fetchAppointmentByCriteria(final Integer clinicId, final Integer appointmentNumber);
	
	List<Appointment> fetchSelectedAppoinment(final Appointment _appointment);

	List<Appointment> fetchSelectedAppoinmentsInOtherChannelCenters(final Appointment _appointment);
	
	void addOrUpdateAppointment(final Appointment _appointment);
}
