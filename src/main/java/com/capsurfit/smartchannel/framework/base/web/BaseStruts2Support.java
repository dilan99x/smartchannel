package com.capsurfit.smartchannel.framework.base.web;

import com.capsurfit.smartchannel.framework.common.shared.CoreConstants;
import com.capsurfit.smartchannel.framework.common.util.DateTimeUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class BaseStruts2Support extends ActionSupport implements
		ServletRequestAware, ServletResponseAware, Preparable {
	private HttpServletRequest request;
	private HttpServletResponse response;

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	protected Date getBrowserDate() {
        String browserDateTime = request.getParameter(CoreConstants.BROWSER_DATE_TIME);
        if (browserDateTime != null) {
            return DateTimeUtil.parseDate(browserDateTime, CoreConstants.STANDARD_DATE_TIME_PATTERN);
        }

        Locale clientLocale = request.getLocale();
        Calendar calendar = Calendar.getInstance(clientLocale);

        return calendar.getTime();
    }

}
