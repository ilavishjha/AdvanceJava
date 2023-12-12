package in.co.rays.transactionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestTransactionHandling {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("insert into emp values(10,'lavish',456)");
		i = stmt.executeUpdate("insert into emp values(10,'sagar',5685)");
		i = stmt.executeUpdate("insert into emp values(11,'lokesh',5874)");
		conn.commit();
		System.out.println("inserted" + i);
	}

}
