package com.lxy.service;

import com.lxy.model.Message;

public interface MessageService {
	void leaveMessage(Message message);
	void findMessages();
	void deleteMessage(int id);
}
