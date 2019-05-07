package cl222ae_lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lonerevision {

	private static List<Integer> list = new ArrayList<Integer>();
	private static int Sum = 0;

	public static void main(String[] args) {

		getSalaries();
		computeStats();
	}

	private static void getSalaries() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salaries and finish with \"X\": ");
		while (sc.hasNextInt()) {
			int salary = sc.nextInt();
			list.add(salary);
			Sum += salary;

		}
		Collections.sort(list);
		sc.close();
	}

	private static void computeStats() {

		int average = Sum / list.size();
		System.out.println("Average salary: " + average);

		// Because we're only dealing with ints eventual fractions will be truncated,
		// thus dividing by 2 works fine.
		// -1 because .get is zero based and .size is not.

		if (list.size() % 2 == 0) {
			int one = list.get((list.size() / 2) - 1);
			int two = list.get((list.size() / 2));
			int median = (one + two) / 2;
			System.out.println("Median salary: " + median);
		} else {
			int median = list.get((list.size() / 2));
			System.out.println("Median salary: " + median);
		}

		// Absolute difference between min and max value.
		System.out.println("Salary spread: " + Math.abs(list.get(0) - list.get(list.size() - 1)));

	}

}
