package practice;

public class ReverseNum {

	 
	public static void main(String[] args) {
		
		int num = 1234;
//		int rev = 0;
//		while(num!=0)
//		{
//			num = num % 10;
//			rev = rev * 10 + num;
//			num = num / 10;
//		}
//		System.out.println("After Reverse the Number is: "+rev);
		
		
		/*Using String Buffer*/
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
//		
//		System.out.println(rev);
		
		/*Using String Builder*/
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println(rev);
	}
}
