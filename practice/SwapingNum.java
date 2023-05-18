package practice;

public class SwapingNum {

	public static void main(String[] args) {
		
		
		int a=2,b=3;
		
		//logic 1 using + and - operator
//		a = a+b;//5
//		b = a-b;//5-3=2
//		a = a-b;//5-3=3
//		System.out.println("after swapping: "+a+" "+b);
		
		//Logic 2 using * and / operator
//		a = a*b;
//		b = a/b;
//		a = a/b;
//		
//		System.out.println("after swapping: "+a+" "+b);
		
		//Logic 3 using Single Third variable
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping: "+a+" "+b);
		
		//Logic 4 using bitwise operator
//		a = a^b;
//		b = a^b;
//		a = a^b;
//		System.out.println("after swapping: "+a+" "+b);
		
		//Logic 5 using Single statement
//		b = a+b-(a=b); 
//		System.out.println("after swapping: "+a+" "+b);
		
		
	}
}
