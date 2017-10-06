
<%@page import="com.la.model.*"%>
<%@include file="header.jsp"%>
<script type="text/javascript" src="./dist/js/tech_matrix.js"></script>
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
       <div class="callout callout-success" >
        <h3 ><strong>Tenant form</strong></h3>
        <!-- /.box-header -->
            <!-- form start -->
              <form role="form" action="TenantController" method="POST"  enctype="multipart/form-data" >
              <div class="box-body">
              
              <br> <hr>
                  <center><strong><i class="fa fa-fw fa-home"></i> Address Details in which Tenants are staying </strong> </center>
                  <hr>  
                  <div class="form-group">
                <label>Select state of India</label>
                <select class="form-control select2" style="width: 100%;" id="State1" name="StateOwner"> 
                </select>
                </div>
               <div class="form-group">
                <label>Select City</label>
                <select class="form-control select2"  style="width: 100%;" id="city1" name="cityOwner" > 
                </select>                   
                 <script language="javascript">
                   populateCountries("State1", "city1");
                 </script>
              </div>
                  
                    <div class="form-group">
                  <label for="exampleInputEmail1">House/(Apartment&Flat) Number</label>
                  <input type="text" name="HousenumberOwner" class="form-control"  placeholder="Enter House/(Apartment&Flat) Number">
                  </div>
                  
                  <div class="form-group">
                  <label for="exampleInputEmail1">Street Name</label>
                  <input type="text" class="form-control" name="StreetnameOwner"  placeholder="Enter Street Name">
                  </div>
                  
                  <div class="form-group">
                  <label for="exampleInputEmail1">Landmark</label>
                  <input type="text" class="form-control" name="LandmarkOwner"  placeholder="Enter Landmark">
                  </div>
                  
                  
                  <div class="form-group">
                  <label for="exampleInputEmail1">Pincode</label>
                  <input type="text" class="form-control" name="PincodeOwner" placeholder="Enter Pincode">
                  </div>
                  
                  <div class="form-group">
                  <label for="exampleInputEmail1">Near-by Police station Name</label>
                  <input type="text" class="form-control" name="PolicestationnameOwner" placeholder="Enter Police Station Name">
                  </div>
                 <br> 
               
                   <br> <hr>
                  <center><strong><i class="fa fa-fw fa-user"></i>Tenant's information </strong> </center>
                  <hr>  
                  
                  <div class="form-group">
                  <label for="exampleInputEmail1">Date Of Entrance (Should be in {dd/mm/yyyy} and seperated with / )</label>
                  <input type="text" class="form-control" name="DateOfEnterTen"   placeholder="dd/mm/yyyy" required>
                  </div> 
               
                   <div class="form-group">
                  <label for="exampleInputEmail1">Full Name</label>
                  <input type="text" class="form-control" name="FullnameTen"   placeholder="Enter your Full Name" required>
                  </div> 
                  
                  <div class="form-group">
                  <label for="exampleInputEmail1">Phone Number</label>
                  <input type="text" class="form-control" name="MobileNumTen"   placeholder="Enter your Mobile Number" required>
                  </div> 
                   
                   <div class="form-group">
                  <label for="exampleInputEmail1">Aadhar Card Number</label>
                  <input type="text" class="form-control" name="AadharCardNumten"   placeholder="Enter your Aadhar Card Number" required>
                  </div> 
                         <div class="form-group">
                  <label for="exampleInputEmail1">Father/Husband Name</label>
                  <input type="text" class="form-control" name="FaOrHuNameTen"   placeholder="Enter your Father's/Husband's Name" >
                  </div> 
                  
                    <div class="form-group">
                 
                  <label for="exampleInputFile">Upload Passport Photo</label>
                  <input type="file" id="exampleInputFile" name="PhotoTen">

                  <p ><strong>Note: Image must be cropped.</strong></p>
               
                   <label for="exampleInputFile">Upload Right ThumbPrint</label>
                  <input type="file" id="exampleInputFile" name="FingerPrintTen" >

                  <p ><strong>Note : Finger Print taken Should be on white background and cropped. </strong></p>
               
                 
             
             <br><hr>
                  <center><strong><i class="fa fa-fw fa-home"></i> Permanent Address Details of Tenant </strong> </center>
                  <hr>  
                  <div class="form-group">
                <label>Select state of India</label>
                <select class="form-control select2" style="width: 100%;" id="State2" name="StateTen"> 
                </select>
                </div>
               <div class="form-group">
                <label>Select City</label>
                <select class="form-control select2"  style="width: 100%;" id="city2" name="cityTen" > 
                </select>                   
                 <script language="javascript">
                   populateCountries("State2", "city2");
                 </script>
              </div>
                  
                    <div class="form-group">
                  <label for="exampleInputEmail1">House/(Apartment&Flat) Number</label>
                  <input type="text" name="HousenumberTen" class="form-control"  placeholder="Enter House/(Apartment&Flat) Number">
                  </div>
                  
                  <div class="form-group">
                  <label for="exampleInputEmail1">Street Name</label>
                  <input type="text" class="form-control" name="StreetnameTen"  placeholder="Enter Street Name">
                  </div>
                  
                  <div class="form-group">
                  <label for="exampleInputEmail1">Landmark</label>
                  <input type="text" class="form-control" name="LandmarkTen"  placeholder="Enter Landmark">
                  </div>
                  
                  
                  <div class="form-group">
                  <label for="exampleInputEmail1">Pincode</label>
                  <input type="text" class="form-control" name="PincodeTen" placeholder="Enter Pincode">
                  </div>
                  
                  <div class="form-group">
                  <label for="exampleInputEmail1">Near-by Police station Name</label>
                  <input type="text" class="form-control" name="PolicestationnameTen" placeholder="Enter Police Station Name">
                  </div>
                 <br> 
                </div>
                
                 <div class="form-group">
                  <label for="exampleInputEmail1"> Enter Number of Members:   (Except the head)</label>
                  
                    <input type="text" id="member" class="form-control" placeholder="Enter number of members. " name="members" value="">
                    
					   
					    <button type="button" class="btn btn-block btn-info" onclick="addFields()">Add Details </button>
					    </div>
				
	                            
					    <div class= "form-group" id="container">
					    </div>
	                
	               <br> <hr>
                  <center><strong><i class="fa fa-fw fa-user"></i> Information about local Relative or known Person</strong> </center>
                  <hr>  
                  <div class="form-group">
                  <label for="exampleInputEmail1">Full Name</label>
                  <input type="text" class="form-control" name="FullnameTenRel"  placeholder="Enter Street Name">
                  </div>
                    
                    <div class="form-group">
                  <label for="exampleInputEmail1">Mobile Number</label>
                  <input type="text" class="form-control" name="MobilenumTenRel"  placeholder="Enter Mobile Number">
                  </div>
                 
                  <div class="form-group">
                  <label>Full- Address </label>
                  <textarea class="form-control" rows="3" placeholder="Enter address here."  name="AddressTenRel" ></textarea>
                  <label>including --> House Number, Street and area ,Land Mark ,Pincode, (max 255 characters are allowed) </label>
                  </div>
                  
              <!-- /.box-body -->

              <div class="box-footer">
                  
                  <input type="submit"  id="submitid" class="btn btn-block btn-success " value="Submit">
              </div>
            </form>
          </div>
          <!-- /.box -->
         
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
