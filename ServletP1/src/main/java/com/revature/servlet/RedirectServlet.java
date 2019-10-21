package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {

	/* Redirect 
	 * -give  url to a new resource
	 * -response will tell the client to send another request for this resource
	 * -Pro: is aware of new url
	 * -Cons: slower, loss of request scope*/
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside of deGet of RedirectServlet");
		resp.sendRedirect("hello");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Inside doPost of RedirectServlet");
	resp.sendRedirect("hello");
	}
	
		
	
	
	
}
