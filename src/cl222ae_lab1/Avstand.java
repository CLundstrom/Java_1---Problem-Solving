package cl222ae_lab1;

import java.util.Scanner;

public class Avstand {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter point 1 on form x,y: ");
		double[] Point1 = GetCoords(in.nextLine());
		System.out.println("Enter point 2 on form x,y: ");
		double[] Point2 = GetCoords(in.nextLine());
		
		double x = Math.abs(Point1[0] - Point2[0]);
		double y = Math.abs(Point1[1] - Point2[1]);
		x = Math.pow(x, 2);
		y = Math.pow(y, 2);

		double Distance = Math.sqrt(x + y);

		System.out.println("Distance is: " + String.format("%.3f", Distance) + " m");
		in.close();
	}

	public static double[] GetCoords(String line) {

		double[] point = {0,0};
		try {
			String[] coords = line.split(",");
			for (int i = 0; i < coords.length; i++) {
				
				point[i] = Double.parseDouble(coords[i]);
			}
		}

		catch (java.util.InputMismatchException e) {
			System.out.println("Improper formatting. Coordinates should be of type double. Please try again");
			return null;
		}

		catch (Exception e) {
			System.out.println("There was an unexpected error. Please try again: " + e.toString());
			return null;
		}
		return point;
	}
}
