package cl222ae_lab1;

import java.util.Scanner;

/* Time calc
*
*@ Christoffer Lundström - Linneaus University 2018
* 
* 
* 
*/

public class Tid {

	public static void main(String[] args) {

		System.out.print("Time Calculator\n");
		System.out.print("Enter amount of seconds to convert:\n");

		Scanner in = new Scanner(System.in);

		int hours = 0;
		int minutes = 0;

		int sec = in.nextInt();
		if (sec >= 60) {

			minutes = sec / 60;
			sec = sec % 60;
		}

		if (minutes >= 60) {
			hours = minutes / 60;
			minutes = minutes % 60;
		}

		in.close();
		System.out.print("Elapsed time: ");
		System.out.println(hours + " hours " + minutes + " minutes " + sec + " seconds");

	}

}
