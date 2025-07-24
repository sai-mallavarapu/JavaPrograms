package ProgramsDayFour;

public class Timer {
public static void main(String[] args) throws InterruptedException  {
	
	while(true) {
		java.time.LocalTime now=java.time.LocalTime.now();
		int hourtime=now.getHour();
		
		if(hourtime==13) {
			System.out.println("lunch break remainder");
		}
		else if(hourtime==15) {
			System.out.println("tea break");
		}
		else {
			System.out.println("complete pending work...........");
		}
		
			Thread.sleep(3600000);
		
	}
}
}
