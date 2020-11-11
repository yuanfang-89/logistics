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

public class ExpressInfoDb {
	
	Connection conn = null;
	ResultSet res=null;
	PreparedStatement ps = null;
	
	List<Customer> listc = new ArrayList<Customer>();
	List<Address> listac = new ArrayList<Address>();
	List<Address> listar = new ArrayList<Address>();
	List<Express> liste = new ArrayList<Express>();
	
	
	String sendname=null;
	String receivename=null;
	String receivephone=null;
	String receivedetails=null;
	String est=null;
	int id=0;
	int sta=0;
	
	int num=0;
	List<String> sname=new ArrayList<String>();
	List<String> rname=new ArrayList<String>();
	List<String> rphone=new ArrayList<String>();
	List<String> rdetails=new ArrayList<String>();
	List<Integer> exid=new ArrayList<Integer>();
	List<Integer> status=new ArrayList<Integer>();
	List<String> estm=new ArrayList<String>();
	
	public List<Customer> expressCusShow(){
		try{
			String sql="select * from express,customer,address where express.sendman=customer.customer_name and customer_address=details";
			conn = GetConnection.getconn();
			ps=conn.prepareStatement(sql);
			res=ps.executeQuery();
	         
			while(res.next())
	    	{
				id=res.getInt("id");
				exid.add(id);
				sta=res.getInt("status");
				status.add(sta);
				est=res.getString("estimate");
				estm.add(est);
				++num;
				System.out.println("进入顾客和地址listci和listai");
				String username=res.getString("username");
		        String password=res.getString("password");
	            sendname=res.getString("customer_name");
	            sname.add(sendname);
	            String sendphone=res.getString("customer_phone");
	            String sendprovince=res.getString("province");
	            String sendcity=res.getString("city");
	            String senddistrict=res.getString("district");
	            String sendroad=res.getString("road");
	            String senddetails=res.getString("details");
	            Customer customer=new Customer(username,password ,sendname ,sendphone,senddetails );
	            Address address1=new Address(sendprovince,sendcity,senddistrict,sendroad,senddetails);
	            listc.add(customer);
	            listac.add(address1);
			
	            System.out.println("顾客和地址存入listci和listai");
	    	}
			
			System.out.println(sendname);
			System.out.println("信息成功从顾客页面取出寄件人地址快递信息");
		        res.close();
		    	ps.close();
		    	conn.close();
				
	        } catch (SQLException e) {
	             e.printStackTrace();
	         }
		return listc;
	 }
	
	
	public List<Address> expressAddrcShow(){
		
		return listac;
	}
	
	
	public List<Address> expressAddrShow(){
		try {
			String sql2="select * from express,address,customer where express.sendman=customer_name and express.receiveaddress=details";
			conn = GetConnection.getconn();
			ps=conn.prepareStatement(sql2);
			
			res=ps.executeQuery();
			while(res.next()){
				System.out.println("进入地址和listai");
				receivename=res.getString("receivename");
				rname.add(receivename);
				receivephone=res.getString("receivephone");
				rphone.add(receivephone);
				String receiveprovince=res.getString("province");
				String receivecity=res.getString("city");
				String receivedistrict=res.getString("district");
				String receiveroad=res.getString("road");
				receivedetails=res.getString("details");
				rdetails.add(receivedetails);
				Address address2=new Address(receiveprovince,receivecity,receivedistrict,receiveroad,receivedetails);
				listar.add(address2);
				System.out.println();
				System.out.println("地址存入listai");
			}
			System.out.println(receivedetails);
			System.out.println("信息成功从地址页面取出收件人快递信息");
			res.close();
	    	ps.close();
	    	conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listar;
	}
	
	public List<Express> expressExShow(){
		
		for(int i=0; i<num; i++){
			Express express=new Express(exid.get(i),status.get(i),sname.get(i),rname.get(i),rphone.get(i),rdetails.get(i),estm.get(i));
			liste.add(express);
		}

		System.out.println("快递存入listei");
		System.out.println(sendname+" "+receivename+" "+receivephone+" "+receivedetails);
		System.out.println("信息成功从快递页面取出快递信息");
		return liste;
	}
	
	

}
