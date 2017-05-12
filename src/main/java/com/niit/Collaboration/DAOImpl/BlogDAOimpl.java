package com.niit.Collaboration.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.niit.Collaboration.DAO.BlogDAO;
import com.niit.Collaboration.model.Blog;


@Repository("blogDAO")
@Transactional
public class BlogDAOimpl {

	  private static Logger log = LoggerFactory.getLogger(BlogDAO.class);
private  SessionFactory  sessionFactory;
	
	
	public BlogDAOimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	
	

	public Blog get(String id) {
		 Blog blog = (Blog) sessionFactory.getCurrentSession().get(Blog.class, id);
		 
		 return blog;
	}

	public List<Blog> list() {
		 return sessionFactory.getCurrentSession().createQuery("from Blog").list();
		
	}
/**\
 * If spring security not used
 */
	/*public boolean isValidCredentials(String id, String password) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from Blog where id =? and password = ? ");
		query.setString(0, id);
		query.setString(1, password);
		
		 if( query.uniqueResult() ==null)
		 {
			 return false;
		 }
		 else
		 {
			 return true;
		 }
		
	
	}*/

	public boolean save(Blog blog) {
		try {
			sessionFactory.getCurrentSession().save(blog);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	
	}

	public boolean update(Blog blog) {
	try {
		sessionFactory.getCurrentSession().update(blog);
		return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	}

	public boolean delete(String id)
	{
		log.debug("Starting of the method delete");
		log.debug("Trying to delte the record : " + id);
		try
		{
		
		sessionFactory.getCurrentSession().delete(get(id));
		log.debug("successfully delted the record :" + id);
		}catch(Exception e)
		{
			log.debug("record does not exist with the id " + id);
			return false;
			
		}
		log.debug("Ending of the method delete");
		return true;
	}
}
