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
   
<div class="callout callout-success">
             
                <div align="center">
				<img src="police.png"   height="200" width="120"  >
				</div> <br>
				 <h4>Enter Credentilals given by higher authority</h4> 
             </div>
 </div>
 <!-- /.form-box -->

<div class="login-box-body">
  <p class="login-box-msg">Sign in</p>

  <form action="PoliceLogin" method="post">
  
    <div class="form-group has-feedback">
      <input type="email" class="form-control" name="email" placeholder="Email">
      <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
    </div>
    <div class="form-group has-feedback">
      <input type="password" class="form-control" name="password" placeholder="Password">
      <span class="glyphicon glyphicon-lock form-control-feedback"></span>
    </div>
    <div class="row">
     
 
      <div class="col-xs-4">
        <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
      </div>
   
    </div>
  </form>

</div>
<!-- /.login-box-body -->

<!-- jQuery 3 -->
<script src="./bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="./bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
</body>
</html>