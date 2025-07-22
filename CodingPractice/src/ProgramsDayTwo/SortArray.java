package ProgramsDayTwo;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array length");
	int size=sc.nextInt();
	int[] a=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		Arrays.sort(a);
	}
	for(int arr:a) {
		System.out.print(arr+" ");
	}
}
}
