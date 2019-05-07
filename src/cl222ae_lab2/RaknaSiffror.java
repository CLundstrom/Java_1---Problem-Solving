package cl222ae_lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RaknaSiffror {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer number: ");

		int number = sc.nextInt();

		while (number < 0) {
			System.out.println("You must enter a positive integer, try again:  ");
			number = sc.nextInt();
		}

		int zeros = 0;
		int even = 0;
		int odd = 0;

		List<Integer> list = new ArrayList<Integer>();

		sc.close();

		// Adding the numbers to a list of type Int.
		while (number > 0) {
			list.add(number % 10);
			number /= 10;
		}

		for (int i : list) {

			// The different cases where the results are added.
			if (i == 0)
				zeros++;
			if (i % 2 == 0 && i != 0)
				even++;
			if (i % 2 > 0)
				odd++;
		}
		System.out.println("Results:\nEven: " + even + "\nOdd: " + odd + "\nZeros: " + zeros);
	}

}
