package Collection;

import java.util.Set;
import java.util.TreeMap;

public class fruitshop {
	public static void main(String[] args) {
		TreeMap<String,Integer> tm=new TreeMap<String, Integer>();
		tm.put("Mango",50);
		tm.put("Graps",60);
		tm.put("Chikku",20);
		tm.put("ButterFruit",75);
		tm.put("Apple",101);
		Set<String> s = tm.keySet();
		System.out.println(s);
		System.out.println(tm.get(s));
	
		
	}

}
