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
		System.out.println("进入RegisterServlet-doPoset");
		request.setCharacterEncoding("utf-8");
		
		//获取注册用户名
        String username=request.getParameter("username");
       
        //获取注册用户密码
        String password=request.getParameter("password");
        
        //设置用户角色为顾客
        System.out.println(username+"--"+password);
        RegisterDb registerdb= new RegisterDb();
        User user=new User(username,password);
        user.setRole(0);
        
        try {
            
            if(registerdb.regist(user)) {
            	System.out.println("注册成功");
                response.sendRedirect("firstinterface.jsp");
            }else {
            	System.out.println("注册失败");
                response.sendRedirect("register.jsp");
       
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
