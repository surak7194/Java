package Array;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {5,7,1,2,8,3,9};
	    System.out.println("Enter the number: ");
		int num = sc.nextInt();
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("Number is found at "+i+" th index");
				break;
			}
			if(arr[i]!=num && i==arr.length-1)
				flag=true;
			
		}
		if(flag==true)
			System.out.println("Number is not found");
	}
}
