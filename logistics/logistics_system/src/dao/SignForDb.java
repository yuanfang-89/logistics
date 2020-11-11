package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignForDb {
	Connection conn = null;
	PreparedStatement ps = null;
	
	public boolean signFor(int index) throws SQLException{
		boolean flag=false;
		
		String sql="update express set status=? where express.id=?";
    	conn = GetConnection.getconn();
		ps = conn.prepareStatement(sql);
		System.out.println("update express status"+index);
        ps.setInt(1, 1);
        ps.setInt(2, index);
        System.out.println("update express 状态");
    
        if (ps.executeUpdate() > 0) {
            flag = true;
            System.out.println(index);
    		System.out.println("将rid成功插入express表");
        }
		
    	ps.close();
    	conn.close();
		
		return flag;
	}
}
