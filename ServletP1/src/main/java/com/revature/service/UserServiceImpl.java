package com.revature.service;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoFake;
import com.revature.pojo.User;

public class UserServiceImpl implements UserService {

	private static UserDao userDAO = new UserDaoFake();
	
	public User loginUser(String username, String password) {
		System.out.println("Attempted login with creds: Username: "+ username +" Password: " + password);
		

		User user = userDAO.getUser(username);
		
		System.out.println("User: " + user);
		
		if(((user.getUser() != null) && (user.getPassword() != null)) && (user.getPassword().equals(password))) {
			System.out.println("Checking if Username: "+ user.getUser() +" Password: " + user.getPassword());
			return user;
			
		}
			System.out.println("Checking if Username: "+ user.getUser() +" Password: " + user.getPassword());
			return null;
		}

}
