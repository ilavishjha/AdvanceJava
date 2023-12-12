package in.co.rays.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrepareFind {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
	PreparedStatement  ps=con.prepareStatement("select * from marksheet where s_no=8");
	ResultSet i =ps.executeQuery();
	while (i.next()) {
		System.out.print( i.getInt(1));
		System.out.print("\t"+i.getString(2));
		System.out.print("\t"+i.getInt(3));
		System.out.print("\t"+i.getInt(4));
		System.out.print("\t"+i.getInt(5));
		System.out.println("\t"+i.getInt(6));
	}
	
	
}
}
