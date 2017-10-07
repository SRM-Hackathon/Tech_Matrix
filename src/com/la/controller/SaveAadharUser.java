package com.la.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.la.bean.AdharBean;
import com.la.model.AadharModal;

@WebServlet("/SaveAadharUser")
public class SaveAadharUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public SaveAadharUser() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		try {
			AdharBean bean=new AdharBean(); 
			List<FileItem> formItems=new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
			long seconds=System.currentTimeMillis()/1000;

			
			if (formItems != null && formItems.size() > 0) {
				// iterates over form's fields
				for (FileItem item : formItems) {
		
					 String name=item.getFieldName();
			            if(name.equals("uidai")){
			                bean.setUidai(item.getString());
			            }else if(name.equals("nm")){
			            	bean.setNm(item.getString());
			                
			            }else if(name.equals("mob")){
			            	bean.setMob(item.getString());
			                
			            }else if(name.equals("uploadFile")){
			            	 
			            	 String uploadPath ="E:\\aadharUploads\\";
			            	 String fileName = seconds+new File(item.getName()).getName();
					         String filePath=uploadPath+fileName;
					         item.write(new File(uploadPath,fileName));
					         System.out.println(filePath);

								bean.setFilePath(filePath);
								// saves the file on disk
								request.setAttribute("message",
									filePath+"Upload has been done successfully!");
							
			            }
					
				}
				
			      response.setContentType("text/html;charset=UTF-8");
		    		PrintWriter out = response.getWriter();
		    		
		          AadharModal model=new  AadharModal();
		         boolean status= model.saveAdhar(bean);
		         if(status)
		         {
		        	 out.println("<h3>REGISTRATION COMPLETED</h3>");
				     out.println("<h4><a href=index.jsp>Home</a></h4>");
					 
		         }
		         else {
		        	 out.println("<h3>REGISTRATION NOT COMPLETED</h3>");
				     out.println("<h4><a href=index.jsp>Home</a></h4>");
		         }
		        
			}
		} catch (Exception ex) {
			request.setAttribute("message",
					"There was an error: " + ex.getMessage());
		}
		// redirects client to message page
		getServletContext().getRequestDispatcher("/message.jsp").forward(
				request, response);
	}

}
