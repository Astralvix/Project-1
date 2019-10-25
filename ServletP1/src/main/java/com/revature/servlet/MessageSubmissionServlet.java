package com.revature.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.dao.MessageFormDao;
import com.revature.dao.MessageFormDaoImpl;
import com.revature.pojo.MessageForm;
import static com.revature.util.LoggerUtil.*;

/**
 * Servlet implementation class MessageSubmissionServlet
 */
public class MessageSubmissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static MessageFormDao MFD = new MessageFormDaoImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageSubmissionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		info("Inside the message servlet");
		HttpSession session = request.getSession();
		session.getAttribute("username");
		if(session !=null ){
			MessageForm msg = new MessageForm();
			String sender_user = session.getAttribute("username").toString();
			String rec_user = request.getParameter("requestuser");
			String message = request.getParameter("infomessage");
			LocalDate today = LocalDate.now();
			
			msg.setSender_user(sender_user);
			msg.setRec_user(rec_user);
			msg.setMessages(message);
			msg.setSendDate(today);
			MFD.createMsgForm(msg);
			
			response.sendRedirect("handleRequestsPage.html");
			
		}
	
	}

}
