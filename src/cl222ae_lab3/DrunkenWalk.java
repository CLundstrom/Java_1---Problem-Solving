package cl222ae_lab3;

import java.util.Scanner;

public class DrunkenWalk {

	private static float people = 0;
	private static float amountOfSwimmers = 0;
	private static int steps = 0;
	private static int size = 0;

	public static void main(String[] args) {

		System.out.println("Walking a test-subject.");
		RandomWalk rw = new RandomWalk(10, 5);
		rw.takeStep();
		rw.takeStep();
		rw.takeStep();
		System.out.println(rw.toString());
		System.out.println();
		
		queryUser();
		walkPeople();
		printResults();
	}

	private static void queryUser() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Drunken Walk");
		System.out.println("------------");

		System.out.print("Enter size of platform: ");
		size = sc.nextInt();

		System.out.print("Enter maximum amount of steps: ");
		steps = sc.nextInt();
		System.out.print("Enter amount of people to walk: ");
		people = sc.nextInt();

		sc.close();
	}

	private static void walkPeople() {

		for (int i = 0; i < people; i++) {

			RandomWalk rw = new RandomWalk(steps, size);
			rw.walk();
			if (!rw.inBounds()) {
				amountOfSwimmers = amountOfSwimmers + 1;
			}
		}
	}

	private static void printResults() {

		float percentage = 0;
		if (amountOfSwimmers == 0) {
			percentage = 0;
		} else {
			percentage = amountOfSwimmers/people*100;
		}
		System.out.println(String.format("Out of %.0f drunk people, %.0f (%.2f%%) fell in the water.", people,
				amountOfSwimmers, percentage));

	}

}
