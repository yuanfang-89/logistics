package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Address;
import bean.Customer;
import dao.CusCenterDb;

@WebServlet("/CusCenterServlet")
public class CusCenterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("进入CusCenterServlet-doPoset");
		request.setCharacterEncoding("utf-8");
		
		//接收来自登录界面的用户名
		HttpSession  session = request.getSession(); 
		String username = (String)session.getAttribute("username");
		
		CusCenterDb cusCenterDb = new CusCenterDb();

		List<Customer> cuslist = new ArrayList<Customer>();
		List<Address> addrlist = new ArrayList<Address>();
		
		try {
			cuslist=cusCenterDb.cusCenterShow(username);
			addrlist=cusCenterDb.cusCenteraddrShow(username);
			
			//获取顾客的基本信息
			request.getSession().setAttribute("listcus", cuslist);
			request.getSession().setAttribute("listaddr", addrlist);
			
			response.sendRedirect("cuspercenter.jsp");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
