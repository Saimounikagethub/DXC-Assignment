package Dxc;

public class ArrayTeacher 
{
	private String teacherName;
	private String subject;
	private double salary;
//Constructor
	public ArrayTeacher(String teacherName, String subject,double salary) 
	{
this.teacherName=teacherName;
this.subject=subject;
this.salary=salary;
	}
//Getters and Setters
	public String getTeacherName()
	{
		return teacherName;
	}
public void setTeacherName(String teacherName)
{
	this teacherName=teacherName;
}
	
 public String getSubject()
 {
    return subject;
}

public void setSubject(String subject) 
{
    this.subject = subject;
}

public double getSalary() 
{
	return salary;
}

public void setSalary(double salary)
{
    this.salary = salary;
}
}


public class ArrayTester
{
 public static void main(String[] args) 
 {
	 
        ArrayTeacher a1 = new ArrayTeacher("Alex", "Java Fundamentals", 1200L);
        ArrayTeacher a2 = new ArrayTeacher("John", "RDBMS", 800L);
        ArrayTeacher a3 = new ArrayTeacher("Sam", "Networking", 900L);
        ArrayTeacher a4 = new ArrayTeacher("Maria", "Python", 900L);

        Teacher[] teachers = {a1, a2, a3, a4};

        for (Teacher teacher : teachers) {
            System.out.print("\nName: " + Arrayteacher.getTeacherName());
            System.out.print(", Subject: " + Arrayteacher.getSubject());
            System.out.print(", Salary: " + Arrayacher.getSalary());
        }
    }
}