package OOPS;

class Poly {

	void poly(String name)
	{
		System.out.println(name);
	}
	
	void poly(String name,int age)
	{
		System.out.println(name+" "+age);
	}
	
	void poly(String name,int age,String bgroup)
	{
		System.out.println(name+" "+age+" "+bgroup);
	}
}

public class PolymorphismOverloading
{
	public static void main(String[] args) {
		
		Poly p = new Poly();
		p.poly("Sam",26,"A+");
		
	}
}
