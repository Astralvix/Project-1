package com.revature.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.dao.ERFormDaoImpl;
import com.revature.pojo.ERForm;

import org.junit.*;
public class ServletTest {
	
	public static final ERFormDaoImpl formDaoImpl = new ERFormDaoImpl();
	
	private List<ERForm> ERFormList = new ArrayList<ERForm>();
	private LocalDate testDate; 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getERFormsByErik() {
		ERFormList.add(new ERForm(0, "test", "test", date, , null, null, 0, null, null, null, null, null, null));
		assertEquals(ERFormList, formDaoImpl.getMyForms("testUser"));
	}

}
