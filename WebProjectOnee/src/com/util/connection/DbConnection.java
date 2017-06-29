package com.util.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DbConnection {
	public static Connection jdbc() throws SQLException, ClassNotFoundException{
		
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","mathi");
		
		
		}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
		jdbc();
			}}
