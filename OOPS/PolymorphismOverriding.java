package OOPS;

class A
{
	A()
	{
		System.out.println("A");
	}
	void show(String name)
	{
		System.out.println(name);
	}
}

class B extends A
{
	B()
	{
		System.out.println("B");
	}
	void show(String name,int age)
	{
		System.out.println(name+" "+age);
	}
}

class C extends B
{
	C()
	{
		System.out.println("C");
	}
	
	void show(String name,int age,char gender)
	{
		System.out.println(name+" "+age+" "+gender);
	}
}

class D extends C
{
	D()
	{
		System.out.println("D");
	}
	
	void show(String name,int age,char gender,int id)
	{
		System.out.println(name+" "+age+" "+gender+" "+id);
	}
}


public class PolymorphismOverriding {

	public static void main(String[] args) {
		
	    C a = new D();
		a.show("Sam",25,'e');
	}
	
}
