package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class duplicates {

	public static void main(String[] args) {
		
		char[] arr = {'a','b','a','a','b','b','c','a','c','c','d'};
		
		Set<Character> s = new TreeSet<Character>();//Hashset
		
		for(Character c : arr)
		{
			s.add(c);
		}
	    
		System.out.println(s);
		
		
		
	}
}
