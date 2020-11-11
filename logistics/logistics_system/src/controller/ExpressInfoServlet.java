package controller;

import java.io.IOException;
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
import dao.ExpressInfoDb;

@WebServlet("/ExpressInfoServlet")
public class ExpressInfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("ExpressInfoServlet-doPost");
		request.setCharacterEncoding("utf-8");

		ExpressInfoDb expressinfodb = new ExpressInfoDb();

		//从数据库获取快递的信息
		List<Customer> listci = expressinfodb.expressCusShow();
		request.getSession().setAttribute("listci", listci);
		List<Address> listaci = expressinfodb.expressAddrcShow();
		request.getSession().setAttribute("listaci", listaci);
		List<Address> listari = expressinfodb.expressAddrShow();
		request.getSession().setAttribute("listari", listari);
		List<Express> listei = expressinfodb.expressExShow();
		request.getSession().setAttribute("listei", listei);
		
		response.sendRedirect("expressinfo.jsp");
		//request.getRequestDispatcher("expressinfo.jsp").forward(request,response);
				
	}

}
