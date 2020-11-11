package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	public static Connection getconn(){
		String driverName="com.mysql.jdbc.Driver";
		Connection conn=null;
		//String url="jdbc:mysql://127.0.0.1:3306/logisticssystem?useUnicode=true&amp;characterEncodeing=UTF-8";
		//String url = "jdbc:mysql://localhost:3306/logisticssystem";
		String url="jdbc:mysql://127.0.0.1:3306/logisticssystem?useOldAliasMetadataBehavior=true";
		String user="root";
		String password="2017401365";
		
		try {
			  
			  Class.forName(driverName); //加载数据库驱动
			  conn = (Connection) DriverManager.getConnection(url, user, password); //建立数据库连接
			  System.out.println("数据库连接成功");
			  } catch (ClassNotFoundException e) {
			  e.printStackTrace();
			  } catch (SQLException e) {
			  e.printStackTrace();
			  }
		return conn;
	   }
	
}
