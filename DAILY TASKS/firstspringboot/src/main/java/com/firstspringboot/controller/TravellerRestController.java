package com.firstspringboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.firstspringboot.entity.ForeignTour;
import com.firstspringboot.entity.LocalTour;
import com.firstspringboot.entity.Traveller;
import com.firstspringboot.repo.TravellerRepository;
import com.firstspringboot.service.TravellerService;





@RestController
public class TravellerRestController {
	
	@Autowired
	TravellerService travellerservice;
	
	@Autowired
	TravellerRepository travellerRepository;
	
	@GetMapping("/welcome")
	public String helloAppln() {
		return "Welcome Traveller";
	}
	
	@PostMapping("/addtraveller")	
	public Traveller addTraveller(@RequestBody Traveller traveller) {
		return travellerservice.addTraveller(traveller);
	}
	
	@PostMapping("/requestlocaltour")
	public LocalTour saveLocalTourRequest(@RequestBody LocalTour localTour) {
		return travellerservice.saveLocalTourRequest(localTour);
	}

	
	@PostMapping("/requestforeigntour")
	public ForeignTour saveForeignTourRequest(@RequestBody ForeignTour foreignTour) {
		System.out.println("****** From Controller Foreign ******" + foreignTour);
		return travellerservice.saveForeignTourRequest(foreignTour);
	}
	@GetMapping("/listtravellers")
	public List<Traveller> listAllTravellers() {
	return travellerservice.listAllTravellers();
	}
	
	@GetMapping("/findbytid/{tid}")
	public Optional <Traveller> serachByTravellerId(@PathVariable Long tid){
		return travellerservice.findByTravellerId(tid);
	}
	
	@GetMapping("/findbytname/{tname}")
	public Traveller serachByTravellerId(@PathVariable String tname){
		return travellerservice.findByTravellerName(tname);
	}
	
	@DeleteMapping("/deletebyid/{tid}")
	public void deleteById(@PathVariable Long tid) {
		 travellerservice.deleteByTravellerId(tid);
	}
	
	@GetMapping("/login")	
	public ResponseEntity<Traveller> loginrest(@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password) {
		System.out.println("*******This is a login rest controller ***********");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Traveller traveller = travellerRepository.findByTravellerName(auth.getName());
		System.out.println("After Login__________________"
				+ "send back to Angular or postman as response__________________" + traveller);
		return ResponseEntity.ok(traveller);
	}
	
}
