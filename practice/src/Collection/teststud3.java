package Collection;

import java.util.TreeSet;

public class teststud3 {
	public static void main(String[] args) {
		student3 s1=new student3(22,"amaresh");
		student3 s2=new student3(15,"suchi");
		student3 s3=new student3(21,"krishna");
		studentbyint age1=new studentbyint();
		TreeSet<student3> t=new TreeSet<student3>(age1);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		for(student3 std:t) {
			System.out.println(std);
		}
		
		
	}

	}


