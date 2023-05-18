package Array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SecondHighestElement {

	public static void main(String[] args) {
		
		int []arr = {12,11,3,45,66,11,9,45,22,96,99,22};

/*Sorting array logic
		int temp ;
		for(int i=0; i<arr.length ; i++)
		{
			for(int j = i+1 ; j<arr.length ; j++)
			{
				if(arr[i]>arr[j])
				{
				  temp = arr[i];
				  arr[i] = arr[j];
				  arr[j] = temp;
				}
			}
		}
      
*/		
		
		TreeSet<Integer> a = new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
		a.add(arr[i]);
		}
		
		for(int i : a)
			System.out.print(i +" ");
		
		System.out.println();
		
		Integer[] brr = a.toArray(new Integer[a.size()]);
		
		System.out.println(brr[1]);
		System.out.println(brr[brr.length-2]);
		
	}
}
