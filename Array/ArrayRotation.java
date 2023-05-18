package Array;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int d = sc.nextInt();
		int[] temp = new int[arr.length];
		int k=0;
		
		for(int i=d;i<arr.length;i++)
		{
			temp[k]=arr[i];	//3 4 5 6
			k++;
		}
		
		for(int i=0;i<d;i++)
		{
			temp[k]=arr[i]; //1 2
		    k++;
		    
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=temp[i];
		}
		
		System.out.println("After rotate array: ");
		for (int i=0;i<arr.length;i++) 
		{
		    System.out.print(arr[i]+" ");
		}
	}
}
