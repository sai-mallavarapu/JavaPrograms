package com;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
			if (isPrime && n>1) {
				System.out.println("prime");
			} else {
				System.out.println("not prime");
			}
		

	}
}
