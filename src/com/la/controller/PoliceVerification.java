package com.la.controller;

import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.nio.file.Files;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.la.bean.AdharBean;
import com.la.bean.TenantBean;
import com.la.common.Config;
import com.la.model.AadharModal;
import com.la.model.TenantModel;
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
			Connection con = Config.getInstance().getConnection();
			TenantModel model=new TenantModel();
			List<TenantBean> list=model.getTenantList(con);
			Iterator<TenantBean> itr=list.iterator();
			
			List<TenantBean> verified=new ArrayList<>();
			List<TenantBean> notverfied=new ArrayList<>();
			
			while(itr.hasNext())
			{
				TenantBean bean=itr.next();
				String fingerPath=bean.getFingerPPath();
				String adharno=bean.getAadharCardNumten();
				
				byte[] probeImage = Files.readAllBytes(Paths.get(fingerPath));
				AadharModal admodel=new AadharModal();
				String filepath=admodel.getAdharList(adharno,con);
					byte[] candidateImage = Files.readAllBytes(Paths.get(filepath));
					  
					  FingerprintTemplate probe = new FingerprintTemplate(probeImage);
				      FingerprintTemplate candidate = new FingerprintTemplate(candidateImage);
				      
				      FingerprintMatcher matcher = new FingerprintMatcher(probe);
				       double score = matcher.match(candidate);
				           System.out.println("score ="+score);
				       double threshold = 40;
				       boolean match = score >= threshold;
				       
				       if(match==true) {
				               System.out.println(filepath+"Matched"+fingerPath);
				              verified.add(bean);
				       }				    
				       else {
				           System.out.println(filepath+"Not Matched"+fingerPath);
				           	notverfied.add(bean);
				       }
					     
				
				
				
			}
			request.setAttribute("list", verified.toArray());
			request.setAttribute("nlist", notverfied.toArray());
			RequestDispatcher rd=request.getRequestDispatcher("policeTenant.jsp");
			rd.forward(request, response);
		
			
		       }
		       catch(Exception e)
		       {System.out.println(e);
		       }
	}

}
