package com.niit.Collaboration.model;
      

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="C_USER_DETAIL")
public class User {
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Id
	private String id;
	
	private String name;
	
	private String role;
	
	private String password;
	
	private String email; //it is not required if you want to use emial as id

	private String address;

	private String mobile;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setErrorCode(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setErrorMessage(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setLastSeenTime(Date date) {
		// TODO Auto-generated method stub
		
	}

	public void setIsOnline(char c) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus(char c) {
		// TODO Auto-generated method stub
		
	}

	public void setReason(String reason) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
