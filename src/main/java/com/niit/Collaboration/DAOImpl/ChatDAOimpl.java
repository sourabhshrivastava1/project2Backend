package com.niit.Collaboration.DAOImpl;


import java.math.BigDecimal;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Collaboration.DAO.ChatDAO;
import com.niit.Collaboration.model.Blog;
import com.niit.Collaboration.model.Chat;
import com.niit.Collaboration.model.User;

@Repository("chatDAO")
public class ChatDAOimpl implements ChatDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<Chat> list(){
		String hql="from Chat c";
				Query query=sessionFactory.openSession().createQuery(hql);
		return query.list();
		
	}
	
	@Transactional
	public Chat get(String userID, Integer chatforumID) {
		String hql="select c from Chat c where c.userID="+"'"+userID+"'and c.id='"+chatforumID+"'";
		Query query=sessionFactory.openSession().createQuery(hql);
		
		return (Chat)query.list().get(0);
	}
	
	@Transactional
	public boolean update(Chat chat) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.update(chat);
			session.flush();
			return true;
		}catch(Exception e){
		e.printStackTrace();	
		return false;
		}
	}
	
	@Transactional	
	public boolean delete(int userID,BigDecimal chatforumID) {
		Chat chat=new Chat();
		chat.setId(userID);
		chat.setUserID(userID);
		Session session=sessionFactory.openSession();
		session.delete(chat);
		session.flush();
		return true;
	}
	
	/*@Transactional
	public boolean save(Chat chat){
		try{
			String hql="select c_chat_forum_sequence.nextval from dual";
			Query query=sessionFactory.getCurrentSession().createSQLQuery(hql);
	BigDecimal		maxID=(BigDecimal) query.uniqueResult();
			chat.setUserID(maxID.toString());
			Session session=sessionFactory.getCurrentSession();
			session.save(chat);
			session.flush();
		    return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}*/
	
	@Transactional
	public boolean save(Chat chat) {
		try {
			sessionFactory.getCurrentSession().save(chat);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean save(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Chat get(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
