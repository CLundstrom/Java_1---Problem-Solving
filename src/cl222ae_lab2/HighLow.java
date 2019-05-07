package cl222ae_lab2;

import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {

		System.out.print("Guess a number between 0 and 100: ");
		Scanner sc = new Scanner(System.in);

		int number = (int) (Math.random() * 100);
		int guess = sc.nextInt();
		int nrOfGuesses = 1;

		while (guess != number) {

			if (guess < number) {
				System.out.println("Guesses: " + nrOfGuesses + "\nHint: Higher");
				guess = sc.nextInt();
				nrOfGuesses += 1;
			} else if (guess > number) {
				System.out.println("Guesses: " + nrOfGuesses + "\nHint: Lower");
				guess = sc.nextInt();
				nrOfGuesses += 1;
			}

			if (nrOfGuesses == 10) {
				System.out.println("Guesses: " + nrOfGuesses);
				System.out.println("You're out of attempts, better luck next time!");
				System.exit(0);
			}
		}
		System.out.println("Correct! It took " + nrOfGuesses + " guesses");
		sc.close();

	}
}
