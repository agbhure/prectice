package Collection;

import java.util.LinkedList;

public class addforEach {
	public static void main(String[] args) {
		LinkedList j=new LinkedList();
		j.add("amaresh");
		j.add("mallikarjun");
		j.add("Sangmesh");
		j.add("Gangshetty");
		j.add("prabhavati");
		for(int i=0;i<j.size();i++) {
			System.out.println(j.get(i));
		}
		
	}

	
}
