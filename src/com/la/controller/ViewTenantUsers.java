package com.la.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.la.bean.TenantBean;
import com.la.bean.UserBean;
import com.la.common.Config;
import com.la.common.Constant;
import com.la.model.TenantModel;

import javax.servlet.http.HttpSession;


@WebServlet("/ViewTenantUsers")
public class ViewTenantUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ViewTenantUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		 UserBean bean = (UserBean) session.getAttribute("userbean");
		  	String email=bean.getEmail();

		if(email==null)
		{
			response.sendRedirect(Constant.BASE_URL);
		}
		else
		{
		
		Connection con = Config.getInstance().getConnection();
		TenantModel model=new TenantModel();
		List<TenantBean> list=model.getTenantList(con);
		
		System.out.println("size--->"+list.size());
		

		request.setAttribute("list", list.toArray());
		
		RequestDispatcher rd=request.getRequestDispatcher("viewTenant.jsp");
		rd.forward(request, response);
		}
	}

}
