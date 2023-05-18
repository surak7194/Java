package HackerEarth;

import java.util.Scanner;

public class Zoos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String z = sc.nextLine();
        int count = 0,nt=0;
        for(int i=0,j=i;i<z.length();i++)
        {
            if(z.charAt(i)==z.charAt(0))
            {
                count++;
            }
            else
            {
            	z.charAt(j);
            	nt++;
            }
            
        }
        
        
        int mul = 2*count;
     
        if(mul==nt)
        {
        	System.out.println("Yes");
        }
        else 
        {
        	System.out.println("No");
        }
      
	}
}
