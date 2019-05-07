package cl222ae_lab2;

import java.util.Scanner;

public class RaknaA {

	static int NrOfCapital;
	static int NrOfLowerCase;

	public static void main(String[] args) {

		System.out.println("Enter a text: ");
		Scanner in = new Scanner(System.in);

		String text = in.nextLine();
		in.close();
		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == 'A')
				NrOfCapital++;

			else if (text.charAt(i) == 'a') {
				NrOfLowerCase++;
			}
		}
		System.out.println("Number of \"A\": " + NrOfCapital);
		System.out.print("Number of \"a\": " + NrOfLowerCase);
	}
}