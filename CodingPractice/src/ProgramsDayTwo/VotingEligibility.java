package ProgramsDayTwo;

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("eligible to vote");
		} else {
			System.out.println("not eligible");
		}
	}
}
