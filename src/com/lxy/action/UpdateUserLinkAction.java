package com.lxy.action;

import com.lxy.model.User;
import com.lxy.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateUserLinkAction extends ActionSupport{
	private User user;
	private UserService us;
	
	public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String selectUser(){
		return SUCCESS;
	}
}
