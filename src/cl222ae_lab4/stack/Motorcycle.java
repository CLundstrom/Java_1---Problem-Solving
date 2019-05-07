package cl222ae_lab4.stack;

public class Motorcycle {

	private String make;
	private String model;
	private int year;
	
	public Motorcycle (String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		System.out.println("Adding " + toString());
	}
	
	public String toString() {
		
		
		return String.format("%s, %s, %d" , this.make, this.model, this.year);
	}

	public String getMake() {

		return this.make;
	}

	public String getModel() {

		return this.make;
	}

	public int getYear() {

		return this.year;
	}
	
}
