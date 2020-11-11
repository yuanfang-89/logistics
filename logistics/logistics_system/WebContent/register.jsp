<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册</title>
<style type="text/css">
	.register{
		background-image: url(https://s2.ax1x.com/2019/10/11/uLADN4.png);
		background-size: 1300px;
	}
	.cen{
		 position:absolute;
         left: 50%;
         top: 50%;
         margin: -60px 0px 0px -60px;
	}
	
	
</style>
</head>
<body class="register">
	<center class="cen">
		<form action="/logistics_system/RegisterServlet" method="post">
            <table border="0">
                <tr>
                    <td>账户:</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>密码:</td>
                    <td><input type="password" name="password">
                    </td>
                </tr>
            </table>
       	    <br>
            <input type="submit" value="注册" style="color:gray"><br><br><br>
        </form>
	</center>
</body>
</html>