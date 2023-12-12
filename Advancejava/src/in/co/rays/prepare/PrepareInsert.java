package in.co.rays.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareInsert {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
	PreparedStatement ps = con.prepareStatement("insert into marksheet values(8,'yogyata',108,100,100,100)");
	int i= ps.executeUpdate();
System.out.println("data inserted"+i);	
}
}
