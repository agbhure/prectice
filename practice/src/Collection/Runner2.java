package Collection;

import java.util.LinkedList;

public class Runner2 {
	public static void main(String[] args) {
		Emp e1=new Emp(101,"Ambani");
		Emp e2=new Emp(102,"Cook");
		Emp e3=new Emp(103,"TATa");
		
		LinkedList< Emp>ll=new LinkedList<Emp>();
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		for(Emp details:ll)
			System.out.println(details);
		
	}

}
