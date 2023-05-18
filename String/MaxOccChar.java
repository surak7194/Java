package String;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOccChar {
//		
//		 static final int N = 256;
//		 
//		 static char MaxOccuringChar(String str1)
//		 {
//		  int ctr[] = new int[N];
//		  int l = str1.length();
//		  for (int i = 0; i < l; i++)
//		  {
//		   ctr[str1.charAt(i)]++;
//		  }
//		  
//		  int max = -1;
//		  char result = ' ';
//
//		  for (int i = 0; i < l; i++) 
//		  {
//		   if (max < ctr[str1.charAt(i)]) 
//		   {
//		    max = ctr[str1.charAt(i)];
//		    result = str1.charAt(i);
//		   }
//		  }
//
//		  return result;
//		 }
//		 
//		 public static void main(String[] args) {
//		  String str1 = "god is great";
//		  System.out.println("The given string is: " + str1);
//		  System.out.println("Max occurring character: " + MaxOccuringChar(str1));
//		 }
	
	public static void main(String[] args) {
	      Scanner in = new Scanner(System. in);
	      String k = in.nextLine();
	      char tempArray[] = k.toCharArray(); 
	        Arrays.sort(tempArray); 
	        String s = new String(tempArray); //aaacghitvy
	        int n = s.length();//10
	        int max_count = 0;
	        int count = 1;
	        char ans = ' ';
	        for (int i = 1; i <= n; i++)
	        {
	            if ((i == n) || (s.charAt(i) != s.charAt(i - 1)))//1.false
	            {
	                if (max_count < count)
	                {
	                    max_count = count;
	                    ans = s.charAt(i-1);
	                }
	                count = 1;
	            }
	            else
	            {
	                count++;//2//
	            }
	        }
	    System.out.println("Maximum occurring character is "+ans);
	  }
}

