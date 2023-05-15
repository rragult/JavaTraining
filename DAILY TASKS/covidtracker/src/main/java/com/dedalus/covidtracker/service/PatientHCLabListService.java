package com.dedalus.covidtracker.service;


import java.util.List;
import java.util.Optional;

import com.dedalus.covidtracker.entity.PatientHCLabList;

public interface PatientHCLabListService {
	public PatientHCLabList addPatientHCLabList(PatientHCLabList patientHCLabList);
	
	public PatientHCLabList editPatientHCLabListForTestOutcome(PatientHCLabList patientHCLabList);	

	public PatientHCLabList editPatientHCLabListForAdmission(PatientHCLabList patientHCLabList);
	
	public PatientHCLabList editPatientHCLabListForDischarge(PatientHCLabList patientHCLabList);	
	
	public PatientHCLabList editPatientHCLabListForDeceased(PatientHCLabList patientHCLabList);
	
	public Optional<PatientHCLabList> getPatientHCLabListById(long PatHCLabId);
	
	public void deletePatientHCLabListById(long PatHCLabId);
	
	public List<PatientHCLabList> getAllPatientHCLabList();
	
	public List<PatientHCLabList> getAllPatientHCLabListInAsc();
	
	public List<PatientHCLabList> getAllPatientHCLabListInDesc();
	
	public boolean existPatientHCLabListById(long PatHCLabId);
}
