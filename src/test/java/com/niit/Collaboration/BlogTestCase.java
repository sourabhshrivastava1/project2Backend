package com.niit.Collaboration;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Collaboration.DAO.BlogDAO;
import com.niit.Collaboration.DAO.UserDAO;
import com.niit.Collaboration.model.Blog;
import com.niit.Collaboration.model.User;

import junit.framework.Assert;

public class BlogTestCase {

	
	@Autowired  static AnnotationConfigApplicationContext context;
	
	@Autowired  static Blog blog;
	
	@Autowired  static BlogDAO  blogDAO;
	
	
	
	@BeforeClass
	public static  void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		blog = (Blog) context.getBean("blog");
		
		blogDAO = (BlogDAO) context.getBean("blogDAO");
		 
	}
	
	/*@Test
	
	public void validateCredentialsTestCase()
	{
		
	boolean flag =	  blogDAO.isValidCredentials("manish", "manish");
	
	Assert.assertEquals("validateCredentialsTestCase", true , flag);;
	;;;;;;;;
	;;;;;;;;;
		
	}
	*/
	
	@Test
	public void createBlogTestCase()
	{
		blog.setId("001");
		blog.setUserid("001");
		blog.setTitle("FUN");
		blog.setDatetime("DATE");
	    blog.setStatus("Y");
	    blog.setReason("this is for status");
	    blog.setDescription("Entertainment blog");
		boolean flag =	blogDAO.save(blog);
	       
	       assertEquals("createBlogTestCase ",true, flag);
	}
	
	
/*	@Test
	public void updateBlogTestCase()
	{
		blog.setId("manish");
		blog.setTitle("manish");
	
		blog.setDatetime("datetime");
		blog.setDescription("description");
		blog.setReason("reason");
		blog.setStatus("o");
	       boolean flag =	blogDAO.update(blog);
	       
	       assertEquals("createBlogTestCase ",true, flag);
	}
	
	
	@Test
	public void getBlogTestCase()
	{
		blog =  blogDAO.get("manish");
		
		assertEquals("getBlogTestCase", null, blog);
		
		
		
	}
	
	
	@Test
	public void getAllBlogsTestCase()
	{
		List<Blog> blogs=  blogDAO.list();
		
		//select count(*) from c_blog_detail
		assertEquals("getAllBlogsTestCase", 28, blogs.size());
	}
	
	
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
