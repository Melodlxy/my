package com.lxy.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lxy.dao.MessageDAO;
import com.lxy.model.Message;
@Repository(value="messageDAO")
public class MessageDAOImpl implements MessageDAO {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Message message) {
		Session session = sessionFactory.getCurrentSession();
		session.save(message);
		session.flush();
	}

}
