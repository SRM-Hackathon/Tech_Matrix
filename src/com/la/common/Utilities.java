package com.la.common;

import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

public class Utilities {
	

	public static String getParamValue(HttpServletRequest request,String TAG)
	{
		String tag_value = "";
		try
		{
			tag_value = request.getParameter(TAG);
			if(tag_value != null)
			return tag_value;
			else
			return "";	
		} 
		catch (Exception e)
		{
			return "";
		}
		
	}
	
	

	public static String generateOTP()
	    {    
	        String OTP="";
	        //Generating OTP
	       String numberss = "0123456789";

	       // Using random method
	       Random rndm_method = new Random();

	       char[] otp = new char[5];
	       for (int i = 0; i < 5; i++)
	      {
	       otp[i] =  numberss.charAt(rndm_method.nextInt(numberss.length()));
	      }

	      

	        for (Character c : otp)
	        OTP += c.toString();
	        System.out.println("EmailOTp="+OTP);
	        return OTP;
	    }
	
	
	public  static boolean sendMail(String EmailOTP, String Email)
    {
        boolean flag=false;
        
    //      Message Sending Starts  
       //Sending Mail  s            
       String from= "Neerajvyas615@gmail.com";
       String password ="9644272667";
       String to=Email; //Email Entered in Form
       String sub="OTP";
       String msg="Your OTP is "+EmailOTP+" for Email verification.";
                     
       Properties props = new Properties();    
   props.put("mail.smtp.host", "smtp.gmail.com");    
   props.put("mail.smtp.socketFactory.port", "465");    
   props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");    
   props.put("mail.smtp.auth", "true");    
   props.put("mail.smtp.port", "465");    
  //get Session  
   Session ses = Session.getDefaultInstance(props,    
   new javax.mail.Authenticator() {    
   protected PasswordAuthentication getPasswordAuthentication() {    
   return new PasswordAuthentication(from,password);  
   }    
  });    
  //compose message    
  try {    
   MimeMessage message = new MimeMessage(ses);    
   message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
   message.setSubject(sub);    
   message.setText(msg);    
   //send message  
   Transport.send(message);    
   System.out.println("message sent successfully");
   
   flag=true;
 
  } catch (MessagingException e) {throw new RuntimeException(e);} 

    
        return flag;
    }
	

}
