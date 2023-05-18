package OOPS;

    interface Printable
    {  
    void show1();  
    }

    interface Showable
    {  
    void show1();  
    }  
 

public class MultipleInheritance implements Printable,Showable{

	public void show1()
	{
		System.out.println("Hello");
	}
	
	  
	  
	public static void main(String args[])
	{  
		MultipleInheritance obj = new MultipleInheritance();  
		  
		obj.show1();  
	}  
}
