package ProgramsDayTwo;

import java.util.Scanner;

public class MergeArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array Length");
		int size1 = sc.nextInt();
		int[] a = new int[size1];
		System.out.println("enter the array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter array Length");
		int size2 = sc.nextInt();
		int[] b = new int[size2];
		System.out.println("enter the array elements");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
