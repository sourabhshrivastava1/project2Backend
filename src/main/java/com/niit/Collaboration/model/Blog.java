package com.niit.Collaboration.model;

import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.type.ClobType;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="C_BLOG")
public class Blog {

	@Id
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getUserid() {
		return Userid;
	}
	public void setUserid(String userid) {
		Userid = userid;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Clob getDescription() {
		return description;
	}
	public void setDescription(Clob description) {
		this.description = description;
	}
	private String Title;
	
	@Column
	private String Userid;
	@Column
	private String datetime;
	private String status;
	private String reason;
	private Clob description;
	public void setDescription(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setErrorCode(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setErrorMessage(String string) {
		// TODO Auto-generated method stub
		
	}
}
