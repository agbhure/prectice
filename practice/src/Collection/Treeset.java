package Collection;

import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(5);
		ts.add(20);
		ts.add(7);
		ts.add(9);
		ts.add(0);
		for(int tsa:ts) {
			System.out.println(tsa);
		}
	}

}
