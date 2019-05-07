package cl222ae_lab2;

import java.util.Scanner;

public class Baklanges {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text to reverse: ");
		String text = sc.nextLine();
		sc.close();

		StringBuilder sb = new StringBuilder(text);
		text = sb.reverse().toString();

		System.out.print("Reversed: " + text);

	}

}
