package com.lxy.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.lxy.dao.UserDAO;
import com.lxy.model.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{

	@Override
	public void add(User user) {
		getHibernateTemplate().save(user);
//		Object o = getHibernateTemplate().getSessionFactory().getCurrentSession().get(User.class, user.getUsername());
//		Session sess = getHibernateTemplate().getSessionFactory().getCurrentSession();
//		Transaction tx = sess.beginTransaction();
//		sess.save(user);
//		tx.commit();
//		sess.close();
//		return true;
	}

	@Override
	public boolean valid(User user) {
		List<User> l = (List<User>) getHibernateTemplate().find(" from User  where username=? and password=? ", new String[]{user.getUsername(),user.getPassword()});
		if(l.size() == 0){
			return false;
		}
		return true;
	}
	
	public User get(User user){
		return getHibernateTemplate().get(User.class, user.getUsername());
	}

	public void save(User user){
		getHibernateTemplate().save(user);
	}
}
