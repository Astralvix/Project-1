package com.revature.service;

import java.time.LocalDate;

import com.revature.pojo.ERForm;

public interface FormService {
	
	public boolean checkDate(LocalDate currentDate, LocalDate courseStart);

}
