package com.lxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxy.dao.UserDAO;
import com.lxy.model.User;
import com.lxy.service.UserService;
import com.opensymphony.xwork2.ActionContext;
@Service(value="userService")
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	@Resource(name="userDAO")
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public boolean vaild(User user) {
		List<User> users = userDAO.getByNameAndPass(user);
		if(users.size()>0){
			ActionContext.getContext().getSession().put("user", users.get(0));
			return true;
		}
		return false;
	}

	@Override
	public boolean regist(User user) {
		List<User> users = userDAO.getByName(user.getUsername());
		if(users.size()>0){
			return false;
		}else{
			userDAO.save(user);
//			ActionContext.getContext().getSession().put("user", users.get(0));
			return true;
		}
	}

	@Override
	public void update(User user) {
		userDAO.update(user);
	}
	
	@Override
	public User getById(int id) {
		return userDAO.getById(id);
	}
	
}
