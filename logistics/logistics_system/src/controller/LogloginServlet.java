package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.GetConnection;
import dao.LoginDb;
import bean.User;

@WebServlet("/LogloginServlet")
public class LogloginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost---");
		request.setCharacterEncoding("utf-8");
		
		/*��ȡ�˻�������������*/
		LoginDb logindb = new LoginDb();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(username+"--"+password);
		
		
		//�����Ŀ�ݽ���
		HttpSession session =request.getSession();
        session.setAttribute("username", username);
        session.setAttribute("password", password);
        
        List<Integer> list1=logindb.compare(username,password);
        
        if(list1.get(0)==1){
        	if(list1.get(1)==0){
        		//����role���
            	session.setAttribute("role", 0);
        		System.out.println("roleΪ��"+0);
    			System.out.println("��¼�ɹ���");
    			response.sendRedirect("customerpage.jsp");
    		}
    		else if(list1.get(1)==1){
    			//����role���
    			session.setAttribute("role", 1);
        		System.out.println("roleΪ��"+1);
    			System.out.println("��¼�ɹ���");
    			response.sendRedirect("companypage.jsp");
    		}
        	
        }else if(list1.get(0)==0){
        	System.out.println("�˻����������");
			response.sendRedirect("firstinterface.jsp");
        }

	}

}
