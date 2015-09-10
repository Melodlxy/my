package com.lxy.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.lxy.dao.MessageDAO;
import com.lxy.model.Message;
import com.lxy.model.User;
import com.opensymphony.xwork2.ActionContext;
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
	@Override
	public List<Message> getMessages() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Message>)session.createCriteria(Message.class)
				.add(Restrictions.eq("userid", ((User)ActionContext.getContext().getSession().get("user")).getId())).list();
	}
	@Override
	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(session.get(Message.class, id));
		session.flush();
	}

}
