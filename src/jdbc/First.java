package jdbc;

import java.sql.*;

public class First {
	
	static Connection connect(String url , String user , String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = 	DriverManager.getConnection(url, user , password);
			System.out.println("got connected");
			return conn;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	static void createStatement(Statement stmt) {
		try {
            stmt.executeUpdate("INSERT INTO emp VALUES (201, 'umair')");
            System.out.println("data inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
		}
	static void delete(Statement stmt) {
		try {
            stmt.executeUpdate("DELETE FROM emp WHERE id = 3");
            System.out.println("data deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }	}
	static void show(Statement stmt) {
		try {
		ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
		while(rs.next()) {
            System.out.println("ID: " + rs.getInt("id") + "  Name: " + rs.getString("name"));
		}
		rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "7860";
		
		 Connection conn = connect(url, user, password);
		
		 try {
	            Statement stmt = conn.createStatement();

	            createStatement(stmt);
	            show(stmt);

	            delete(stmt);
	            show(stmt);

	            
	            stmt.close();
	            conn.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
