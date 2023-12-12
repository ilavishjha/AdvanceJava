package in.co.rays.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Marksheet1Model {
	public void add(Marksheet1Bean bean) throws Exception {
		int pk = nextPk();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		ps.setInt(1, pk);
		ps.setString(2, bean.getName1());
		ps.setInt(3, bean.getRoll_no());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());
		int i = ps.executeUpdate();
		System.out.println("data inserted " + i);

	}

	public Integer nextPk() throws Exception {
		int pk = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		PreparedStatement ps = con.prepareStatement("select max(s_no) from marksheet");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			pk = rs.getInt(1);
		}
		return pk + 1;

	}

}
