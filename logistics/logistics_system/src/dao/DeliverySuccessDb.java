package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Address;
import bean.Customer;
import bean.Express;

public class DeliverySuccessDb {
	Connection conn = null;
	ResultSet res=null;
	PreparedStatement ps = null;
	
	public int deliveryShow(){
		int id = 110;
		String sql="select max(id) from express";
		try{
			
			conn = GetConnection.getconn();
			ps=conn.prepareStatement(sql);
			res=ps.executeQuery();
	        
			while(res.next())
	        {
				id=res.getInt(1);
	        	System.out.println("���ݿ�������id "+id);
	            
	        }
			System.out.println("�ɹ��ӿ��ҳ��ȡ����ǰid");
		        res.close();
		    	ps.close();
		    	conn.close();
				
	        } catch (SQLException e) {
	             e.printStackTrace();
	         }
		return id;
	 }
	
}
