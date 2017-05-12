package com.niit.Collaboration.DAO;

import java.util.List;

import com.niit.Collaboration.model.Friend;
import com.niit.Collaboration.model.User;

public interface FriendDAO {

	public List<Friend>  list();
	
public boolean save(Friend friend);
	
	public boolean update(Friend friend);
	
	public boolean delete(String id);

	public Friend get(String string);

	public boolean reject(String id);

	public void setOnline(String id);

	public void setOffLine(String loggedInUserID);

	public List<Friend> getMyFriends(String loggedInUserID);

	public Friend get(String loggedInUSerID, String friendID);

	public List<Friend> getFriendsRequestsSendByMe(String loggedInUserID);

	public List<Friend> getNewFriendRequests(String loggedInUserID);
	
}
