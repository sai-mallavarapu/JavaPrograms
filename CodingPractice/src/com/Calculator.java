package com;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	double a=sc.nextDouble();
	System.out.println("enter second number");
	double b=sc.nextDouble();
	
	
	double sum=a+b;
	double difference=a-b;
	double product=a*b;
	double quotient=0;
	if(b!=0) {
		quotient=a/b;
	}
	else {
		System.out.println("division not allowed by zero");
	}
	System.out.println("sum of numbers is:"+sum);
	System.out.println("difference of numbers is:"+difference);
	System.out.println("product of numbers is:"+product);
	System.out.println("division of numbers is:"+quotient);
}
}
