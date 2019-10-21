package com.revature.dao;

import com.revature.pojo.WelcomeMsg;

public class WMDao implements WelcomeDao {

	public WelcomeMsg WM() {
		// TODO Auto-generated method stub
		WelcomeMsg msg = new WelcomeMsg();
		msg.setWelcomeMsg("Welcome to the Home Page!");
		
		return msg;
	}

}
