package ProgramsDayFour;

public class StringBasedProgram {
public static void main(String[] args) {
	String s="  i am sai";
	
	System.out.println(s.length());
	System.out.println(s.charAt(6));
	System.out.println(s.substring(0,8));
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s.contains("saii"));
	System.out.println(s.replace('a', 'A'));
	System.out.println(s.trim());
	System.out.println(s.indexOf("ai"));
}
}
