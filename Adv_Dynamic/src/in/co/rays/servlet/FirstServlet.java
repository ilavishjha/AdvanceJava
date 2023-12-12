package in.co.rays.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String fname = req.getParameter("fName");
	String lname = req.getParameter("lName");
	
	System.out.println(fname);
	System.out.println(lname);
	
	resp.sendRedirect("SecondServlet");
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String fname = req.getParameter("firstname");
	String lname = req.getParameter("lastname");

	System.out.println(fname);
	System.out.println(lname);
	
RequestDispatcher rd=req.getRequestDispatcher("SecondServlet");
rd.forward(req, resp);
}
}