package com.lxy.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lxy.model.User;
import com.lxy.service.MessageService;
import com.lxy.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")
public class LoginDealAction extends ActionSupport{

	private User user;
	private UserService us;
	private MessageService ms;
	private String tip;
	
	public MessageService getMs() {
		return ms;
	}
	@Resource(name="messageService")
	public void setMs(MessageService ms) {
		this.ms = ms;
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

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String login() throws Exception {
		if(us.vaild(user)){
			ms.findMessages();
			setTip("欢迎您,"+user.getUsername());
			return SUCCESS;
		}else{
			setTip("账户名或密码错误,请重新输入!");
			return ERROR;
		}
	}
}

