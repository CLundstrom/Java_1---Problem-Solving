package cl222ae_lab1;

import java.util.Scanner;

/* Sum of three.123
*
*@ Christoffer Lundström - Linneaus University 2018
* 
* 
* 
*/
public class SummaAvTre {

	public static void main(String[] args) {

		/* Summa av tre tal */

		System.out.print("Enter a three digit integer: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();

		int tmp = input % 10;
		int one = tmp;
		tmp = input / 10;
		int two = (tmp % 10);
		tmp = tmp / 10;
		int three = tmp;
		int sum = one + two + three;
		System.out.println("Sum is: " + sum);

	}
}
