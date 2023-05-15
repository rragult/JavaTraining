package com.dedalus.covidtracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dedalus.covidtracker.entity.PatientHCMapping;
import com.dedalus.covidtracker.repository.PatientHCMappingRepository;

@Service
public class PatientHCMappingServiceImp implements PatientHCMappingService {
	
	@Autowired
	private PatientHCMappingRepository patientHCMappingRepository;

	@Override
	public PatientHCMapping addPatientHCMapping(PatientHCMapping patientHCMapping) {
		// TODO Auto-generated method stub
		return patientHCMappingRepository.save(patientHCMapping);
	}

	@Override
	public PatientHCMapping editPatientHCMapping(PatientHCMapping patientHCMapping) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
