package com.util.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DbConnection {
	public static Connection jdbc(){
		Connection con=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","mathi");
			System.out.println("Hello"+ con);
	       } catch (Exception e) {
		e.printStackTrace();
		}
		
		return con;
		}

	public static void main(String[] args) {
			
		jdbc();
			}}
