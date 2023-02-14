package mounisql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update
{
	private static final String url = "jdbc:mysql:///newbooks";
	private static final String user = "root";
	private static final String password = "Mouni555$";

		public static void main(String[] args) {

		     Scanner sc = null;
		     int u = 0, bookId = 0, ch =0;
		     String bookName = null;
		     Connection con = null;

		     try {
		        sc = new Scanner(System.in);
		        if(sc != null) {
		            System.out.print("Enter Number of Books you want to update: ");
		            u = sc.nextInt();
		        }
		        con = DriverManager.getConnection(url, user, password);
			    Statement st = con.createStatement();
		        
		        if(sc != null) {
		           for(int i=0; i<u; i++) {
		        	  System.out.println("Enter Book Id or Book Name");
		              System.out.print("bookId: ");
		              bookId = sc.nextInt();
		              System.out.print("bookName: ");
		              bookName = sc.nextLine();
		              bookName+=sc.nextLine();
		              
		    	      String query = "SELECT * FROM mouni.newbooks WHERE bookId = '" + bookId +
                   "' OR bookName = '" + bookName + "'";

		              ResultSet r = st.executeQuery(query);

		    	      boolean flag = false;
		    	      while (r.next()) {
		    	         flag = true;
		    	         System.out.println(r.getInt(1) + " " + r.getString(2) + 
		    	        		 " " + r.getString(3)+ " " +r.getString(4));		    	         
		    	      }
		    	      while(flag) {
		    	    	  System.out.println("Enter the choice to update: \u1.Book Id \u2.Book Name "
				    	      		+ "\u3.Author Name \u4.Edition");
		    	    	  String update = "UPDATE the booktable ";
		    	    	  ch = sc.nextInt();

		    	    	  switch(ch) {
		    	    	  case 1:
		    	    		  System.out.println("Enter new Book Id: ");
		    	    		  int newBookId= sc.nextInt();
		    	    		  update = update + "bookId = ? WHERE  bookId = " +  bookId;
			    	    	  PreparedStatement p1 = con.prepareStatement(update);
		    	    		  p1.setInt(1, newBookId);
		    	    		  
		    	    		  int t = p1.executeUpdate();
		    	    		  if(t>0)
		    	    			  System.out.println("Record updated sucessfully");
		    	    		  break;
		    	    		  
		    	    	  case 2:
		    	    		  System.out.println("Enter new Book Name: ");
		    	    		  String newBookName= sc.nextLine();
		    	    		  newBookName+=sc.nextLine();
		    	    		  update = update + "bookName = ? WHERE  bookId = " +  bookId;
			    	    	  PreparedStatement p2 = con.prepareStatement(update);
		    	    		  p2.setString(1, newBookName);
		    	    		  
		    	    		  int t1 = p2.executeUpdate();
		    	    		  if(t1>0)
		    	    			  System.out.println("Record updated sucessfully");
		    	    		  break;
		    	    		  
		    	    	  case 3:
		    	    		  System.out.println("Enter new Author Name: ");
		    	    		  String newAuthorName= sc.nextLine();
		    	    		  newAuthorName+=sc.nextLine();
		    	    		  update = update + "authorName = ? WHERE  bookId = " +  bookId;
			    	    	  PreparedStatement p3 = con.prepareStatement(update);
		    	    		  p3.setString(1, newAuthorName);
		    	    		  
		    	    		  int t2 = p3.executeUpdate();
		    	    		  if(t2>0)
		    	    			  System.out.println("Record updated sucessfully");
		    	    		  break;
		    	    		  
		    	    	  case 4:
		    	    		  System.out.println("Enter new Edition: ");
		    	    		  String newEdition= sc.nextLine();
		    	    		  newEdition+=sc.nextLine();
		    	    		  update = update + "edition = ? WHERE  bookId = " +  bookId;
			    	    	  PreparedStatement p4 = con.prepareStatement(update);
		    	    		  p4.setString(1, newEdition);
		    	    		  
		    	    		  int t3 = p4.executeUpdate();
		    	    		  if(t3>0)
		    	    			  System.out.println("Record updated sucessfully");
		    	    		  break;
		    	    	  
		    	    	  }
		    	      }
		    	      
		    	      if (flag != true) {
		    	         System.out.println("\nRecord not found");
		    	      } 
		           }
		        }

		     } catch(SQLException se) {
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