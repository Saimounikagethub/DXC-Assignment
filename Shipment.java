package Sai;
public class Shipment {
	public boolean checkProductNameValidity(String productName) 
	 {
	 //Implement your code here and change the return value accordingly
		 String regex="([A-Za-z]{3,10}.\\s[A-Za-z]{3,10}.\\s[A-Za-z]{3,10})"
		 		+ "|([A-Za-z]{3,10}.*\\s[A-Za-z]{3,10})";
		 if(productName.matches(regex))
		 {
			 return true;
		 }
		 
		 
	 return false; 
	}
	public boolean checkProductIdValidity(String productId) 
	
	{
	 //Implement your code here and change the return value accordingly
		String regex="[A-Za-z0-9]{2,20}";
		if(productId.matches(regex))
		{
			return true;
		}
		
	 return false; 
	}
	public boolean checkTrackerIdValidity(String trackerId) {
	 //Implement your code here and change the return value accordingly
		
		String regex="[A-Z]{1}:[A-Z]{4}:[a-z]{3}:[0-9]{2}";
		if(trackerId.matches(regex))
		{
			return true;
		}
	 return false; 
	} 
}
class Productname_Validity
{
	 
	 public static void main(String[] args)
	 {
	 
	 Shipment shipment = new Shipment();
	 
	 //Change the values for testing your code with different values
	 
	 String productName = "Digital Camera";
	 System.out.println("The product name is "+ (shipment.checkProductNameValidity(productName) ? "valid!" : "invalid!"));
	 String productId = "DC1911";
	 System.out.println("The product Id is "+ (shipment.checkProductIdValidity(productId) ? "valid!" : "invalid!"));
	 String trackerId = "D:CMDC:cmd:23";
	 System.out.println("The tracker Id is "+ (shipment.checkTrackerIdValidity(trackerId) ? "valid!" : "invalid!"));

}
}
