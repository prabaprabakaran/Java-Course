package com.util.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.util.DAO.*;
import com.util.bean.student1;
import com.util.connection.DbConnection;
@WebServlet(name="my",urlPatterns="/stud")
public class stuServlet extends HttpServlet{
@Override
public void init(ServletConfig config) throws ServletException {
	
	super.init(config);
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<student1> b1;
		try {
			b1= new BussinessLogic().getList();
			req.setAttribute("list",b1);
			RequestDispatcher re=req.getRequestDispatcher("/stu.jsp");
			re.forward(req,resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
