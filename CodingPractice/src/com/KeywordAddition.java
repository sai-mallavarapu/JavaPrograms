package com;

import java.util.Scanner;

public class KeywordAddition {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	int a=sc.nextInt();
	System.out.println("enter second number");
	int b=sc.nextInt();
	int sum=a+b;
	System.out.println(sum);
	sc.close();
}
}
