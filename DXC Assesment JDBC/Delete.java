package mounisql;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

	      // variables
	      final String url = "jdbc:mysql:///newbooks";
	      final String user = "root";
	      final String password = "Mouni555$";

	      // establish the connection
	      Connection con = DriverManager.getConnection(url, user, password);
	      // create JDBC statement object
	      Statement st = con.createStatement();
	      Scanner sc = new Scanner(System.in);
	      int n=0;
	      try {
		        if(sc != null) {
		            System.out.print("Enter Number of Books  to delete: ");
		             n = sc.nextInt();
		        }
		        if(sc != null) {
		           for(int i=0; i<n; i++) {
		        	  System.out.println("Enter Book Id or Book Name");
		              System.out.print("bookId: ");
				      int id = sc.nextInt();
		              System.out.print("bookName: ");
				      String name = sc.nextLine();
			          name+=sc.nextLine();
		      // prepare SQL query
		      String query = "DELETE FROM bookDetails WHERE bookId = '" + id +
	                    "' OR bookName = '" + name + "'" ;
		      int i = st.executeUpdate(query);
	
		      if (i > 0)           
	              System.out.println("\nRecords deleted and displayed");           
	          else
	              System.out.println("Record not found"); 
		           }
		        }
		      st.close();
		      con.close();
		     }catch(SQLException se) {
			        se.printStackTrace();
			     } catch(Exception e) {
			        e.printStackTrace();
			     }

			     finally {
			        try {
			           if(con != null) con.close();
			        } catch(SQLException se) {
			           se.printStackTrace();
			        }
			        try {
			           if(sc != null) sc.close();
			        } catch(Exception e) {
			           e.printStackTrace();
			        }
			     } 
	}

}