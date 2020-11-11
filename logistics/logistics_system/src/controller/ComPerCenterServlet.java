package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ComPerCenterDb;

@WebServlet("/ComPerCenterServlet")
public class ComPerCenterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("����ComPerCenterServlet-doPoset");
		request.setCharacterEncoding("utf-8");
		
		ComPerCenterDb comPerCenterdb = new ComPerCenterDb();
		try {
			
			String comname=comPerCenterdb.comPerCenterShow();
			
			//��session�л��������˾����
			request.getSession().setAttribute("comname", comname);
			System.out.println("�õ���������"+comname);
			
			//���ݴ�session��õ�role�ж�Ϊ�˿ͻ��ǹ���Ա
			HttpSession  session = request.getSession(); 
			int rol = (int)session.getAttribute("role");
			
			if(rol==0){
				//response.sendRedirect("inquirysuccess.jsp");
				response.sendRedirect("aboutcompany.jsp");
			}
			if(rol==1){
				//response.sendRedirect("cominquirysuccess.jsp");
				response.sendRedirect("compercenter.jsp");
			}
			//response.sendRedirect("compercenter.jsp");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
