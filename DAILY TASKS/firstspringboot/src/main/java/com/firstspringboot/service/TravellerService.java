package com.firstspringboot.service;

import java.util.List;
import java.util.Optional;

import com.firstspringboot.entity.ForeignTour;
import com.firstspringboot.entity.LocalTour;
import com.firstspringboot.entity.Traveller;

public interface TravellerService {
	public Traveller addTraveller(Traveller traveller);
	public LocalTour saveLocalTourRequest(LocalTour localTour);
	public ForeignTour saveForeignTourRequest(ForeignTour foreignTour);
	public List<Traveller> listAllTravellers();
	
	public Optional<Traveller> findByTravellerId(Long tid);
	public Traveller findByTravellerName(String tname);
	public void deleteByTravellerId(Long tid);
}
