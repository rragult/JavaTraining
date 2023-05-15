package com.dedalus.covidtracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "labmaster")
public class LabMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private long labmasterid;

	@Column(nullable = false, length = 10)
	private String labmastercode;

	@Column(nullable = false, length = 100)
	private String labmastername;

	@Column(nullable = false, length = 100)
	private String activeind;

	public LabMaster() {
		super();
	}

	public long getLabmasterid() {
		return labmasterid;
	}

	public void setLabmasterid(long labmasterid) {
		this.labmasterid = labmasterid;
	}

	public String getLabmastercode() {
		return labmastercode;
	}

	public void setLabmastercode(String labmastercode) {
		this.labmastercode = labmastercode;
	}

	public String getLabmastername() {
		return labmastername;
	}

	public void setLabmastername(String labmastername) {
		this.labmastername = labmastername;
	}

	public String getActiveind() {
		return activeind;
	}

	public void setActiveind(String activeind) {
		this.activeind = activeind;
	}

	@Override
	public String toString() {
		return "LabMaster [labmasterid=" + labmasterid + ", labmastercode=" + labmastercode + ", labmastername="
				+ labmastername + ", activeind=" + activeind + "]";
	}

	public LabMaster(long labmasterid, String labmastercode, String labmastername, String activeind) {
		super();
		this.labmasterid = labmasterid;
		this.labmastercode = labmastercode;
		this.labmastername = labmastername;
		this.activeind = activeind;
	}


}
