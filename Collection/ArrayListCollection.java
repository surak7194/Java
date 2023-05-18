package Collection;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		
		 ArrayList<Integer> list = new ArrayList<>();
	        list.add(5);
	        list.add(6);
	        list.add(7);
	        list.add(10);
	        list.add(9);
	        
	        int sum = 0;
 
	        for(int i : list)
	        {
	        	sum = sum + i;
	        }
	        	
	        
	        System.out.println("sum : " + sum);

	}
}
