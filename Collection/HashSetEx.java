package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		/*unique elements only
		 * Null Value accept
		 * non synchronized.
		 * best approach for search operations.
		 * doesn't maintain the insertion order.
		 * */
		
		
		HashSet<String> hsh = new HashSet<String>();
		
		hsh.add("City1");
		hsh.add("City2");
		hsh.add("City3");
		hsh.add("City4");
		hsh.add("City5");
		hsh.add("City6");
		hsh.add("City7");
		hsh.add("City8");
		hsh.add(null);
		hsh.add("City9");
		hsh.add("City10");
		hsh.add("City11");
		hsh.add("City12");
		hsh.add("City13");
		
		
		//System.out.println(hsh);
		 Iterator<String> i=hsh.iterator();  
         while(i.hasNext())  
         {  
         System.out.println(i.next());  
         }  
	}
}
