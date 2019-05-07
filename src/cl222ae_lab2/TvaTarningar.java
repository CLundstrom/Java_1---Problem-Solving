package cl222ae_lab2;

import java.util.Random;

public class TvaTarningar {

	static final int MAX_DICE_COUNT = 10000;

	public static void main(String[] args) {

		System.out.println("Frequency table (sum, count) for rolling two dices 10000 times.");
		Random rand = new Random();

		int[] numberOfSums = new int[14];

		for (int i = 1; i <= MAX_DICE_COUNT; i++) {

			int sum = (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1);

			numberOfSums[sum] += 1;

		}

		printResults(numberOfSums);
	}

	public static void printResults(int[] sums) {

		for (int i = 2; i < sums.length - 1; i++) {
			System.out.println(i + "\t" + sums[i]);

		}
	}
}
