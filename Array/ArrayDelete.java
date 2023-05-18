package Array;

import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,5,4,6,2,3,4};
		
		System.out.println("Enter the position:"); 
		int pos = sc.nextInt(); //3
		
		
		int[] temp = new int[arr.length-1];  //temp[6]
		
		for(int i=0;i<pos-1;i++)
		{
			temp[i]=arr[i];//temp[0]=1	temp[1]=5	
		}
		
		for(int i=pos-1;i<temp.length;i++)
		{
			temp[i]=arr[i+1];	//temp[2]=6
		}
		
		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]+" ");
		}
	}
}
