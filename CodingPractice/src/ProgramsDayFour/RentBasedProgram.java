package ProgramsDayFour;

class Rent1 {

	void expenses() {
		System.out.println("expenses of complete view");
	}
}

class Home1 extends Rent1 {
	int rent;
	int bill;

	Home1(int rent, int bill) {
		this.rent = rent;
		this.bill = bill;
	}
    @Override
	void expenses() {
		int totalexpenses = rent + bill;
		System.out.println("totalexpenses of home:" + totalexpenses);
		
	}
}

class Apartment1 extends Rent1 {
	int rent;
	int bill;

	Apartment1(int rent, int bill) {
		this.rent = rent;
		this.bill = bill;
	}
    @Override
	void expenses() {
		int totalexpenses = rent + bill;
		System.out.println("totalexpenses of apartment:" + totalexpenses);
	}
}

public class RentBasedProgram {
	public static void main(String[] args) {
		Rent1 r1 = new Home1(8000, 2000);
		r1.expenses();

		Rent1 r2 = new Apartment1(9000, 2500);
		r2.expenses();

	}
}
