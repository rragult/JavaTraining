package com.dedalus.covidtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dedalus.covidtracker.entity.PatientHCLabList;

@Repository
public interface PatientHCLabListRepository extends JpaRepository<PatientHCLabList, Long> {

}
