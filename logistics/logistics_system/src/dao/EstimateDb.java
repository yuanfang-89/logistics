package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EstimateDb {
	Connection conn = null;
	PreparedStatement ps = null;
	
	public boolean estimateInsert(String es,int index) throws SQLException{
		boolean flag=false;
		
		String sql="update express set estimate=? where express.id=?";
    	conn = GetConnection.getconn();
		ps = conn.prepareStatement(sql);
		System.out.println("update express estimate"+index);
        ps.setString(1, es);
        ps.setInt(2, index);
        System.out.println("update express 评价");

        if (ps.executeUpdate() > 0) {
            flag = true;
            System.out.println(index);
    		System.out.println("将estimate成功插入express表");
        }
		
    	ps.close();
    	conn.close();
		
		return flag;
	}
}
