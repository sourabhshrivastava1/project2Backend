package com.niit.Collaboration;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Collaboration.DAO.UserDAO;
import com.niit.Collaboration.model.User;

import junit.framework.Assert;

public class UserTestCase {

	
	@Autowired  static AnnotationConfigApplicationContext context;
	
	@Autowired  static User user;
	
	@Autowired  static UserDAO  userDAO;
	
	
	
	@BeforeClass
	public static  void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		user = (User) context.getBean("user");
		
		userDAO = (UserDAO) context.getBean("userDAO");
		 
	}
	
	
	/*@Test
	
	public void validateCredentialsTestCase()
	{
		
	boolean flag =	  userDAO.isValidCredentials("sourabh", "sourabh");
	
	Assert.assertEquals("validateCredentialsTestCase", true , flag);;
	;;;;;;;;
	;;;;;;;;;
		
	}
	*/
	
	
	
	
	
	@Test
	public void getUserTestCase()
	{
		user =  userDAO.get("sourabh");
		
		assertEquals("getUserTestCase", null, user);
		
		
		
	}
	
	
	@Test
	public void getAllUsersTestCase()
	{
		List<User> users=  userDAO.list();
		
		//select count(*) from c_user_detail
		assertEquals("getAllUsersTestCase", 3, users.size());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	

}
