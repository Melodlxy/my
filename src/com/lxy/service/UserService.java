package com.lxy.service;

import com.lxy.model.User;

public interface UserService {
	public boolean vaild(User user);
	public boolean regist(User user);
	public void update(User user);
	User getById(int id);
}
