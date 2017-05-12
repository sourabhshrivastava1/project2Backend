package com.niit.Collaboration.DAO;

import java.util.List;

import com.niit.Collaboration.model.User;

public interface UserDAO {
	
	
	
	
	
	public User  get(String id);
	
	public List<User>  list();
	
	
	//If you are not using spring security,  you need to defin validate function
	public boolean isValidCredentials(String id, String password);
	
	
	public boolean save(User user);
	
	public boolean update(User user);
	
	public boolean delete(String id);

	public List<User> notMyFriendList(String loggedInUserID);

	public User authenticate(String id, String password);

	public void setOnline(String id);

	public void setOffLine(String loggedInUserID);
	

}
