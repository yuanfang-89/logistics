package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDb {
	Connection conn = null;
	ResultSet res=null;
	PreparedStatement ps=null;
	List<Integer> list1 = new ArrayList<Integer>();
	
	public List<Integer> compare(String username,String password){
		int m = 0;
		int r = 0;
		//String sql = "select password,role from user where username='"+username+"'";
		String sql = "select* from user where username=? and password=?";
	    try{
	    	conn = GetConnection.getconn();
	    	ps=conn.prepareStatement(sql);
	    	ps.setString(1,username);
	    	ps.setString(2, password);
	    	res=ps.executeQuery();
	    	while(res.next())
	    	{
	    		System.out.println("进入登录查询的循环");
	    		r=res.getInt("role");
	    		m=1;
	    	}
	    	res.close();
	    	ps.close();
	    	conn.close();
	    	
	    }catch(SQLException e){
	    	e.printStackTrace();
	    }
	    
	    System.out.println(m);
	    System.out.println(r);
	    list1.add(m);
	    list1.add(r);
	    
	    return list1;
	}

}
