package com.dedalus.covidtracker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dedalus.covidtracker.entity.PatientHCMapping;

@Repository
public interface PatientHCMappingRepository extends CrudRepository<PatientHCMapping, Long> {
	
	

}
