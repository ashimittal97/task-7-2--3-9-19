package com.worldpay.jdbcEmp;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {
	public static Connection Conndemo(){
		Connection con = null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		      
		        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		        System.out.println("Connected");

		}catch(Exception ex)
		{
		ex.printStackTrace();
		}
		return con;
		}

}
