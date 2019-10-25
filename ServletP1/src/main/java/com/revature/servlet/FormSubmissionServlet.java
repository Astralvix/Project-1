package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.dao.ERFormDao;
import com.revature.dao.ERFormDaoImpl;
import com.revature.dao.StatusFormDao;
import com.revature.dao.StatusFormDaoImpl;
import com.revature.pojo.ERForm;
import com.revature.pojo.StatusForm;
import com.revature.service.FormService;
import com.revature.service.FormServiceImpl;
import static com.revature.util.LoggerUtil.*;

/**
 * Servlet implementation class FormSubmissionServlet
 */
public class FormSubmissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static FormService ERFS = new FormServiceImpl();
    private static ERFormDao ERFD = new ERFormDaoImpl();
    private static StatusFormDao SFD = new StatusFormDaoImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormSubmissionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //Creating/submitting a new form
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		session.getAttribute("username");
		if(session !=null ){
			trace("Inside the submit servlet");
		response.getWriter().write("Inside The Submit Servlet");
		System.out.println("We made it!");
		ERForm form = new ERForm(); 
		String userName = session.getAttribute("username").toString(); //get username here
		String fullName = request.getParameter("fullName");
		LocalDate theDate = LocalDate.parse(request.getParameter("currentdate"));
		LocalDate eventStartDate = LocalDate.parse(request.getParameter("coursestart"));
		String thelocation = request.getParameter("location");
		String eventType = request.getParameter("event");
		String description = request.getParameter("desc");
		Double theCost = Double.parseDouble(request.getParameter("cost"));
		String fileName = request.getParameter("certifyFile");
		String gradingFormat = request.getParameter("grade");
		String passingPercentage = request.getParameter("passingScore");
		
		
		  form.setUserName(userName);
		  form.setFullName(fullName);
		  form.setTheDate(theDate); 
		  form.setEventStartDate(eventStartDate);
		  form.setEventType(eventType);
		  form.setTheLocation(thelocation);
		  form.setDescription(description);
		  form.setTheCost(theCost); 
		  form.setFileName(fileName);
		  form.setGradingFormat(gradingFormat);
		  form.setPassingPercentage(passingPercentage);
		 
		  boolean check = ERFS.checkDate(form.getTheDate(), form.getEventStartDate());
		if(check == true) {
			System.out.println("There is a more than a week difference");
			ERFD.createForm(form);
			SFD.CreateStatForm();
			response.sendRedirect("home.html");
		}else {
			System.out.println("There is less then a week difference");
			response.sendRedirect("ERF.html");
		}
		
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * HttpSession session = request.getSession();
		 * 
		 * String loggedInAs;
		 * 
		 * loggedInAs = session.getAttribute("username").toString();
		 */
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
