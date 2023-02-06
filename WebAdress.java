package Sai;

public class WebAdress {

	public static boolean checkWebAddressValidity(String webAddress) 
	{
		boolean flag=false;
		String regex="^[http|https].*(://www.).[A-Za-z0-9].*.?[com|org|net]";
		if(webAddress.matches(regex))
		{
			flag=true;
		}
		  return flag; 
	 }
		 
public static void main(String[] args) {
		 
		 String webAddress = "http://www.company.com";
		 System.out.println("The web address is "+ (checkWebAddressValidity(webAddress)
				 ? "valid!" : "invalid!"));
}
}