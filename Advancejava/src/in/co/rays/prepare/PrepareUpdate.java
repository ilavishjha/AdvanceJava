package in.co.rays.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareUpdate {
	public static void main(String[] args) throws Exception {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
	PreparedStatement ps = con.prepareStatement("update marksheet set name='isha',roll_no=102,physics=94,maths=90,chemistry=99 where s_no=2");
	int i= ps.executeUpdate();
	System.out.println("data updated"+i);
}
}