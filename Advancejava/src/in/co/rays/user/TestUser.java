package in.co.rays.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUser {
	public static void main(String[] args) throws Exception {

		//testDelete();
		// testadd();
		// testupdate();
		
			testsearch();
			
		

		//testAuthenticate();
	}

	private static void testAuthenticate() throws Exception {
	UserModel model=new UserModel();
	UserBean bean=model.authenticate("lavish@gmail.com","123");
		if (bean!=null) {
			System.out.print(bean.getId());
			System.out.print("\t"+bean.getFirst_name());
			System.out.print("\t"+bean.getLast_name());
			System.out.print("\t"+bean.getLogin_id());
			System.out.print("\t"+bean.getPassword());
			System.out.print("\t"+bean.getDob());
			System.out.println("\t"+bean.getAddress());
			
		}	
	}

	
	private static void testDelete() throws Exception {
		UserBean bean = new UserBean();
		UserModel model = new UserModel();
		model.delete(5);
	}

	
	private static void testsearch() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();
		bean.setDob(sdf.parse("2004-01-01"));
		UserModel model = new UserModel();
		List list = model.search(bean);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			bean = (UserBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirst_name());
			System.out.print("\t" + bean.getLast_name());
			System.out.print("\t" + bean.getLogin_id());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getAddress());
		}

	}

	private static void testupdate() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		UserBean bean = new UserBean();
		bean.setId(2);
		bean.setFirst_name("sagar");
		bean.setLast_name("patidar");
		bean.setLogin_id("sagar@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("2005-05-01"));
		bean.setAddress("indore");

		UserModel model = new UserModel();
		model.update(bean);

	}

	private static void testadd() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		UserBean bean = new UserBean();

		bean.setFirst_name("yogyata");
		bean.setLast_name("verma");
		bean.setLogin_id("yogyata@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("1997-50-25"));
		bean.setAddress("indore");

		UserModel model = new UserModel();
		model.add(bean);

	}

}
