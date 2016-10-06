package com.capsurfit.smartchannel.framework.common.util;

import com.capsurfit.smartchannel.framework.common.shared.CoreConstants;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {

	public static Date convertToUtilDate(java.sql.Date sqlDate) {
		return new Date(sqlDate.getTime());
	}

	public static java.sql.Date convertToSqlDate(Date utilDate) {
		return new java.sql.Date(utilDate.getTime());
	}

	public static Date parseDate(String dateString) {
		return parseDate(dateString, CoreConstants.STANDARD_DATE_PATTERN);
	}

	public static Date parseDateTime(String dateString) {
		return parseDate(dateString, CoreConstants.STANDARD_DATE_TIME_PATTERN);
	}

	public static Date parseDate(String dateString, String format) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.parse(dateString);
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}

	public static Date parsedate(final String _dateString, final String _fromDateFormat, final String _toDteFormat) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(_fromDateFormat);
		try {
			Date date = dateFormat.parse(_dateString);
			dateFormat = new SimpleDateFormat(_toDteFormat);

			return dateFormat.parse(dateFormat.format(date));

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
