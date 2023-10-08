package Collection;

import java.util.TreeSet;

public class testemp {
	public static void main(String[] args) {
		employee1 e1=new employee1(101,"ramu",22000);
		employee1 e2=new employee1(105,"suresh",3000);
		employee1 e3=new employee1(103,"lokesh",44000);
		employee1 e4=new employee1(107,"veeranna",12000);
		sortEmployee1 test=new sortEmployee1();
		TreeSet<employee1> t=new TreeSet<employee1>(test);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		
		for(employee1 emp:t) {
			System.out.println(emp);
		}
		
		
	}

}
