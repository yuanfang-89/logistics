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
import bean.Route;

public class InquiryDb {
	Connection conn = null;
	ResultSet res=null;
	PreparedStatement ps = null;
	
	List<Customer> listc = new ArrayList<Customer>();
	List<Address> lista = new ArrayList<Address>();
	List<Express> liste = new ArrayList<Express>();
	List<Route> listr = new ArrayList<Route>();
	
	String sname=null;
	String rname=null;
	String rphone=null;
	String rdetails=null;
	int routeid=0;
	int esta=0;
	
	public List<Customer> inquiryCusShow(int trackingnumber) throws SQLException{
		String sql="select * from express,customer,address where express.id=? and express.sendman=customer.customer_name and customer_address=details";
		
		conn = GetConnection.getconn();
		ps=conn.prepareStatement(sql);
		ps.setInt(1, trackingnumber);
		res=ps.executeQuery();
		while(res.next())
    	{
    		/*int id=res.getInt("id");*/
			System.out.println("进入顾客和地址listc和lista");
			routeid=res.getInt("rid");
			System.out.println("查询rid="+routeid);
			esta=res.getInt("station");
			String username=res.getString("username");
	        String password=res.getString("password");
            sname=res.getString("customer_name");
            String sphone=res.getString("customer_phone");
            String sprovince=res.getString("province");
            String scity=res.getString("city");
            String sdistrict=res.getString("district");
            String sroad=res.getString("road");
            String sdetails=res.getString("details");
            Customer customer=new Customer(username,password ,sname ,sphone,sdetails );
            Address address1=new Address(sprovince,scity,sdistrict,sroad,sdetails);
            listc.add(customer);
            lista.add(address1);
		
            System.out.println("顾客和地址存入listc和lista");
    	}
		System.out.println(sname);
		System.out.println("查询成功从顾客页面取出寄件人地址快递信息");
		
    	res.close();
    	ps.close();
    	conn.close();
		
    	return listc;
	}
	
	
	public List<Address> inquiryAddrShow(int trackingnumber){
		
		try {
			String sql2="select * from express,address,customer where express.sendman=customer_name and express.receiveaddress=details and express.id=?";
			conn = GetConnection.getconn();
			ps=conn.prepareStatement(sql2);
			ps.setInt(1, trackingnumber);
			res=ps.executeQuery();
			while(res.next()){
				System.out.println("进入地址和lista");
				rname=res.getString("receivename");
				rphone=res.getString("receivephone");
				String rprovince=res.getString("province");
				String rcity=res.getString("city");
				String rdistrict=res.getString("district");
				String rroad=res.getString("road");
				rdetails=res.getString("details");
				Address address2=new Address(rprovince,rcity,rdistrict,rroad,rdetails);
				lista.add(address2);
				
				System.out.println("地址存入lista");
			}
			System.out.println(rdetails);
			System.out.println("查询成功从地址页面取出收件人快递信息");
			res.close();
	    	ps.close();
	    	conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	public List<Express> inquiryExShow(){
		
		Express express=new Express(0,sname,rname,rphone,rdetails);
		liste.add(express);
		System.out.println("快递存入liste");
		System.out.println(sname+" "+rname+" "+rphone+" "+rdetails);
		System.out.println("查询成功从快递页面取出快递信息");
		return liste;
	}
	
	public List<Route> inquiryRotShow() throws SQLException{
		String sql="select * from route where route.rtid=?";
		
		conn = GetConnection.getconn();
		ps=conn.prepareStatement(sql);
		ps.setInt(1, routeid);
		res=ps.executeQuery();
		while(res.next()){
			if(esta==1){
				String firststation=res.getString("first_station");
				Route route = new Route(routeid,firststation);
				listr.add(route);
				System.out.println("成功从route获得数据");
				System.out.println(firststation);
			}else if(esta==2){
				String firststation=res.getString("first_station");
				String secondstation=res.getString("second_station");
				Route route = new Route(routeid,firststation,secondstation);
				listr.add(route);
				System.out.println("成功从route获得数据");
				System.out.println(firststation+secondstation);
			}else if(esta==3){
				String firststation=res.getString("first_station");
				String secondstation=res.getString("second_station");
				String thirdstation=res.getString("third_station");
				Route route = new Route(routeid,firststation,secondstation,thirdstation);
				listr.add(route);
				System.out.println("成功从route获得数据");
				System.out.println(firststation+secondstation+thirdstation);
			}else if(esta==4){
				String firststation=res.getString("first_station");
				String secondstation=res.getString("second_station");
				String thirdstation=res.getString("third_station");
				String fourthstation=res.getString("fourth_station");
				Route route = new Route(routeid,firststation,secondstation,thirdstation,fourthstation);
				listr.add(route);
				System.out.println("成功从route获得数据");
				System.out.println(firststation+secondstation+thirdstation+fourthstation);
			}else if(esta==5){
				String firststation=res.getString("first_station");
				String secondstation=res.getString("second_station");
				String thirdstation=res.getString("third_station");
				String fourthstation=res.getString("fourth_station");
				String endstation=res.getString("end_station");
				Route route = new Route(routeid,firststation,secondstation,thirdstation,fourthstation,endstation);
				listr.add(route);
				System.out.println("成功从route获得数据");
				System.out.println(firststation+secondstation+thirdstation+fourthstation+endstation);
			}
			
		}
		
		System.out.println("查询成功route信息");
		res.close();
    	ps.close();
    	conn.close();
    	
		return listr;
	}
	
}
