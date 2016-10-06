package com.capsurfit.smartchannel.framework.common.util;

import com.capsurfit.smartchannel.framework.common.shared.CoreConstants.Symbol;
import ognl.TypeConverter;

import java.lang.reflect.Member;
import java.util.Map;

public class IdConverter implements TypeConverter {

    @Override
    public Object convertValue(Map map, Object object, Member member, String string, Object obj, Class type) {
        if (obj != null || !Symbol.EMPTY_STRING.getValue().equals(obj)) {
            if (Integer.class.isAssignableFrom(type)) {
                String[] stringFormDate = (String[]) obj;
                if (stringFormDate.length > 0 && !Symbol.EMPTY_STRING.getValue().equals(stringFormDate[0])) {
                    return getLavaIntegerValue(stringFormDate[0]);
                } else {
                    return null;
                }
            } else if (String.class.isAssignableFrom(type)) {
                Integer argument = (Integer) obj;
                return String.valueOf(argument).trim();
            }
        }
        return null;
    }

    private Integer getLavaIntegerValue(String argument) {
        try {
            String s = argument.trim();
            return Integer.parseInt(s);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
