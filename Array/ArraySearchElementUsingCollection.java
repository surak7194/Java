package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ArraySearchElementUsingCollection {

	
	public static void main(String[] args) {
		
		int[] arr = {12,34,56,1,53,76,98};
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> i = new TreeSet<Integer>();
		for(int a : arr)
		{
			i.add(a);
		}
		
		boolean b = i.contains(sc.nextInt());
		
		if(b==true)
		{
			System.out.println("Element found ");
		}
			
		else
		{
			System.out.println("Not Found");
		}
		
		
		
	}
}
