package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.User;

public class RegisterDb {
	Connection conn = null;
	PreparedStatement ps = null;
	public boolean regist(User user) throws Exception{
		conn = GetConnection.getconn();
        boolean flag=false;
        
        String sql="insert into user(username,password,role)values(?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getPassword());
        ps.setInt(3, user.getRole());
        if (ps.executeUpdate() > 0) {
            flag = true;
        }
        return flag;
    }


}
