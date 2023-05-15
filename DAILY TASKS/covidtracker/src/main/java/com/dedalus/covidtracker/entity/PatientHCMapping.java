package com.dedalus.covidtracker.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "Patienthcmapping")
public class PatientHCMapping {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long patienthcid;

	private long patientid;

	@Column
	private String hccode;

	@Column
	private Date encounterdt;

	public long getPatienthcid() {
		return patienthcid;
	}

	public void setPatienthcid(long patienthcid) {
		this.patienthcid = patienthcid;
	}

	public long getPatientid() {
		return patientid;
	}

	public void setPatientid(long patientid) {
		this.patientid = patientid;
	}

	public String getHccode() {
		return hccode;
	}

	public void setHccode(String hccode) {
		this.hccode = hccode;
	}

	public Date getEncounterdt() {
		return encounterdt;
	}

	public void setEncounterdt(Date encounterdt) {
		this.encounterdt = encounterdt;
	}

	@Override
	public String toString() {
		return "PatientHCMapping [patienthcid=" + patienthcid + ", patientid=" + patientid + ", hccode=" + hccode
				+ ", encounterdt=" + encounterdt + "]";
	}

	public PatientHCMapping() {
		super();
	}

	public PatientHCMapping(long patienthcid, long patientid, String hccode, Date encounterdt) {
		super();
		this.patienthcid = patienthcid;
		this.patientid = patientid;
		this.hccode = hccode;
		this.encounterdt = encounterdt;
	}

}
