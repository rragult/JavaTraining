package com.dedalus.covidtracker.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dedalus.covidtracker.entity.PatientHCLabList;
import com.dedalus.covidtracker.entity.PatientHCMapping;
import com.dedalus.covidtracker.repository.PatientHCLabListRepository;
import com.dedalus.covidtracker.repository.PatientHCMappingRepository;
import com.dedalus.covidtracker.service.PatientHCLabListService;
import com.dedalus.covidtracker.service.PatientHCMappingService;


@RestController
public class CovidTrackerRestController {

	@Autowired
	PatientHCLabListRepository patientHCLabListRepository;
	
	@Autowired
	PatientHCMappingRepository patientHCMappingRepository;

	@Autowired	
	PatientHCLabListService patientHCLabListService;
	
	@Autowired	
	PatientHCMappingService  patientHCMappingService;
	
	@PostMapping("/addpatienthcmapping")
	public PatientHCMapping addPatientHCMapping(@RequestBody PatientHCMapping patientHCMapping) {
		return patientHCMappingService.addPatientHCMapping(patientHCMapping);
	}
		
	@PostMapping("/createPatientHCLabList")
	public PatientHCLabList addPatientHCLabList(@RequestBody PatientHCLabList patientHCLabList) {
			return patientHCLabListService.addPatientHCLabList(patientHCLabList);
	}
	
	
	@PutMapping("/editPatientHCLabListForTestOutcome")
	public PatientHCLabList editPatientHCLabListForTestOutcome(@RequestBody PatientHCLabList patientHCLabList) {
		return patientHCLabListService.editPatientHCLabListForTestOutcome(patientHCLabList);
	}
		
	@PutMapping("/editPatientHCLabListForAdmission")
	public PatientHCLabList editPatientHCLabListForAdmission(@RequestBody PatientHCLabList patientHCLabList  ) {
		
		
		//System.out.println("test-------"+patientHCLabList.getLabmaster().getLabmasterid());
		//System.out.println(patientHCLabList.getLabmaster().getLabmasterid());
		//System.out.println(patientHCLabList.getDateoftestgiven());
		
		return patientHCLabListService.editPatientHCLabListForAdmission(patientHCLabList);
	}
	
	
	@PutMapping("/editPatientHCLabListForDischarge")
	public PatientHCLabList editPatientHCLabListForDischarge(@RequestBody PatientHCLabList patientHCLabList  ) {
		return patientHCLabListService.editPatientHCLabListForDischarge(patientHCLabList);
	}	
	
	@PutMapping("/editPatientHCLabListForDeceased")
	public PatientHCLabList editPatientHCLabListForDeceased(@RequestBody PatientHCLabList patientHCLabList  ) {
		return patientHCLabListService.editPatientHCLabListForDeceased(patientHCLabList);
	}
	
	
	@GetMapping("/getPatientHCLabListById/{id}")	
	public Optional<PatientHCLabList>  getPatientHCLabListById(@PathVariable("id") Long PatHCLabId) {
		return patientHCLabListService.getPatientHCLabListById(PatHCLabId);
	}
	
	@DeleteMapping("/deletePatientHCLabListById/{id}")
	public void deletePatientHCLabListById(@PathVariable("id") Long PatHCLabId ) {
		System.out.println(PatHCLabId);
		patientHCLabListService.deletePatientHCLabListById(PatHCLabId);	
	}
	
	@GetMapping("/getPatientHCLabList")
	public List<PatientHCLabList> getPatientHCLabList(){
		return patientHCLabListService.getAllPatientHCLabList();		
	}
	
	@GetMapping("/getAllPatientHCLabListInAsc")
	public List<PatientHCLabList> getAllPatientHCLabListInAsc(){
		return patientHCLabListService.getAllPatientHCLabListInAsc();		
	}
	
	@GetMapping("/getAllPatientHCLabListInDesc")
	public List<PatientHCLabList> getAllPatientHCLabListInDesc(){
		return patientHCLabListService.getAllPatientHCLabListInDesc();		
	}
	
	
	@GetMapping("/welcome")
	public String helloAppln() {
		return "Hi SSN";
	}
	
	
}
