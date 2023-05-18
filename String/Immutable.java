package String;

import java.util.Scanner;

public class Immutable {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,9,5,6};
	    
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the position:");
		int pos = sc.nextInt();
		
	    System.out.println("Enter the element:");
	    int ele = sc.nextInt();
	    
		int[] temp = new int[arr.length+1];
			
		for(int i=0;i<pos-1;i++)
		{
			temp[i]=arr[i];
			
		}
		
		temp[pos-1]=ele;		
		
		for(int i=pos;i<temp.length;i++)
		{
			temp[i]=arr[i-1];
		}
		
		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]+" ");
		}
	}
}
