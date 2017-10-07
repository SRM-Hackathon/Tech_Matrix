package com.la.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.la.bean.TenantBean;
import com.la.common.Constant;
import com.la.model.TenantModel;


@WebServlet("/TenantController")
public class TenantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TenantController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	 }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			TenantBean bean =new TenantBean();
//			dateOfEnterTen fullnameTen mobileNumTen aadharCardNumten tenantAddress PhotoTen FingerPrintTen pincode
			try {
				
			
			List<FileItem> formItems=new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);

			long seconds=System.currentTimeMillis()/1000;

			if (formItems != null && formItems.size() > 0) {

			for (FileItem item : formItems)

			{ String name=item.getFieldName();

				if(name.equals("dateOfEnterTen")){
	
				bean.setDateOfEnterTen(item.getString());
	
				}else if(name.equals("fullnameTen")){
	
				bean.setFullnameTen(item.getString());
				}
				else if(name.equals("mobileNumTen")){
					
					bean.setMobileNumTen(item.getString());
					
			    }else if(name.equals("aadharCardNumten")){
					
					bean.setAadharCardNumten(item.getString());
					
			    }else if(name.equals("tenantAddress")){
					
					bean.setTenantAddress(item.getString());
					
			    }else if(name.equals("PhotoTen")){
					
			    	String uploadPath ="E://useruploads";

			    	String fileName = seconds+new File(item.getName()).getName();

			    	String filePath=uploadPath+fileName;

			    	item.write(new File(uploadPath,fileName));

			    	System.out.println(filePath);

			    	bean.setProfilePath(filePath);
					
			    }else if(name.equals("FingerPrintTen")){
			    	
			    	String uploadPath ="E://useruploads";

			    	String fileName = seconds+new File(item.getName()).getName();

			    	String filePath=uploadPath+fileName;

			    	item.write(new File(uploadPath,fileName));

			    	System.out.println(filePath);

			    	bean.setFingerPPath(filePath);
				
					
			    }else if(name.equals("pincode")){
					
					bean.setPincode(item.getString());
			    }
				
				
				
				
			}
			}
			
			TenantModel tm=new TenantModel();
			boolean status=tm.saveTenant(bean);
			if(status) {
				Constant.message="Tenant Information Send Successfully";
				response.sendRedirect("home.jsp");
			}
			
			}
			catch (Exception e)
			{System.out.print(e);}
	}

}

