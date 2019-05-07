package cl222ae_lab2;

import java.util.Scanner;

public class NastStorsta {

	public static void main(String[] args) {

		final int MAX_NUMBERS = 10;
		int saved = 0;
		int lastNumber = -2147483648; // Lowest value of int to make sure lastnumber always is lower than tmp.
		System.out.print("Enter 10 integers in a row or one at a time: ");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < MAX_NUMBERS; i++) {

			int tmp = sc.nextInt();
			if (tmp > lastNumber) {
				saved = lastNumber; // Saving last highest number
				lastNumber = tmp;
			}
		}
		System.out.println("\nSecond largest number is: " + saved);
		sc.close();
	}

}
