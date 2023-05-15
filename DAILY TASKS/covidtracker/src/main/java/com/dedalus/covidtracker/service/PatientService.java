package com.dedalus.covidtracker.service;

import java.util.List;

import com.dedalus.covidtracker.entity.Patient;

public interface PatientService {
	public Patient addPatient(Patient patient);
	public Patient editPatient(Patient patient);
	public Patient getDataById(Long id);
	public List<Patient> getAllData();
}
