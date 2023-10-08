package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class demo1 {
	public static void main(String[] args) {
		ArrayList x=new ArrayList();
		x.add(10);
		System.out.println(x);
		
		
		LinkedList l=new LinkedList(x);
		l.add(20);
		System.out.println(l);
		}
	
	
	

}
