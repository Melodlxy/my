package com.lxy.dao;

import java.util.List;

import com.lxy.model.Message;

public interface MessageDAO {
	void save(Message message);
	void delete(int id);
	List<Message> getMessages();
}
