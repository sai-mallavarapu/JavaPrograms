package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidation {
	public static void main(String[] args) {
		String[] data = { "sai", "ramu", "100", "200", "hsjss", "./ksks", };
		String numberPattern = "[-+]?\\d*\\.?\\d+";
		Pattern regex = Pattern.compile(numberPattern);
		for (String s : data) {
			Matcher matcher = regex.matcher(s);
			if (matcher.matches()) {
				System.out.println("valid number");
			} else {
				System.out.println("invalid number");
			}
		}
	}
}
