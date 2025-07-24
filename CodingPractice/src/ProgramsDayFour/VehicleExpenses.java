package ProgramsDayFour;

interface Vehicle {
	void speed();
}

abstract class Pulsar implements Vehicle {
	int cost;
	double maintainance;
	int milage;

	Pulsar(int cost, double maintainance, int milage) {
		this.cost = cost;
		this.milage = milage;
		this.maintainance = maintainance;
	}

	double bikeExpenses() {
		return cost + maintainance + milage;
	}
}

class Pulsar125 extends Pulsar {

	Pulsar125(int cost, double maintainance, int milage) {
		super(cost, maintainance, milage);

	}

	@Override
	public void speed() {
		System.out.println("Maximum speed is 100km/hr");

	}

}

class pulsar150 extends Pulsar {

	pulsar150(int cost, double maintainance, int milage) {
		super(cost, maintainance, milage);

	}

	@Override
	public void speed() {
		System.out.println("maximum speed is 110km/hr");

	}

}

public class VehicleExpenses {
	public static void main(String[] args) {
		Pulsar p = new Pulsar125(120000, 3000, 50);
		p.speed();
		double totalcost=p.bikeExpenses();
		System.out.println("totalcost of pulsar125 and one month maintainance:"+totalcost);
		Pulsar p1 = new pulsar150(150000, 5000, 45);
		p1.speed();
		double totalcost1=p1.bikeExpenses();
		System.out.println("totalcost of pulsar150 and one month maintainance:"+totalcost1);
	}
}
