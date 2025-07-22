package ProgramsDayTwo;

import java.util.Scanner;

public class FindVowelsCountInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String s=sc.nextLine();
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
				count++;
			}
		}
				System.out.println(count);
			
		}
	}

