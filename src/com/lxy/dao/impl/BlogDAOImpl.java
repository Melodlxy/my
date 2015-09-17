package com.lxy.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.lxy.dao.BlogDAO;
import com.lxy.model.Blog;
import com.lxy.model.User;
import com.opensymphony.xwork2.ActionContext;
@Repository("blogDAO")
public class BlogDAOImpl implements BlogDAO {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Blog> getBlogs() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Blog>)session.createCriteria(Blog.class).add(Restrictions.eq("userid", ((User)ActionContext.getContext().getSession().get("user")).getId())).list();
	}

}
