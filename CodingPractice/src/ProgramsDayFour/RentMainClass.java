package ProgramsDayFour;

abstract class Rent3 {
	abstract void expensess();
}

abstract class Home3 extends Rent3 {

	int rent;
	double power;
	int foodexpense;

	Home3(int rent, double power, int foodexpense) {
		this.rent = rent;
		this.foodexpense = foodexpense;
		this.power = power;
	}
}

class RentHome extends Home3 {

	RentHome(int rent, double power, int foodexpense) {
		super(rent, power, foodexpense);

		System.out.println("less expenses");
	}

	@Override
	void expensess() {
		double amount = rent + power + foodexpense;
		System.out.println("amount total for expenses:" + amount);

	}

}

class Apartment3 extends Home3 {

	Apartment3(int rent, double power, int foodexpense) {
		super(rent, power, foodexpense);
		System.out.println("high expenses");

	}

	@Override
	void expensess() {
		double amount = rent + power + foodexpense;
		System.out.println("amount total for expenses:" + amount);

	}

}

public class RentMainClass {
	public static void main(String[] args) {

		Home3 h=new RentHome(5000, 200, 500);
		h.expensess();
		Home3 h1=new Apartment3(10000, 2000, 500);
		h1.expensess();
		//RentHome h = new RentHome(1000, 2000, 3000);
	     //h.expensess();
		 //Apartment3 a = new Apartment3(10000, 500, 200);
		 //a.expensess();

	}
}
