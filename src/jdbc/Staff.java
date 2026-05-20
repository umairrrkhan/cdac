package jdbc;

import java.sql.*;
import java.util.Scanner;
public class Staff {
	int id ;
	String name ;
	String department;
	int salary;
	Connection con;
	PreparedStatement st;
	DbConfig k ;
	Scanner io = new Scanner(System.in);
	
	
	public Staff() {
		try {
			k = new DbConfig();
			con = k.getCon();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addStaff() throws Exception{
		System.out.println("enter id: ");
		id = io.nextInt();
		io.nextLine();
		System.out.println("enter the name :");
		name = io.nextLine();
		System.out.print("Enter Department: ");
        department = io.nextLine();
        System.out.print("Enter Salary: ");
        salary = io.nextInt();
        st = con.prepareStatement("INSERT INTO staff VALUES(?,?,?,?)");
        st.setInt(1, id);
        st.setString(2, name);
        st.setString(3, department);
        st.setInt(4, salary);
        st.executeUpdate();
        st.close();
        System.out.println("Staff added successfully!");
	}
	
	public void displayStaff() throws Exception {
        st = con.prepareStatement("SELECT * FROM staff");
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            System.out.println(
                rs.getInt(1) + "\t" +
                rs.getString(2) + "\t\t" +
                rs.getString(3) + "\t\t" +
                rs.getInt(4)
            );
        }
        rs.close();
        st.close();
    }
	public void updateStaff() throws Exception {
        System.out.print("Enter ID of staff to update: ");
        id = io.nextInt();
        io.nextLine();
        System.out.print("Enter New Name: ");
        name = io.nextLine();
        System.out.print("Enter New Department: ");
        department = io.nextLine();
        System.out.print("Enter New Salary: ");
        salary = io.nextInt();

        st = con.prepareStatement(
            "UPDATE staff SET name=?, department=?, salary=? WHERE id=?"
        );
        st.setString(1, name);
        st.setString(2, department);
        st.setInt(3, salary);
        st.setInt(4, id);
        int rows = st.executeUpdate();
        st.close();

        if (rows > 0) {
            System.out.println("Staff updated successfully!");
        } else {
            System.out.println("Staff ID not found!");
        }
    }
	public void deleteStaff() throws Exception {
        System.out.print("Enter ID of staff to delete: ");
        id = io.nextInt();

        st = con.prepareStatement("DELETE FROM staff WHERE id=?");
        st.setInt(1, id);
        int rows = st.executeUpdate();
        st.close();

        if (rows > 0) {
            System.out.println("Staff deleted successfully!");
        } else {
            System.out.println("Staff ID not found!");
        }
    }

}
