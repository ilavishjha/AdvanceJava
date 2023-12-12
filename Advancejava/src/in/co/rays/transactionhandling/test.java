package in.co.rays.transactionhandling;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class test {

    public static void main(String[] args) throws SQLException, Exception {
    	Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");

		CallableStatement callStmt = conn.prepareCall("{CALL empOut(?)}");

    
		callStmt.registerOutParameter(1, Types.INTEGER);
                callStmt.execute();
                
              ResultSet rs = callStmt.getResultSet() ;
                        while (rs.next()) {
                            int result = rs.getInt(1);
                        	System.out.println(rs.getInt(1));
                			System.out.println(rs.getString(2));
                			System.out.println(rs.getInt(3));

                      //      System.out.println("Result from empOUT: " + result);
                        }
                    
                   callStmt.getMoreResults();
    }
            }

