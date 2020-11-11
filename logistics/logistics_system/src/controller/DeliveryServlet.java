package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Address;
import bean.Customer;
import bean.Express;
import dao.DeliveryDb;
import dao.DeliverySuccessDb;

@WebServlet("/DeliveryServlet")
public class DeliveryServlet extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("进入DeliveryServlet-doPoset");
		request.setCharacterEncoding("utf-8");
		//获得delivery.jsp界面的数据
		String sendname=request.getParameter("sendname");
		String sendphone=request.getParameter("sendphone");
		String sendprovince=request.getParameter("sendprovince");
		String sendcity=request.getParameter("sendcity");
		String senddistrict=request.getParameter("senddistrict");
		String sendroad=request.getParameter("sendroad");
		String senddetails=request.getParameter("senddetails");
		String receivename=request.getParameter("receivename");
		String receivephone=request.getParameter("receivephone");
		String receiveprovince=request.getParameter("receiveprovince");
		String receivecity=request.getParameter("receivecity");
		String receivedistrict=request.getParameter("receivedistrict");
		String receiveroad=request.getParameter("receiveroad");
		String receivedetails=request.getParameter("receivedetails");
		
		//接收来自登录界面的用户名和密码
		HttpSession  session = request.getSession(); 
		String username = (String)session.getAttribute("username");
		String password = (String)session.getAttribute("password");
		
		
		
		//传给寄件成功界面
		session.setAttribute("sendname", sendname);
		session.setAttribute("sendphone", sendphone);
		session.setAttribute("sendprovince", sendprovince);
		session.setAttribute("sendcity", sendcity);
		session.setAttribute("senddistrict", senddistrict);
		session.setAttribute("sendroad", sendroad);
		session.setAttribute("senddetails", senddetails);
		session.setAttribute("receivename", receivename);
		session.setAttribute("receivephone", receivephone);
		session.setAttribute("receiveprovince", receiveprovince);
		session.setAttribute("receivecity", receivecity);
		session.setAttribute("receivedistrict", receivedistrict);
		session.setAttribute("receiveroad", receiveroad);
		session.setAttribute("receivedetails", receivedetails);
		
		
		DeliveryDb deliverydb = new DeliveryDb();
		Customer customer = new Customer(username,password,sendname,sendphone,senddetails);
		Address address1 = new Address(sendprovince,sendcity,senddistrict,sendroad,senddetails);
		Address address2 = new Address(receiveprovince,receivecity,receivedistrict,receiveroad,receivedetails);
		Express express = new Express(0,sendname,receivename,receivephone,receivedetails);
		express.setStation(1);
		System.out.println("存入express类的数据"+express.getSendman()+express.getReceiveName()+express.getReceivePhone()+express.getReceiveAddress()+express.getStation());
		
		try{
			if(deliverydb.deliverycus(customer)){
				System.out.println("顾客插入成功");
                
			}
			if(deliverydb.deliveryadd(address1)){
				System.out.println("寄件人地址插入成功");
			}
			if(deliverydb.deliveryadd(address2)){
				System.out.println("收件人地址插入成功");
			}
			if(deliverydb.deliveryexp(express)){
				System.out.println("快递插入成功");
				
			}
			if(deliverydb.deliveryrot(address1,address2,express)){
				System.out.println("rid插入成功");
				response.sendRedirect("deliverysuccess.jsp");
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		DeliverySuccessDb deliveryseccessdb = new DeliverySuccessDb();
		
		int id=deliveryseccessdb.deliveryShow();
		System.out.println(id);
		session.setAttribute("id", id);
		
	}

}
