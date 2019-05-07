package cl222ae_lab4;

import java.io.*;
import java.util.Scanner;

public class RaknaTecken {

	private static String fileName = "HistoryOfProgramming.txt";
	private static int spaces;
	private static int smallCase;
	private static int bigCase;
	private static int other;
	private static int digit;

	public static void main(String[] args) throws IOException {
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("");
		
		while (sc.hasNext()) {

			char c = sc.next().charAt(0);

			if (Character.isWhitespace(c)) {
				spaces = spaces + 1;
			} 
			
			else if (Character.isLowerCase(c)) {
				smallCase = smallCase + 1;
			}

			else if (Character.isUpperCase(c)) {

				bigCase = bigCase + 1;
			}

			else if (Character.isDigit(c)){

				digit = digit + 1;
			} 
			
			else {
				
				other = other +1 ;
			}
		}
		sc.close();
		
		System.out.println("Big Case: " + bigCase);
		System.out.println("Small case: " + smallCase);
		System.out.println("Whitespace etc: " + spaces);
		System.out.println("Digits: " + digit);
		System.out.println("Others(digits included): " + (digit+other));
		System.out.println("Others(digits excluded): " + (other));
	}

}
