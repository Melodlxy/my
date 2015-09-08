package com.lxy.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lxy.model.User;
import com.lxy.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")
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
	@Resource(name="userService")
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
			setTip("ע��ɹ�,"+user.getUsername());
			return SUCCESS;
		}else{
			setTip("�Ѵ����û���Ϊ"+user.getUsername()+"���û�,��ֱ�ӵ�¼!");
			return ERROR;
		}
	}
}

