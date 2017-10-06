package com.la.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.la.bean.UserBean;
import com.la.common.Config;
import com.la.common.Utilities;
import com.la.model.UserModel;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	
	String email=Utilities.getParamValue(request,"email");
	String password=Utilities.getParamValue(request,"password");
	
	UserBean bean =new UserBean();
	bean.setEmail(email);
	bean.setPassword(password);
	
	Connection con=Config.getInstance().getConnection();
	UserModel model =new UserModel();
	String verifyStatus=model.getVerifyStatus(con,email);
//check pass
	boolean status=model.checkEmailPassword(con, bean);
	System.out.println("statyus"+status);
	if(status) {
		if(verifyStatus.equals("0")) {
		String otp_generated=Utilities.generateOTP();
		boolean mobStatus=UserModel.sendMobileOTP(con,otp_generated,bean);
		System.out.println(mobStatus);
			if(mobStatus) {
				HttpSession session =request.getSession();
				session.setAttribute("OTP", otp_generated);
				session.setAttribute("userbean", bean);
				response.sendRedirect("verifyMobile.jsp");
			}
			
		}
		else {
			response.sendRedirect("la_user_home.jsp");
		 }
	}
	else {
		
		response.sendRedirect("index.jsp");
	}
	
	
	}

}
