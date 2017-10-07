package com.la.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.la.bean.AdharBean;
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
}
