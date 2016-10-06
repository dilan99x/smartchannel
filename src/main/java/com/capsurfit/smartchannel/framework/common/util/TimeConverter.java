package com.capsurfit.smartchannel.framework.common.util;

import com.capsurfit.smartchannel.framework.common.shared.CoreConstants;
import com.capsurfit.smartchannel.framework.common.shared.CoreConstants.Symbol;
import ognl.TypeConverter;

import java.lang.reflect.Member;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class TimeConverter implements TypeConverter {

	@Override
	public Object convertValue(Map map, Object o, Member member, String string, Object obj, Class type) {
		if (obj != null && !Symbol.EMPTY_STRING.getValue().equals(obj)) {
			try {
				// This method checks whether the class or interface represented
				// by the class object is same or
				// super type of the class or interface represented by the class
				// parameter(type)
				if (Date.class.isAssignableFrom(type)) {
					String[] stringFormDate = (String[]) obj;
					if (stringFormDate.length > 0 && !Symbol.EMPTY_STRING.getValue().equals(stringFormDate[0])) {
						Date date = DateTimeUtil.parsedate(stringFormDate[0].toString(),
								CoreConstants.DATE_PATTERN_WITH_MONTH, CoreConstants.STANDARD_DATE_TIME_PATTERN);
						return date;
					} else {
						return null;
					}
				} else if (String.class.isAssignableFrom(type)) {
					Date dateFormDate = (Date) obj;
					SimpleDateFormat format = new SimpleDateFormat(CoreConstants.DATE_PATTERN_WITH_MONTH);

					return format.format(dateFormDate);
				} else {
					return null;
				}
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return null;
		}

	}

}
