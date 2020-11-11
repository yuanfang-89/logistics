package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ComPerCenterDb {
	Connection conn = null;
	ResultSet res=null;
	PreparedStatement ps = null;
	
	public String comPerCenterShow() throws SQLException{
		
		String sql="select* from logisticscompany";
		conn = GetConnection.getconn();
		ps=conn.prepareStatement(sql);
		res=ps.executeQuery();
		String comname=null;
		
		while(res.next()){
			comname=res.getString("company_name");
			System.out.println("物流公司表查询成功");
		}
		res.close();
    	ps.close();
    	conn.close();
    	
    	return comname;
	}
}
