package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.pojo.StatusForm;
import com.revature.util.ConnectionFactory;

public class StatusFormDaoImpl implements StatusFormDao{

	private Connection conn = ConnectionFactory.getConnection();
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void CreateStatForm() {
	String sql ="insert into project1.status(manager_status, depthead_status, benco_status) values(?,?,?);";
	
	try {
		PreparedStatement stmt = conn.prepareCall(sql);
		stmt.setString(1, "pending");
		stmt.setString(2, "pending");
		stmt.setString(3, "pending");
		stmt.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
