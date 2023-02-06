package Dxc;
import java.util.Scanner;
public class Tshirts {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String[] cart = {"round-neck", "collared", "hooded", "round-neck", "round-neck"};
	int totalCost = 0;
	int discount = 0;
	int finalAmount = 0;
	
	for (String type : cart) {
		  if (type.equals("round-neck")) 
		  {
		    totalCost += 200;
		  } 
		  else if (type.equals("collared")) 
		  {
		    totalCost += 250;
		  } 
		  else if (type.equals("hooded")) 
		  {
		    totalCost += 300;
		  }
		}

		if (cart.length < 5) {
		  discount = 0;
		} 
		else if (cart.length >= 5 && cart.length <= 10)
		{
		  discount = 10;
		} 
		else if (cart.length > 10) 
		{
		  discount = 20;
		}

		finalAmount = totalCost - (totalCost * (discount / 100));
		System.out.println("The final amount for the T-Shirts is: Rs." + finalAmount);
	
}
}