package practice;

/*Static is a non -access modifier*/

/*public class StaticVariable {

	static int a=10;
	
	void m1()
	{
		//static int b=20;  //Error
		System.out.println(++a);
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);
		StaticVariable s = new StaticVariable();
		s.m1();
		System.out.println(a);
	}
	
}*/





/*
public class StaticVariable {

	static int b = 20;
}

class A
{
	public static void main(String[] args) {
		
		System.out.println(StaticVariable.b);//using . we can access it
	}
}*/


/*
public class StaticVariable {

	int empid;
	String name;
	static String company;
	
//	this variable is same for all employees object 
//	but that will occupy memory every time when object is created.
//  if we create is static then it will allocate memory once. 
	
	
	public StaticVariable(int empid, String name, String company) {
		super();
		this.empid = empid;
		this.name = name;
		this.company = company;
	}
	
	void display()
	{
		System.out.println(empid+" "+name+" "+company);
	}
	
	public static void main(String[] args) {
		
		StaticVariable s1 = new StaticVariable(1,"Sameer","SP");
		s1.display(); //
		StaticVariable s2 = new StaticVariable(2,"Ajit","SP");
		s2.display();
	}
	
	
    
	
}*/



/*
public class StaticVariable {

	public static void main(String args[]) { 
	     System.out.println(fun());
	   }
	  
	   static int fun()
	   {
	     static int x= 10;  //Error: Static local variables are not allowed
	     return x--;
	   }
	} 

*/


/*
public class StaticVariable
{
	static int a = m1();
	  
    // static block
    static
    {
        System.out.println("Inside static block");
    }
  
    // static method
    static int m1()
    {
        System.out.println("from m1");
        return 20;
    }
   
  
    // static method(main !!)
    public static void main(String[] args)
    {
        System.out.println("Value of a : " + a);
        System.out.println("from main");
    }
    
    
}*/



/*Bindind : at compile time or early binding that is the reson we can
   access static method without creating an object*/





/*In the static method, we cannot override a static method, 
 * because of early binding. 
 */


// Override of static method
/*
class Parent {
 
    // static method
    static void show()
    {
        System.out.println("Parent");
    }
}
 
// Parent inherit in Child class
class Child extends Parent {
 
    // override show() of Parent
	
//    void show()
//    {
//        System.out.println("Child");
//    }
	

}
 
class StaticVariable {
    public static void main(String[] args)
    {
        Parent p = new Parent();
        // calling Parent's show()
        p.show();
        // cannot override Parent's show()
    }
}
 
*/


/*
class StaticVariable{
	
	int a = 20;
	
	static void show()
	{
	   //System.out.println(a); //that is not accessible
	}
}*/

public class StaticVariable{
	
	
	
	public static void main(String[] args) {
		
	A.a=15;
	
	System.out.println(A.a+2);
	System.out.println(A.a);
	
	}
}
	
class A
{
	static int a = 10;
}
	