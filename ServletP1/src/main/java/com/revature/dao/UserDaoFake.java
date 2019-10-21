package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pojo.User;
import com.revature.util.ConnectionFactory;

public class UserDaoFake implements UserDao{
	
private Connection conn = ConnectionFactory.getConnection();
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}

	
	public User getUser(String username) {
	String sql = "select * from project1.users where username = ?;";
	PreparedStatement stmt;
	User user = new User();
	try {
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, username);
	ResultSet rs = stmt.executeQuery();
	
	while(rs.next()) {
		user.setUser(rs.getString(1));
		user.setPassword(rs.getString(2));
		user.setRole(rs.getString(3));
	}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return user;
	
}

	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
