package com.niit.Collaboration.DAO;

import java.util.List;

import com.niit.Collaboration.model.Blog;
import com.niit.Collaboration.model.Chat;
import com.niit.Collaboration.model.User;

public interface ChatDAO {

	public List<Chat>  list();
	
public boolean save(Chat chat);
	
	public boolean update(Chat chat);
	
	public boolean delete(String id);

	public Chat get(String string);
}
