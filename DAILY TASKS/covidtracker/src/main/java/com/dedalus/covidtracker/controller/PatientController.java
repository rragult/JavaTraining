package com.dedalus.covidtracker.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.config.ResourceNotFoundException;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dedalus.covidtracker.entity.Patient;
import com.dedalus.covidtracker.repo.PatientRepository;
import com.dedalus.covidtracker.service.PatientService;


@RestController
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@Autowired
	PatientRepository patientRepository;
	
	@GetMapping("/Welcome")
	public String helloAppln() {
		return "Welcome Traveller";
	}
	
	@PostMapping("/addpatient")	
	public Patient addPatient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}
	
//	@PutMapping("/editpatient")
//	public Patient editPatient(@RequestBody Patient patient) {
//		return patientService.editPatient(patient);
//	}
//	
	@GetMapping("/getdata")
    public List<Patient> getAllData() {
        return patientService.getAllData();
    }
    
    @GetMapping("/getdata/{id}")
    public Patient getDataById(@PathVariable Long id) {
        return patientService.getDataById(id);
    }
    
//    @PutMapping("/patients/{id}")
//    public ResponseEntity<Patient> updatePatient(@PathVariable(value = "id") Long patientId, @RequestBody Patient patientDetails) throws ResourceNotFoundException {
//        Patient patient = patientRepository.findById(patientId)
//                .orElseThrow(() -> new ResourceNotFoundException("Patient not found for this id :: " + patientId));
//
//        patient.setName(patientDetails.getName());
//        patient.setAge(patientDetails.getAge());
//        patient.setGender(patientDetails.getGender());
//        final Patient updatedPatient = patientRepository.save(patient);
//
//        return ResponseEntity.ok(updatedPatient);
//    }
	
}
