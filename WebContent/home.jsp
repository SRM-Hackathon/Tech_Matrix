
<%@page import="com.la.model.*"%>
<%@include file="header.jsp"%>
	 <%
      UserBean bean = (UserBean) session.getAttribute("userbean");
  	String fullname =bean.getFullname(); 
  	String email=bean.getEmail();
      %>
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
     
        <h3 ><strong>Hello <%= fullname%> </strong></h3>

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


<%@include file="footer.jsp"%>
