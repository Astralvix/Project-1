package com.revature.dao;

import java.util.List;

import com.revature.pojo.ERForm;

public interface ERFormDao {

	public List<ERForm> getAllForms();
	
	public ERForm getSpecificForm(int RID);
	
	public List<ERForm> getMyForms(String username);
	
	public void createForm(ERForm form);
	
	//For employee, not managers
	public void removeForm(ERForm form);
	
	public void updateStatusER(int r_id, String status, String reason);
}
