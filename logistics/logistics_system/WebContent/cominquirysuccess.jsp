<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查询成功</title>
<style type="text/css">
			.backgrd{
				background-image: url(https://s2.ax1x.com/2019/12/13/Qcfntx.jpg);
				/*background-image: url(https://s2.ax1x.com/2019/12/13/Qchpbd.jpg);*/
				background-size: 1300px;
			}
			.top .logo{
				display: inline-block;
				vertical-align: middle;
			}
			.top .menu{
				display: inline-block;
			}
			.menu .comlink{
				border-left-width: 20px;
				margin-left: 120px;
				text-decoration: none;
			}
			.menu .purpose,.purpose1{
				border-left-width: 20px;
				margin-left: 80px; 
			}
			.percenter{
				display: inline-block;
				text-decoration: none;
				font-size: 20px;
				font-family: "楷体";
			}
			.percenter .perc{
				border-left-width: 20px;
				margin-left: 200px;
				text-decoration: none;
			}
			.main{
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
<body class="backgrd">
	<div class="top">
			<div class="logo">                
	     		<img src="https://s2.ax1x.com/2019/12/13/QcftAI.png" />
			</div>
			<div class="menu">
				<a href="companypage.jsp" class="comlink">首页</a>
				<span class="purpose">微笑服务</span>
				<span class="purpose1">耐心仔细</span>
				<span class="purpose1">服务至上</span>
				<span class="purpose1">诚信待人</span>
			</div>
			<div class="percenter">
			<a href="compercenter.jsp" class="perc">个人中心</a>
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
					<td><c:out value="${cus.getCustomerName()}" default="wu"/></td>
					<td><c:out value="${cus.getCustomerPhone()}" default="wu"/></td>
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
					<td><c:out value="${exp.getReceiveName()}" default="wu"/></td>
					<td><c:out value="${exp.getReceivePhone()}" default="wu"/></td>
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
						<td><c:out value="${addr.getProvince()}${addr.getCity()}${addr.getDistrict()}${addr.getRoad()}${addr.getDetails()}" default="wu"/></td>
						
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