package Collection;

import java.util.Comparator;

public class SortStudByAge implements Comparator<Stud> {

	@Override
	public int compare(Stud x, Stud y) {
		
		return x.age-y.age;
	}

	
	

}
