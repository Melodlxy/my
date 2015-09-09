package com.lxy.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.lxy.dao.UserDAO;
import com.lxy.model.User;
@Repository(value="userDAO")
public class UserDAOImpl implements UserDAO{

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		session.flush();
	}
	
	public List<User> getByNameAndPass(User user){
		Session session = sessionFactory.getCurrentSession();
		return (List<User>)session.createCriteria(User.class)
				.add(Restrictions.eq("username", user.getUsername())).add(Restrictions.eq("password", user.getPassword())).list();
	}
	
	public User getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return (User)session.get(User.class, id);
	}
	@Override
	public List<User> getByName(String username) {
		Session session = sessionFactory.getCurrentSession();
		return (List<User>)session.createCriteria(User.class)
				.add(Restrictions.eq("username", username)).list();
	}
	@Override
	public void update(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.update(user);
		session.flush();
	}

}
