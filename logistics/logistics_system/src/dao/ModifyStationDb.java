package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModifyStationDb {
	Connection conn = null;
	ResultSet res=null;
	PreparedStatement ps = null;
	
	int stat=0;
	
	public int modifyStation(int trackingnumber) throws SQLException{
		
		String sql="select station from express where id=?";
		conn = GetConnection.getconn();
		ps=conn.prepareStatement(sql);
		ps.setInt(1,trackingnumber);
		res=ps.executeQuery();
		
		while(res.next()){
			stat=res.getInt(1);
			stat++;
		}
		res.close();
    	ps.close();
    	conn.close();
    	
    	
    	
    	String sql2="update express set station=? where id=?";
		conn = GetConnection.getconn();
		ps=conn.prepareStatement(sql2);
		ps.setInt(1, stat);
		System.out.println("stat的值为："+stat);
		ps.setInt(2,trackingnumber);
		
		if (ps.executeUpdate() > 0) {
    		System.out.println("将station成功修改为"+stat);
        }
			
		ps.close();
    	conn.close();
    	
    	return stat;
	}
}
