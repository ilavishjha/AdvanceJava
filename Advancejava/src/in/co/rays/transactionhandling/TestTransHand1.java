package in.co.rays.transactionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestTransHand1 {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			int i = stmt.executeUpdate("insert into emp values(10,'lavish',456)");
			i = stmt.executeUpdate("insert into emp values(10,'sagar',5685)");
			i = stmt.executeUpdate("insert into emp values(12,'lokesh',5874)");
			conn.commit();
			System.out.println("inserted" + i);
		} catch (Exception e) {
			conn.rollback();

		}

	}
}
