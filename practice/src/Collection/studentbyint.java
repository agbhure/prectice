package Collection;

import java.util.Comparator;

public class studentbyint implements Comparator<student3>{

	@Override
	public int compare(student3 x, student3 y) {
		return x.name.compareTo(y.name);
	}
	

}
