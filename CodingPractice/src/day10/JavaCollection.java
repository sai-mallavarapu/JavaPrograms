package day10;

import java.util.ArrayList;

public class JavaCollection {
	class Department {
		private String name;
		private double sales;
		private double expenses;

		public Department(String name, double sales, double expenses) {
			this.name = name;
			this.sales = sales;
			this.expenses = expenses;
		}

		public double getProfit() {
			return sales - expenses;
		}

		public String getName() {
			return name;
		}
	}

	public static void main(String[] args) {
		JavaCollection j = new JavaCollection();
		ArrayList<Department> depart = new ArrayList<>();

		depart.add(j.new Department("Sales", 1000, 8000));
		depart.add(j.new Department("marketing", 1200, 9000));
		depart.add(j.new Department("Research", 5000, 4000));

		for (Department d : depart) {
			System.out.println(d.getName() + " profit " + d.getProfit());
		}
		depart.sort((d1, d2) -> Double.compare(d2.getProfit(), d1.getProfit()));
		System.out.println("sorting done");
		for (Department d : depart) {
			System.out.println(d.getName() + " profit " + d.getProfit());
		}

	}
}
