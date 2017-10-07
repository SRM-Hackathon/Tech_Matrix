
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.la.model.*"%>
<%@include file="header.jsp"%>
	 <%
      UserBean bean = (UserBean) session.getAttribute("userbean");
  	String fullname =bean.getFullname(); 
  	String email=bean.getEmail();
      %>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    
     <div class="row">
      
        
        
         <section class="content">

					<div class="box-body">
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
					</div>


				</section>
       </div>
      
      
      </div>
 
      <!-- /.row -->



<%@include file="footer.jsp"%>
