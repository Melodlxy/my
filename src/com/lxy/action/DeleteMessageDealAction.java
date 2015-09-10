package com.lxy.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.lxy.service.MessageService;
import com.opensymphony.xwork2.ActionSupport;
@Controller
public class DeleteMessageDealAction extends ActionSupport{
	private MessageService ms;
	private int id;
	
	public MessageService getMs() {
		return ms;
	}
	@Resource(name="messageService")
	public void setMs(MessageService ms) {
		this.ms = ms;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String deleteMessage(){
		ms.deleteMessage(id);
		return SUCCESS;
	}
}
