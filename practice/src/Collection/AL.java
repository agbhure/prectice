package Collection;

import static org.testng.Assert.assertListContains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class AL {
	public static void main(String[] args) {
		ArrayList a=new ArrayList() ;
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains(10));
		System.out.println(a.get(2));
		System.out.println(a.indexOf(40));
		
		LinkedList l=new LinkedList();
		l.addAll(a);
		l.add(50);
		System.out.println(l);
		
		System.out.println(a.contains(l));
		a.add(50);
		System.out.println("l contains  "+ l);
		System.out.println(("a contains  "+a));
		System.out.println(a.containsAll(l));
		l.add(60);
		
		a.removeAll(l);		
		
		System.out.println(l);
		System.out.println(a);
		
		LinkedList al=new LinkedList();
	al.add(40);
	al.add(20);
	al.add(70);
	al.add(4);
	al.add(50);
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
	al.add(1, 7);

	System.out.println(al);
	al.set(1, 50);
	System.out.println(al);
	

		
		}

}
