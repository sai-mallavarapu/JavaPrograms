package ProgramsDayThree;

public class Employee {
private String employeename;
private double salary;

public void setEmployeename(String employeename) {
	this.employeename=employeename;
}
public void setSalary(double salary) {
	this.salary=salary;
	
}
public void display() {
	System.out.println("employee name is:"+employeename);
	System.out.println("employee salary is:"+salary);
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.setEmployeename("ravi");
	e.setSalary(10000);
	e.display();
}

}
