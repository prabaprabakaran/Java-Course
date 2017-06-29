package com.util.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.util.DAO.EmployeeLogic;
import com.util.EmpBean.EmpBean;

@WebServlet("/view")
public class ViewServlet extends HttpServlet {
@Override
public void init() throws ServletException {

	super.init();
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	List<EmpBean> b1 = null;
	try {
		b1= new EmployeeLogic().view();
		req.setAttribute("list",b1);
		 req.getRequestDispatcher("/view.jsp").forward(req,resp);
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
}
   }

