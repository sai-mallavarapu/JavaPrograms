package ProgramsDayFour;

import java.util.Timer;
import java.util.TimerTask;

public class TimerProgram {
	public static void main(String[] args) {

		Timer timer = new Timer();
		TimerTask tt = new TimerTask() {

			@Override
			public void run() {
				System.out.println("inform me for everyone hour" + java.time.LocalTime.now());

			}
		};
		timer.schedule(tt, 0, 3600000);
		System.out.println("Message scheduler starts press ctrl+c to stop");
	}

}
