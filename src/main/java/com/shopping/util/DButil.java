 package com.shopping.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {

	private static Connection connection;
	
	public static Connection getConnection() throws SQLException {
		if(connection != null)
		{
			return connection;
		}
		else {
			
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/shopping?useSSL=false";
			String user = "root"; 
			String password = "123456789";
			
			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		return connection;
	}
	
}