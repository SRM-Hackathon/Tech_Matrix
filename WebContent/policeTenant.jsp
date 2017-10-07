
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.la.model.*"%>
<%@page import="com.la.bean.UserBean"%>
<%@page import="com.la.common.Constant"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.la.model.*"%>
	 <%
      if(session.getAttribute("email") == null){
    	  response.sendRedirect(Constant.BASE_URL);
      }else{
    	  String email=(String)session.getAttribute("email");
    	   
      %>
  <!DOCTYPE html>

<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Law Automaton</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="./bower_components/bootstrap/dist/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="./bower_components/font-awesome/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="./bower_components/Ionicons/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="./dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="./dist/css/skins/_all-skins.min.css">
  
  <!-- iCheck -->
  <link rel="stylesheet" href="./plugins/iCheck/square/blue.css">

 
  <!-- Google Font -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    <a href="#" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>L</b>AW</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Law</b>-Automaton</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </a>

      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
         
          
         
          <!-- Control Sidebar Toggle Button -->
          <li>
           <a href="LogoutController" class="btn btn-block btn-success" role="button">Logout</a>
          </li>
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  
 <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
     
       
       
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu" data-widget="tree">
     

        <li class="header">MAIN NAVIGATION</li>
        
        <li>
           <a href="#">    <span> <%= email %> </span> </a>
          <a href="#"><i class="fa fa-circle text-success"> </i> Online</a>
           
        </li> 
         <li><a href="home.jsp"><i class="fa fa-user"></i>User Home</a></li> 
       
        <li class="treeview">
           <a href="#">
            <i class="fa fa-fw fa-external-link-square"></i>   <span>Tenant Form</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
           <li><a href="tenantForm.jsp"><i class="fa fa-link"></i>Tenant form</a></li>            
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
           <i class="fa fa-fw fa-external-link-square"></i> <span>Hostel Form</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          
           <ul class="treeview-menu">
            <li><a href="hostelForm.jsp"><i class="fa fa-link"></i>Hostel form</a></li>            
          </ul>
        </li>
       <li class="treeview">
          <a href="#">
            <i class="fa fa-fw fa-external-link-square"></i> <span>Hotel Form</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
           <ul class="treeview-menu">
            <li><a href="hotelForm.jsp"><i class="fa fa-link"></i>Hotel form</a></li>            
          </ul>
        </li>
       
       
       <li class="treeview">
          <a href="#">
            <i class="fa fa-fw fa-external-link-square"></i><span>Contractor Form</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
           <ul class="treeview-menu">
            <li><a href="contractorForm.jsp"><i class="fa fa-link"></i> Contractor form</a></li>            
          </ul>
        </li>
        
        <li class="treeview">
          <a href="#">
           <i class="fa fa-fw fa-external-link-square"></i> <span>Servant Form</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
           <ul class="treeview-menu">
             <li><a href="servantForm.jsp"><i class="fa fa-link"></i>Servant form</a></li>            
          </ul>
        </li>
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>
<%
			}
		%>  
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    	<div class="box-body">
					     <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Search By Finger Print</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form role="form"  action="PoliceSearch" method="POST"  enctype="multipart/form-data" >
              <div class="box-body">
               
                <div class="form-group">
                  <label for="exampleInputFile">File input</label>
                  <input type="file" name="uploadFile" id="exampleInputFile">

                  <p class="help-block">Upload Image Of Print. </p>
                </div>
                
              </div>
              <!-- /.box-body -->
					<%
							String message = Constant.message;
							System.out.println(message);
  							if (message.equals("No records Found")) {
						%>
						<h4>
							<font color="red">No records Found</font>
						</h4>
						<%
							Constant.message = "";
							}%>
              <div class="box-footer">
                <button type="submit" class="btn btn-primary">Submit</button>
              </div>
            </form>
          </div>
          </div>
     <div class="row">
      
        
        
         <section class="content">
					<h2>Verified Tenants</h2>
				
						<table id="example1" class="table table-bordered table-striped">
							<thead>
							<th>Date of Entrance
							</th>
							<th>
										Name
							</th>
							<th>
									Mobile No.
							</th>
							<th>
							Aadhar Card
							</th>
							<th>
							Address
							</th>
							<th>
							Pincode
							</th>
							</thead>
								<c:forEach items="${list}" var="item">
									<tr>

										<td><c:out value="${item.dateOfEnterTen}" /></td>
										<td><c:out value="${item.fullnameTen}" /></td>
										<td><c:out value="${item.mobileNumTen}" /></td>
										<td><c:out value="${item.aadharCardNumten}" /></td>
										<td><c:out value="${item.tenantAddress}"></c:out></td>
										<td><c:out value="${item.pincode}"></c:out></td>


										<%-- 		<td><center>
												<a href="EditUser?id=<c:out value="${item.id}" />"><i
													class="fa fa-fw fa-edit"></i></a>
											</center></td> --%>

									</tr>
								</c:forEach>

							
						</table>
						
						
						<h2>Not Verified List</h2>
						
						
						<table id="example1" class="table table-bordered table-striped">
							<thead>
							<th>Date of Entrance
							</th>
							<th>
										Name
							</th>
							<th>
									Mobile No.
							</th>
							<th>
							Aadhar Card
							</th>
							<th>
							Address
							</th>
							<th>
							Pincode
							</th>
							</thead>
								<c:forEach items="${nlist}" var="item">
									<tr>

										<td><c:out value="${item.dateOfEnterTen}" /></td>
										<td><c:out value="${item.fullnameTen}" /></td>
										<td><c:out value="${item.mobileNumTen}" /></td>
										<td><c:out value="${item.aadharCardNumten}" /></td>
										<td><c:out value="${item.tenantAddress}"></c:out></td>
										<td><c:out value="${item.pincode}"></c:out></td>


										<%-- 		<td><center>
												<a href="EditUser?id=<c:out value="${item.id}" />"><i
													class="fa fa-fw fa-edit"></i></a>
											</center></td> --%>

									</tr>
								</c:forEach>

							
						</table>
					</div>


				</section>
       </div>
      
      
      </div>
 
      <!-- /.row -->



<%@include file="footer.jsp"%>
