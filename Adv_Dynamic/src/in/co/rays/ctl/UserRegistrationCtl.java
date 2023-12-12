package in.co.rays.ctl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/UserRegistrationCtl")
public class UserRegistrationCtl extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("UserRegistrationView.jsp");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserModel model = new UserModel();
		UserBean bean = new UserBean();
		UserBean existBean = null;

		String fname = req.getParameter("firstname");
		String lname = req.getParameter("lastname");
		String login = req.getParameter("loginid");
		String pass = req.getParameter("password");
		String dob = req.getParameter("DOB");
		String add = req.getParameter("address");

		System.out.println(login);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			existBean = model.findByLogin(login);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		if (existBean != null) {
			RequestDispatcher rd = req.getRequestDispatcher("UserRegistrationView.jsp");
			rd.forward(req, resp);
		} else {

			bean.setFirst_name(fname);
			bean.setLast_name(lname);
			bean.setLogin_id(login);
			bean.setPassword(pass);
			try {
				bean.setDob(sdf.parse(dob));
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			bean.setAddress(add);

			try {
				model.add(bean);
			} catch (Exception e) {
				e.printStackTrace();
			}
			resp.sendRedirect("LoginView.jsp");
		}

	}
}
