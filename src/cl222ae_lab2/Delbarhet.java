package cl222ae_lab2;

public class Delbarhet {

	public static void main(String[] args) {

		int rowNumber = 0;
		for (int value = 100; value <= 200; value++) {

			boolean divideBy4 = (value % 4) == 0;
			boolean divideBy5 = (value % 5) == 0;

			if (divideBy4 && divideBy5) {
				continue;
			}

			else if (divideBy5 || divideBy4) {

				// Prints a new line if the rownumber is divisible by 10.
				if (rowNumber % 10 == 0) {
					System.out.print("\n" + value + " ");
					rowNumber++;
				} else {
					System.out.print(value + " ");
					rowNumber++;
				}
			}
		}
	}
}
