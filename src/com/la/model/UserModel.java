package com.la.model;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.URLConnection;
import java.net.URL;
import java.net.URLEncoder;
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
	 
	
	public boolean checkEmailPassword(Connection con,UserBean bean)
    { 
        boolean flag=false;
        String email_entered=  bean.getEmail();
        String pass_entered= bean.getPassword(); 
        
        
        try {
            Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select password from la_users where email ='"+email_entered+"'");
            
             if(rs.next())
             {//mil gaya
                 if(rs.getString(1).equals(pass_entered))
                 {
                     flag=true;
                     System.out.println("Email and Password entered are correct");
                 }
                 else
                 {
                	 Constant.message = "Invalid credentials"; 
                     System.out.println("Wrong Password entered");
                 } 
                 
             }
             else
             {//nhi mila
                 System.out.println("Wrong Email Entered");
             }
             
             
        //     con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        
        
        return flag;
    }
	
	
	public static  boolean sendMobileOTP(Connection con, String OTPSMS , UserBean bean)
    {
        boolean flag=false;
        
        try 
        {
             
             String email_entered=  bean.getEmail();
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                
              ResultSet rs = stmt.executeQuery("select mobile from la_users where email='"+email_entered+"'");
              
            boolean nextrowvalid=  rs.next();
            
              if(nextrowvalid) {
                String  Mobilenumber= rs.getString(1);
              
    /*
        // Message Sending Starts               
        // Construct data for sending message on mobile
        String apiKey = "apikey=" + URLEncoder.encode("OToFOR6ELr0-laL2neZP5qiyr15e4fYXOmRnpd9GQt", "UTF-8");
                   String user="&username="+URLEncoder.encode("Neerajvyas615@gmail.com", "UTF-8");
        String hash="&hash="+URLEncoder.encode("b000afa1bbab72d3edf57cf41cc90466eeaf32eb76a41ef4e859a18f062cb534", "UTF-8");
                   String password="&password="+URLEncoder.encode("Neo9644272667", "UTF-8");
                   String message = "&message=" + URLEncoder.encode("Your OTP is "+OTPSMS+" came from LAW-AUTOMATON Website.", "UTF-8");
        String sender = "&sender=" + URLEncoder.encode("TXTLCL", "UTF-8");
        String numbers = "&numbers=" + URLEncoder.encode("91"+Mobilenumber, "UTF-8");
        // Send data
        String data = "https://api.textlocal.in/send/?" + apiKey + user +hash+ password + numbers + message + sender ;
        URL url = new URL(data);
        URLConnection conn = url.openConnection();
        conn.setDoOutput(true);
        
        // Get the response
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        String sResult="";
        while ((line = rd.readLine()) != null) {
        // Process line...
            sResult=sResult+line+" ";
        }
        rd.close();
        
                 System.out.println(""+sResult);
     // Msg Sending Ends
     
        */   
    
     System.out.println("OTP ="+OTPSMS);           
               flag=true;  
              }    
              
             // con.close();
        }
        catch (Exception e)
        {
            
        }
        
    
    
        return flag;
    }

}
