<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查询成功</title>
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
			.main{
				/* position:absolute;
	         	left: 40%;
	         	top: 35%;
	         	margin: -60px 0px 0px -60px; */
	         	margin-left:200px;
	         	margin-top:100px; 
	         	
			}
			.table1{
				display: inline-block;
				vertical-align: middle;
				margin-top:-50px; 
				
			}
			.table2,.table3,.table4{
				display: inline-block;
				/* margin-top:100px; */
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
			
			<table class="table1" border="1">
				<tr>
					<td>寄件人姓名&nbsp&nbsp</td>
					<td>寄件人手机&nbsp&nbsp</td>
				</tr>
			<c:forEach var="cus" items="${listc}" >
				<tr>
					<td><c:out value="${cus.getCustomerName()}" default="wang"/></td>
					<td><c:out value="${cus.getCustomerPhone()}" default="wang"/></td>
				</tr>		
			</c:forEach>
				
			</table>
			<table class="table2" border="1">
			<tr>
					<td>收件人姓名&nbsp&nbsp</td>
					<td>收件人手机&nbsp&nbsp</td>
			</tr>
			<c:forEach var="exp" items="${liste}" >
				<tr>
					<td><c:out value="${exp.getReceiveName()}" default="wang"/></td>
					<td><c:out value="${exp.getReceivePhone()}" default="wang"/></td>
				</tr>		
			</c:forEach>
			</table>		
			
			<table class="table3" border="1">
				<tr>
					<td>寄件人地址&nbsp&nbsp</td>
					<td>收件人地址&nbsp&nbsp</td>
					
				</tr>
				<tr>
					<c:forEach var="addr" items="${lista}" >
						<td><c:out value="${addr.getProvince()}${addr.getCity()}${addr.getDistrict()}${addr.getRoad()}${addr.getDetails()}" default="wang"/></td>
						
					</c:forEach>
				</tr>
			</table>
			
			<table class="table4" border="1">
				<tr>
					<td>物流</td>
				</tr>
				<c:forEach var="rout" items="${listr}" >
				<tr>
					<td><c:out value="${rout.getFirstStation()}${rout.getSecondStation()}${rout.getThirdStation()}${rout.getFourthStation()}${rout.getEndStation()}" default="wang"/></td>
				</tr>		
			</c:forEach>
			</table>
		</div>
	</body>
</html>