package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Address;
import bean.Customer;
import bean.Express;
import bean.Route;
import dao.InquiryDb;

@WebServlet("/InquiryServlet")
public class InquiryServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("����InquiryServlet-doPost");
		request.setCharacterEncoding("utf-8");
		
		//��ȡ���Բ�ѯ������˵���
		//int trackingnumber = Integer.parseInt(trackingnumber);
		Integer trackingnumber = request.getParameter("trackingnumber") != null && !request.getParameter("trackingnumber").equals("") ? Integer.parseInt(request.getParameter("trackingnumber")) : null;
		System.out.println("������ "+trackingnumber);
		
		InquiryDb inquirydb = new InquiryDb();
		
		try {
			List<Customer> listc = inquirydb.inquiryCusShow(trackingnumber);
			request.getSession().setAttribute("listc", listc);
			System.out.println("��ѯ�˿ͳɹ�");
			
			List<Address> lista = inquirydb.inquiryAddrShow(trackingnumber);
			request.getSession().setAttribute("lista", lista);
			System.out.println("��ѯ��ַ�ɹ�");
			
			List<Express> liste = inquirydb.inquiryExShow();
			request.getSession().setAttribute("liste", liste);
			System.out.println("��ѯ��ݳɹ�");
			
			List<Route> listr = inquirydb.inquiryRotShow();
			request.getSession().setAttribute("listr", listr);
			
			System.out.println("��ѯ·�߳ɹ�");
			
			
			//���ݴ�session��õ�role�ж�Ϊ�˿ͻ��ǹ���Ա
			HttpSession  session = request.getSession(); 
			int rol = (int)session.getAttribute("role");
			
			if(rol==0){
				response.sendRedirect("inquirysuccess.jsp");
			}
			if(rol==1){
				response.sendRedirect("cominquirysuccess.jsp");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
