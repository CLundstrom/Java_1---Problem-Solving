package cl222ae_lab1;

import java.util.Scanner;

public class Area {

	static float Radius = 0f;
	static float Area = 0f;

	public static void main(String[] args) {

		GetRadius();
		GetArea(Radius);
		PrintResult();
	}

	public static void PrintResult() {

		String result = String.format("%.1f", Area);
		System.out.println("The area of the circle is: " + result);
	}

	public static void GetArea(float radius) {

		Area = (float) (Math.PI * (Math.pow(Radius, 2)));
	}

	public static void GetRadius() {

		System.out.println("Enter a radius: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		try {

			Radius = Float.parseFloat(input);
		}

		catch (Exception e) {

			System.out.println("There was an error." + e.getMessage());
			sc.close();
		}
		sc.close();
	}

}
