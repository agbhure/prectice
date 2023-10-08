package Collection;

import java.util.Comparator;

import org.apache.poi.ss.formula.functions.LookupUtils.LookupValueComparer;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	double sal;
	
	Employee(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
		}
	public String toString() {
		return id+""+name+""+sal;
	}
	@Override
	public int compareTo(Employee e) {
		
		return (int) ((int)this.sal-e.sal);
	}
	
	

}
