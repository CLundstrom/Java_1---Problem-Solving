package cl222ae_lab3;

public class MultiDisplay {

	private int displayCount = 1;
	private String displayMessage = "";

	public MultiDisplay() {
		setDisplayMessage("");
	}

	public MultiDisplay(String displayMessage, int displayCount) {

		setDisplayMessage(displayMessage);
		setDisplayCount(displayCount);
	}

	public void setDisplayMessage(String msg) {

		displayMessage = msg.isEmpty() ? "No string set for object." : msg;
	}

	public String getDisplayMessage() {

		return displayMessage;
	}

	public void setDisplayCount(int displayCount) {
		if(displayCount < 0)
			throw new IllegalArgumentException();
		
		this.displayCount = displayCount;
	}

	public void display(String msg, int count) {

		for (int i = 0; i < count; i++) {
			System.out.println(msg);
		}
	}

	public void display() {

		for (int i = 0; i < displayCount; i++)
			System.out.println(displayMessage);
	}

}
