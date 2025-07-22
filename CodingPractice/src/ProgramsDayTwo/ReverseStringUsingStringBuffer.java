package ProgramsDayTwo;

import java.util.Scanner;

public class ReverseStringUsingStringBuffer {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter String");
	String s=sc.nextLine();
	StringBuffer sb=new StringBuffer(s);
	sb.reverse();
	System.out.println(sb);
}
}
