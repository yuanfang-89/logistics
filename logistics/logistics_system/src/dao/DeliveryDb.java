package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Address;
import bean.Customer;
import bean.Express;

public class DeliveryDb {
	Connection conn = null;
	ResultSet res=null;
	PreparedStatement ps = null;
	
	
	public boolean deliverycus(Customer customer)throws Exception{
		boolean m=false;
		boolean flag=false;
		String sql="select username from customer where customer_name=\""+customer.getCustomerName()+"\"";
		try{
	    	conn = GetConnection.getconn();
	    	ps=conn.prepareStatement(sql);
	   
	    	res=ps.executeQuery();
	    	while(res.next())
	    	{
	    		String pa=res.getString(1);
	    		if(pa.equals(customer.getCustomerUserName())){
	    			m = true;
	    		}
			
	    	}
	    	res.close();
	    	ps.close();
	    	conn.close();
	    	
	    }catch(SQLException e){
	    	e.printStackTrace();
	    }
		
	    if(m==false){
	    	
	    	conn = GetConnection.getconn();
	    	String sql2="insert into customer(username,password,customer_name,customer_phone,customer_address)values(?,?,?,?,?)";
			ps = conn.prepareStatement(sql2);
			ps.setString(1, customer.getCustomerUserName());
			ps.setString(2, customer.getCustomerPassWord());
	        ps.setString(3, customer.getCustomerName());
	        ps.setString(4, customer.getCustomerPhone());
	        ps.setString(5, customer.getCustomerAddress());
	        if (ps.executeUpdate() > 0) {
	            flag = true;
	        }
	    }
	    return flag;
	}
	
	public boolean deliveryadd(Address address)throws Exception{
		
		boolean flag=false;
		int m=0;
		String addrdetails=null;
		
		String sql="select* from address";
		conn = GetConnection.getconn();
		ps = conn.prepareStatement(sql);
		res=ps.executeQuery();
		while(res.next()){
			System.out.println("进入查询地址的while");
			addrdetails=res.getString("details");
			if(addrdetails.equals(address.getDetails())){
				m=1;
				System.out.println("找到相同的地址");
				ps.close();
				conn.close();
				break;
			}
		}
		
		
		if(m==0){
			System.out.println("没有相同的地址，将插入新地址");
			String sql2="insert into address(province,city,district,road,details)values(?,?,?,?,?)";
			conn = GetConnection.getconn();
			ps = conn.prepareStatement(sql2);
	        ps.setString(1, address.getProvince());
	        ps.setString(2, address.getCity());
	        ps.setString(3, address.getDistrict());
	        ps.setString(4, address.getRoad());
	        ps.setString(5, address.getDetails());
	        if (ps.executeUpdate() > 0) {
	            flag = true;
	            System.out.println("地址插入成功");
	            ps.close();
	            conn.close();
	        }
			
		}
		return flag;
	}
	
	public boolean deliveryexp(Express express) throws Exception{
		conn = GetConnection.getconn();
        boolean flag=false;
        
        String sql="insert into express(status,sendman,receivename,receivephone,receiveaddress)values(?,?,?,?,?)";
        ps = conn.prepareStatement(sql);
        
        ps.setInt(1, express.getStatus());
        ps.setString(2, express.getSendman());
        ps.setString(3, express.getReceiveName());
        ps.setString(4, express.getReceivePhone());
        ps.setString(5, express.getReceiveAddress());
        
        if (ps.executeUpdate() > 0) {
            flag = true;
            System.out.println("快递插入表中");
            ps.close();
        	conn.close();
        }
        return flag;
    }
	
	public boolean deliveryrot(Address address1 ,Address address2,Express express)throws Exception{
		
		boolean flag=false;
		int rid = 0;
		int eid = 0;

		String sql="select rtid from route where first_station=? and end_station=?";
		conn = GetConnection.getconn();
		ps = conn.prepareStatement(sql);
		ps.setString(1, address1.getCity());
		ps.setString(2, address2.getCity());
		res=ps.executeQuery();

		while(res.next())
    	{
    		/*int id=res.getInt("id");*/
			System.out.println("进入route");
			rid=res.getInt("rtid");
	        
		
            System.out.println("找到route的rtid");
    	}
		System.out.println(rid);
		System.out.println("查询成功route的rtid");
		
    	res.close();
    	ps.close();
    	conn.close();
    	
    	
    	String sql2="select max(id) from express";
		conn = GetConnection.getconn();
		ps = conn.prepareStatement(sql2);
		
		res=ps.executeQuery();

		while(res.next())
    	{
			eid=res.getInt(1);
			System.out.println("进入express");
	        
            System.out.println("找到express的id");
    	}
		System.out.println(eid);
		System.out.println("查询成功express的id");
		
    	res.close();
    	ps.close();
    	conn.close();
    	
    	
    	String sql3="update express set rid=?,station=? where express.id=?";
    	conn = GetConnection.getconn();
		ps = conn.prepareStatement(sql3);
		/*System.out.println("updaterouteid"+rid);*/
        ps.setInt(1, rid);
        ps.setInt(2, express.getStation());
        ps.setInt(3, eid);
        /*System.out.println("updateexpressstation"+express.getStation());
        System.out.println("updateexpresssid"+eid);*/
       
        if (ps.executeUpdate() > 0) {
        	
            flag = true;
            /*System.out.println(rid+" "+express.getStation());
    		System.out.println("将rid和station成功插入express表");*/
        }
		
		
    	res.close();
    	ps.close();
    	conn.close();
    	
		return flag;
	}
}
