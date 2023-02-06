

package example;

class Driver
{
	private String driverName;
	private float averageRating;
	public Driver(String driverName, float averageRating)
	{
		
		this.driverName = driverName;
		this.averageRating = averageRating;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public  float getAverageRating() {
		return this.averageRating;
	}
	public void setAverageRating(float averageRating) 
	{
		  this.averageRating = averageRating;
	}
	public String toString()
	{

		return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;

		}
	
}

class CabServiceProvider
{
	static String cabServiceName;
	int totalCabs;
	public CabServiceProvider(String cabServiceName, int toalCabs) 
	{
		
		CabServiceProvider.cabServiceName = cabServiceName;
		this.totalCabs = toalCabs;
	}
	
	public static double calculateRewardPrice(Driver driver)
	{
		double bonus=0 ;
		double rating;
		rating=driver.getAverageRating();
		if(cabServiceName=="Halo")
		{	
		   
			if(rating>=4.5 && rating<=5)
			{
				bonus=rating*10;
			}
			else if(rating>=4 && rating<4.5)
			{
				bonus=rating*5;
			}
			
			
		}
		else if(cabServiceName=="Aber")
		{
			if(rating>=4.5 && rating<=5)
			{
				bonus=rating*8;
			}
			else if(rating>=4 && rating<4.5)
			{
				bonus=rating*3;
			}
			

		}
		
		return bonus;
		
	
		
	
	}
	
	
	
}

public class cabdriver{
	
	public static void main(String[] args)
	{
		
	CabServiceProvider c=new CabServiceProvider("Halo",50);
	Driver d1=new Driver("Luke",4.8f);
	Driver d2=new Driver("Mark",4.2f);
	Driver d3=new Driver("David",3.9f);
	Driver[] driveList= {d1,d2,d3};
	for(Driver driver : driveList)
	{
		System.out.println("Driver Name: "+driver.getDriverName());
	
	double bonus = CabServiceProvider.calculateRewardPrice(driver);

	if (bonus>0)
	
	System.out.println("Bonus: $"+(bonus)+"\n");

	else

	System.out.println("Sorry, bonus is not available!");


	
	}
	}
}