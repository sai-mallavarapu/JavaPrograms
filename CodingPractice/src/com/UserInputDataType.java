package com;

import java.util.Scanner;

public class UserInputDataType {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name");
		String name=sc.nextLine();
		System.out.println("Enter User score");
		int score=sc.nextInt();
		System.out.println("Enter User height");
		Double height=sc.nextDouble();
        System.out.println("name:"+name);
		System.out.println("score:"+score);
		System.out.println("height:"+height);
	}
}
