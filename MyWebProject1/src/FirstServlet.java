import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="praba",urlPatterns="/am")
public class FirstServlet extends HttpServlet{
@Override
public void init() throws ServletException {
	// TODO Auto-generated method stub
	super.init();
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		out.println("<h1>WelCome Praba "+new Date()+"</h1>");
		String name=req.getParameter("my");	
		String age=req.getParameter("age");
		out.println("<h1>name="+name+ "age=" +age);
}	
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out=resp.getWriter();
	out.println("<h1>WelCome Praba "+new Date()+"</h1>");
	//String name=req.getParameter("my");	
	//String age=req.getParameter("age");
	//out.println("<h1>name="+name+ "age=" +age);
	RequestDispatcher rd=req.getRequestDispatcher("/sec");
	rd.forward(req,resp);
}	

}
