package com.capsurfit.smartchannel.app.configuration.contactmanagement.dao;

import com.capsurfit.smartchannel.app.configuration.contactmanagement.domain.Contact;
import com.capsurfit.smartchannel.framework.base.dao.BasePersistanceDaoSupport;

public class ContactDaoHibernate extends BasePersistanceDaoSupport implements
		ContactDao {

	@Override
	public void saveOrUpdateContact(final Contact _contact) {
		addOrUpdateEntity(_contact);
	}

	@Override
	public Contact findContactById(Integer _contactId) {
		return getHibernateTemplate().get(Contact.class, _contactId);
	}

	@Override
	public void deleteContact(final Contact _contact) {
		deleteEntity(_contact);
	}

}
