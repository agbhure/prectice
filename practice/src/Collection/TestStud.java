package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TestStud
{
	public static void main(String[] args) {
		
		 Stud s1=new Stud(10,"sachin");
		 Stud s2=new Stud(3,"amar");
		 Stud s3=new Stud(1,"lokesh");
		 
		 SortStudByAge obj=new  SortStudByAge();	 
		 TreeSet s=new TreeSet(obj) ;
		 s.add(s1);
		 s.add(s2);
		 s.add(s3);
		 Iterator v = s.iterator();
		while(v.hasNext())
		{
			System.out.println(v.next());
		}
		
		 
		
	}

}
