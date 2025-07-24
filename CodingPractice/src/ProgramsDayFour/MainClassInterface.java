package ProgramsDayFour;

interface Rent4 {
	void showExpesnses();
}

class RentHouse implements Rent4 {

	int houserent;
	double power;
	int waterbill;

	RentHouse(int houserent, double power, int waterbill) {
		this.houserent = houserent;
		this.power = power;
		this.waterbill = waterbill;
	}

	@Override
	public void showExpesnses() {
		double totalbill = houserent + power + waterbill;
		System.out.println("Total expenses:" + totalbill);

	}
}

class Apartment4 implements Rent4 {
	int houserent;
	double power;
	int waterbill;

	Apartment4(int houserent, double power, int waterbill) {
		this.houserent = houserent;
		this.power = power;
		this.waterbill = waterbill;
	}

	@Override
	public void showExpesnses() {
		double totalbill = houserent + power + waterbill;
		System.out.println("Total expenses:" + totalbill);

	}
}

public class MainClassInterface {
	public static void main(String[] args) {
		RentHouse r = new RentHouse(5000, 200, 100);
		r.showExpesnses();
		Apartment4 a = new Apartment4(10000, 1000, 500);
		a.showExpesnses();

	}
}
