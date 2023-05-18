package practice;

public class OddEvenDigit {

	public static void main(String[] args) {
		
		long num = 145678,rem=0,ecount=0,ocount=0;
		System.out.println(num);
		
		while(num!=0)
		{
			rem = num%10;
			if(rem%2==0)
			{
			    ecount++;
			}
			else
			{
				ocount++;
			}
			num = num/10;
			
		}
		System.out.println("Odd digits:"+ocount);
		System.out.println("Even digits:"+ecount);
	}
}
