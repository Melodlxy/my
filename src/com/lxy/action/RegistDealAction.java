package com.lxy.action;

import com.lxy.model.User;
import com.lxy.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class RegistDealAction extends ActionSupport{

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
	
	public String regist() throws Exception{
		if(us.regist(user)){
			setTip("注册成功,"+user.getUsername());
			return SUCCESS;
		}else{
			setTip("已存在用户名为"+user.getUsername()+"的用户,请直接登录!");
			return ERROR;
		}
	}
}

