package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountAlphabetsInString {

	public static void main(String[] args) {
		
		
		
		int counter[] = new int[256];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String: ");
		String str = sc.nextLine();
		
		
		for(int i=0;i<str.length();i++)
		{
			counter[(int)str.charAt(i)]++;
		}
		for(int i=0;i<256;i++)
		{
			if(counter[i]!=0)
			{
				System.out.println((char)i+" --> "+counter[i]);
			}
		}
		
	}
	

	
}
