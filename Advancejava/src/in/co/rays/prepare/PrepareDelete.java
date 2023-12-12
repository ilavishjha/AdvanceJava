package in.co.rays.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareDelete {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
	PreparedStatement  ps=con.prepareStatement("delete from marksheet where s_no=5");
	int i =ps.executeUpdate();
	System.out.println("record deleted "+i);
}
}
