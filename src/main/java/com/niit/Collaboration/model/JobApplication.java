package com.niit.Collaboration.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "c_job")
@Component
public class JobApplication extends BaseDomain{


	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public Long getJobID() {
		return jobID;
	}
	public void setJobID(Long jobID) {
		this.jobID = jobID;
	}
	public Date getDateApplied() {
		return dateApplied;
	}
	public void setDateApplied(Date dateApplied) {
		this.dateApplied = dateApplied;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	@Id
	private Long id;
	@Column(name="user_id")
	private String userID;
	
	@Column(name="job_id")
	private Long jobID;
	
	@Column(name="date_applied")
	private Date dateApplied;
	private String remarks;
	private char status;//S->Select; R->Reject; C->Call For Inerview
	}