package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.ClinicProperty;

public interface ClinicPropertyDao {
   ClinicProperty getClinicPropertyByClinicId(final Integer clinicId);
}
