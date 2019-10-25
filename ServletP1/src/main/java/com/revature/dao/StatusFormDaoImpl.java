package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pojo.StatusForm;
import com.revature.util.ConnectionFactory;
import static com.revature.util.LoggerUtil.*;
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

	@Override
	public List<StatusForm> getAllStat() {
		// TODO Auto-generated method stub
		String sql = "select * from project1.status;";
		PreparedStatement stmt;
		List<StatusForm> allStatForm = new ArrayList<StatusForm>();
		
		try {
			stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				StatusForm ST = new StatusForm();
				ST.setRID_status(rs.getInt(1));
				ST.setManager_stat(rs.getString(2));
				ST.setDeptHead_stat(rs.getString(3));
				ST.setBenCo_stat(rs.getString(4));
				allStatForm.add(ST);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allStatForm;
	}

	@Override
	public void updateStatusManager(int r_id, String status) {
		// TODO Auto-generated method stub
		String sql = "update project1.status set manager_status = ? where rid_status = ?;";
		PreparedStatement stmt;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, status);
			stmt.setInt(2, r_id);
			stmt.executeUpdate();
			info("Status for manager has been updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStatusDeptHead(int r_id, String status) {
		// TODO Auto-generated method stub
		String sql = "update project1.status set depthead_status = ? where rid_status = ?;";
		PreparedStatement stmt;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, status);
			stmt.setInt(2, r_id);
			stmt.executeUpdate();
			info("Status for depthead has been updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStatusBenCo(int r_id, String status) {
		// TODO Auto-generated method stub
		String sql = "update project1.status set benco_status = ? where rid_status = ?;";
		PreparedStatement stmt;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, status);
			stmt.setInt(2, r_id);
			stmt.executeUpdate();
			info("Status for benco has been updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
