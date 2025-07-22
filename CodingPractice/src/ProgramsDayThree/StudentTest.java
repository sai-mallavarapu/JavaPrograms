package ProgramsDayThree;

class Student {
	String name;
	int age;

	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "sai";
		s.age = 20;
		s.display();

	}
}
