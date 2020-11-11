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
		System.out.println("����DeleteExpressServlet-doPoset");
		request.setCharacterEncoding("utf-8");
		
		/*��ȡҪɾ���Ķ�����*/
		DeleteExpressDb deleteexpressdb = new DeleteExpressDb();
		
		int trackingnumber = Integer.parseInt(request.getParameter("trackingnumber"));
		try {
			deleteexpressdb.deleteExpressShow(trackingnumber);
			System.out.println("������˾�ɹ�ɾ������");
			response.sendRedirect("companypage.jsp");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
		
	}

}
