package practice;

import java.util.Scanner;

public class odd {

//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		while(num!=(-1))
//		{
//			if(num%2==1)
//			{
//			   System.out.println(num);
//			}
//			
//		}
//	}
	
	public static void main(String[] args) {
		
		int[] arr = {4,5,6,1,7,-1};
	    int i=0;
		while(arr[i]!=(-1))
		{
			if((arr[i]%2)== 1)
				{
				   System.out.println(arr[i]);
				}
			i++;
		}
	}
}
