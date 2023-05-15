package com.dedalus.covidtracker.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "patienthclablist")
public class PatientHCLabList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private long pathclabid;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "patienthcid", referencedColumnName = "patienthcid")
	private PatientHCMapping patienthcmapping;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "labmasterid", referencedColumnName = "labmasterid")
	private LabMaster labmaster;

	@Column(nullable = true, length = 1)
	private String labtestoutcome;

	@Column(nullable = true)
	private Date dateoftestgiven;

	@Column(nullable = true)
	private Date dateoftestresult;

	@Column(nullable = true)
	private Date dateofadmission;

	@Column(nullable = true)
	private Date dateofdischarge;

	@Column(nullable = true)
	private Date dateofdeceased;

	public long getPathclabid() {
		return pathclabid;
	}

	public void setPathclabid(long pathclabid) {
		this.pathclabid = pathclabid;
	}

	public PatientHCMapping getPatienthcmapping() {
		return patienthcmapping;
	}

	public void setPatienthcmapping(PatientHCMapping patienthcmapping) {
		this.patienthcmapping = patienthcmapping;
	}

	public LabMaster getLabmaster() {
		return labmaster;
	}

	public void setLabmaster(LabMaster labmaster) {
		this.labmaster = labmaster;
	}

	public String getLabtestoutcome() {
		return labtestoutcome;
	}

	public void setLabtestoutcome(String labtestoutcome) {
		this.labtestoutcome = labtestoutcome;
	}

	public Date getDateoftestgiven() {
		return dateoftestgiven;
	}

	public void setDateoftestgiven(Date dateoftestgiven) {
		this.dateoftestgiven = dateoftestgiven;
	}

	public Date getDateoftestresult() {
		return dateoftestresult;
	}

	public void setDateoftestresult(Date dateoftestresult) {
		this.dateoftestresult = dateoftestresult;
	}

	public Date getDateofadmission() {
		return dateofadmission;
	}

	public void setDateofadmission(Date dateofadmission) {
		this.dateofadmission = dateofadmission;
	}

	public Date getDateofdischarge() {
		return dateofdischarge;
	}

	public void setDateofdischarge(Date dateofdischarge) {
		this.dateofdischarge = dateofdischarge;
	}

	public Date getDateofdeceased() {
		return dateofdeceased;
	}

	public void setDateofdeceased(Date dateofdeceased) {
		this.dateofdeceased = dateofdeceased;
	}

	@Override
	public String toString() {
		return "PatientHCLabList [pathclabid=" + pathclabid + ", patienthcmapping=" + patienthcmapping + ", labmaster="
				+ labmaster + ", labtestoutcome=" + labtestoutcome + ", dateoftestgiven=" + dateoftestgiven
				+ ", dateoftestresult=" + dateoftestresult + ", dateofadmission=" + dateofadmission
				+ ", dateofdischarge=" + dateofdischarge + ", dateofdeceased=" + dateofdeceased + "]";
	}

	public PatientHCLabList() {
		super();
	}

	public PatientHCLabList(long pathclabid, PatientHCMapping patienthcmapping, LabMaster labmaster,
			String labtestoutcome, Date dateoftestgiven, Date dateoftestresult, Date dateofadmission,
			Date dateofdischarge, Date dateofdeceased) {
		super();
		this.pathclabid = pathclabid;
		this.patienthcmapping = patienthcmapping;
		this.labmaster = labmaster;
		this.labtestoutcome = labtestoutcome;
		this.dateoftestgiven = dateoftestgiven;
		this.dateoftestresult = dateoftestresult;
		this.dateofadmission = dateofadmission;
		this.dateofdischarge = dateofdischarge;
		this.dateofdeceased = dateofdeceased;
	}
	
	
	

}
