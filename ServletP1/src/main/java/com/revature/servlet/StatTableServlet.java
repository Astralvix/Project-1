package com.revature.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.ERFormDao;
import com.revature.dao.ERFormDaoImpl;
import com.revature.dao.StatusFormDao;
import com.revature.dao.StatusFormDaoImpl;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoFake;
import com.revature.pojo.StatusForm;
import com.revature.pojo.User;
import static com.revature.util.LoggerUtil.*;

/**
 * Servlet implementation class StatTableServlet
 */
public class StatTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static StatusFormDao SFD = new StatusFormDaoImpl();
	private static UserDao UD = new UserDaoFake();
	private static ERFormDao ERFD = new ERFormDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatTableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper om = new ObjectMapper();
		List<StatusForm> statForm = SFD.getAllStat();
		response.setContentType("text/plain");
		response.getWriter().write(om.writeValueAsString(statForm));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		session.getAttribute("username");
		if(session !=null ){
			
		String userName = session.getAttribute("username").toString();
		User user = UD.getUser(userName);
		int r_id = Integer.parseInt((request.getParameter("requestuser")));
		String accepted_btn = request.getParameter("accepted_button");
		String rejected_btn = request.getParameter("rejected_button");
		String msg = request.getParameter("infomessage");
		info(accepted_btn);
		info(rejected_btn);
		if(user.getRole().equals("manager")) {
			if(accepted_btn != null) {
				info("accepted is not null");
				SFD.updateStatusManager(r_id, accepted_btn);
			}else {
				info("somethings wrong");
				SFD.updateStatusManager(r_id, rejected_btn);
			}
		}
			if(user.getRole().equals("depthead")) {
				if(accepted_btn != null) {
					info("accepted is not null");
					SFD.updateStatusDeptHead(r_id, accepted_btn);
				}else {
					info("somethings wrong");
					SFD.updateStatusDeptHead(r_id, rejected_btn);
				
			}
		}
				if(user.getRole().equals("benco")){
						if(accepted_btn != null) {
							info("accepted is not null");
							info("in benco acc");
							SFD.updateStatusBenCo(r_id, accepted_btn);
							ERFD.updateStatusER(r_id, accepted_btn, msg);
						}else {
							info("somethings wrong");
							info("in benco rejected");
							SFD.updateStatusBenCo(r_id, rejected_btn);
							ERFD.updateStatusER(r_id, rejected_btn, msg);
						}
					}
		response.sendRedirect("manageForms.html");
		}
	}
}
