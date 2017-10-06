<%@page import="com.la.bean.UserBean"%>
<%@page import="com.la.common.Constant"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.la.model.*"%>
<% 
response.setHeader("Cache-Control","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", 0);
String TotalReq;
String TotalOfferReq;
%>
<%
if((UserBean) session.getAttribute("userbean") == null){
	response.sendRedirect(Constant.BASE_URL);
}
else{
	UserBean bean = (UserBean) session.getAttribute("userbean");
	String fullname =bean.getFullname(); 
	String email=bean.getEmail();


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

