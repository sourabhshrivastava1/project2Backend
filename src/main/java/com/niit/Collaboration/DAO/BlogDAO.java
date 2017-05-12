package com.niit.Collaboration.DAO;

import java.util.List;

import com.niit.Collaboration.model.Blog;
import com.niit.Collaboration.model.User;

public interface BlogDAO {

	public List<Blog>  list();
	
public boolean save(Blog blog);
	
	public boolean update(Blog blog);
	
	public boolean delete(String id);

	public Blog get(String string);

	public boolean reject(String id);

	public boolean isValidCredentials(String string, String string2);
	
}
