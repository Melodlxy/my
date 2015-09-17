package com.lxy.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")
public class WriteBlogLinkAction extends ActionSupport{
	public String writeBlog(){
		return SUCCESS;
	}
}
