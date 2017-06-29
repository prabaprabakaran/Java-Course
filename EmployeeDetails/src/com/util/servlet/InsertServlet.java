package com.util.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.util.DAO.EmployeeLogic;
import com.util.EmpBean.EmpBean;
@WebServlet("/insert")
public class InsertServlet extends HttpServlet{
@Override
public void init() throws ServletException {
	
	super.init();
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	EmpBean emp=new EmpBean();
	emp.setEmployee_id(Integer.parseInt(req.getParameter("Emp_id")));
	emp.setEmployee_name(req.getParameter("Emp_name"));
	emp.setEmployee_Course("Emp_course");
	EmployeeLogic.insert(emp); 
	RequestDispatcher re=req.getRequestDispatcher("/view");
	re.forward(req,resp);
}
	
}
