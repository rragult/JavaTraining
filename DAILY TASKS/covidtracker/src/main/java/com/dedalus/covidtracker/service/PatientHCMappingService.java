package com.dedalus.covidtracker.service;

import com.dedalus.covidtracker.entity.PatientHCMapping;

public interface PatientHCMappingService  {
	public PatientHCMapping addPatientHCMapping(PatientHCMapping patientHCMapping);

	public PatientHCMapping editPatientHCMapping(PatientHCMapping patientHCMapping);

}
