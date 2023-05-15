package com.dedalus.covidtracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Patientreg")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long patientID;
	
	@Column(nullable = true)
	private String patientFirstName;
	
	@Column(nullable = true)
	private String patientLastName;
	
	@Column(nullable = true)
	private String patientDOB;
	
	@Column(nullable = true)
	private String patientGender;
	
	@Column(nullable = true)
	private String patientContactNo;
	
	@Column(nullable = false)
	private String patientEmailID;
	
	@Column(nullable = false)
	private String patientAddr1;
	
	@Column(nullable = false)
	private String patientAddr2;
	
	@Column(nullable = true)
	private String stateCode;
	
	@Column(nullable = true)
	private Long postalCode;
	
	@Column(nullable = true)
	private String patientStatusCode;
	
	@Override
	public String toString() {
		return String.format(
				"Patient [patientID=%s, patientFirstName=%s, patientLastName=%s, patientDOB=%s, patientGender=%s, patientContactNo=%s, patientEmailID=%s, patientAddr1=%s, patientAddr2=%s, stateCode=%s, postalCode=%s, patientStatusCode=%s]",
				patientID, patientFirstName, patientLastName, patientDOB, patientGender, patientContactNo,
				patientEmailID, patientAddr1, patientAddr2, stateCode, postalCode, patientStatusCode);
	}

	public Patient(Long patientID, String patientFirstName, String patientLastName, String patientDOB,
			String patientGender, String patientContactNo, String patientEmailID, String patientAddr1,
			String patientAddr2, String stateCode, Long postalCode, String patientStatusCode) {
		super();
		this.patientID = patientID;
		this.patientFirstName = patientFirstName;
		this.patientLastName = patientLastName;
		this.patientDOB = patientDOB;
		this.patientGender = patientGender;
		this.patientContactNo = patientContactNo;
		this.patientEmailID = patientEmailID;
		this.patientAddr1 = patientAddr1;
		this.patientAddr2 = patientAddr2;
		this.stateCode = stateCode;
		this.postalCode = postalCode;
		this.patientStatusCode = patientStatusCode;
	}

	public Long getPatientID() {
		return patientID;
	}

	public void setPatientID(Long patientID) {
		this.patientID = patientID;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public String getPatientDOB() {
		return patientDOB;
	}

	public void setPatientDOB(String patientDOB) {
		this.patientDOB = patientDOB;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientContactNo() {
		return patientContactNo;
	}

	public void setPatientContactNo(String patientContactNo) {
		this.patientContactNo = patientContactNo;
	}

	public String getPatientEmailID() {
		return patientEmailID;
	}

	public void setPatientEmailID(String patientEmailID) {
		this.patientEmailID = patientEmailID;
	}

	public String getPatientAddr1() {
		return patientAddr1;
	}

	public void setPatientAddr1(String patientAddr1) {
		this.patientAddr1 = patientAddr1;
	}

	public String getPatientAddr2() {
		return patientAddr2;
	}

	public void setPatientAddr2(String patientAddr2) {
		this.patientAddr2 = patientAddr2;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public Long getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Long postalCode) {
		this.postalCode = postalCode;
	}

	public String getPatientStatusCode() {
		return patientStatusCode;
	}

	public void setPatientStatusCode(String patientStatusCode) {
		this.patientStatusCode = patientStatusCode;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	


}
