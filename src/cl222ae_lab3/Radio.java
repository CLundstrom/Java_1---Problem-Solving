package cl222ae_lab3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Radio {

	private int volume = 1;
	private int channel = 1;
	private boolean isOn = false;
	private static ArrayList<String> Log = new ArrayList<String>();

	public String getSettings() {

		return String.format("Settings: On: %s \tChannel: %s \tVolume: %s", isOn, channel, volume);
	}

	public void turnOn() {

		if (isOn)
			System.err.println("Radio is already on.");
		else {
			isOn = true;
			Log("Radio turned on");
		}
	}

	public void turnOff() {
		if (!isOn)
			System.out.println("Radio is already off.");
		else {
			isOn = false;
			volume = 1;
			this.channel = 1;
			Log("Radio turned off");
		}
	}

	/** @param volume A value between 0-5. Default: 1 */
	public void setVolume(int volume) {
		if (!isOn) {
			System.err.println("Turn on radio before adjusting volume.");
			Log("Error: Radio already on.");
		}
			

		else if (volume < 0 || volume > 5)
			System.err.println("New volume not within range!");
		else {
			this.volume = volume;
			Log("Volume set to " + volume);
		}
	}

	public void volumeDown() {
		setVolume(volume - 1);
	}

	public void volumeUp() {
		setVolume(volume + 1);
	}

	/** @param channel A value between 1-10. Default: 1 */
	public void setChannel(int channel) {
		if (!isOn)
			System.err.println("Turn on radio before changing channels.");

		if (channel > 10 || channel < 1) {
			System.err.println("New channel not within range!");
			Log("Error: New channel not within range!");
		}
		else {
			this.channel = channel;
			Log("Channel set to: " + channel);
		}
	}

	public void channelUp() {
		setChannel(channel + 1);
	}

	public void channelDown() {
		setChannel(channel - 1);
	}

	private void Log(String s) {
		Log.add(String.format("%s: %s", LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")), s));
	}

	public void printLog() {
		System.out.println("\nLogged Actions\n---------------");
		for (String s : Log) {
			System.out.println(s);
		}
	}

}
