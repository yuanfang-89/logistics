<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="bean.Address" %>
<%@ page import="bean.Customer" %>
<%@ page import="bean.Express" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>寄件成功</title>
		<style type="text/css">
			.background{
				background-image: url(https://s2.ax1x.com/2019/12/13/QccMUf.jpg);
				background-size: 1300px;
			}
			.top .logo{
				display: inline-block;
				vertical-align: middle;
			}
			.top .menu{
				display: inline-block;
			}
			.menu .link{
				border-left-width: 20px;
				margin-left: 100px;
				text-decoration: none;
			}
			.menu .link1{
				border-left-width: 20px;
				margin-left: 70px; 
				text-decoration: none;
			}
			.percenter{
				display: inline-block;
				font-size: 20px;
				font-family: "楷体";
			}
			.percenter .link2{
				border-left-width: 20px;
				margin-left: 100px;
				text-decoration: none;
			}
			.main .delisuccess{
				margin-left:38%;
				top: 30%;
			}
			.main .deliinfo{
				position:absolute;
	         	left: 40%;
	         	top: 35%;
	         	margin: -60px 0px 0px -60px;
			}
			a:link, 
			a:visited { 
				color:#2F4F4F; 
		
			} 
			a:hover, 
			a:active { 
				color:#006400; 
		
			} 
		</style>
	</head>
	<body class="background">
		<div class="top">
			<div class="logo">                
	     		<img src="https://s2.ax1x.com/2019/12/13/QcftAI.png" />
			</div>
			<div class="menu">
				<a href="customerpage.jsp" class="link">首页</a>
				<a href="delivery.jsp" class="link1">在线寄件</a>
				<a href="inquiry.jsp" class="link1">运单查询</a>
				<a href="/logistics_system/ExpressInfoServlet" class="link1">快递签收</a>
				<a href="/logistics_system/ExpressInfoServlet" class="link1">物流评价</a>
				<a href="/logistics_system/ExpressInfoServlet" class="link1">我的快递</a>
			</div>
			<div class="percenter">
				<a href="/logistics_system/CusCenterServlet" class="link2">个人中心</a>
			</div>
		</div>
		
		<div class="main">
			<div class="delisuccess">
				<h3>寄件成功</h3>
			</div>
			<div class="deliinfo">
				<!-- <form action="/logistics_system/DeliverySuccessServlet" method="post"> -->
					<table>
						<tr>
							<td><h3>寄件人信息</h3></td>
						</tr>
						
						<tr>
							<td>姓名&nbsp${sessionScope.sendname}</td>
						</tr>
						<tr>
							<td>手机&nbsp${sessionScope.sendphone}</td>
						</tr>
						
						<tr>
							<td>地址&nbsp${sessionScope.sendprovince}${sessionScope.sendcity}${sessionScope.senddistrict}${sessionScope.sendroad}${sessionScope.senddetails}</td>
						</tr>
						<tr>
							<td><h3>收件人信息</h3></td>
						</tr>
						<tr>
							<td>姓名&nbsp${sessionScope.receivename}</td>
						</tr>
						<tr>
							<td>手机&nbsp${sessionScope.receivephone}</td>
						</tr>
						<tr>
							<td>地址&nbsp${sessionScope.receiveprovince}${sessionScope.receivecity}${sessionScope.receivedistrict}${sessionScope.receiveroad}${sessionScope.receivedetails}</td>
						</tr>
						<tr>
							<td></td>
						</tr>
						<tr> 
							<td>单号&nbsp${sessionScope.id}</td>
						</tr>
					</table>
				<!-- </form> -->
			</div>
		</div>
		<%-- <%} %> --%>
	</body>
</html>