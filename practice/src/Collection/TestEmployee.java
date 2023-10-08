package Collection;

import java.util.TreeSet;

public class TestEmployee {
public static void main(String[] args) {
	Employee e1=new Employee(103,"Lokesh",12.16);
	Employee e2=new Employee(101,"Sachin",9.16);
	Employee e3=new Employee(102,"Amaresh",11.16);
	TreeSet<Employee>t=new TreeSet<Employee>();
	t.add(e1);
	t.add(e2);
	t.add(e3);
	for(Employee emp:t) {
		System.out.println(emp);
	}
	
	
}
}
