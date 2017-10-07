package com.la.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.la.bean.AdharBean;
import com.la.bean.TenantBean;
import com.la.common.Config;

public class AadharModal {

	  public boolean saveAdhar(AdharBean bean) throws SQLException {
		  boolean flag=false;
		  Connection con=Config.getInstance().getConnection();
	      
	      String qr="INSERT INTO `aadhar_data`(`uidai`, `nm`, `mob`, `filePath`) VALUES (?,?,?,?)";
	      PreparedStatement ps=con.prepareStatement(qr);
	      ps.setString(1, bean.getUidai());
	      ps.setString(2, bean.getNm());
	      ps.setString(3, bean.getMob());
	      ps.setString(4, bean.getFilePath());
	      int i=ps.executeUpdate();
			  if(i>0) {
				  flag=true;
			  }
			  
			 
	      return flag;
	  }
	  
	  
	  
		 public String getAdharList(String adharno,Connection con){
				//List<AdharBean> list=new ArrayList<AdharBean>();
				String filepath="";
				try{
					
					String qry="SELECT filePath FROM `aadhar_data` where uidai='"+adharno+"'";
					Statement statement =con.createStatement();
					ResultSet rs = statement.executeQuery(qry);
					
					if(rs.next())
					{ 
						//AdharBean bean_obj = new AdharBean();
						//bean_obj.setId(rs.getInt(1));
						
						filepath=rs.getString("filePath");
						
						
					}
					
				}
				catch(Exception e){
					e.printStackTrace();
					return filepath ;
				}
				return filepath;
			}
}
