package com.dedalus.covidtracker.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dedalus.covidtracker.entity.Patient;
import com.dedalus.covidtracker.repo.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepository patientRepository;

	@Override
	public Patient addPatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public Patient editPatient(Patient patient) {
		return patientRepository.save(patient);
	}

	public Patient getDataById(Long id) {
		return patientRepository.findById(id).orElse(null);
	}

	public List<Patient> getAllData() {
		return patientRepository.findAll();
	}

}
