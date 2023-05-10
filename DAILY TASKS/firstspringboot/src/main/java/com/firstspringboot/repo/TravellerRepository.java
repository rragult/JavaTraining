package com.firstspringboot.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.firstspringboot.entity.Traveller;

@Repository
public interface TravellerRepository extends CrudRepository<Traveller, Long>{
 public Optional<Traveller> findByTravellerId(Long travellerid);
 public Traveller findByTravellerName(String travellername);
 public void deleteByTravellerId(Long travellerid);
}
