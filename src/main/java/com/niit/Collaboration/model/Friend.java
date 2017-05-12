package com.niit.Collaboration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "C_FRIEND")
@Component
public class Friend extends BaseDomain{

	@Id
	private int id;
	
	@Column(name="user_id")
	private String userID;
	
	 @Column(name="friend_id")
	private String friendID;
	
	private String status;
	
	@Column(name="is_online")
	private char isOnline;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID= userID;
	}

	public String getFriendID() {
		return friendID;
	}

	public void setFriendID(String friendID) {
		this.friendID= friendID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String string) {
		this.status = string;
	}

	public char getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(char isOnline) {
		this.isOnline = isOnline;
	}

	public void setIsOnline(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus(char c) {
		// TODO Auto-generated method stub
		
	}
	
	
}