package ProgramsDayFour;

import java.util.Calendar;

public class CalenderProgram {
public static void main(String[] args) {
	
	Calendar calendar=Calendar.getInstance();
	System.out.println("current date and time:"+calendar.getTime());
	calendar.set(Calendar.YEAR,2025);
	calendar.set(Calendar.MONTH,Calendar.JANUARY);
	calendar.set(Calendar.DAY_OF_MONTH,15);
	System.out.println("Specific date jan 15:"+calendar.getTime());
	
	calendar.set(Calendar.MONTH, 10);
	System.out.println("adding 10days to that jan 15:"+calendar.getTime());
	
	calendar.set(Calendar.MONTH, -1);
	System.out.println("subtracting one day from the month:"+calendar.getTime());
}
}
