package in.co.rays.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String fname = req.getParameter("firstname");
	String lname = req.getParameter("lastname");
	
	System.out.println(fname);
	System.out.println(lname);
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String fname = req.getParameter("firstname");
	String lname = req.getParameter("lastname");
	
	System.out.println(fname);
	System.out.println(lname);
	}
}
