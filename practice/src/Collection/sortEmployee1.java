package Collection;

import java.util.Comparator;

public class sortEmployee1 implements Comparator<employee1> {

	public int compare(employee1 x, employee1 y) {
		return x.id-y.id;
	}
	
	
	

}
