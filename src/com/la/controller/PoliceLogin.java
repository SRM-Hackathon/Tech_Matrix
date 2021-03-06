package com.la.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.la.common.Utilities;

/**
 * Servlet implementation class PoliceLogin
 */
@WebServlet("/PoliceLogin")
public class PoliceLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PoliceLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String email=Utilities.getParamValue(request,"email");
		String password=Utilities.getParamValue(request,"password");
		
		if(email.equals("admin@gmail.com" ) && password.equals("admin@123")) {
			HttpSession session =request.getSession();
			session.setAttribute("email",email);
			response.sendRedirect("PoliceVerification");
		}
		
		
	}

}
