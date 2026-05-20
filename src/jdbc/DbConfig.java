package jdbc;

import java.sql.DriverManager;
import java.sql.*;

public class DbConfig {
	Connection con;

	public DbConfig() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc",
					"root","7860");
		}catch(Exception r) {
			
		}
		
	}
	public Connection getCon() {
		return con;
	}
}
