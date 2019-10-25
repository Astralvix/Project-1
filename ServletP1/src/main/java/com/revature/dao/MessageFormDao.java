package com.revature.dao;

import java.util.List;

import com.revature.pojo.MessageForm;

public interface MessageFormDao {
	
	public void createMsgForm(MessageForm msgForm);

	public List<MessageForm> getMyMsg(String rec_username);
}
