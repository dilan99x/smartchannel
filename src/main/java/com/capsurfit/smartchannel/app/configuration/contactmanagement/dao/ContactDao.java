package com.capsurfit.smartchannel.app.configuration.contactmanagement.dao;

import com.capsurfit.smartchannel.app.configuration.contactmanagement.domain.Contact;

public interface ContactDao {
	void saveOrUpdateContact(final Contact _contact);
	Contact findContactById(final Integer _contactId);
	void deleteContact(final Contact _contact);
}
