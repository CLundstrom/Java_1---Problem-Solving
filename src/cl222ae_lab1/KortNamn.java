package cl222ae_lab1;

import java.util.Scanner;

public class KortNamn {

	final static int LASTNAME_MIN = 4;
	static String FirstName = "";
	static String LastName = "";
	
	public static void main(String[] args) {
		
		GetName();
		System.out.print(FirstName.charAt(0) + ". " );
		
		if (LastName.length() < LASTNAME_MIN) {
			
			System.out.print(LastName.substring(0, LastName.length()));
		}
		else {
			
			System.out.print(LastName.substring(0, 4));
		}
	}
	
	
	public static void GetName() {
		System.out.print("Enter first name: ");
		Scanner sc = new Scanner(System.in);
		FirstName = sc.nextLine();
		System.out.print("Enter last name: ");
		LastName = sc.nextLine();

		if (FirstName.isEmpty() || LastName.isEmpty()) {
			System.out.println("Missing fields. Please try again");
			GetName();
		}
		sc.close();
	}
}
