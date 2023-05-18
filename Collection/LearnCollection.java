package Collection;

import java.util.*;

public class LearnCollection {

	public static void main(String[] args) {
		
		
		/*ordered is preserved
		 *duplicates are allowed 
		 *indexed collection*/
		
		/*type safe*/
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Tara");
		names.add("Sitara");
		names.add("Sam");
		names.add("Ram");
        //names.remove("Tara");
        //System.out.println(names.indexOf("Sitara"));
        //System.out.println(names.contains("Sam"));
		//names.set(1, "Shyam");
		names.add(1,"Shyam");
        for (String nam : names)
		{
			System.out.println(nam);
		}
		
		System.out.println("_______________________");
		
		/*untype safe*/
		
//		LinkedList list = new LinkedList();
//		
//		list.add("Same");
//		list.add(23);
//		list.add('M');
//		System.out.println(list);
        
		
		
		/*in hash set ordered not preserved
		 *duplicates are not allowed 
		 *not indexed collection*/
		
        HashSet<Double> nms = new HashSet<Double>();
        nms.add(13.55);
        nms.add(3.55);
        nms.add(133.55);
        nms.add(1398.55);
        nms.add(138.55);
        System.out.println("Hashset: "+nms);
        
        
        //oredred list
        TreeSet<Double> tset = new TreeSet<Double>();
        tset.addAll(nms);
        System.out.println("Treeset: "+tset);
        
        System.out.println("_______________________");
        
        Vector<String> vect = new Vector<String>();
        vect.addAll(names);
        System.out.println("Vector: "+vect);
        
        System.out.println("_______________________");
        //using iterator 
        Iterator<String> itr = names.iterator();
        //forword
        while(itr.hasNext())
        {
        	String next = itr.next();
        	System.out.println(next);
        }
        System.out.println("_______________________");
        //backword
        ListIterator<String> litr = names.listIterator(names.size());
        while(litr.hasPrevious())
        {
        	String pre = litr.previous();
        	System.out.println(pre);
        }
        
        System.out.println("_______________________");
        //duplicates not allowed order not maintain
        HashMap<String, Integer> course = new HashMap<String, Integer>();
        
        course.put("core java", 4000);

        course.put("DBT", 3500);

        course.put("java", 4500);

        course.put("Spring", 5000);
        
		System.out.println(course);
	}
}
