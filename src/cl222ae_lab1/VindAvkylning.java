package cl222ae_lab1;

import java.util.Scanner;

/* Windchill calculator.
*
*@ Christoffer Lundström - Linneaus University 2018
* 
* 
* 
*/

public class VindAvkylning {

	static double Celsius = 0;
	static double WindSpeed = 0;

	public static void main(String[] args) {

		PromptUser();
		GetExperiencedTemp();
	}

	public static void GetExperiencedTemp() {

		WindSpeed = Math.abs(WindSpeed * 3.6); // Convert to Km/h and makes sure the speed is a positive value

		// Windspeed formula
		double expTemp = (13.12 + 0.6215 * Celsius - 11.37 * (Math.pow(WindSpeed, 0.16))
				+ 0.3965 * Celsius * (Math.pow(WindSpeed, 0.16)));
		expTemp = Math.round(expTemp * 10); // Round off to whole number multiplied by 10
		expTemp = expTemp / 10; // divide by 10 to retain 1 decimal precision
		System.out.println("The experienced temperature (C): " + expTemp);
	}

	public static void PromptUser() {
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("Enter temperature in C: ");
			Celsius = Double.parseDouble(in.nextLine());
			System.out.println("Enter windspeed (m/s): ");
			WindSpeed = Double.parseDouble(in.nextLine());
			in.close();
		}

		catch (java.util.InputMismatchException e) {

			System.out.println("Improper formatting. Values should be of type double. Please try again");
			in.close();
		}

		catch (Exception e) {

			System.out.println("There was an unexpected error. Please try again: " + e.toString());
			in.close();
		}

	}
}
