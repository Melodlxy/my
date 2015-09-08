package com.lxy.service.impl;

import com.lxy.dao.UserDAO;
import com.lxy.model.User;
import com.lxy.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public boolean vaild(User user) {
		boolean result = userDAO.valid(user);
		if(result){
			return true;
		}
		return false;
	}

	@Override
	public boolean regist(User user) {
		User u = userDAO.get(user);
		if(u == null){
			userDAO.add(user);
			return true;
		}
		return false;
	}

	@Override
	public void update(User user) {
		userDAO.save(user);
	}

	@Override
	public void add(User user) {
		
	}

}
