package day5;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class TimerProgram {
	public static void main(String[] args) {

		String[] remindhours = { "08:00 AM", "09:00 AM", "01:30 PM", "04:00 PM" };

		String[] tasks = { "eat breakfast", "join session", "lunch break", "tea break" };

		Timer time = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {

				String currenttime=LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"));
				for (int i = 0; i < tasks.length; i++) {

					if (currenttime.equals(remindhours[i])) {
						System.out.println(tasks[i]);
					}
				}
			}
		};

		time.schedule(task, 0, 60000);
		System.out.println("remainder started");
	}
}
