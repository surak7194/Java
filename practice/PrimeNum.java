package practice;

import java.util.Scanner;

public class PrimeNum {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Number: ");
//		int num = sc.nextInt();
//		boolean flag = false;
//		if(num==0||num==1)
//		{
//			System.out.println("Not prime");
//		}
//		else
//		{
//
//			for(int i=2;i<num;i++)
//			{
//				if(num%i==0)
//				{
//					flag=true;
//				}
//			}
//			
//			if(flag==true)
//			{
//				System.out.println("Not Prime");
//			}
//			else
//			{
//				System.out.println("Prime");
//			}
//		}
//	} 
	
	public static void main(String[] args) {

		  int num = 20, count;

		  for(int i=2;i<=num;i++) 
		  {
		   count = 0;
		   for(int j=2;j<=i/2;j++) 
		   {
		    if(i%j==0) 
		    {
		     count++;
		     break;
		    }
		   }

		   if(count==0) 
		   {
		    System.out.println(i);
		   }
 
		  }
		 }
}
