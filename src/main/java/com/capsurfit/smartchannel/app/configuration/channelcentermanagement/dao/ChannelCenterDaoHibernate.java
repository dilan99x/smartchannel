/**
 * 
 */
package com.capsurfit.smartchannel.app.configuration.channelcentermanagement.dao;

import java.util.List;

import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain.ChannelCenter;
import com.capsurfit.smartchannel.framework.base.dao.BasePersistanceDaoSupport;
import com.capsurfit.smartchannel.framework.common.domain.QueryContext;
import org.hibernate.Query;

/**
 * @author anushka
 * 
 */
public class ChannelCenterDaoHibernate extends BasePersistanceDaoSupport
		implements ChannelCenterDao{
	@SuppressWarnings("unchecked")
	public void saveOrUpdateChannelCenter(final ChannelCenter _channelCenter) {
		addOrUpdateEntity(_channelCenter);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ChannelCenter> fetchChannelCenters() {
		QueryContext queryContext = new QueryContext() {

			@Override
			public void applyQueryParameters(Query query) {
			}
		};

		queryContext.setQueryName("findChannelCenterByCriteria");
		return getResults(queryContext);
	}

	@SuppressWarnings("unchecked")
	public ChannelCenter findChannelCenterById(final Integer _channelCenterId) {
		Query query = getSession().getNamedQuery("findChannelCenterById")
				.setParameter("id", _channelCenterId);
		List<ChannelCenter> channelCenterList = query.list();
		if (channelCenterList.size() > 0) {
			return channelCenterList.get(0);
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ChannelCenter> findChannelCenterByUniqueField(
			final ChannelCenter _channelCenter) {
		QueryContext queryContext = new QueryContext() {

			@Override
			public void applyQueryParameters(Query query) {
				query.setParameter("channelCenterName",
						_channelCenter.getChannelCenterName());
				query.setParameter("resCity",
						_channelCenter.getResidentialCity());
			}
		};

		queryContext.setQueryName("findChannelCenterByUniqueField");
		

		return getResults(queryContext);
	}

	@Override
	public void deleteChannelCenter(ChannelCenter _channelCenter) {
		deleteEntity(_channelCenter);
	}

}
