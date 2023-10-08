package Collection;

import java.util.ArrayList;

public class TestS1 {

	public static void main(String[] args) {
 S1 x=new S1(20,"Lokesh");
 S1 y=new S1(21, "amaresh");
 
 
 ArrayList<S1> l=new ArrayList();
 l.add(x);
 l.add(y);
 
 
 for(S1 z:l) {
	 System.out.println(z);
 }
 
	}

}
