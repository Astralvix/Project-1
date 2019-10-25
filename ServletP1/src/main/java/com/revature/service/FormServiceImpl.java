package com.revature.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import com.revature.dao.ERFormDao;
import com.revature.dao.ERFormDaoImpl;
import com.revature.pojo.ERForm;

public class FormServiceImpl implements FormService{

	private static ERFormDao formDao = new ERFormDaoImpl();

	@Override
	public boolean checkDate(LocalDate currentDate, LocalDate courseStart) {
		// TODO Auto-generated method stub
		long days = ChronoUnit.DAYS.between(currentDate, courseStart);
		System.out.println("Number of days: "+ days);
		if(days >= 8) {
		return true;
	}
		return false;
	}

	@Override
	public List<ERForm> myForms(String username) {
		
		return formDao.getMyForms(username);
	}

	@Override
	public List<ERForm> getThemAll() {
		// TODO Auto-generated method stub
		return formDao.getAllForms();
	}	
	
	
}
