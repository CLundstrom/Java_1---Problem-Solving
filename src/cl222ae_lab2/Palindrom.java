package cl222ae_lab2;

import java.util.Scanner;

public class Palindrom {

	private static String reversed = "";
	private static String input = "";

	public static void main(String[] args) {

		getInput();
		reversed = reverse(input);
		reversed = formatText(reversed);
		input = formatText(input);

		if (isPalindrome(input)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is NOT a palindrome.");
		}
	}

	// .Equals is important here since w're comparing value and not reference.
	private static boolean isPalindrome(String text) {
		if (text.isEmpty()) {
			System.out.println("No string entered, exiting.");
			System.exit(0);
		}

		if (reversed.equalsIgnoreCase(input))
			return true;
		else
			return false;
	}

	private static String reverse(String text) {
		StringBuilder sb = new StringBuilder(input);
		reversed = sb.reverse().toString();

		return reversed;
	}

	// Tried a different approach extracting a-z with pattern, matcher
	// and appending to stringbuilder but this one-line approach seemed
	// easier to comprehend, though unclear if cheaper computation-wise.
	private static String formatText(String text) {

		text = text.replaceAll("[^a-zA-Z]", ""); // trimming everything but a-z
		
		return text;
	}

	private static void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to test for palindrome: ");
		input = sc.nextLine();
		sc.close();
	}

}
