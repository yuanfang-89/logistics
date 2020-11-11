package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SignForDb;

@WebServlet("/SignForServlet")
public class SignForServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("进入SignForServlet的doPost");
		request.setCharacterEncoding("utf-8");
		
		
		//来自我的快递信息界面
		int index = Integer.parseInt(request.getParameter("id")); 
		//Integer index = request.getParameter("index") != null && !request.getParameter("index").equals("") ? Integer.parseInt(request.getParameter("index")) : null;
		//Integer index = request.getAttribute("index") != null && !request.getAttribute("index").equals("") ? Integer.parseInt(request.getAttribute("index")) : null;
		//Integer index=Integer.parseInt(String.valueOf(request.getAttribute("index")!= null ? request.getAttribute("index") : "0").trim());
		System.out.println("来自expressinfo.jsp界面的index"+index);
		SignForDb signfordb = new SignForDb();
		try {
			if(signfordb.signFor(index)){
				System.out.println("express的status修改成功");
				response.sendRedirect("/logistics_system/ExpressInfoServlet");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
