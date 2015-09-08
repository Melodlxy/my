package com.lxy.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lxy.model.User;
import com.lxy.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")
public class UpdateUserDealAction extends ActionSupport{
	
	private String tip;
	private User user;
	private UserService us;
	
	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUs() {
		return us;
	}
	@Resource(name="userService")
	public void setUs(UserService us) {
		this.us = us;
	}

	public String updateUser(){
		us.update(user);
		return SUCCESS;
	}

}
