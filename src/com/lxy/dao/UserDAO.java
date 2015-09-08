package com.lxy.dao;

import com.lxy.model.User;

public interface UserDAO {	
	boolean valid(User user);
	void add(User user);
	User get(User user);
	void save(User user);
}
