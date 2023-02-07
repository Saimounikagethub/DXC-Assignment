
package Dxc;

class Course {
	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseId;
	private boolean hotelRequired;
	int amount=0;
	int discount=0;
	public Course(String studentName,int registrationId,float qualifyingMarks,int courseId,
 boolean hotelRequired) 
	{
		this.studentName=studentName;
		this.registrationId=registrationId;
		this.qualifyingMarks=qualifyingMarks;
	
		this.courseId=courseId;
		this.hotelRequired=hotelRequired;
	}
	public String getStudentName() 
	{
		return studentName;
	}
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	public int getRegistrationId()
	{
		return registrationId;
	}
	public void setRegistrationId(int registrationId) 
	{
		this.registrationId=registrationId;
		
	}
	public float getQualifyingMarks() 
	{
		return qualifyingMarks;
	}
	public void setQualifyingMarks(float qualifyingMarks)
	{
		this.qualifyingMarks=qualifyingMarks;
	}
	public double getCourseFee()
	{
		return courseFee;
	}
	public void setCourseFee(double courseFee) 
	{
		this.courseFee=courseFee;
	}
	public int getCourseId() 
	{
		return courseId;
	}
	public void setCourseId(int courseId)
	{
		this.courseId=courseId;
		
	}
	public boolean getHotelRequired()
	{
		return hotelRequired;
	}
	public void setHotelRequired(boolean hotelRequired)
	{
		this.hotelRequired=hotelRequired;
	}
	public float ValidateMarks() 
	{
		float marks=getQualifyingMarks();
		
		if(marks<=65) {
			System.out.println("Marks is less than 65. You are not eligible for admission!!");
		}
		else if(marks>=65 && marks<=69) 
		{
			 discount = 5;
		}
		else if(marks>=70 && marks<=84)
{
			 discount=10;
		}
		else 
		{
			discount=15;
		}
		return marks;
	}
	
	public int ValidatecourseId()
	{
		int id=getCourseId();
		
		if(id==1001) 
		{
			amount=55000;
		}
		else if(id==1002) 
		{
			amount=35675;
		}
		else if(id==1003) 
		{
			amount=28300;
		}
		else if(id==1004)
		{
			amount=22350;
			
		}
		else if(id==1005) 
		{
			amount=115000;
		}
		else 
		{
			System.out.println("Invalid Course Id. Please try again");
		}
		return id;
	}
	public double calculateCourseFee()
	{
		return amount-(amount*discount)/100;
	
	}
}
class MarksTester{
		public static void main(String args[])
		{
			Course a=new Course("peter",5001,78,1005,false);

			
			System.out.println("Student Name: "+a.getStudentName());
			System.out.println("Course Id: "+a.ValidatecourseId());
			System.out.println("Qualifying Exam Marks: "+a.ValidateMarks());
			System.out.println("Student's Registration Id: "+a.getRegistrationId());
			System.out.println("Total course Fee: "+a.calculateCourseFee());
			System.out.println("Hostel Required: "+a.getHotelRequired());
		}
	}