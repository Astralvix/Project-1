package com.revature.service;

import java.time.LocalDate;
import java.util.List;

import com.revature.pojo.ERForm;

public interface FormService {
	
	public boolean checkDate(LocalDate currentDate, LocalDate courseStart);

	public List<ERForm> myForms(String username);
	
}
