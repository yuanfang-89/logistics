<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>顾客界面</title>
<style type="text/css">
	.top .logo,.foot1{
		display: inline-block;
		vertical-align: middle;
	}
	.top .menu,.foot2{
		display: inline-block;
	}
	.menu .link{
		border-left-width: 20px;
		margin-left: 150px;
		text-decoration: none;
	}
	.menu .link1{
		border-left-width: 20px;
		margin-left: 150px; 
		text-decoration: none;
	}
	.percenter{
		display: inline-block;
		font-size: 20px;
		font-family: "楷体";
	}
	.percenter .link4{
		border-left-width: 20px;
		margin-left: 100px;
		text-decoration: none;
	}
	.btngroup .link2{
		border-left-width: 20px;
		margin-left: 150px; 
		text-decoration: none;
	}
	.btngroup .link3{
		border-left-width: 20px;
		margin-left: 150px; 
		text-decoration: none;
	}
	.turn{
        margin: 0 auto;

    }
    .turn img{
        height: 400px;
        width: 1300px;
        margin: 0 auto;
    }

    .img1{
        display: block;
    }

    .img2,.img3,.img4{
        display: none;
    }
    .custompage .btngroup{
		background-color: cornflowerblue;
		width: 1300px;
		line-height: 3;
	}
	.ourserv,.ouradv,.ourxw{
		font-size: 25px;
		line-height: 5;
		text-align: center;
	}
	.advandinfo{
		background-image: url(https://s2.ax1x.com/2019/10/11/uLADN4.png);
	    background-size: 1300px;
	}
	.hdfk{
		display: inline-block;
		line-height: 3;
		margin-left: 80px;
				
	}
	.bjfw,.dzmd,.yfdf,.smqj{
		display: inline-block;
		vertical-align: top;
		line-height: 3;
		margin-left: 175px;
	}
	.advantage .introduce{
		text-align: center;
	}
	.gxwl{
		display: inline-block;
		margin-left: 350px;
		font-size: 18px;
	}
	.zxwl{
		display: inline-block;
		vertical-align: top;
		margin-left: 350px;
		font-size: 18px;
	}
	.jsxw .xwtp{
		display: inline-block;
		vertical-align: middle;
				
	}
	.jsxw .fl{
		display: inline-block;
		margin-left: 150px;
	}
	.foot{
		background-image: url(https://s2.ax1x.com/2019/10/17/KkskjJ.png);
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
<body>
	<div class="top">
		<div class="logo">                
     		<img src="https://s2.ax1x.com/2019/12/13/QcftAI.png" />
		</div>
		<div class="menu">
			<a href="customerpage.jsp" class="link">首页</a>
			<a href="delivery.jsp" class="link1">快递业务</a>
			<a href="inquiry.jsp" class="link1">快递物流</a>
			<a href="/logistics_system/ComPerCenterServlet" class="link1">关于极速</a>
		</div>
		<div class="percenter">
			<a href="/logistics_system/CusCenterServlet" class="link4">个人中心</a>
		</div>
	</div>
	<div class="main">
		<div class="turn">
				<img  class="img-slide img1" src="https://s2.ax1x.com/2019/11/06/Misqh9.jpg"  >
				<img  class="img-slide img2" src="https://s2.ax1x.com/2019/11/06/Mi4GvQ.jpg"  >
				<img  class="img-slide img3" src="https://s2.ax1x.com/2019/11/06/MiWHrn.jpg"  >
				<img  class="img-slide img4" src="https://s2.ax1x.com/2019/11/06/Mi4mDA.jpg"  >
		</div>
		<div class="custompage">
				<div class="btngroup">
					<a href="delivery.jsp" class="link2">在线寄件</a>  
					<a href="inquiry.jsp" class="link3">运单查询</a>
					<a href="/logistics_system/ExpressInfoServlet" class="link3">快递签收</a>
					<a href="/logistics_system/ExpressInfoServlet" class="link3">服务评价</a>
					<a href="/logistics_system/ExpressInfoServlet" class="link3">我的快递</a>
				</div>
        </div>
        <div class="service">
            	<div class="ourserv">
            		我们的服务
            	</div>
            	<div class="serlist">
            		<img src="https://s2.ax1x.com/2019/10/11/uqzAtP.png" hspace="65">
            		<img src="https://s2.ax1x.com/2019/10/11/uqznXQ.png" hspace="65">
            		<img src="https://s2.ax1x.com/2019/10/11/uqzJpT.png" hspace="65">
            		<img src="https://s2.ax1x.com/2019/10/11/uqzY1U.png" hspace="65">
            		<img src="https://s2.ax1x.com/2019/10/11/uqztcF.png" hspace="65">
            		<div class="hdfk">货到付款 </div>
            		<div class="bjfw">保价服务</div>
            		<div class="dzmd">电子面单</div>
            		<div class="yfdf">运费到付</div>
            		<div class="smqj">上门取件</div>
            	</div>
        </div>
        <div class="advandinfo">
            <div class="advantage">
               <div>
            	    <img src(unknow)>
               </div>
               <div class="ouradv">
            		我们的优势
               </div>
               <div class="introduce">
            	   <p>我们有专属的运营、信息技术、专业的售后服务团队和产品，为您提供个性化、定制化的快递和物流解决方案。</p>
            	   <p>同时我们可以为您提供专属的打单发货软件、上门取件业务以及各类时效类增值服务，是您身边的贴心快递管家。</p>
               </div>
               <br><br>
               <div class="gxwl">
            	   <div class="gxwl1">干线网络</div><br>
            	   <p><span style="font-size: 15px;"><font color="red">100</font>家分拨中心</span></p>
            	   <p><span style="font-size: 15px;"><font color="red">3078</font>条线路</span></p>
               </div>
               <div class="zxwl">
            	   <div class="zxwl1">支线网络</div><br>
            	   <br>
            	   <p><span style="font-size: 15px;"><font color="red">18168</font>家快递点</span></p>
               </div>
            </div>
           	<div class="jsxw">
            	<div class="ourxw">
            		极速新闻
            	</div>
            	<div class="xwtp">
            		<img src="https://s2.ax1x.com/2019/10/12/uLmUTf.png" style="margin-left: 100px;">
            	</div>
            	<div class="fl">
            		<ul type="none">
					<li>极速物流正式在上海开始运营</li><br>
					<li>品质为本，极致服务，极速物流进行人员培训</li><br>
					<li>极速物流加速数字化转型</li>
				</ul>
            	</div>
           	</div>
       	 </div>
            
    </div>
	<div class="foot">
		<div class="foot1">
		<br><br>
			<div><font size="3">客服电话</font></div>
			<div><font size="2">0731-003-562</font></div>
			<div><font size="2">服务时间：8:00-18:00</font></div>
			<br>
		</div>	
		<div class="foot2" style="margin-left: 400px;"><font size="2">
		<br><br><br>
			©版权所有2019极速物流有限公司
			<br>
			湘ICP备13006085号|快递业务经营许可证
			</font>
		</div>
	</div>
</body>
<script type="text/javascript">
    var index=0;
    //改变图片
    function ChangeImg() {
        index++;
        var a=document.getElementsByClassName("img-slide");
        if(index>=a.length) index=0;
        for(var i=0;i<a.length;i++){
            a[i].style.display='none';
        }
        a[index].style.display='block';
    }
    //设置定时器，每隔两秒切换一张图片
    setInterval(ChangeImg,2000);
</script>
</html>