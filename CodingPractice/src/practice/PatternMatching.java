package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
public static void main(String[] args) {
	Pattern pattern=Pattern.compile("JavaCoding",Pattern.CASE_INSENSITIVE);
	Matcher matcher=pattern.matcher("Learn JavaCoding");
	boolean matchFound=matcher.find();
	if(matchFound) {
		System.out.println("match found");
	}
	else {
		System.out.println("match not found");
	}
}
}
