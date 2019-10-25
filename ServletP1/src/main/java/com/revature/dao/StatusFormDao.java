package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.revature.pojo.StatusForm;

public interface StatusFormDao {
	
	public void CreateStatForm();
	
	public List<StatusForm> getAllStat();
	
	public void updateStatusManager(int r_id, String status);
	
	public void updateStatusDeptHead(int r_id, String status);
	
	public void updateStatusBenCo(int r_id, String status);
	
}
