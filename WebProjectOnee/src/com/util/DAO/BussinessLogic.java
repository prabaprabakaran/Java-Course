package com.util.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

import com.util.bean.*;
import com.util.connection.*;
import com.util.connection.DbConnection;

import sun.nio.cs.ext.Big5_HKSCS_2001;
public class BussinessLogic {

	/*public static void insert() throws SQLException{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		con=DbConnection.jdbc();
		Statement st=con.createStatement();
		String str="alter table student add stu_date Date";
		 st.executeUpdate(str);
				try {
					if(con!=null){
					con.close();
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
	public static void inserting(student1 stu) throws ParseException, SQLException, ClassNotFoundException{
		Statement sta=DbConnection.jdbc().createStatement();
		String dat=stu.getDate();
		Date dt=new SimpleDateFormat("dd/MM/yyy").parse(dat);
        String ins="insert into student values('"+stu.getStu_id()+"','"+stu.getStu_name()+"','"+stu.getSal()+"','"
		+new SimpleDateFormat("dd/MM/yyy").format(dt)+"')";
        int i =sta.executeUpdate(ins);
        System.out.println(i>0);
		}
			
public List<student1> getList() throws SQLException, ClassNotFoundException{
	List<student1>st=new ArrayList<student1>();
	
	Statement sta=DbConnection.jdbc().createStatement();
	String view="select * from student";
    
    ResultSet re=sta.executeQuery(view);
    while(re.next()){
    	student1 stu=new student1();
    	Date dat=re.getDate("stu_date");
    	stu.setStu_id(re.getInt("stu_id"));
    	stu.setStu_name(re.getString("stu_name"));
    	stu.setSal(re.getInt("stu_sal"));
    	stu.setDate(""+dat);
    	 st.add(stu);
    	 
    }
   
	if(sta!=null){
		sta.close();
	}
	
if(DbConnection.jdbc()!=null){
	DbConnection.jdbc().close();
}
	
	return st;
	
}

public static void main(String[] args) throws SQLException {
	BussinessLogic bl=new BussinessLogic();
	
	
}
}
