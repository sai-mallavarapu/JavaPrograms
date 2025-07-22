package ProgramsDayThree;

abstract class EmployeeOne {
	String name;
	int empid;

	public EmployeeOne(String name, int empid) {
		this.name = name;
		this.empid = empid;
	}

	abstract double calculateSalary();

	public void display() {
		System.out.println("employee name:" + name);
		System.out.println("employee id:" + empid);
	}
}

class FullTimeEmploye extends EmployeeOne {
	double monthlySalary;

	public FullTimeEmploye(String name, int empid, double monthlySalary) {
		super(name, empid);
		this.monthlySalary = monthlySalary;
	}

	@Override
	double calculateSalary() {

		return monthlySalary;
	}
}

class ParttimeEmployee extends EmployeeOne {
	int hours;
	double ratePerHour;

	public ParttimeEmployee(String name, int empid, int hours, double ratePerHour) {
		super(name, empid);
		this.hours = hours;
		this.ratePerHour = ratePerHour;
	}

	@Override
	double calculateSalary() {

		return hours * ratePerHour;
	}
}

public class PayrollSystem {
	public static void main(String[] args) {
		EmployeeOne e1 = new FullTimeEmploye("chetan", 101, 50000);
		EmployeeOne e2 = new ParttimeEmployee("kiran", 102, 80, 30);

		e1.display();
		System.out.println(e1.calculateSalary());

		e2.display();
		System.out.println(e2.calculateSalary());
	}
}
