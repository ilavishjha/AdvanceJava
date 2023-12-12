package in.co.rays.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StateDelete {

	public static void main(String[] args) throws Exception {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		  Statement stmt= conn.createStatement();
		  int i= stmt.executeUpdate("delete from marksheet where s_no=3"); 
		  System.out.println("deleted"+i);

	}

}
