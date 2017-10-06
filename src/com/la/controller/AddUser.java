package com.la.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.la.bean.UserBean;
import com.la.common.Config;
import com.la.common.Utilities;
import com.la.model.UserModel;


@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddUser() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean bean=new UserBean();
		bean.setFullname(Utilities.getParamValue(request,"fullname"));
		bean.setAadhar(Utilities.getParamValue(request,"aadhar"));
		bean.setMobile(Utilities.getParamValue(request,"mobile"));
		bean.setEmail(Utilities.getParamValue(request,"email"));
		bean.setState(Utilities.getParamValue(request,"state"));
		bean.setCity(Utilities.getParamValue(request,"city"));
		bean.setHou_ap_no(Utilities.getParamValue(request,"hou_ap_no"));
		bean.setStreet(Utilities.getParamValue(request,"street"));
		bean.setPincode(Utilities.getParamValue(request,"pincode"));
		bean.setNear_police(Utilities.getParamValue(request,"near_police"));
		bean.setPassword(Utilities.getParamValue(request,"password"));
		bean.setEmail_verify_status("0");
		bean.setMobile_verify_status("0");
		
		Connection con=Config.getInstance().getConnection();
		UserModel model=new UserModel();
		model.addUserDetails(con, bean);
	

		
	}

}
