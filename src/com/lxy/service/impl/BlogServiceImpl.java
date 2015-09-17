package com.lxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxy.dao.BlogDAO;
import com.lxy.model.Blog;
import com.lxy.service.BlogService;
import com.opensymphony.xwork2.ActionContext;
@Service(value="blogService")
public class BlogServiceImpl implements BlogService {
	
	private BlogDAO blogDAO;

	public BlogDAO getBlogDAO() {
		return blogDAO;
	}
	@Resource(name="blogDAO")
	public void setBlogDAO(BlogDAO blogDAO) {
		this.blogDAO = blogDAO;
	}

	@Override
	public void findBlogs() {
		List<Blog> blogs = blogDAO.getBlogs();
		ActionContext.getContext().getSession().put("blogs", blogs);
	}

}
