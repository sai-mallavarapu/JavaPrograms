package ProgramsDayTwo;

public class PalindromeCheck {
public static void main(String[] args) {
	String s="sos";
	StringBuilder sb=new StringBuilder(s);
	sb.reverse();
	if(s.equals(sb.toString())) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not");
	}
}
}
