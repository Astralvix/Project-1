package com.revature.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.revature.pojo.ERForm;

public class FormServiceImpl implements FormService{


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
}
