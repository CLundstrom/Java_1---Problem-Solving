package cl222ae_lab3;

public class AlarmMain {

	static final int DEFINED_TIME = 500;
	
	public static void main(String[] args) {
		
		AlarmClock ac = new AlarmClock(23, 48);
		
		ac.displayTime();
		ac.setAlarm(6, 15);
		ac.displayAlarmTime();
		
		for(int i = 0; i < DEFINED_TIME; i++) {
			ac.timeTick();
		}
		
		ac.displayTime();
	}

}
