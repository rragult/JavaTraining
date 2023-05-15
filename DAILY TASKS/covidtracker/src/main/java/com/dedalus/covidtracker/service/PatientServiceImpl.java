package com.dedalus.covidtracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.dedalus.covidtracker.entity.Patient;
import com.dedalus.covidtracker.exception.PatientAlreadyExistsException;
import com.dedalus.covidtracker.exception.PatientNotFoundException;
import com.dedalus.covidtracker.repository.PatientRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService{
	private PatientRepository patientRepository;
	
	@Override
	public Patient createPatient(Patient patient) throws PatientAlreadyExistsException{
		if(patientRepository.findByAadhaarno(patient.getAadhaarno()).isPresent())
		{
			throw new PatientAlreadyExistsException();
		}
		else
		{
			return patientRepository.save(patient);
		}
	}

	@Override
	public Patient getPatientById(long patientId) {
		Optional<Patient> optionalPatient = patientRepository.findById(patientId);
		return optionalPatient.get();
	}

	@Override
	public List<Patient> getAllPatients() {		
		return patientRepository.findAll(Sort.by(Sort.Direction.ASC,"patientfirstname"));
	}

	@Override
	public Patient updatePatient(Patient patient) throws PatientNotFoundException{
		if(patientRepository.findById(patient.getPatientid()).isEmpty())
		{
			throw new PatientNotFoundException();
		}
		else
		{
			Patient existingPatient = patientRepository.findById(patient.getPatientid()).get();
			existingPatient.setPatientfirstname(patient.getPatientfirstname());
			existingPatient.setPatientlastname(patient.getPatientlastname());
			existingPatient.setPatientdob(patient.getPatientdob());
			existingPatient.setPatientgender(patient.getPatientgender());
			existingPatient.setPatientcontactno(patient.getPatientcontactno());
			existingPatient.setPatientemailid(patient.getPatientemailid());
			existingPatient.setPatientaddr1(patient.getPatientaddr1());
			existingPatient.setPatientaddr2(patient.getPatientaddr2());
			existingPatient.setStatecode(patient.getStatecode());
			existingPatient.setPostalcode(patient.getPostalcode());
			existingPatient.setPatientstatuscode(patient.getPatientstatuscode());		
			existingPatient.setAadhaarno(patient.getAadhaarno());
			return patientRepository.save(existingPatient);
		}
	}

	@Override
	public void deletePatient(Long patientId) throws PatientNotFoundException{
		if(patientRepository.findById(patientId).isEmpty())
		{
			throw new PatientNotFoundException();
		}
		else
		{
			Patient existingPatient = patientRepository.findById(patientId).get();
			existingPatient.setActiveind('D');
			patientRepository.save(existingPatient);
		}
	}

}
