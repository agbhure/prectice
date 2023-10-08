package Collection;

import java.util.LinkedList;

public class add {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		for(int i:l)
		{
			System.out.println(i);
		}
		//Auto Boxing convert primitive to non primitive
		int a=10;
		Integer b=new Integer(a);
		System.out.println(a  +"  "+b);
		
		double c=21.2;
		Double d=new Double(c);
		System.out.println(c+ ""+d);
		char e='A';
		Character f=new Character(e);
		System.out.println(e+"   "+f);
		
		//Auto Unboxing converted non primitive to primitive class
		Float g=new Float(123.12);
		float h=g;
		System.out.println(g+ " "+h);
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("amaresh");
		System.out.println(ll);
		
		
		
		
		
		
		
	}

}
