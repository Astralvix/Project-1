package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.revature.pojo.StatusForm;

public interface StatusFormDao {
	
	public void CreateStatForm();
	
	public List<StatusForm> getAllStat();
	
}
