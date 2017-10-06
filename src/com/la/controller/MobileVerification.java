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
import com.la.common.Constant;
import com.la.common.Utilities;
import com.la.model.UserModel;

/**
 * Servlet implementation class MobileVerification
 */
@WebServlet("/MobileVerification")
public class MobileVerification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MobileVerification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String otpentered=Utilities.getParamValue(request, "otpenteredsms");
	   	HttpSession session=request.getSession();
	    String otp_generated=(String)session.getAttribute("OTP");
	    if(otp_generated.equals(otpentered.trim())) {
			UserModel model=new UserModel();
			UserBean bean =(UserBean)session.getAttribute("userbean");
			Connection con=Config.getInstance().getConnection();
			bean.setMobile_verify_status("1");
			
			boolean status=model.updateUserDetails(con,bean);
			System.out.println("status added "+status);
			if(status) {
			response.sendRedirect("la_user_home.jsp");
			}
			else {
				response.sendRedirect("index.jsp");
			}
		}
	    
	   	
	
	}

}
