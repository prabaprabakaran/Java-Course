package com.util.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DbConnection {
	public static Connection jdbc(){
		Connection con=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			System.out.println(con);
	       } catch (Exception e) {
		e.printStackTrace();
		}
		
		return con;
		}

	public static void main(String[] args) {
			DbConnection jd=new DbConnection();
		jd.jdbc();
			}}
