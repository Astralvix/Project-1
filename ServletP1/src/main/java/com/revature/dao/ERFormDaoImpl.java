package com.revature.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.revature.pojo.ERForm;
import com.revature.pojo.User;
import com.revature.util.ConnectionFactory;

public class ERFormDaoImpl implements ERFormDao{

private Connection conn = ConnectionFactory.getConnection();
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public List<ERForm> getAllForms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ERForm getSpecificForm(int RID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ERForm> getMyForms(String username) {
		String sql = "select * from project1.reimbursementInfo where username = ?;";
		
		PreparedStatement stmt;
		
		List<ERForm> allForms = new ArrayList<ERForm>();
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, username);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			ERForm form = new ERForm();
			form.setRID(rs.getInt(1));
			form.setUserName(rs.getString(2));
			form.setFullName(rs.getString(3));
			form.setTheDate(rs.getDate(4).toLocalDate());
			form.setEventStartDate(rs.getDate(5).toLocalDate());
			form.setTheLocation(rs.getString(6));
			form.setDescription(rs.getString(7));
			form.setTheCost(rs.getDouble(8));
			form.setGradingFormat(rs.getString(9));
			form.setPassingPercentage(rs.getString(10));
			form.setEventType(rs.getString(11));
			form.setFileName(rs.getString(12));
			form.setStatus(rs.getString(13));
			form.setReason(rs.getString(14));
			allForms.add(form);
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allForms;
	}

	@Override
	public void createForm(ERForm form) {
		// TODO Auto-generated method stub
			String sql = "insert into project1.reimbursementInfo (userName, fullName, thedate, eventstartdate, thelocation, description, thecost, gradingformat, passingpercentage, eventtype, filename,status,reason) values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
			try {PreparedStatement stmt = conn.prepareCall(sql);
			//RID should auto increment, so this isnt necessary
			
			stmt.setString(1, form.getUserName());
			stmt.setString(2, form.getFullName());
			stmt.setDate(3, Date.valueOf(form.getTheDate()));
			stmt.setDate(4, Date.valueOf(form.getEventStartDate()));
			stmt.setString(5, form.getTheLocation());
			stmt.setString(6, form.getDescription());
			stmt.setDouble(7, form.getTheCost());
			stmt.setString(8, form.getGradingFormat());
			stmt.setString(9, form.getPassingPercentage());
			stmt.setString(10, form.getEventType());
			stmt.setString(11, form.getFileName());
			stmt.setString(12, "pending");
			stmt.setString(13, "");
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void removeForm(ERForm form) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
