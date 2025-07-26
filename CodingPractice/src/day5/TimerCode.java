package day5;

public class TimerCode {
public static void main(String[] args) {
	
	
	String[] tasks= 
		{"wake up","do exercise","do breakfast","ready for Session","watch session",
				"practice session","tea break","lunch break","re join session","Session completed u can leave"};
	
	double[] times= {5.00,6.00,7.00,8.00,9.00,10.00,11.00,12.00,13.00,18.00};
	
	String meridian=" ";
	
	for(int i=0;i<tasks.length;i++) {
		if(times[i]>=12)
			meridian="pm";
		
	else {
		meridian="am";	
	}
	
	System.out.println(times[i]+" "+meridian);
	System.out.println(tasks[i]);
	System.out.println("------------------------------------------");
	}
}
}
