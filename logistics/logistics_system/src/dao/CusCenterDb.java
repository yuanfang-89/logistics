package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Address;
import bean.Customer;

public class CusCenterDb {
	Connection conn = null;
	ResultSet res=null;
	PreparedStatement ps = null;
	
	List<Customer> cuslist = new ArrayList<Customer>();
	List<Address> addrlist = new ArrayList<Address>();
	
	
	public List cusCenterShow(String uname) throws SQLException{
		String sql="select * from customer,address where username=? and details=customer_address";
		
		conn = GetConnection.getconn();
		ps=conn.prepareStatement(sql);
		ps.setString(1, uname);
		res=ps.executeQuery();
		while(res.next())
    	{
			System.out.println("进入顾客表");
			String username=res.getString("username");
	        String password=res.getString("password");
			String name=res.getString("customer_name");
			String phone=res.getString("customer_phone");
            String address=res.getString("customer_address");
            Customer customer=new Customer(username,password ,name ,phone,address );
            cuslist.add(customer);
		
            System.out.println("获取顾客表成功");
    	}
		
    	res.close();
    	ps.close();
    	conn.close();
		
    	return cuslist;
	}
	
	
	
	public List cusCenteraddrShow(String uname) throws SQLException{
		String sql="select * from customer,address where username=? and details=customer_address";
		
		conn = GetConnection.getconn();
		ps=conn.prepareStatement(sql);
		ps.setString(1, uname);
		res=ps.executeQuery();
		while(res.next())
    	{
			System.out.println("进入地址表");
		
            String province=res.getString("province");
            String city=res.getString("city");
            String district=res.getString("district");
            String road=res.getString("road");
            String details=res.getString("details");
 
            Address address=new Address(province,city,district,road,details);
            addrlist.add(address);
		
            System.out.println("获取顾客表成功");
    	}
		
    	res.close();
    	ps.close();
    	conn.close();
		
    	return addrlist;
	}

}
