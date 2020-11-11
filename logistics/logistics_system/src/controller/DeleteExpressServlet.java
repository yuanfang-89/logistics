package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DeleteExpressDb;
import dao.LoginDb;

@WebServlet("/DeleteExpressServlet")
public class DeleteExpressServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("进入DeleteExpressServlet-doPoset");
		request.setCharacterEncoding("utf-8");
		
		/*获取要删除的订单号*/
		DeleteExpressDb deleteexpressdb = new DeleteExpressDb();
		
		int trackingnumber = Integer.parseInt(request.getParameter("trackingnumber"));
		try {
			deleteexpressdb.deleteExpressShow(trackingnumber);
			System.out.println("物流公司成功删除订单");
			response.sendRedirect("companypage.jsp");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
		
	}

}
