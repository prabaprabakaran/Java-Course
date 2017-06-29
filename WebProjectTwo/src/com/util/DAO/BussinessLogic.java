package com.util.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.util.bean.*;
import com.util.connection.*;
import com.util.connection.DbConnection;

import sun.nio.cs.ext.Big5_HKSCS_2001;
public class BussinessLogic {
public List<student1> getList() throws SQLException{
	List<student1>st=new ArrayList<student1>();
	student1 stuObj=new student1();
	Statement sta=DbConnection.jdbc().createStatement();
	String sql="select * from student";
	ResultSet rt=sta.executeQuery(sql);
	while(rt.next()){
		stuObj.setStu_name(rt.getString("stu_name"));
		stuObj.setStu_id(rt.getInt("stu_id"));
		stuObj.setSal(rt.getInt("sal"));
		st.add(stuObj);
	}
	if(sta!=null){
		sta.close();
	}
	if(rt!=null){
		rt.close();
	}
if(DbConnection.jdbc()!=null){
	DbConnection.jdbc().close();
}
	
	return st;
	
}
public static void main(String[] args) throws SQLException {
	BussinessLogic bl=new BussinessLogic();
	System.out.println(bl.getList());
	
}
}