package com.lxy.dao;

import java.util.List;
import com.lxy.model.User;

public interface UserDAO {	
	List<User> getByNameAndPass(User user);
	List<User> getByName(String username);
	User getById(int id);
	void save(User user);
	void update(User user);
}
