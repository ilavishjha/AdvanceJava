package in.co.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		//testAdd();
//testDelete();
		// testUpdate();
		for (int i = 1; i <=50; i++) {
			testFindId();
			System.out.println("ok"+i);
			
		}
		
		 //testSearch();

	}

	private static void testSearch() throws Exception {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean=new MarksheetBean();
		//bean.setName("amit");
		bean.setRoll_no(104);
		List list = model.search(bean,2,5);
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
		bean = (MarksheetBean) it.next();
			System.out.print(bean.getS_no());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRoll_no());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());
		}

	}

	private static void testDelete() throws Exception {
		MarksheetModel model = new MarksheetModel();
		model.delete("himanshu");
	}

	private static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setS_no(13);
		bean.setName("himanshu");
		bean.setRoll_no(104);
		bean.setPhysics(53);
		bean.setChemistry(23);
		bean.setMaths(85);

		MarksheetModel model = new MarksheetModel();
		model.add(bean);
	}

	private static void testUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.getS_no();
		bean.setName("himanshu");
		bean.setRoll_no(107);
		bean.setPhysics(63);
		bean.setChemistry(82);
		bean.setMaths(97);

		MarksheetModel model = new MarksheetModel();
		model.update(bean);

	}

	private static void testFindId() throws Exception {

		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = model.findId(2);
		if (bean != null) {
			System.out.print(bean.getS_no());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRoll_no());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		} else {

			System.out.println("ID does not exist...!!!");

		}

	}

}
