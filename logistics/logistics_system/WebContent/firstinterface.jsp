<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>物流管理系统</title>
<style type="text/css">
	.login{
		background-image: url(https://s2.ax1x.com/2019/12/16/QhcuGt.jpg);
		background-size: 1300px;
	}
	.cen{
		 position:absolute;
         left: 45%;
         top: 45%;
         margin: -60px 0px 0px -60px;
	}
	
	
</style>

</head>
<body class="login">
	<center class="cen">
		<form  action="/logistics_system/LogloginServlet" method="post">
            <table border="0">
                <tr>
                    <td>账户:</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>密码:</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr></tr>
                <tr></tr>
           </table>
           <br>
           <input type="submit" value="登录" style="color:gray"><br><br><br>
                            没有账号？点击 <a href="register.jsp" style="text-decoration: none;">注册</a>
		</form>
	</center>
</body>
</html>