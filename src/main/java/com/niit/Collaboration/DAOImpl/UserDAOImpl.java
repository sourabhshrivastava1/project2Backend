package com.niit.Collaboration.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.niit.Collaboration.DAO.UserDAO;
import com.niit.Collaboration.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO{
	
   private static Logger log = LoggerFactory.getLogger(UserDAOImpl.class);
	
	private  SessionFactory  sessionFactory;
	
	
	public UserDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	public void tempMethod()
	{
		
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
	

	public User get(String id) {
		 User user = (User) sessionFactory.getCurrentSession().get(User.class, id);
		 
		 return user;
	}

	public List<User> list() {
		 return sessionFactory.getCurrentSession().createQuery("from User").list();
		
	}
/**\
 * If spring security used, we no need to write this method
 */
	public boolean isValidCredentials(String id, String password) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from User where id =? and password = ? ");
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
		
	
	}

	public boolean save(User user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	
	}

	public boolean update(User user) {
	try {
		sessionFactory.getCurrentSession().update(user);
		return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	}

	public List<User> notMyFriendList(String loggedInUserID) {
		// TODO Auto-generated method stub
		return null;
	}

	public User authenticate(String id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setOnline(String id) {
		// TODO Auto-generated method stub
		
	}

	public void setOffLine(String loggedInUserID) {
		// TODO Auto-generated method stub
		
	}

}
