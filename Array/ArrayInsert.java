package Array;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,5,4,6,2,3,4};
		System.out.println("Enter the Number:");
		int num = sc.nextInt(); //9
		System.out.println("Enter the position:"); 
		int pos = sc.nextInt(); //2
		
		int[] temp = new int[arr.length+1];
		
		for(int i=0;i<pos;i++)
		{
			if(i!=pos-1)
			temp[i]=arr[i];//temp[0]=1
			else
			temp[i]=num;//temp[1]=9
		}
		
		for(int i=pos-1;i<arr.length;i++)
		{
			temp[i+1]=arr[i];	//temp[2]=5 and so on
		}
		
		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]+" ");
		}
	}
	
//	public static void main(String[] args) {
//        int[] arr = {1,2,3,4,7,9,5,6};
//	    
//		Scanner sc  = new Scanner(System.in);
//		
//		System.out.println("Enter the position:");
//		int pos = sc.nextInt();
//		
//	    System.out.println("Enter the element:");
//	    int ele = sc.nextInt();
//	    
//		int[] temp = new int[arr.length+1];
//			
//		for(int i=0;i<pos-1;i++)
//		{
//			temp[i]=arr[i];
//			
//		}
//		
//		temp[pos-1]=ele;		
//		
//		for(int i=pos;i<temp.length;i++)
//		{
//			temp[i]=arr[i-1];
//		}
//		
//		for(int i=0;i<temp.length;i++)
//		{
//			System.out.print(temp[i]+" ");
//		}
//	}
}
