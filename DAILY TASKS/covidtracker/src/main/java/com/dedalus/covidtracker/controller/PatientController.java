package com.dedalus.covidtracker.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dedalus.covidtracker.service.PatientService;
import com.dedalus.covidtracker.entity.Patient;
import com.dedalus.covidtracker.exception.PatientAlreadyExistsException;
import com.dedalus.covidtracker.exception.PatientNotFoundException;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/patients")
public class PatientController {
	private PatientService patientService;
	
	@PostMapping
	public ResponseEntity<Patient> createPatient(@RequestBody Patient patient)
	{
		Patient savedPatient = patientService.createPatient(patient);
		return new ResponseEntity<>(savedPatient,HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Patient> getUserById(@PathVariable("id") Long patientId)
	{
		Patient _patient = patientService.getPatientById(patientId);
		return new ResponseEntity<>(_patient,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Patient>> getAllPatients()
	{
		List<Patient> _patients = patientService.getAllPatients();
		return new ResponseEntity<>(_patients,HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Patient> UpdatePatient(@PathVariable("id") Long patientId,@RequestBody Patient patient)
	{
		patient.setPatientid(patientId);		
		Patient updatedPatient = patientService.updatePatient(patient);
		return new ResponseEntity<>(updatedPatient,HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> DeletePatient(@PathVariable("id") Long patientId)
	{		
		patientService.deletePatient(patientId);
		return new ResponseEntity<>("Patient successfully deleted!",HttpStatus.OK);
	}
	
	@ExceptionHandler(value = PatientAlreadyExistsException.class)
    public ResponseEntity<String> handlePatientAlreadyExistsException(PatientAlreadyExistsException patientAlreadyExistsException) {
        return new ResponseEntity<>(patientAlreadyExistsException.getMessage(), HttpStatus.CONFLICT);
    }
	
	@ExceptionHandler(value = PatientNotFoundException.class)
    public ResponseEntity<String> handlePatientNotFoundException(PatientNotFoundException patientNotFoundException) {
        return new ResponseEntity<>(patientNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }
}
