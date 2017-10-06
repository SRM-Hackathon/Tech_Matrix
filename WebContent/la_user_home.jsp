<!DOCTYPE html>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<%
//java code
/*
 String name="";
String Email=(String) session.getAttribute("Email");
if(Email==null)
{
	response.sendRedirect("index.jsp");	

}
else
{
  Connection con=com.la.conn.Config.getConnection();
  Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	 ResultSet rs = stmt.executeQuery("SELECT Firstname , Lastname FROM lawautomatonusers WHERE EmailID='"+Email+"'");
	 String First="";
	 String Last="";  
	 while(rs.next())
	   {
		   First = rs.getString(1);
		   Last= rs.getString(2);
		   
	   }
	 
	  name= First+" "+Last;
}
*/
%>

<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 2 | General Form Elements</title>
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
      <span class="logo-mini"><b>L</b>AM</span>
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
           <a href="#">    <span> <% /*Email*/ %> </span> </a>
          <a href="#"><i class="fa fa-circle text-success"> </i> Online</a>
           
        </li> 
        
        <li class="treeview">
          <a href="#">
              <i class="fa fa-dashboard"></i> <span>Home</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
           <ul class="treeview-menu">
             <li><a >Wannna go on Home page<br> click the link given below. </a></li> 
            <li><a href="LawAutomatonUserHome.jsp"><i class="fa fa-link"></i>User Home</a></li>            
          </ul>
        </li>
        <li class="treeview">
           <a href="#">
            <i class="fa fa-fw fa-external-link-square"></i>   <span>Tenant Form</span>
         <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
             <li><a > Fill Information about your <br> <i class="fa fa-fw fa-users"> </i> Tenants.<br> click the link given below. </a></li> 
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
             <li><a > Fill Information about your <br><i class="fa fa-fw fa-users"> </i> Hostellers.<br> click the link given below. </a></li> 
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
             <li><a > Fill Information about your <br> <i class="fa fa-fw fa-users"> </i> Hotel Visitors.<br> click the link given below. </a></li> 
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
             <li><a > Fill Information about your <br> <i class="fa fa-fw fa-users"></i> Labours.<br> click the link given below. </a></li> 
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
             <li><a> Fill Information about your <br> <i class="fa fa-fw fa-users"></i> Servants.<br> click the link given below. </a></li> 
            <li><a href="servantForm.jsp"><i class="fa fa-link"></i>Servant form</a></li>            
          </ul>
        </li>
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    
    <!-- Main content -->
    <section class="content">
      <div class="row">
        <!-- left column -->
        <div class="col-md-2">
        </div>
        <div class="col-md-8">
      <!--/.col (right) -->
         <section class="content">
      <div class="callout callout-info">
        <h3 ><strong>Hello <%/*name*/%> </strong></h3>

        <p> Law-Automaton lets you update information regarding Tenants, Labours, Hotel Visitors, Hostellers, and people having servants.
           You can update all the information which will later get verified. The police will know the information and get stored in their database.
        </p>
        <br>
        <h4>Select a specific form from the side-bar menu which you want to fill  </h4>
      </div>
    
    </section>
       </div>
      
      
      </div>
        <div class="col-md-2">
        </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 2.4.0
    </div>
  <center> <strong>Copyright &copy;  Tech-Matrix </strong> All rights
    reserved.</center>
  </footer>


  <!-- /.control-sidebar -->
 


<!-- jQuery 3 -->
<script src="./bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="./bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="./bower_components/fastclick/lib/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="./dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="./dist/js/demo.js"></script>
<script type="text/javascript" src="./dist/js/city_state.js"></script>


</body>
</html>
