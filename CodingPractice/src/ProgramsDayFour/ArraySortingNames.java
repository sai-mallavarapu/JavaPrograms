package ProgramsDayFour;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingNames {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int size=sc.nextInt();
	String a[]=new String[size];
	System.out.println("enter names ");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.next();
	}
	for(int i=0;i<a.length;i++) {
		Arrays.sort(a);
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	
	
}
}
