package Collection;

import java.util.HashMap;
import java.util.Map;

public class HMap {

	public static void main(String[] args)
    {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(10, "Geeks");
        map.put(15, "4");
        map.put(25, "Geeks");
        map.put(25, "Welcomes");//will not allow duplicate keys
        map.put(30, "You");
        
        System.out.println(map);
        
    }
}
