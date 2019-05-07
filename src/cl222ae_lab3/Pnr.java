package cl222ae_lab3;

public class Pnr {

	static final int DEFINED_LENGTH = 11;
	static final int GENDER_INDEX = 9;

	static String number = "900924-4825";
	static String number2 = "900924-4851";

	public static void main(String[] args) {

		System.out.println(getFirstPart(number));
		System.out.println(getSecondPart(number));
		System.out.println("Female: " + isFemaleNumber(number));
		System.out.println("Equality: " + areEqual(number, number2));
		System.out.println("Is Correct: " + isCorrect(number));

	}

	private static String getFirstPart(String pnr) {

		// Only need to check the format once during this first invocation.
		checkFormat(pnr);
		return pnr.subSequence(0, 6).toString();
	}

	private static String getSecondPart(String pnr) {

		return pnr.subSequence(7, 11).toString();
	}

	private static boolean isFemaleNumber(String pnr) {

		return Character.getNumericValue(pnr.charAt(GENDER_INDEX)) % 2 == 0 ? true : false;
	}

	private static boolean areEqual(String pnr1, String pnr2) {

		return pnr1.equals(pnr2) ? true : false;
	}

	private static boolean isCorrect(String pnr) {

		int sum = 0;
		pnr = pnr.replace("-", "");

		for (int i = 0; i < pnr.length() - 1; i++) {

			if (i % 2 == 0) {

				int temp = Character.getNumericValue(pnr.charAt(i)) * 2;

				// All values above 10 will be split into 1+0, 1+1 and so on.
				if (temp >= 10) {
					sum += temp / 10;
					sum += temp % 10;
				} else {
					sum += temp;
				}

			} else {

				sum += Character.getNumericValue(pnr.charAt(i)) * 1;
			}
		}

		// Based on Luhn-algorithm or IBM MOD-10
		int controlNumber = (10 - (sum % 10)) % 10;
		//control index will be 9 since '-' was deleted
		return controlNumber == Character.getNumericValue(pnr.charAt(9)) ? true : false;
	}

	private static void checkFormat(String pnr) {
		if (pnr.length() != DEFINED_LENGTH)
			throw new StringIndexOutOfBoundsException();
	}

}
