package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.util;

import java.util.ArrayList;
import java.util.List;

import com.capsurfit.smartchannel.framework.common.shared.CoreConstants.Symbol;

public class AppointmentProcessUtil {
	public int getnerateActualMaxAppointments(final String _fromTime, final String _toTime, int maxAppointments,
			int apponitmentPeriod) {
		int numberOfAppointments = 0;
		int totalTimeInmunites = getTimePeriodInMinutes(_fromTime, _toTime);
		if (totalTimeInmunites > 0) {
			numberOfAppointments = totalTimeInmunites / apponitmentPeriod;
			if (numberOfAppointments <= maxAppointments) {
				return numberOfAppointments;
			}
		}
		return 0;
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
			String[] splitedTime = _mixtime[0].split(Symbol.COLON.getValue());
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

	public List<String> getTimeFrame(final String _fromTime, final String _toTime, int maxAppointments,
			int apponitmentPeriod) {
		int fromTimeInMinutes = 0;

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
		}

		StringBuilder builder = new StringBuilder();
		List<String> timeSlots = new ArrayList<String>();
		for (int length = 1; length <= maxAppointments; length++) {
			//TODO Need to minimize creation of StringBuilder objects in the loop
			builder= new StringBuilder();
			if (length > 1) {
				fromTimeInMinutes += apponitmentPeriod;
			}

			if (fromTimeInMinutes > 720) {
				if (fromTimeInMinutes % 60 == 0) {
					builder.append(fromTimeInMinutes / 60).append(".00").append(" PM");
				} else {
					int temp = fromTimeInMinutes % 60;
					builder.append((fromTimeInMinutes - temp) / 60).append(".").append(temp).append(" PM");
				}
			} else {
				if (fromTimeInMinutes % 60 == 0) {
					builder.append(fromTimeInMinutes / 60).append(".00").append(" AM");
				} else {
					int temp = fromTimeInMinutes % 60;
					builder.append((fromTimeInMinutes - temp) / 60).append(".").append(temp).append(" AM");
				}
			}
			timeSlots.add(builder.toString());

		}

		return timeSlots;
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
