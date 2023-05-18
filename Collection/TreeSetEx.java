package Collection;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
/*unique elements only like HashSet.
 *doesn't allow null element
 *maintains ascending order.
 *efficient data structures in order to keep the large data 
  that is sorted and also to do operations on it.
 *TreeSet class is non synchronized.
 *access and retrieval times are quiet fast
*/		
 
		
		TreeSet<String> str = new TreeSet<>();
		str.add("1");
		str.add("2");
		str.add("3");		
		str.add("5");
		str.add("4");
		str.add("6");
		str.add("7");
		str.add("8");
		str.add("9");
//		str.add("10");
//		str.add("11");
//		str.add("12");
//		str.add("13");
//		str.add("14");
//		str.add("15");
//		str.add("16");
//		
//		str.add("18");
//		str.add("19");
//		str.add("20");
//		str.add("21");
//		str.add("17");
		
		System.out.println(str);
	}
}
