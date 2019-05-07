package cl222ae_lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OmvandOrdning {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<Integer>();

		int input = 1;
		int numberOfInput = 0;

		System.out.println("Enter a positive number, end with a negative: ");

		while (input > 0) {

			System.out.print("Tal " + (numberOfInput + 1) + ": ");
			input = sc.nextInt();

			if (input > 0) {
				numbers.add(input);
				numberOfInput++;
			}

		}
		sc.close();
		Collections.reverse(numbers);

		System.out.println("Positive numbers: " + numberOfInput);
		System.out.print("Reversed: ");

		for (int i : numbers) {
			System.out.print(i + ", ");
		}
	}

}
