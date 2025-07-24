package ProgramsDayFour;

import java.util.TimerTask;

public class TimerPrograms {
public static void main(String[] args) {
	
	java.util.Timer timer=new java.util.Timer();
	TimerTask tt=new TimerTask() {
		
		@Override
		public void run() {
		System.out.println("provide me message to remember its onehour completed"+java.time.LocalTime.now());			
		}
	};
	timer.schedule(tt,0,360000);
	System.out.println("Message scheduler starts if u r work done sttop it");
}
}
