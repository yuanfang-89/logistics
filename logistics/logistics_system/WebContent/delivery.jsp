<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>寄件</title>
		<style type="text/css">
			.top .logo{
				display: inline-block;
				vertical-align: middle;
			}
			.top .menu{
				display: inline-block;
			}
			.menu .link{
				border-left-width: 20px;
				margin-left: 150px;
				text-decoration: none;
			}
			.menu .link1{
				border-left-width: 20px;
				margin-left: 100px; 
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
			.title .imp{
				display: inline-block;
				vertical-align: middle;
			}
			.title .bj{
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
			.thing,.snote {
    			display: inline-block;
    			position: relative;
			}
		    .t-list,.s-list {
   			    position: absolute;
  		     	left: 35px;
    			top: 6px;
    			font-size: 15px;
			}
    			
			.tandl,.snote{
				margin-left: 60px;
			}
			
			input[type=checkbox],
		    input[type=radio] {
   		    	margin: 0;
			}
 
			input[type=radio]{
    			-webkit-appearance: none;
    			-moz-appearance: none;
   			    width: 80px;
    			height: 28px;
    			background-color: transparent;
    			border: 1px solid #bdbdbd;
    			margin-left: 18px;
			}
 
			input[type=radio]:focus,
			input[type=radio]:checked {
   				border: 1px solid #000 !important;
    			/*background-color: yellow;
    			background-color:#FFD700;*/
    			background-color:#98FB98;
			}
			 
			input[type=checkbox]{
				-webkit-appearance: none;
    			-moz-appearance: none;
   			    width: 96px;
    			height: 28px;
    			background-color: transparent;
    			border: 1px solid #bdbdbd;
    			margin-left: 18px;
			}
			input[type=checkbox]:focus,
			input[type=checkbox]:checked {
   				border: 1px solid #000 !important;
    			/*background-color: yellow;*/
    			background-color: #98FB98;;
			 }
			 .sub{
			 	text-align:center;  
			 	margin-top: 20px;
			 }
			.deliverysub {
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
		    .deliverysub:hover {   
		    	 background: #268DFF;
		    }
			.menu{
				display: inline-block;
				vertical-align: middle;
			}
			.login{
				display: inline-block;
			}
			.menu .caidan{
				display: none;
		
			}
			ul li:hover .caidan{
				display: block;
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
	<body class="backgrooud">
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
			<div class="title">
				<div class="imp">
					<h1 class="title">客户服务</h1>
					<div class="info">极速物流提供快捷、安全、贴心、可靠的快递服务，是您的优质选择</div><br>
				</div>
				<div class="bj">
					<img src="https://s2.ax1x.com/2019/09/23/uP1VrF.jpg"/>
				</div>
			</div>
			<div class="bigtable">
			<form action="/logistics_system/DeliveryServlet" method="post">
				<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#f8f8f8">
					<tr>
						<td>
							<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#ffffff" align="center">
								<tr>
									
									<td valign="top"><h3>寄件人信息</h3>	
										<hr style="width:215%; text-align:center;vertical-align:middle"/>
									</td>
								</tr>
								
								<tr>
									<td><font color="red">*</font>姓名
										<input type="text" name="sendname" id="name" style="outline: none;" placeholder="请输入寄件人姓名" />
									</td>
									<td>
										<font color="red">*</font>手机
										<input type="text" name="sendphone" style="outline: none;" placeholder="请输入手机号" />
										<br>
									</td>
								</tr>
								<tr>
									<td><font color="red">*</font>所在省
											<input type="text" name="sendprovince" style="outline: none;" placeholder="请输入所属省" />
									</td>
									<td><font color="red">*</font>所在市
											<input type="text" name="sendcity" style="outline: none;" placeholder="请输入所属市" />
										<br>
									</td>
								</tr>
								<tr>
									<td><font color="red">*</font>所在区
											<input type="text" name="senddistrict" style="outline: none;" placeholder="请输入所在区" />
									</td>
									<td><font color="red">*</font>所在街道
											<input type="text" name="sendroad" style="outline: none;" placeholder="请输入所在街道" />
										<br>
									</td>
								</tr>
								<tr>
									<td><font color="red">*</font>详细地址
											<input type="text" name="senddetails" style="outline: none;" placeholder="请输入详细地址" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td>
							<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#ffffff" align="center">
								<tr>
									
									<td valign="top"><h3>收件人信息</h3>	
										<hr style="width:215%; text-align:center;vertical-align:middle"/>
									</td>
								</tr>
								<tr>
									<td><font color="red">*</font>姓名
										<input type="text" name="receivename" id="name" style="outline: none;" placeholder="请输入收件人姓名" />
									</td>
									<td>
										<font color="red">*</font>手机
										<input type="text" name="receivephone" style="outline: none;" placeholder="请输入手机号" />
										<br>
									</td>
								</tr>
								<tr>
									<td><font color="red">*</font>所在省
											<input type="text" name="receiveprovince" style="outline: none;" placeholder="请输入所属省" />
									</td>
									<td><font color="red">*</font>所在市
											<input type="text" name="receivecity" style="outline: none;" placeholder="请输入所属市" />
										<br>
									</td>
								</tr>
								<tr>
									<td><font color="red">*</font>所在区
											<input type="text" name="receivedistrict" style="outline: none;" placeholder="请输入所在区" />
									</td>
									<td><font color="red">*</font>所在街道
											<input type="text" name="receiveroad" style="outline: none;" placeholder="请输入所在街道" />
										<br>
									</td>
								</tr>
								<tr>
								<td><font color="red">*</font>详细地址
											<input type="text" name="receivedetails" style="outline: none;" placeholder="请输入详细地址" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td>
							<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#ffffff" align="center">
								<tr>
									<td valign="top"><h3>物品信息</h3>
										<hr style="width:100%; text-align:center;vertical-align:middle"/>
									</td>
								</tr>
								<tr>
									<td><div class="t-head"><font color="red">*</font>物品类型</div><br>
									
										<div class="tandl">
										<label class="thing">
										<input type="radio" name="type" value="file" />
										<span class="t-list">文件</span></label>
										<label class="thing">
										<input type="radio" name="type" value="book"/>
										<span class="t-list">书籍</span></label>
										<label class="thing">
										<input type="radio" name="type" value="food" />
										<span class="t-list">食品</span></label>
										<label class="thing">
									    <input type="radio" name="type" value="cosmetics" />
									    <span class="t-list">化妆品</span></label>
									    <label class="thing">
										<input type="radio" name="type" value="clothing" />
										<span class="t-list">服装</span></label>
										<label class="thing">
										<input type="radio" name="type" value="dailything" />
										<span class="t-list">日用品</span></label>
										<label class="thing">
										<input type="radio" name="type" value="drugs" />
										<span class="t-list">药品</span></label>
										<label class="thing">
										<input type="radio" name="type" value="fragile" />
										<span class="t-list">易碎品</span></label>
										<label class="thing">
										<input type="radio" name="type" value="others" />
										<span class="t-list">其他</span></label>
										</div>
										<br>
									</td>
								</tr>
								<tr>
									<td><font color="red">*</font>物品重量
										<input type="text" name="weight" style="outline: none;" placeholder="0.1-50KG之间"/>KG
										<br><br>
									</td>
								</tr>
								<tr><td>特殊备注<br><br>
									<label class="snote">
									<input type="checkbox" name="note" value="carton" />
									<span class="s-list">请带纸箱</span></label>
									<label class="snote">
									<input type="checkbox" name="note" value="climb" />
									<span class="s-list">需要爬楼</span></label>
									<label class="snote">
									<input type="checkbox" name="note" value="pocket" />
									<span class="s-list">缺文件袋</span></label>
									<label class="snote">
									<input type="checkbox" name="note" value="call" />
									<span class="s-list">来前电话</span></label>
									<label class="snote">
									<input type="checkbox" name="note" value="tape" />
									<span class="s-list">我没胶带</span></label>
									<br><br>
									</td>
								</tr>
								<tr>
									<td>其他备注<br><br>
									   <div align="center">
									   	<textarea rows="8" cols="120" wrap="virtual" style="resize: none; outline: none;" name="note1"></textarea>
									   </div>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<div class="sub">
					<input type="submit" value="提交" class="deliverysub" name="deliverysub" onclick="arert('提交成功')" style="width:100px; height:30px;"/>
				</div>
			</form>
			</div><br><br><br>
		</div>
	</body>
</html>