package com.capsurfit.smartchannel.app.configuration.channelcentermanagement.dao;

import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain.ChannelCenter;

import java.util.List;

public interface ChannelCenterDao {
	void saveOrUpdateChannelCenter(final ChannelCenter _channelCenter);
	List<ChannelCenter> fetchChannelCenters();
	ChannelCenter findChannelCenterById(final Integer _channelCenterId);
	List<ChannelCenter> findChannelCenterByUniqueField(final ChannelCenter _channelCenter);
	void deleteChannelCenter(final ChannelCenter _channelCenter); 
}
