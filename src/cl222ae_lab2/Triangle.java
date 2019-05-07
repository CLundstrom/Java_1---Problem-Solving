package cl222ae_lab2;

import java.util.Scanner;

public class Triangle {

	static final char STAR = '*';
	static final char SPACE = ' ';

	public static void main(String[] args) {

		System.out.print("Enter an odd number to produce pyramids: ");
		Scanner sc = new Scanner(System.in);

		int Number = sc.nextInt();
		sc.close();

		if (Number % 2 == 0) {
			System.out.println("You must enter an odd number. Exiting..");
			System.exit(0);
		}

		System.out.println("Right triangle: \n");

		/*
		 * Run row and column x times. If the column is greater than or equal to the row
		 * a star will be printed.
		 * 
		 * Example: Row iteration 1: Row will be 0, column will be 0. Therefore a star
		 * will be printed.
		 * 
		 * Row iteration 2: Row will be 1 so it will take 2 iterations for column to be
		 * greater or equal to row, hence one less star. This relationship between row
		 * and column is responsible for the pyramid shape.
		 * 
		 */
		
		for (int row = 0; row < Number; row++) {

			for (int column = 0; column < Number; column++) { //STARS
				if (row >= column)
					System.out.print(" ");
			}
			
			for (int column = 0; column < Number; column++) { //STARS
				if (row < column)
					System.out.print(STAR);
			}
			

			System.out.println();
		}

		/*
		 * First loop: Adding a space for each x while x is less than the number minus
		 * the row number 
		 * Second: Responsible for adding one star since y = z in the
		 * first iteration. 
		 * Third: One less space, one more star etc etc..
		 */
		System.out.println("Even triangle: \n");
		for (int y = 0; y < Number; y++) {

			for (int x = 0; x < Number; x++) {
				if (x < Number - y)
					System.out.print(" ");
			}
			for (int z = 0; z <= y; z++) {
				System.out.print(STAR + " ");
			}
			System.out.println("");
		}
	}
}
