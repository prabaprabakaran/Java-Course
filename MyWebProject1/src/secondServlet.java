import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="second",urlPatterns="/sec")
public class secondServlet extends HttpServlet{
@Override
public void init() throws ServletException {
	// TODO Auto-generated method stub
	super.init();
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter p=resp.getWriter();
		p.println();
	}
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	RequestDispatcher rd=req.getRequestDispatcher("/thi");
	rd.forward(req,resp);
}	
}
