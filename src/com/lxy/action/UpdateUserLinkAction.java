package com.lxy.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lxy.model.User;
import com.lxy.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")
public class UpdateUserLinkAction extends ActionSupport{
	private int id;
	private User user;
	private UserService us;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public UserService getUs() {
		return us;
	}
	@Resource(name="userService")
	public void setUs(UserService us) {
		this.us = us;
	}	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String updateUser(){
		this.user = (User) ActionContext.getContext().getSession().get("user");
		return SUCCESS;
	}
}
