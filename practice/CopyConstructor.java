package practice;

class Student
{
	String name;
	int age;
	
	Student()
	{
		
	}
	
	Student(Student s2)//Copy COnstructor
	{
		this.name=s2.name;
		this.age=s2.age;
	}
	
	public void PrintInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

public class CopyConstructor {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.name="Sameer";
		s1.age=27;
		s1.PrintInfo();
		
		Student s2 = new Student(s1);
		s2.PrintInfo();
	}
	
	
	
	
 	
	
	
}
