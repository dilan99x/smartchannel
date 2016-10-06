/**
 * 
 */
package com.capsurfit.smartchannel.framework.base.dao;

import com.capsurfit.smartchannel.framework.common.domain.BaseEntity;

/**
 * @author anushka
 * 
 */
public class BasePersistanceDaoSupport extends BaseHibernateDaoSupport {
	public void addOrUpdateEntity(BaseEntity entity) {
		if (entity.getMergeRequired()) {
			getHibernateTemplate().merge(entity);
			entity.setMergeRequired(Boolean.FALSE);
		} else {
			getHibernateTemplate().saveOrUpdate(entity);
		}
	}

	public void deleteEntity(BaseEntity entity) {
		getHibernateTemplate().delete(entity);
	}

	public BaseEntity findEntityById(final Integer _id) {
		BaseEntity baseEntity = getHibernateTemplate().get(BaseEntity.class, _id);
		return baseEntity;
	}
}
