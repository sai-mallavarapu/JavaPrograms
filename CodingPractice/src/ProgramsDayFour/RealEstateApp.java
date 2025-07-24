package ProgramsDayFour;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Property1 {
	private String address;
	private double price;
	private int bedrooms;

	Property1(String address, double price, int bedrooms) {
		this.address = address;
		this.price = price;
		this.bedrooms = bedrooms;
	}

	public String getAddress() {
		return address;
	}

	public double getPrice() {
		return price;
	}

	public int getBedrooms() {
		return bedrooms;

	}

	public String toString() {
		return String.format("Property1[address='%s', price=%.2f, bedrooms=%d]", address, price, bedrooms);

	}
}

public class RealEstateApp {
	static List<Property1> properties = new ArrayList<>();

	public static void main(String[] args) {
		properties.add(new Property1("Hyderabad", 100000, 2));
		properties.add(new Property1("Ameerpet", 70000, 3));
		properties.add(new Property1("chennai", 80000, 2));
		properties.add(new Property1("Ongole", 50000, 2));

		filterAndAct(p -> p.getPrice() < 300_000, p -> System.out.println("Affordable: " + p));

		System.out.println();

		filterAndAct(p -> p.getBedrooms() == 2, p -> System.out.println("Schedule showing: " + p));
	}

	static void filterAndAct(Predicate<Property1> tester, Consumer<Property1> action) {
		for (Property1 p : properties) {
			if (tester.test(p)) {
				action.accept(p);
			}
		}
	}

}
