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


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Register() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String otpentered=Utilities.getParamValue(request, "otpentered");
		HttpSession session=request.getSession();
		String otp_generated=(String)session.getAttribute("otp");
		if(otp_generated.equals(otpentered.trim())) {
			UserModel model=new UserModel();
			UserBean bean =(UserBean)session.getAttribute("userbean");
			Connection con=Config.getInstance().getConnection();
			boolean status=model.addUserDetails(con,bean);
			System.out.println("status added "+status);
		}
	}

}
