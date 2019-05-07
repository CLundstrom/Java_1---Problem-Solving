package cl222ae_lab3;

public class MultiDisplayMain {

	public static void main(String[] args) {

		MultiDisplay noValues = new MultiDisplay();
		MultiDisplay values = new MultiDisplay("Object instantiated with values.", 1);
		
		//Two objects. One will display a default value.
		noValues.display();
		values.display();
		
		//Setting values
		noValues.setDisplayMessage("Hello World!");
		noValues.setDisplayCount(3);
		
		//Display again after setting values
		noValues.display();
		
		//Testing display overload.
		noValues.display("Goodbye cruel world!", 2);
		
		System.out.println("Current message: " + noValues.getDisplayMessage());
	}

}
