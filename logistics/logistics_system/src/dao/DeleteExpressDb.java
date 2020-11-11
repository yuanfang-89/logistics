package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteExpressDb {
	Connection conn = null;
	ResultSet res=null;
	PreparedStatement ps = null;
	
	
	
	public void deleteExpressShow(int trackingnumber) throws SQLException{
		
		int id=0;
		int status=0;
		String sendman=null;
		String receivename=null;
		String receivephone=null;
		String receiveaddress=null;
		String estimate=null;
		int rid=0;
		int station=0;
		
		String sql="select* from express where id=?";
		conn = GetConnection.getconn();
    	ps=conn.prepareStatement(sql);
    	ps.setInt(1, trackingnumber);
    	res=ps.executeQuery();
    	
    	while(res.next()){
    		id=res.getInt("id");
    		status=res.getInt("status");
    		sendman=res.getString("sendman");
    		receivename=res.getString("receivename");
    		receivephone=res.getString("receivephone");
    		receiveaddress=res.getString("receiveaddress");
    		estimate=res.getString("estimate");
    		rid=res.getInt("rid");
    		station=res.getInt("station");
    		System.out.println("查找到了快递表"+trackingnumber+"将要删除");
    		
    	}
    	res.close();
    	ps.close();
    	conn.close();
    	
    	
    	String sql2="delete from express where id='"+trackingnumber+"'";
    	conn = GetConnection.getconn();
    	ps=conn.prepareStatement(sql2);
    	if (ps.executeUpdate() > 0) {
    		System.out.println("express表删除成功");
    	}
    	
    	ps.close();
    	conn.close();
    	
    	
    	
    	
    	String sql3="insert into deletedorder(id,status,sendman,receivename,receivephone,receiveaddress,estimate,rid,station)values(?,?,?,?,?,?,?,?,?)";
		conn = GetConnection.getconn();
    	ps=conn.prepareStatement(sql3);
    	ps.setInt(1, id);
    	ps.setInt(2, status);
    	ps.setString(3, sendman);
    	ps.setString(4, receivename);
    	ps.setString(5, receivephone);
    	ps.setString(6, receiveaddress);
    	ps.setString(7, estimate);
    	ps.setInt(8, rid);
    	ps.setInt(9, station);
    	
    	if (ps.executeUpdate() > 0) {
            System.out.println("删除表插入成功");
            ps.close();
        	conn.close();
        }
    	
	}
}
