/**
 * 
 */
package com.capsurfit.smartchannel.app.configuration.channelcentermanagement.service;

import com.capsurfit.smartchannel.app.configuration.channelcentermanagement.domain.ChannelCenter;

import java.util.List;

/**
 * @author anushka
 * 
 */
public interface ChannelCenterManager {
	List<ChannelCenter> fetchChannelCenters();

	ChannelCenter findChannelCenterById(final Integer _channelCenterId);

	void saveChannelCenter(final ChannelCenter _channelCenter);

	void updateChannelCenter(final ChannelCenter _channelCenter);

	void deleteChannelCenter(final ChannelCenter _channelCenter);
}
