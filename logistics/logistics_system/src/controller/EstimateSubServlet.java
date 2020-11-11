package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EstimateDb;

@WebServlet("/EstimateSubServlet")
public class EstimateSubServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("����EstimateSubServlet-doPoset");
		request.setCharacterEncoding("utf-8");
		
		//���estimate.jsp������
		String est=request.getParameter("estimate");
		System.out.println("����estimate.jsp�����estimate"+est);
		int index = Integer.parseInt(request.getParameter("id"));
		System.out.println("����estimate.jsp�����index"+index);
		EstimateDb estmate = new EstimateDb();
		try {
			if(estmate.estimateInsert(est,index)){
				System.out.println("express��estimate�޸ĳɹ�");
				response.sendRedirect("/logistics_system/ExpressInfoServlet");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
