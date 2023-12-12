package in.co.rays.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StateInsert {
	public static void main(String[] args) throws Exception {
		
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		  Statement stmt= conn.createStatement();
		  int i= stmt.executeUpdate("insert into marksheet values(3,'ok',103,2,2,2)"); 
		  System.out.println("inserted"+i);
	}
}
		 
