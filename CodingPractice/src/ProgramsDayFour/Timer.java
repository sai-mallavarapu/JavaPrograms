package ProgramsDayFour;

import java.time.LocalTime;

public class Timer {
	public static void main(String[] args) throws InterruptedException {

		while (true) {
			LocalTime now = LocalTime.now();
			int hourtime = now.getHour();

			if (hourtime == 13) {
				System.out.println("lunch break remainder");
			} else if (hourtime == 16) {
				System.out.println("tea break");
			} else {
				System.out.println("complete pending work...........");
			}
			Thread.sleep(3600000);
			

		}
	}
}
