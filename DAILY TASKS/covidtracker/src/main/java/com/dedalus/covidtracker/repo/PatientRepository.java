package com.dedalus.covidtracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dedalus.covidtracker.entity.Patient;
//import org.springframework.data.repository.CrudRepository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

}
