package OOPS;
/*HierarchialInheritance : one object can aquire all the properties 
                and behaviour of its parent class */
public class HierarchialInheritance{

	public static void main(String[] args) {
	
		Manager m1 = new Manager();
		Husband h1 = new Husband();
		h1.info();
		m1.info();
	}
}

class Person
{
	String name;
	int age;
	
	public void info()
	{
	  System.out.println("Eating");
	}
}

class Manager extends Person
{
	String jd;
	
	
	public void info()
	{
		System.out.println("Job");
	}
	
}

class Husband extends Person
{
	String job;
	
	@Override
	public void info()
	{
		System.out.println("family support");
	}
}