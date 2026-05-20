package jdbc;

import java.sql.*;
public class Book {

	int isbn;
	String bname;
	String aname;
	int price;
	Connection con;
	PreparedStatement  st;
	DbConfig  k;
	
	public Book() {
		try {
			k = new DbConfig();
					con = k.getCon();
		}
		catch(Exception e) {}
	}
	
	public void addBooks() throws Exception{
		st = con.prepareStatement("insert into book values(?,?,?,?)");
		st.setInt(1,123);
	     st.setString(2, "java");
	     st.setString(3, "herbert");
	     st.setInt(4, 23000);
	     st.execute();
	}
	
	public void displayBooks()throws Exception 
	{    st=con.prepareStatement("select * from book");
	     ResultSet rs= st.executeQuery();
	     while(rs.next())
	     {
	       System.out.println(rs.getString(1) +"  "+ rs.getString(2));
	     }
	 }
	
	
	public static void main(String args[]){
		try {
            Book b = new Book();
            b.addBooks();
            b.displayBooks();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
