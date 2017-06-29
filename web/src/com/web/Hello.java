package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="serv",urlPatterns="/save")
public class Hello extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter p=resp.getWriter();
	p.println("<h1>welcome</h1>");
	req.setAttribute("one","my");
	RequestDispatcher re=req.getRequestDispatcher("/boy");
	re.forward(req,resp);
	//Cookie cook=new Cookie("one","all");
	//cook.setMaxAge(300);
			//resp.addCookie(cook);
    
	/*RequestDispatcher re1=req.getRequestDispatcher("/girl");
	re1.include(req, resp);*/	
	}
}
