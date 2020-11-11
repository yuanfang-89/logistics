<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>公司界面</title>
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
				/*text-decoration: none;*/
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
			.examine{
				display: inline-block;
				line-height: 3;
				margin-left: 80px;
				margin-top: 150px;
				position: relative;
			}
			.choosemap img{
				display: block;
			}
			.examine .exam,.modify .modi,.delete .del{
				position: absolute;
				top: 85px;
				right: 80px;
				text-decoration: none;
			}
			.modify,.delete{
	         	display: inline-block;
				vertical-align: top;
				line-height: 3;
				margin-left: 175px;
				margin-top: 150px;
				position: relative;
			}
			.comlink{
				text-decoration: none;
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
			<a href="/logistics_system/ComPerCenterServlet" class="perc">个人中心</a>
			</div>
		</div>
		<div class="main">
			<div class="examine">
				<div class="choosemap"><img src="https://s2.ax1x.com/2019/12/13/QcWVFP.png" /></div>
				<a href="cominquiry.jsp" class="exam">查看快递信息</a>
			</div>
			<div class="modify">
				<div class="choosemap"><img src="https://s2.ax1x.com/2019/12/13/QcWVFP.png" /></div>
				<a href="changexpress.jsp" class="modi">更改快递信息</a>
			</div>
			<div class="delete">
				<div class="choosemap"><img src="https://s2.ax1x.com/2019/12/13/QcWVFP.png" /></div>
				<a href="deletexpress.jsp" class="del">删除快递信息</a>
			</div>
		</div>
	</body>
</html>