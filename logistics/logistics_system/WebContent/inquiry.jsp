<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>运单查询</title>
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
			.inquirysubmit {
				height:30px;
				width:100px;
			    text-align:center;  
			    line-height:100%;    
			    padding:0.3em;    
			    font:16px Arial,sans-serif bold;    
			    font-style:normal;     
			    text-decoration:none;   
			    margin:2px;     
			    vertical-align:text-bottom;     
			    zoom:1;     
			    outline:none;    
			    font-size-adjust:none;    
			    font-stretch:normal;     
			    border-radius:50px;    
			    box-shadow:0px 1px 2px rgba(0,0,0,0.2);  
			    text-shadow:0px 1px 1px rgba(0,0,0,0.3); 
			    color:#fefee9;    
			    border:0.2px solid #2299ff;    
			    background-repeat:repeat; 
			    background-size:auto;     
			    background-origin:padding-box;     
			    background-clip:padding-box;    
			  
			    background: linear-gradient(to bottom, #eeeff9 0%,#3399ff 100%);
			}
		    .inquirysubmit:hover {   
		    	 background: #268DFF;
		    }
		    .tracknum{
		    	margin-top: 170px;
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
			<form action="/logistics_system/InquiryServlet" method="post">
				<div align="center" style="margin-top:10px">
					<div class="tracknum">运单号&nbsp;<input type="text" name="trackingnumber" style="outline: none;"/></div>
					<br /><br /><br />
					<div>
						<input type="submit" value="提交" class="inquirysubmit" name="inqsub" onclick="arert('提交成功')" style="width:100px; height:30px;"/>
					</div>
				</div>
			</form>
		</div>
	</body>
</html>