package Collection;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("Sam");
		str.add("Ram");
		str.add("Kam");
		str.add("Vam");
		str.add("Oam");
		
		Iterator<String> i = str.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}
