<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>注册页面 |物联网智能终端管理系统</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="ionicons/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="plugins/iCheck/square/blue.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body class="hold-transition register-page">
    <div class="register-box">
      <div class="register-logo">
        <a href="#"><b>智慧</b>南邮</a>
      </div>

      <div class="register-box-body">
        <p class="login-box-msg">注册页面</p>
        <form action="RegisterServlet" method="post" onSubmit="return check()">
          <div class="form-group has-feedback">
            <input type="text" class="form-control" placeholder="账号" name="username" id="username">
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
           <div class="form-group has-feedback">
            <input type="email" class="form-control" placeholder="E-Mail" name="email" id="email">
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>	
          <div class="form-group has-feedback">
            <input type="password" class="form-control" placeholder="密码" name="password" id="password">
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
            <input type="password" class="form-control" placeholder="重复密码" id="confirm_password">
            <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
          </div>
          <div class="row">
            <div class="col-xs-8">
              <div class="checkbox icheck">
                <label>
                  <input type="checkbox" id="agree1">我同意<a href="#">用户须知</a>
                </label>
              </div>
            </div><!-- /.col -->
            <div class="col-xs-4">
              <button type="submit" class="btn btn-primary btn-block btn-flat">注册</button>
            </div><!-- /.col -->
          </div>
        </form>

        <a href="login.jsp" class="text-center">我已有登陆账号</a>
      </div><!-- /.form-box -->
    </div><!-- /.register-box -->
    
    <script type="text/javascript"> 
    	function uuid() {
    		var s = [];
    		var hexDigits = "0123456789abcdef";
    		for (var i = 0; i < 36; i++) {
        		s[i] = hexDigits.substr(Math.floor(Math.random() * 0x10), 1);
    		}
    		s[14] = "4";  // bits 12-15 of the time_hi_and_version field to 0010
   			s[19] = hexDigits.substr((s[19] & 0x3) | 0x8, 1);  // bits 6-7 of the clock_seq_hi_and_reserved to 01
    		s[8] = s[13] = s[18] = s[23] = "-";
 
    		var uuid = s.join("");
    		return uuid;
		}
		
		function check()
		{
            if((document.getElementById("username").value.length>16)){  
                alert("账号不能超过16个字符"); 
				return false;  
            }
            else if(document.getElementById("username").value == ""){  
                alert("账号不能为空!"); 
				return false;  
            }
            else if(document.getElementById("email").value == ""){  
                alert("邮箱不能为空!"); 
				return false;  
            }
			else if(document.getElementById("password").value == ""){  
                alert("密码不能为空!"); 
				return false;  
            }
			else if(document.getElementById("confirm_password").value == ""){  
                alert("确认密码不能为空!"); 
				return false;  
            }
			else if((document.getElementById("password").value.length<6)||(document.getElementById("password").value.length>16)){  
                alert("密码过长或过短，请介于6-16位之间!"); 
				return false;  
            }
			else if(document.getElementById("confirm_password").value != document.getElementById("password").value){  
                alert("两次输入密码不相同!"); 
				return false;  
            }
			else if(document.getElementById('agree1').checked!=1){  
                alert("请同意注册协议!"); 
				return false;  
            }
			else{ 
               return true;
            }  
        }
 </script> 

    <!-- jQuery 2.1.4 -->
    <script src="plugins/jQuery/jQuery-2.1.4.min.js"></script>
    <!-- Bootstrap 3.3.5 -->
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <!-- iCheck -->
    <script src="plugins/iCheck/icheck.min.js"></script>
    <script>
      $(function () {
        $('input').iCheck({
          checkboxClass: 'icheckbox_square-blue',
          radioClass: 'iradio_square-blue',
          increaseArea: '20%' // optional
        });
      });
    </script>
  </body>
</html>
