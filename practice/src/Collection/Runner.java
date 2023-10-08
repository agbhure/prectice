package Collection;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		Student s1=new Student(12, "amaresh");
		Student s2=new Student(13, "Lokesh");
		Student s3=new Student(14, "sachin");
		ArrayList< Student>l=new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		for(Student std:l) {
			System.out.println(std.age);
			System.out.println(std.name);
			System.out.println("..................................");
			
		}
	}

}
