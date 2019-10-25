package com.revature.service;

import java.util.List;

import com.revature.pojo.MessageForm;


public interface MessageService {

	public List<MessageForm> myMsgs(String username);
}
