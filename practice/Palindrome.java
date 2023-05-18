package practice;

public class Palindrome {

	public static void main(String[] args) {
		
		int n = 121;
		int temp=n;
		int sum=0;
		while(n>0)
		{
		int m = n%10;
		sum = sum * 10 + m;
		n = n/10;
		}
		if(sum==temp)
		{
		System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	}
}
