package ExceptionHandling;

public class ExceptionThrows {

	public static void divide(int i) throws ArithmeticException
	{
		
		int b = i/0;
		System.out.println(b);
	}
	public static void main(String[] args) {
		
		int i = 5;
		
		divide(i);
		
	}
}
