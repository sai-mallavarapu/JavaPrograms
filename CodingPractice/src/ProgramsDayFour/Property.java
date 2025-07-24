package ProgramsDayFour;

abstract class RealEstate {
	abstract void expenses();

}

class Home extends RealEstate {
	int rent;
	int water;
	double power;

	Home(int rent, int water, double power) {
		this.rent = rent;
		this.water = water;
		this.power = power;
	}

	void expenses() {
		System.out.println(rent+water+power);
		System.out.println("less");

	}

}

class Apartment extends RealEstate {
	int rent;
	int water;
	double power;
	Apartment(int rent, int water, double power) {
		this.rent = rent;
		this.water = water;
		this.power = power;
	}
	@Override
	void expenses() {
		double amount=rent+water+power;
		System.out.println(amount);
		System.out.println("high");

	}

}

public class Property {
	public static void main(String[] args) {

		RealEstate r = new Home(8000, 500, 500);
		r.expenses();
		RealEstate r2 = new Apartment(10000, 1000, 800);
		r2.expenses();

	}
}
