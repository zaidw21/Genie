package com.mindtree.genie.entities;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class GenieForm  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int slno;
	
	@Column(name="Mid")
	private String Mid;
	
	@Column(name="Location")
	private String location;
	
	@Column(name="Severity")
	private String severity;
	
	@Column(name="Status")
	private String status;
	
	@Column(name="MobileNum")
	private String mobilenum;
	
	@Column(name="Raised_date")
	private Date date;
	
	@Column(name="assignedTo")
	private String assignedTo;
	
	@Column(name="GenieType")
	private String genieType;
	 
	

	public String getGenieType() {
		return genieType;
	}

	public void setGenieType(String genieType) {
		this.genieType = genieType;
	}

	
	public int getSlno() {
		return slno;
	}

	public void setSlno(int slno) {
		this.slno = slno;
	}

	public String getMid() {
		return Mid;
	}

	public void setMid(String mid) {
		Mid = mid;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMobilenum() {
		return mobilenum;
	}

	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "GenieForm [location=" + location + ", severity=" + severity + ", status=" + status + ", mobilenum="
				+ mobilenum + ", date=" + date + "]";
	}
	
	
	
}
