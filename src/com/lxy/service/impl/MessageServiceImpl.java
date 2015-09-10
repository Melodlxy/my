package com.lxy.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxy.dao.MessageDAO;
import com.lxy.model.Message;
import com.lxy.service.MessageService;
import com.opensymphony.xwork2.ActionContext;
@Service(value="messageService")
public class MessageServiceImpl implements MessageService {
	
	private MessageDAO messageDAO;

	public MessageDAO getMessageDAO() {
		return messageDAO;
	}
	@Resource(name="messageDAO")
	public void setMessageDAO(MessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}

	@Override
	public void leaveMessage(Message message) {
		message.setInputdate(new Date());
		messageDAO.save(message);
	}
	@Override
	public void findMessages() {
		List<Message> messages = messageDAO.getMessages();
		ActionContext.getContext().getSession().put("messages", messages);
	}
	@Override
	public void deleteMessage(int id) {
		messageDAO.delete(id);
	}

}
