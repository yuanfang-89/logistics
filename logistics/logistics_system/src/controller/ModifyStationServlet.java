package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ModifyStationDb;

@WebServlet("/ModifyStationServlet")
public class ModifyStationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ModifyStationServlet-doPost");
		request.setCharacterEncoding("utf-8");
		
		Integer trackingnumber = request.getParameter("trackingnumber") != null && !request.getParameter("trackingnumber").equals("") ? Integer.parseInt(request.getParameter("trackingnumber")) : null;
		System.out.println("¶©µ¥ºÅ "+trackingnumber);
		
		ModifyStationDb modifyStationdb = new ModifyStationDb();
	
		try {
			
			modifyStationdb.modifyStation(trackingnumber);
			response.sendRedirect("companypage.jsp");
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
