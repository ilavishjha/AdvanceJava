package in.co.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

import in.co.rays.util.JDBCDataSource;



public class MarksheetModel {
	public void add(MarksheetBean bean) throws Exception {
		int pk = nextPk();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		ps.setInt(1, pk);
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getRoll_no());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());

		int i = ps.executeUpdate();
		System.out.println("data inserted " + i);
	}

	public void delete(String name) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		PreparedStatement ps = con.prepareStatement("delete from marksheet where name=?");
		ps.setString(1, name);
		int s = ps.executeUpdate();
		System.out.println("data deleted " + s);

	}

	public void update(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		PreparedStatement ps = con
				.prepareStatement("update marksheet set name=?,roll_no=?,physics=?,maths=?,chemistry=? where s_no=?");

		ps.setString(1, bean.getName());
		ps.setInt(2, bean.getRoll_no());
		ps.setInt(3, bean.getPhysics());
		ps.setInt(4, bean.getChemistry());
		ps.setInt(5, bean.getMaths());
		ps.setInt(6, bean.getS_no());
		int i = ps.executeUpdate();
		System.out.println("data updated successfully " + i);

	}

	public MarksheetBean findId(int id) throws Exception {
		Connection con=JDBCDataSource.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from marksheet where s_no =?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		MarksheetBean bean = null;

		while (rs.next()) {
			bean = new MarksheetBean();
			bean.setS_no(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRoll_no(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
		}
		return bean;

	}

	public List search(MarksheetBean bean,int pageno , int pagesize) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
	StringBuffer sql=new StringBuffer("select * from marksheet where 1=1");
	
	if (bean!=null) {
		if (bean.getName()!=null && bean.getName().length()>0) {
			sql.append(" and name like'"+bean.getName()+"%'");
		}
		if (bean.getRoll_no()>0) {
			sql.append("  and roll_no="+bean.getRoll_no()+" ");
		}
	}
	if (pagesize>0) {
		pageno=(pageno-1) * pagesize;
		sql.append(" limit "+ pageno +"," +pagesize);
	}
	System.out.println(sql);
	PreparedStatement ps = con.prepareStatement(sql.toString());
	ResultSet rs = ps.executeQuery();
		List list = new ArrayList();
		while (rs.next()) {
			 bean = new MarksheetBean();
			bean.setS_no(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRoll_no(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
			list.add(bean);

		}
		return list;

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
