package com.la.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.la.bean.UserBean;
import com.la.common.Constant;


public class UserModel {
	
	public boolean addUserDetails(Connection con,UserBean bean){
		boolean status=false;
		try{
			String qry="INSERT INTO `la_users`(`fullname`, `aadhar`, `mobile`, `email`,"
					+ " `state`, `city`, `hou_ap_no`, `street`, `pincode`, `near_police`, "
					+ "`password`, `email_verify_status`, `mobile_verify_status`) "
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(qry);
			ps.setString(1,bean.getFullname());
			ps.setString(2,bean.getAadhar());
			ps.setString(3, bean.getMobile());
			ps.setString(4,bean.getEmail());
			ps.setString(5,bean.getState());
			ps.setString(6,bean.getCity());
			ps.setString(7, bean.getHou_ap_no());
			ps.setString(8,bean.getStreet());
			ps.setString(9, bean.getPincode());
			ps.setString(10,bean.getNear_police());
			ps.setString(11, bean.getPassword());
			ps.setString(12, bean.getEmail_verify_status());
			ps.setString(13, bean.getMobile_verify_status());
			
			int i=ps.executeUpdate();
			if(i>0){
				status=true;
				Constant.message = "Registered Successfully";
			}
			else{
				Constant.message = "Registration not Success";
			}
		}
		catch(Exception e){
			e.printStackTrace();
			Constant.message = "Registration not Success";
			return status;
			
		}
		
		return status;
	}
	
	
	public String getVerifyStatus(Connection con,String email) {
			String response="0";
			try
			{
				String qry = "SELECT mobile_verify_status FROM `la_users` WHERE email="+email;
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery(qry);
				if(rs.next()) {
					response =rs.getString(1);
				}
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
				return response;
			}
			return response;
	}
	 

}
