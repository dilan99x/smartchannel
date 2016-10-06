package com.capsurfit.smartchannel.app.configuration.channelcentermanagement.service;

import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.dao.ChannelCenterDao;
import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain.ChannelCenter;
import com.capsurfit.smartchannel.app.configuration.contactmanagement.dao.ContactDao;
import com.capsurfit.smartchannel.app.configuration.contactmanagement.domain.Contact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ChannelCenterManagerImpl implements ChannelCenterManager {
	private ChannelCenterDao channelCenterDao;
	private ContactDao contactDao;

	public void setChannelCenterDao(final ChannelCenterDao channelCenterDao) {
		this.channelCenterDao = channelCenterDao;
	}

	public void setContactDao(final ContactDao _contactDao) {
		this.contactDao = _contactDao;
	}

	private List<ChannelCenter> findChannelCenterByUniqueFields(
			final ChannelCenter _channelCenter) {
		return channelCenterDao.findChannelCenterByUniqueField(_channelCenter);
	}

	@Override
	public void saveChannelCenter(final ChannelCenter _channelCenter) {
		List<ChannelCenter> uniqueChannelCenter = findChannelCenterByUniqueFields(_channelCenter);

		if (uniqueChannelCenter.isEmpty()) {
			channelCenterDao.saveOrUpdateChannelCenter(_channelCenter);
			
			Contact contact = new Contact();
			contact.setContactNumber(_channelCenter.getContactNumber());
			contact.setEmail(_channelCenter.getEmail());
			contact.setWeb(_channelCenter.getWeb());
			contact.setFax(_channelCenter.getFax());
			contact.setEntityPkCode("CHANNEL_CENTER");
			contact.setChannelCenter(_channelCenter);
			
			
//			_channelCenter.setChannelCenterName(_channelCenter.getChannelCenterName());
//			_channelCenter.setAddress(_channelCenter.getAddress());
//			_channelCenter.setResidentialCity(_channelCenter.getResidentialCity());
//			_channelCenter.setMainCity(_channelCenter.getMainCity());
//			_channelCenter.setDescription(_channelCenter.getAddress());
			

			

			//channelCenter.getChannelCenterContacts().add(contact);
			
			contactDao.saveOrUpdateContact(contact);
			
			
		} else {
			// TODO Log error message
		}
	}

	@Override
	public List<ChannelCenter> fetchChannelCenters() {
		return channelCenterDao.fetchChannelCenters();
	}

	@Override
	public ChannelCenter findChannelCenterById(Integer _channelCenterId) {
		return channelCenterDao.findChannelCenterById(_channelCenterId);
	}

	@Override
	public void updateChannelCenter(ChannelCenter _channelCenter) {
		List<ChannelCenter> uniqueChannelCenter = findChannelCenterByUniqueFields(_channelCenter);
		_channelCenter.setMergeRequired(uniqueChannelCenter.size() == 1
				&& uniqueChannelCenter.get(0).getChannelCenterId()
						.equals(_channelCenter.getChannelCenterId()));

		if (uniqueChannelCenter.isEmpty() || _channelCenter.getMergeRequired()) {
			distilUpdateChannelCenter(_channelCenter);
		}

	}

	@Override
	public void deleteChannelCenter(final ChannelCenter _channelCenter) {
		ChannelCenter channelCenter = channelCenterDao
				.findChannelCenterById(_channelCenter.getChannelCenterId());
		if (channelCenter != null) {
			Set<Contact> contacts = channelCenterDao.findChannelCenterById(_channelCenter.getChannelCenterId()).getChannelCenterContacts();
			Contact contact = contacts.iterator().next();
			contactDao.deleteContact(contact);
			channelCenterDao.deleteChannelCenter(_channelCenter);
		}
	}

	public void distilUpdateChannelCenter(final ChannelCenter _channelCenter) {
		Contact contact = null;

		if (_channelCenter != null) {
			channelCenterDao.saveOrUpdateChannelCenter(_channelCenter);
			Set<Contact> contactSet = channelCenterDao.findChannelCenterById(_channelCenter.getChannelCenterId()).getChannelCenterContacts();
			if (contactSet.size() > 0) {
				contact = contactSet.iterator().next();

				contact.setEmail(_channelCenter.getEmail());
				contact.setWeb(_channelCenter.getWeb());
				contact.setContactNumber(_channelCenter.getContactNumber());
				contact.setFax(_channelCenter.getFax());
				contactDao.saveOrUpdateContact(contact);
			}
			
			
		}

	}
}
