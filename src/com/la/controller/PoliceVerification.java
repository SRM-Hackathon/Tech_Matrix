package com.la.controller;

import java.io.IOException;
import java.nio.file.Paths;

import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.machinezoo.sourceafis.FingerprintMatcher;

import com.machinezoo.sourceafis.FingerprintTemplate;

@WebServlet("/PoliceVerification")
public class PoliceVerification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PoliceVerification() {
        super();   
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try{
			
		       byte[] probeImage = Files.readAllBytes(Paths.get("C:\\Users\\Neo\\Desktop\\Sample Finger print\\RTFP1.png"));
		       byte[] candidateImage = Files.readAllBytes(Paths.get("C:\\Users\\Neo\\Desktop\\Sample Finger print\\RTFP2.png"));
		       System.out.println("Finger Print Loaded");
		       FingerprintTemplate probe = new FingerprintTemplate(probeImage);
		       FingerprintTemplate candidate = new FingerprintTemplate(candidateImage);
		     
		       FingerprintMatcher matcher = new FingerprintMatcher(probe);
		       double score = matcher.match(candidate);
		           System.out.println("score ="+score);
		       double threshold = 40;
		       boolean match = score >= threshold;
		       
		       if(match==true)
		               System.out.println("Matched");
		       else
		           System.out.println("Not Matched");
		       
		       }
		       catch(Exception e)
		       {System.out.println(e);
		       }
	}

}
