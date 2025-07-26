package day6;

import java.util.Scanner;

public class ArrayExceptionProgram {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		try {
			System.out.println("enter index to find");
             int index=sc.nextInt();
			
				System.out.print("In index"+index +"  "+"value is :"+a[index] + " ");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("elements are out of bond"+" "+e.getMessage());
			
		}
	}
}
