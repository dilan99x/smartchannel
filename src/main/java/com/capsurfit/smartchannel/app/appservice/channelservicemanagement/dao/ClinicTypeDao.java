package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.ClinicType;

public interface ClinicTypeDao {
    ClinicType findClinicTypeById(final Integer _clinictypeId);
}
