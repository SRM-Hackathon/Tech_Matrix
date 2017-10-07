
<%@page import="com.la.model.*"%>
<%@include file="header.jsp"%>
	 <%
	 if((UserBean) session.getAttribute("userbean") == null){
			
		}
	 else{
      UserBean bean = (UserBean) session.getAttribute("userbean");
  	String fullname =bean.getFullname(); 
  	String email=bean.getEmail();
      %>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
   					
    <!-- Main content -->
    <section class="content">
      <div class="row">
      
        <div class="col-md-2">
        </div>
        <div class="col-md-8">
     
         <section class="content">
      <div class="callout callout-info">
      					<%
							String message = Constant.message;
							System.out.println(message);
  							if (message.equals("Tenant Information Send Successfully")) {
						%>
						<h4>
							<font color="green">Tenant Information Send Successfully</font>
						</h4>
						<%
							Constant.message = "";
							}%>
							
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

<% }
      %>
<%@include file="footer.jsp"%>
