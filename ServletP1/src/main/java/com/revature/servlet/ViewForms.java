package com.revature.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.ERFormDao;
import com.revature.dao.ERFormDaoImpl;
import com.revature.pojo.ERForm;
import com.revature.service.FormService;
import com.revature.service.FormServiceImpl;

/**
 * Servlet implementation class ViewForms
 */
public class ViewForms extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ERFormDao ERFD = new ERFormDaoImpl();
	private static FormService FS = new FormServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewForms() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//IMPORTANT: leaves doGet method after a response is called.
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession();
		ObjectMapper om = new ObjectMapper();
		
		String loggedInAs;
		loggedInAs = session.getAttribute("username").toString();
		
		List<ERForm> forms = FS.myForms(loggedInAs);
		
		response.getWriter().write(om.writeValueAsString(forms));
		
//		RequestDispatcher rd = request.getRequestDispatcher("viewOwnedForms");
//		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
