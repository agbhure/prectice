package Collection;

public class Car implements Comparable<Car> {
	int cost;
	Car(int cost){
		this.cost=cost;
		
	}
	public String toString() {
		return cost+"";
	}
	@Override
	public int compareTo(Car e) {
	
		return this.cost-e.cost;
	}

}
