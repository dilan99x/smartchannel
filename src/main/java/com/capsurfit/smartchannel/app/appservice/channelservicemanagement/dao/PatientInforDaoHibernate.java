package com.capsurfit.smartchannel.app.appservice.channelservicemanagement.dao;

import com.capsurfit.smartchannel.app.appservice.channelservicemanagement.domain.Patient;
import com.capsurfit.smartchannel.framework.base.dao.BasePersistanceDaoSupport;

import java.util.List;

public class PatientInforDaoHibernate extends BasePersistanceDaoSupport implements PatientInforDao {

	@Override
	public List<Patient> fetchPatientInformation(final Patient _patient) {
		return null;
	}

	@Override
	public void addOrUpdatePatientInformation(final Patient _patient) {
		if(_patient != null){
			addOrUpdateEntity(_patient);
		}
		
	}

	@Override
	public void deletePatientInformation(final Patient _patient) {
		if(_patient != null){
			deleteEntity(_patient);
		}
		
	}

}
