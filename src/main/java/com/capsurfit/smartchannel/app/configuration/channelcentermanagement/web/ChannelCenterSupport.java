package com.capsurfit.smartchannel.app.configuration.channelcentermanagement.web;

import java.util.ArrayList;
import java.util.List;

import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain.ChannelCenter;
import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.service.ChannelCenterManager;
import com.capsurfit.smartchannel.framework.base.web.BaseStruts2Support;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;


/**
 * @author anushka
 * 
 */
public class ChannelCenterSupport extends BaseStruts2Support implements
		ModelDriven<ChannelCenter> {
	private ChannelCenter model = new ChannelCenter();
	private ChannelCenterManager channelCenterManager;
	private List<ChannelCenter> chanelCenterList = new ArrayList<ChannelCenter>();

	private String greeting;

	private String name;

	public void setChannelCenterManager(
			final ChannelCenterManager _channelCenterManager) {
		this.channelCenterManager = _channelCenterManager;
	}

	public List<ChannelCenter> getChanelCenterList() {
		return chanelCenterList;
	}

	public void setChanelCenterList(List<ChannelCenter> chanelCenterList) {
		this.chanelCenterList = chanelCenterList;
	}

	public String addChannelCenter() {
		try {
			if ("".equals(model.getChannelCenterName())
					|| model.getChannelCenterName() == null) {
				throw new RuntimeException();
			} else if ("".equals(model.getAddress())
					|| model.getAddress() == null) {
				throw new RuntimeException();
			} else {
				channelCenterManager.saveChannelCenter(model);
				getRequest().setAttribute("SuccessMsg", "Channel Center has been added...!");
			}
			return SUCCESS;
		} catch (Exception ex) {
			ex.printStackTrace();
			return INPUT;
		}
	}

	public String updateChennaelCenter() {
		try {
			channelCenterManager.updateChannelCenter(model);
			return SUCCESS;
		} catch (Exception ex) {
			System.out.println("Exception :" + ex);
			return INPUT;
		}
	}

	@SkipValidation
	public String fetchChannelCenter() {
		try {
			chanelCenterList = channelCenterManager.fetchChannelCenters();
			return SUCCESS;
		} catch (Exception ex) {
			ex.printStackTrace();
			return INPUT;
		}
	}

	public String deleteChannelCenter() {
		try {
			channelCenterManager.deleteChannelCenter(model);
			model = new ChannelCenter();
			return SUCCESS;
		} catch (Exception exception) {
			// TODO Implement error message! The exception should be our own
			// exception.
			System.out.println("Error  : " + exception);
			return INPUT;
		}

	}

	@Override
	// @VisitorFieldValidator(appendPrefix = false)
	public ChannelCenter getModel() {
		return model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}