package com.capsurfit.smartchannel.app.common.dao;

import java.util.List;

import com.capsurfit.smartchannel.app.common.domain.Lookup;

public interface LookupDao {
	List<Lookup> lookupSpeciality();

	List<Lookup> lookupDoctors();

	List<Lookup> lookupChannelCenters();

	List<Lookup> lookupClinicTypes();
}
