package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import dao.GetConnection;
import dao.RegisterDb;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("����RegisterServlet-doPoset");
		request.setCharacterEncoding("utf-8");
		
		//��ȡע���û���
        String username=request.getParameter("username");
       
        //��ȡע���û�����
        String password=request.getParameter("password");
        
        //�����û���ɫΪ�˿�
        System.out.println(username+"--"+password);
        RegisterDb registerdb= new RegisterDb();
        User user=new User(username,password);
        user.setRole(0);
        
        try {
            
            if(registerdb.regist(user)) {
            	System.out.println("ע��ɹ�");
                response.sendRedirect("firstinterface.jsp");
            }else {
            	System.out.println("ע��ʧ��");
                response.sendRedirect("register.jsp");
       
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
