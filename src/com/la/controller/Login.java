package com.la.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	Connection con=Config.getInstance().getConnection();
	UserModel model =new UserModel();
	String verifyStatus=model.getVerifyStatus(con,email);
	if(verifyStatus.equals("1")) {
		
	}
	else {
		Utilities.generateOTP();
	}
	
	}

}
