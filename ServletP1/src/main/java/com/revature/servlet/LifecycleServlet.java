package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Servlet Lifecycle:
*init - Initializes the servlet in the servlet container (web container)
*	Called once - either on first request(default) or on start
*
*	service- Handles a request to this servlet. Basically forwards request to appropriate method(doGet,doPost..etc) 
*			- called on every request to the servlet
*			NOTE: this method is abstract in GenericServlet
*			NOTE: this method is implemented in HttpServlet
*
* destroy - Destroys the servlet
* 		-Typically called when the servlet container stops/restarts
* 		-Most likely not called during normal operations
* 
*/

public class LifecycleServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside deGet of Lifecycle Servlet");
		resp.getWriter().write("<h1>Success</h1>");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("LifecycleServlet is servicing a request");
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("LifecycleServlet is being destroyed");
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Its being created");
		// TODO Auto-generated method stub
		super.init();
	}
	
	

}
