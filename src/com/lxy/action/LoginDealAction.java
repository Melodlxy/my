package com.lxy.action;

import com.lxy.model.User;
import com.lxy.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginDealAction extends ActionSupport{

	private User user;
	private UserService us;
	private String tip;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String login() throws Exception {
		if(us.vaild(user)){
			setTip("欢迎您,"+user.getUsername());
			return SUCCESS;
		}else{
			setTip("账户名或密码错误,请重新输入!");
			return ERROR;
		}
	}
}

