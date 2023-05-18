package ExceptionHandling;

public class ExceptionThrow {

	public static void main(String[] args) {
		
		try 
		{
		 int age = 14;
		 if(age<18)
		 {
		 	throw new YoungerAgeException("Not Eligible for voting");
		 }
		 else
			 System.out.println("You are eligible");
		}
		catch(YoungerAgeException e)
		{
			System.out.println(e);
		}
	}
}

class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String str)
	{
		super(str);
	}
}