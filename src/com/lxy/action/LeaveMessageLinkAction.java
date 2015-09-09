package com.lxy.action;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
@Controller
public class LeaveMessageLinkAction extends ActionSupport{
	public String leaveMessage(){
		return SUCCESS;
	}
}
