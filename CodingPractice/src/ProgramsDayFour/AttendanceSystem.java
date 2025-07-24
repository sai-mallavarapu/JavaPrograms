package ProgramsDayFour;

import java.util.Scanner;

public class AttendanceSystem {
	String studentname;
	String attendance;

	AttendanceSystem(String studentname, String attendance) {
		this.studentname = studentname;
		this.attendance = attendance;
	}

	void studentAttendance() {
		System.out.println("student name:" + studentname);
		System.out.println("Student attendance:" + attendance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter yes to proceed or no to skip");
		String choice = sc.nextLine().toLowerCase();

		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("enter Student name");
			String name = sc.nextLine();
			System.out.println("enter student present/absent");
			String status = sc.nextLine();

			AttendanceSystem a = new AttendanceSystem(name, status);
			a.studentAttendance();
			System.out.println("...................");
			System.out.println("enter new person attendance");
			choice = sc.nextLine().toLowerCase();
		}

		System.out.println("attendance closed today");
	}
}
