package Collection;

import java.util.TreeSet;

public class Testcar {
public static void main(String[] args) {
	Car c1=new Car(2500);
	Car c2=new Car(2800);
	Car c3=new Car(2100);
	Car c4=new Car(2400);
	Car c5=new Car(2700);
	Car c6=new Car(2100);
	TreeSet<Car> t=new TreeSet<Car>();
	t.add(c1);
	t.add(c2);
	t.add(c3);
	t.add(c4);
	t.add(c5);
	t.add(c6);
	for(Car u:t) {
		System.out.println(u);
	}
	
}
}
	