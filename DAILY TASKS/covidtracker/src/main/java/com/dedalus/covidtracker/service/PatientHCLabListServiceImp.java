package com.dedalus.covidtracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dedalus.covidtracker.entity.PatientHCLabList;
import com.dedalus.covidtracker.repository.PatientHCLabListRepository;

@Service
public class PatientHCLabListServiceImp implements PatientHCLabListService {

	@Autowired
	private PatientHCLabListRepository patientHCLabListRepository;

	@Override
	public PatientHCLabList addPatientHCLabList(PatientHCLabList patientHCLabList) {
		return patientHCLabListRepository.save(patientHCLabList);
	}

	@Override
	public PatientHCLabList editPatientHCLabListForAdmission(PatientHCLabList patientHCLabList) {

		long checkPatHCLabId = patientHCLabList.getPathclabid();
		Optional<PatientHCLabList> foundPatientHCLabList;
		PatientHCLabList setPatientHCLabList;

		if (checkPatHCLabId > 0) {
			foundPatientHCLabList = patientHCLabListRepository.findById(checkPatHCLabId);
			if (foundPatientHCLabList.isEmpty() == false) {
				setPatientHCLabList = foundPatientHCLabList.get();
				setPatientHCLabList.setDateofadmission(patientHCLabList.getDateofadmission());
				return patientHCLabListRepository.save(setPatientHCLabList);
			} else {
				return null;
			}
		} else {
			return null;
		}

	}

	@Override
	public PatientHCLabList editPatientHCLabListForDischarge(PatientHCLabList patientHCLabList) {

		long checkPatHCLabId = patientHCLabList.getPathclabid();
		Optional<PatientHCLabList> foundPatientHCLabList;
		PatientHCLabList setPatientHCLabList;

		if (checkPatHCLabId > 0) {
			foundPatientHCLabList = patientHCLabListRepository.findById(checkPatHCLabId);
			if (foundPatientHCLabList.isEmpty() == false) {
				setPatientHCLabList = foundPatientHCLabList.get();
				setPatientHCLabList.setDateofdischarge(patientHCLabList.getDateofdischarge());
				return patientHCLabListRepository.save(setPatientHCLabList);
			} else {
				return null;
			}
		} else {
			return null;
		}

	}

	@Override
	public PatientHCLabList editPatientHCLabListForDeceased(PatientHCLabList patientHCLabList) {

		long checkPatHCLabId = patientHCLabList.getPathclabid();
		Optional<PatientHCLabList> foundPatientHCLabList;
		PatientHCLabList setPatientHCLabList;

		if (checkPatHCLabId > 0) {
			foundPatientHCLabList = patientHCLabListRepository.findById(checkPatHCLabId);
			if (foundPatientHCLabList.isEmpty() == false) {
				setPatientHCLabList = foundPatientHCLabList.get();
				setPatientHCLabList.setDateofdeceased(patientHCLabList.getDateofdeceased());
				return patientHCLabListRepository.save(setPatientHCLabList);
			} else {
				return null;
			}
		} else {
			return null;
		}

	}

	@Override
	public PatientHCLabList editPatientHCLabListForTestOutcome(PatientHCLabList patientHCLabList) {

		long checkPatHCLabId = patientHCLabList.getPathclabid();
		Optional<PatientHCLabList> foundPatientHCLabList;
		PatientHCLabList setPatientHCLabList;
		// System.out.println("check" + checkPatHCLabId);
		if (checkPatHCLabId > 0) {
			foundPatientHCLabList = patientHCLabListRepository.findById(checkPatHCLabId);
			// System.out.println(foundPatientHCLabList);
			if (foundPatientHCLabList.isEmpty() == false) {
				setPatientHCLabList = foundPatientHCLabList.get();
				// System.out.println(setPatientHCLabList);
				setPatientHCLabList.setDateoftestresult(patientHCLabList.getDateoftestresult());
				setPatientHCLabList.setLabtestoutcome(patientHCLabList.getLabtestoutcome());
				return patientHCLabListRepository.save(setPatientHCLabList);
			} else {
				return null;
			}
		} else {
			return null;
		}

	}

	@Override
	public Optional<PatientHCLabList> getPatientHCLabListById(long PatHCLabId) {
		return patientHCLabListRepository.findById(PatHCLabId);
	}

	@Override
	public void deletePatientHCLabListById(long PatHCLabId) {
		System.out.println("service" + PatHCLabId);
		patientHCLabListRepository.deleteById(PatHCLabId);
	}

	@Override
	public List<PatientHCLabList> getAllPatientHCLabList() {
		return patientHCLabListRepository.findAll();
	}

	@Override
	public boolean existPatientHCLabListById(long PatHCLabId) {
		return patientHCLabListRepository.existsById(PatHCLabId);
	}

	@Override
	public List<PatientHCLabList> getAllPatientHCLabListInAsc() {
		return (List<PatientHCLabList>) patientHCLabListRepository.findAll(Sort.by(Sort.Direction.ASC, "pathclabid"));
	}

	@Override
	public List<PatientHCLabList> getAllPatientHCLabListInDesc() {
		return (List<PatientHCLabList>) patientHCLabListRepository.findAll(Sort.by(Sort.Direction.DESC, "pathclabid"));
	}

}
