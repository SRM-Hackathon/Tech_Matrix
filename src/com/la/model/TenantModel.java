package com.la.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.la.bean.TenantBean;
import com.la.common.Config;

public class TenantModel {
	
	 public boolean saveTenant(TenantBean bean) throws SQLException {
		  boolean flag=false;
		  Connection con=Config.getInstance().getConnection();
	      
	      String qr="INSERT INTO `tenant_details`(`dateOfEnterTen`, `fullnameTen`, `mobileNumTen`, "
	      		+ "`aadharCardNumten`, `tenantAddress`, `profilePath`,"
	      		+ " `fingerPPath`, `pincode`) VALUES (?,?,?,?,?,?,?,?)";
	      PreparedStatement ps=con.prepareStatement(qr);
	      ps.setString(1, bean.getDateOfEnterTen());
	      ps.setString(2, bean.getFullnameTen());
	      ps.setString(3, bean.getMobileNumTen());
	      ps.setString(4, bean.getAadharCardNumten());
	      ps.setString(5, bean.getTenantAddress());
	      ps.setString(6, bean.getProfilePath());
	      ps.setString(7, bean.getFingerPPath());
	      ps.setString(8, bean.getPincode());
	      int i=ps.executeUpdate();
			  if(i>0) {
				  flag=true;
			  }
			  
			 
	      return flag;
	  }
	 
	 
	 public List<TenantBean> getTenantList(Connection con){
			List<TenantBean> list=new ArrayList<TenantBean>();
			
			try{
				
				String qry="SELECT * FROM `tenant_details` ORDER BY `tenant_details`.`id` DESC";
				Statement statement =con.createStatement();
				ResultSet rs = statement.executeQuery(qry);
				
				while(rs.next())
				{ 
					TenantBean bean_obj = new TenantBean();
					//bean_obj.setId(rs.getInt(1));
					
					bean_obj.setDateOfEnterTen(rs.getString("dateOfEnterTen"));
					bean_obj.setFullnameTen(rs.getString("fullnameTen"));
					bean_obj.setMobileNumTen(rs.getString("mobileNumTen"));
					bean_obj.setAadharCardNumten(rs.getString("aadharCardNumten")); 
					bean_obj.setTenantAddress(rs.getString("tenantAddress")); 
					bean_obj.setProfilePath(rs.getString("profilePath"));
					bean_obj.setFingerPPath(rs.getString("fingerPPath"));
					bean_obj.setPincode(rs.getString("pincode"));
					
					list.add(bean_obj);
				}
				
			}
			catch(Exception e){
				e.printStackTrace();
				return list;
			}
			return list;
		}
}
