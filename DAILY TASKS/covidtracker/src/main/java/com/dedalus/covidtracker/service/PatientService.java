package com.dedalus.covidtracker.service;

import java.util.List;

import com.dedalus.covidtracker.entity.Patient;

public interface PatientService {	
		Patient createPatient(Patient patient);
		
		Patient getPatientById(long patientId);
		
		List<Patient> getAllPatients();
		
		Patient updatePatient(Patient patient);
		
		void deletePatient(Long patientId);
}
