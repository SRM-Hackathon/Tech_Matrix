package com.la.common;

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
	

}
