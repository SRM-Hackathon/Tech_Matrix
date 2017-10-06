<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <title> Registration Page</title>
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
 <!-- iCheck -->
 <link rel="stylesheet" href="./plugins/iCheck/square/blue.css">

 <!-- Google Font -->
 <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">

</head>
<body class="hold-transition register-page">
<div class="register-box">
 <div class="register-logo">
   <a ><b>LAW Automaton</b></a>
 </div>


 <div class="register-box-body">
   <p class="login-box-msg">Verify your Email ID</p>

   <form action="Register" method="post">
   
     
      <div class="form-group">
                 <label >Enter OTP which came on your mail</label>
                 <input type="text" class="form-control" name="otpentered" placeholder="Enter OTP" required>
                 <input type="hidden" class="form-control" name="otp">
                 </div>
     
   
     <div class="row">
     
       <!-- /.col -->
       <div class="col-xs-4">
         <button type="submit" class="btn btn-primary btn-block btn-flat">Verify</button>
       </div>
       <!-- /.col -->
     </div>
   </form>
 </div>
 <!-- /.form-box -->
</div>
<!-- /.register-box -->

<!-- jQuery 3 -->
<script src="./bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="./bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
</body>
</html>