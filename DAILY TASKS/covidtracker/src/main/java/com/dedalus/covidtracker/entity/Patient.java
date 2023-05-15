package com.dedalus.covidtracker.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue
	private Long patientid;
	
	@Column(nullable=false)
	private String patientfirstname;
	
	@Column(nullable = false)
	private String patientlastname;
	
	@Column(nullable = false)
	private Date patientdob;
	
	@Column(nullable = false)
	private String patientgender;
	
	@Column
	private String patientcontactno;
	
	@Column
	private String patientemailid;
	
	@Column
	private String patientaddr1;
	
	@Column
	private String patientaddr2;
	
	@Column
	private String statecode;
	
	@Column
	private String postalcode;
	
	@Column
	private String patientstatuscode;
	
	@Column
	private char activeind;
	
	@Column(nullable = false, unique=true)
	private long aadhaarno;	
}
