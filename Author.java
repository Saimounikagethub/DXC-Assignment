package Sai;
class Author {  
  private String name, email;  
  private char gender;  
  Author(String name, String email, char gender){  
       this.name = name;  
       this.email = email;  
       this.gender = gender;  
  }  
  public String getName() {  
       return name;  
  }  
  public String getEmail() {  
       return email;  
  }  
  public char getGender() {  
       return gender;  
  }  
  public void setEmail(String email) {  
       this.email = email;  
  }
}  
class Book{  
  private String name;  
  private Author author;  
  private double price;  
  private int quantity;  
  Book(String name, Author author, double price, int quantity){  
       this.name = name;  
       this.author = author;  
       this.price = price;  
       this.quantity = quantity;  
  }  
  public String getName() {  
       return name;  
  }  
  public Author getAuthor() {  
       return author;  
  }  
  public double getPrice() {  
       return price;  
  }  
  public void setPrice(double price) {  
       this.price = price;  
  }  
  public int getquantity() {
	   
       return quantity;   
  }			
  public void setquantity(int quantity) {  
       this.quantity = quantity;  
  }  
public void DisplayDetails(){  
       Author a1 = new Author("Joshua", "joshua@email.com", 'M');  
 
       System.out.println("Author Name: "+a1.getName()+"\nEmail ID: "+a1.getEmail()+"\nGender :"+a1.getGender());  
  } 
}
class BookAuthor{

public static void main(String[] args)
{
	
	Author author = null;
	Book b1=new Book("Effective Java",author,144.0,65);
	Author a1=new Author("Joshua Bloach","joshua@email.com",'M');
	b1.DisplayDetails();

	
	
	
}


}
