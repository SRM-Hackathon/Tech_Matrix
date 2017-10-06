<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
		<form method="post" action="SaveAadharUser" enctype="multipart/form-data">
		 <pre>
            Aadhar Card Number       <input type="text" name="uidai"/>
            Name                     <input type="text" name="nm"/>
            Mobile                   <input type="text" name="mob"/>
            
            FingerPrint              <input type="file" name="uploadFile"/>
                                  
                                     <input type="submit" value="Upload"/>
         </pre>
		</form>
	</center>

</body>
</html>