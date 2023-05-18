package OOPS;

class Mobile
{
	public void fun()
    {
    	System.out.println("Communication");
    }
}

class Samsung extends Mobile
{
	@Override
	public void fun()
	{
		System.out.println("Super Amoled display");
	}
	
}

class Apple extends Mobile
{
	
	public void fun()
	{
		System.out.println("Good Camera");
	}
	
}

public class Overriding 
{
	public static void main(String[] args)
    {
	
		Mobile s = new Apple();
       	s.fun();
       	Apple a = new Apple();
       	a.fun();
    }
    
}


