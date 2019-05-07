package cl222ae_lab1;

import java.util.Scanner;

public class Fahrenheit {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter temperature in Fahrenheit: ");
		Scanner in = new Scanner(System.in);
		float F = in.nextFloat();
		
		//Formula Fahrenheit --> Celsius
		float C = ((F - 32)*5)/9;
		
		System.out.println("Celsius: " + C);
		in.close();
		 
	}

}
