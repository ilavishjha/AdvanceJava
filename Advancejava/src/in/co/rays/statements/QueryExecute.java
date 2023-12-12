package in.co.rays.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryExecute {
	public static void main(String[] args) throws Exception {
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		Statement stmt = conn.createStatement();
		ResultSet i = stmt.executeQuery("select * from emp");
		while (i.next()) {
			System.out.print("\t" +i.getInt(1));
			System.out.print("\t"+i.getString(2));
			System.out.print("\t"+i.getInt(3));
			System.out.println("\t"+i.getInt(4));
			
		}
		

	}
}



