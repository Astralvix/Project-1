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
import com.revature.dao.MessageFormDaoImpl;
import com.revature.pojo.ERForm;
import com.revature.pojo.MessageForm;

import org.junit.*;
public class ServletTest {
	
	public static final ERFormDaoImpl formDaoImpl = new ERFormDaoImpl();
	public static final MessageFormDaoImpl msgFormDaoImpl = new MessageFormDaoImpl();
	
	private List<MessageForm> messageForm = new ArrayList();
	private List<ERForm> ERFormList = new ArrayList<ERForm>();

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
	public void getERFormsByTestUser() {
		ERFormList.add(new ERForm(4, "test", "test", LocalDate.of(2019, 10, 01), LocalDate.of(2019, 10, 31), "test", "test", 1.0, "100%-90%", "1", "test", "", "", "pending"));
		assertEquals(ERFormList, formDaoImpl.getMyForms("test"));
	}
	
	@Test
	public void getMessagesForTestUser() {
		messageForm.add(new MessageForm());
		assertEquals(messageForm, msgFormDaoImpl.getMyMsg("test"));
	}

}
