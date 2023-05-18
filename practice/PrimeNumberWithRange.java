package practice;

import java.util.Scanner;

public class PrimeNumberWithRange {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Start Number: ");
		int start = sc.nextInt();
        System.out.println("Enter the End Number: ");
		int end = sc.nextInt();
		sc.close();
		int sum = 0;
		for(int i=start;i<=end;i++)
		{
			boolean isPrime = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime= false;
					break;
				}
				
			}
			if(isPrime)
			{
				sum = sum + i;
			}
		}
		System.out.println("sum of the prime numbers: "+sum);
	}
}
