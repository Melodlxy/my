package com.lxy.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.lxy.model.Message;
import com.lxy.service.MessageService;
import com.opensymphony.xwork2.ActionSupport;
@Controller
public class LeaveMessageDealAction extends ActionSupport{
	
	private Message message;
	private MessageService ms;
	
	public MessageService getMs() {
		return ms;
	}
	@Resource(name="messageService")
	public void setMs(MessageService ms) {
		this.ms = ms;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public String leaveMessage(){
		ms.leaveMessage(message);
		return SUCCESS;
	}
}
