package com.revature.service;

import java.util.List;
import com.revature.dao.MessageFormDao;
import com.revature.dao.MessageFormDaoImpl;
import com.revature.pojo.MessageForm;

public class MessageServiceImpl implements MessageService{

	private static MessageFormDao MFD = new MessageFormDaoImpl();
	@Override
	public List<MessageForm> myMsgs(String username) {
		// TODO Auto-generated method stub
		return MFD.getMyMsg(username);
	}

}
