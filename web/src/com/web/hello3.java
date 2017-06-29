package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="am",urlPatterns="/girl")
public class hello3 extends HttpServlet{
@Override
public void init() throws ServletException {
	// TODO Auto-generated method stub
	super.init();
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter p=resp.getWriter();
		p.println("<h1>welcome hello3</h1>");
		String name=(String)req.getAttribute("one");
		p.println("<h1>"+name+"</h1>");
	//resp.sendRedirect("https://stackoverflow.com/questions/10827872/difference-between-string-replace-and-replaceall");
	}
}
