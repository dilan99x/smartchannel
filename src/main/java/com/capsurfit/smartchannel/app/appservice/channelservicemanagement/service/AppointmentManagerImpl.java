package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.service;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao.AppointmentDao;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao.ClinicDao;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao.ClinicPropertyDao;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Appointment;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Clinic;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.ClinicProperty;
import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.util.AppointmentProcessUtil;
import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.dao.ChannelCenterDao;
import com.capsurfit.smartchannel.app.configuration.doctormanagement.dao.DoctorDao;
import com.capsurfit.smartchannel.framework.common.shared.CoreConstants.Symbol;
import java.util.ArrayList;
import java.util.List;

public class AppointmentManagerImpl implements AppointmentManager {
	private AppointmentDao appointmentDao;
	private ClinicPropertyDao clinicPropertyDao;
	private ClinicDao clinicDao;
	private DoctorDao doctorDao;
	private ChannelCenterDao channelCenterDao;

	public void setAppointmentDao(final AppointmentDao _appointmentDao) {
		this.appointmentDao = _appointmentDao;
	}

	public void setClinicPropertyDao(final ClinicPropertyDao _clinicPropertyDao) {
		this.clinicPropertyDao = _clinicPropertyDao;
	}

	public void setClinicDao(final ClinicDao _clinicDao) {
		this.clinicDao = _clinicDao;
	}

	public void setDoctorDao(final DoctorDao _doctorDao) {
		this.doctorDao = _doctorDao;
	}

	public void setChannelCenterDao(final ChannelCenterDao _channelCenterDao) {
		this.channelCenterDao = _channelCenterDao;
	}

	@Override
	public List<Appointment> fetchSelectedAppoinment(final Appointment _appointment) {
		Clinic clinic = clinicDao.findClinicById(_appointment.getClinicId());
		
		ClinicProperty clinicProperty = clinicPropertyDao.getClinicPropertyByClinicId(_appointment.getClinicId());
		int numberOfAppointments = 0;
		List<Appointment> newAppointments = new ArrayList<Appointment>();

		if (clinic == null || clinicProperty == null) {
			throw new RuntimeException("Clinic or Clinic Property is null !");
		} else {
			// TODO this object creation should be done by spring
			AppointmentProcessUtil appointmentProcessUtil = new AppointmentProcessUtil();
			numberOfAppointments = appointmentProcessUtil.getnerateActualMaxAppointments(clinic.getStartTime(),
					clinic.getEndTime(), clinic.getMaxAppointments(), clinicProperty.getUnitQuantity());

			List<String> timeFrames = appointmentProcessUtil.getTimeFrame(clinic.getStartTime(), clinic.getEndTime(),
					numberOfAppointments, clinicProperty.getUnitQuantity());

			for (int length = 1; length <= numberOfAppointments; length++) {
				Appointment appointment = new Appointment();
				appointment.setClinic(_appointment.getClinic());
				appointment.setAppoinmentDate(clinic.getDateFrom());
				appointment.setAppoinmentNumber(length);
				appointment.setTotalAppoinmentFee(clinic.getClinicalFee() + clinic.getConsultationFee());
				appointment.setAppoinmentTime(timeFrames.get(length-1));
				appointment.setIsAvailable(Symbol.Y.getValue());
				appointment.setClinicId(_appointment.getClinicId());
				newAppointments.add(appointment);
			}
			List<Appointment> appointments = appointmentDao.fetchSelectedAppoinment(_appointment);
			
			List<Integer> appointmentNumbers = new ArrayList<Integer>();
			for (Appointment app : appointments) {
				// TODO If appointment is a persistent object then, isAvailable
				// must
				// be N. Check whether, the if is needed.
				if (Symbol.N.getValue().equalsIgnoreCase(app.getIsAvailable())) {
					appointmentNumbers.add(app.getAppoinmentNumber());
				}
			}

			for (Appointment appointment : newAppointments) {
				if (appointmentNumbers.contains(appointment.getAppoinmentNumber())) {
					appointment.setIsAvailable("N");
				}
			}
		}
		return newAppointments;
	}

	@Override
	public List<Appointment> fetchSelectedAppoinmentsInOtherChannelCenters(Appointment _appointment) {
		Clinic clinic = clinicDao.findClinicById(_appointment.getClinicId());
		_appointment.setDoctorId(clinic.getDoctorId());
		_appointment.setChannelCenterId(clinic.getChannelCenterId());

		return appointmentDao.fetchSelectedAppoinmentsInOtherChannelCenters(_appointment);
	}

	private int getTimePeriodInMinutes(final String _fromTime, final String _toTime) {
		int fromTimeInMinutes = 0;
		int toTimeInMinutes = 0;
		if (_fromTime == null || _toTime == null || Symbol.EMPTY_STRING.getValue().equals(_fromTime)
				|| Symbol.EMPTY_STRING.equals(_toTime)) {
			throw new RuntimeException("from time or to time is illegal");
		} else {
			if (getAmorPm(_fromTime).equals(Symbol.AM.getValue())) {
				String[] mixtime = _fromTime.split(Symbol.AM.getValue());
				fromTimeInMinutes = getHouresInMinutes(mixtime, Symbol.AM.getValue());
			}
			if (getAmorPm(_fromTime).equals(Symbol.PM.getValue())) {
				String[] mixtime = _fromTime.split(Symbol.PM.getValue());
				fromTimeInMinutes = getHouresInMinutes(mixtime, Symbol.PM.getValue());
			}
			if (getAmorPm(_toTime).equals(Symbol.AM.getValue())) {
				String[] mixtime = _toTime.split(Symbol.AM.getValue());
				toTimeInMinutes = getHouresInMinutes(mixtime, Symbol.AM.getValue());
			}
			if (getAmorPm(_toTime).equals(Symbol.PM.getValue())) {
				String[] mixtime = _toTime.split(Symbol.PM.getValue());
				toTimeInMinutes = getHouresInMinutes(mixtime, Symbol.PM.getValue());
			}
		}
		return toTimeInMinutes - fromTimeInMinutes;
	}

	private int getHouresInMinutes(final String[] _mixtime, final String _timePrefix) {
		if (_mixtime.length > 0) {
			String[] splitedTime = _mixtime[0].split(Symbol.DOT.getValue());
			if (splitedTime.length == 2) {
				if (_timePrefix.equals(Symbol.AM.getValue())) {
					return Integer.parseInt(splitedTime[0].trim()) * 60 + Integer.parseInt(splitedTime[1].trim());
				}
				if (_timePrefix.equals(Symbol.PM.getValue())) {
					return Integer.parseInt(splitedTime[0].trim()) * 60 + Integer.parseInt(splitedTime[1].trim()) + 12
							* 60;
				} else {
					return 0;
				}

			} else {
				return 0;
			}
		} else {
			return 0;
		}

	}

	private String getAmorPm(final String _inputTime) {
		if (_inputTime.contains(Symbol.AM.getValue())) {
			return Symbol.AM.getValue();
		} else if (_inputTime.contains(Symbol.PM.getValue())) {
			return Symbol.PM.getValue();
		} else {
			return null;
		}
	}
}
