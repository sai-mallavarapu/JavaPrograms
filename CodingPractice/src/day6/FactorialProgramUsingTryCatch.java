package day6;

import java.util.Scanner;

public class FactorialProgramUsingTryCatch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	int fact=1;
	
	try {
		if(n<0) {
			System.out.println("not valid number..enter whole numbers only");
			throw new IllegalArgumentException();
		}
		else 
		{
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
	        }
			System.out.println(fact);
	      }
	    }  
	catch(IllegalArgumentException e) {
		System.out.println("exception occurred");
	}
	
}
}
