package com.util.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import com.util.EmpBean.EmpBean;
import com.util.connection.DbConnection;
public class EmployeeLogic {
public static  int insert(EmpBean emp){
	int i=0;
	ResultSet rs=null;
	PreparedStatement pre=null;
	int Employee_id=0;
try{
    String str=("SELECT count_id.NEXTVAL FROM DUAL");
    pre=DbConnection.con().prepareStatement(str);
    rs=pre.executeQuery();
    if(rs.next()){
    	Employee_id=rs.getInt(1);
    }
	pre=DbConnection.con().prepareStatement("insert into mathi values(?,?,?)");
	pre.setInt(1,Employee_id);
    pre.setString(2,emp.getEmployee_name());
    pre.setString(3,emp.getEmployee_Course());
    i=pre.executeUpdate();
if(pre!=null){
	pre.close();
}
if(DbConnection.con()!=null){
	DbConnection.con().close();
}
}
catch(Exception e){
	e.printStackTrace();
}
return i;
}
	public static  List<EmpBean> view() throws SQLException{
		ResultSet rs=null;
		Statement st=DbConnection.con().createStatement();
		String str="select * from mathi";
		rs=st.executeQuery(str);
		while(rs.next()){
			EmpBean emp=new EmpBean();
			emp.setEmployee_id(rs.getInt("Emp_id"));
			emp.setEmployee_name(rs.getString("Emp_name"));
			emp.setEmployee_Course(rs.getString("Emp_course"));
		}
		return null;
		
	}
}

