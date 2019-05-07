package cl222ae_lab3;

public class FractionMain {

	public static void main(String[] args) {

		// Creating a bunch of fractions to test each operation on them.
		Fraction test = new Fraction(5, 6);
		Fraction test_1 = new Fraction(4, 5);
		Fraction test_2 = new Fraction(-4, 5);
		
		Fraction multiply = new Fraction(5, 6);
		Fraction division = new Fraction(5, 6);
		Fraction addition = new Fraction(5, 6);
		Fraction subtraction = new Fraction(5, 6);

		System.out.println("Is negative: " + test.isNegative());
		System.out.println("Numerator: " + test.getNumerator());
		System.out.println("Denominator: " + test.getDenominator());
		System.out.println("Test_1 toString: " + test_1.toString());

		System.out.println("Addition is equal to test: " + addition.isEqualTo(division));
		System.out.println("Addition is equal to test_1: " + addition.isEqualTo(test_1));
		System.out.println();

		System.out.println("Addition: " + addition.add(test_1));
		System.out.println("Addition: " + addition.add(test_2));
		System.out.println("Subtraction: " + subtraction.subtract(test_1));
		System.out.println("Subtraction: " + subtraction.subtract(test_2));
		System.out.println("Multiplying: " + multiply.multiply(test_1));
		System.out.println("Multiplying: " + multiply.multiply(test_2));
		System.out.println("Dividing: " + division.divide(test_1));
		System.out.println("Dividing: " + division.divide(test_2));

	}

}
