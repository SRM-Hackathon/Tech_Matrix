package com.la.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.la.bean.TenantBean;
import com.la.common.Config;
import com.la.model.TenantModel;
import com.machinezoo.sourceafis.FingerprintMatcher;
import com.machinezoo.sourceafis.FingerprintTemplate;

@WebServlet("/PoliceSearch")
public class PoliceSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PoliceSearch() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
		List<FileItem> formItems=new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
        
        long seconds=System.currentTimeMillis()/1000;

        
        if (formItems != null && formItems.size() > 0) {
            // iterates over form's fields
            for (FileItem item : formItems) {
    
                 String name=item.getFieldName();
               if(name.equals("uploadFile")){
                         
                         String uploadPath ="E://policeSearch//";
                         String fileName = seconds+new File(item.getName()).getName();
                         String filePath=uploadPath+fileName;
                         try {
							item.write(new File(uploadPath,fileName));
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                         System.out.println(filePath);

                         try{
                             byte[] probeImage = Files.readAllBytes(Paths.get(filePath));
                             Connection con=Config.getInstance().getConnection();
                             TenantModel model=new TenantModel();
                             List<TenantBean> tb=model.getTenantList(con);
                             Iterator<TenantBean> itr=tb.iterator();
                             
                             while(itr.hasNext())
                             {
                            	 TenantBean bean=itr.next();
             				   String fingerPath=bean.getFingerPPath();
            				   String adharno=bean.getAadharCardNumten();
            				   byte[] candidateImage = Files.readAllBytes(Paths.get(fingerPath));
            				   
            				   
            				   
                               System.out.println("Finger Print Loaded");
                               FingerprintTemplate probe = new FingerprintTemplate(probeImage);
                               FingerprintTemplate candidate = new FingerprintTemplate(candidateImage);
                             
                               FingerprintMatcher matcher = new FingerprintMatcher(probe);
                               double score = matcher.match(candidate);
                                   System.out.println("score ="+score);
                               double threshold = 40;
                               boolean match = score >= threshold;
                               
                               if(match==true)
                               {    System.out.println(fingerPath+"Matched"+adharno);
                               HttpSession session=request.getSession();
                                    session.setAttribute("Aadhar", adharno);
                                        response.sendRedirect("searchsuccess.jsp");
                               }
                                
                                        }
                             
                             response.sendRedirect("policeTenant.jsp");
                             
                             //iterate
                            
                             //conpare probeimh
                            
                             
                             }
                             catch(Exception e)
                             {System.out.println(e);
                             }
                        
                    }
            }
        }
		}
	    catch (Exception e)
		{
	    	
		}
	}

}
