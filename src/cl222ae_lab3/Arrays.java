package cl222ae_lab3;

public class Arrays {

	public static void main(String[] args) {

		int[] n = { 7, 1, 8, 6, 3, 4 };
		int[] test = { 3, 4, 5};

		String str = Arrays.toString(n);
		System.out.println("n = " + str);

		System.out.println("Has number 8: " + hasN(n, 8));

		// Don't crash entire program incase VG-assignment throws.
		try {
			System.out.println("Subsequence match: " + hasSubsequence(n, test));
			isLarger(n, test);
		} catch (Exception e) {
			System.err.println("There was a problem with the VG-functions.");
			e.printStackTrace();
		}

		test = replaceAll(test, 3, 5);
		test = sort(test);

		System.out.println("Reversed: " + toString(n = (reverse(n))));
		System.out.println("Added 10: " + toString(n = addN(n, 10)));
		System.out.println("Sum of array: " + sum(test));

	}

	/**
	 * Calculates sum of array.
	 */
	private static int sum(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}
		return sum;
	}

	private static String toString(int[] arr) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + ", ");
		}

		return sb.toString();
	}

	/**
	 * Adds number to array.
	 */
	private static int[] addN(int[] arr, int n) {

		int[] tempArray = arr.clone();

		for (int i = 0; i < tempArray.length; i++) {

			tempArray[i] += n;
		}

		return tempArray;
	}

	/**
	 * Reverses the array.
	 */
	private static int[] reverse(int[] arr) {

		int[] tempArray = arr.clone();
		int temp = 0;
		for (int i = 0; i < tempArray.length / 2; i++) {

			temp = tempArray[i];
			tempArray[i] = tempArray[tempArray.length - 1 - i];
			tempArray[tempArray.length - 1 - i] = temp;
		}

		return tempArray;
	}

	/**
	 * Returns if array contains number n.
	 *
	 * @param arr Array to look for number n in.
	 */
	private static boolean hasN(int[] arr, int n) {

		for (int i : arr) {

			if (i == n)
				return true;
		}

		return false;
	}

	/**
	 * A simple bubble sort.
	 * <p>
	 * Sorting 100 000 values took 10346ms with this approach. Would not use for any
	 * array-sorting with over 10k values.
	 */
	private static int[] sort(int[] arr) {
		long time = System.currentTimeMillis();

		int[] tempArray = arr.clone();

		// Length-1 because zero-based index.
		for (int i = 0; i < tempArray.length - 1; i++) {

			// Second loop is used so all values get compared to each other.
			for (int j = 0; j < tempArray.length - 1 - i; j++) {

				// Compare value with the next and swap if neccessary.
				if (tempArray[j] > tempArray[j + 1]) {

					int temp = tempArray[j];
					tempArray[j] = tempArray[j + 1];
					tempArray[j + 1] = temp;
				}
			}
		}
		time = System.currentTimeMillis() - time;
		System.out.println("Bonus: Bubblesorting " + tempArray.length + " values took: " + time + " ms");
		return tempArray;
	}

	/**
	 * Replaces all matches of old number with the new in the array.
	 *
	 * @param arr Array to replace numbers in.
	 */
	private static int[] replaceAll(int[] arr, int old, int nw) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] == old) {
					arr[j] = nw;
				}
			}
		}
		return arr;
	}

	/**
	 * Checks if the Base array has a subsequence of array sub.
	 *
	 * @param arr Base array.
	 * @param sub Array to look for in Base array.
	 */
	private static boolean hasSubsequence(int[] arr, int[] sub) {

		if (arr.length < sub.length) {
			return false;
		}

		int numberOfMatches = 0;
		// Check all elements for a first match.
		for (int i = 0; i <= arr.length - 1; i++) {

			// Match found
			if (arr[i] == sub[0]) {

				// Match found and sub length is 1
				if (sub.length == 1)
					return true;

				// Second loop to check for continuity
				for (int j = 0; j < arr.length - i; j++) {

					// Index i acting as new zero index
					if (arr[i + j] == sub[j]) {

						numberOfMatches++;
					} else {
						// Makes sure we can compare subsequences even if we have several index matches.
						numberOfMatches = 0;
					}
				}
			}
		}
		if (numberOfMatches == sub.length && numberOfMatches != 0) {
			return true;
		} else
			return false;
	}

	/**
	 * Compares sizes of two arrays.
	 *
	 * @param a1 First array to compare.
	 * @param a2 Second array to compare.
	 */
	private static boolean isLarger(int[] a1, int[] a2) {
		// Always iterate over the shortest array.
		if (a1.length > a2.length) {
			int[] tmp = a1.clone();
			a1 = a2;
			a2 = tmp;
		}
		
		// Compare sizes of elements.
		for (int i = 0; i < a1.length - 1; i++) {
			if (a1[i] > a2[i]) {
				System.out.println(
						printArray(a1) + " is larger than " + printArray(a2) + " since " + a1[i] + " > " + a2[i]);
				return true;
			} else if (a1[i] < a2[i]) {
				System.out.println(
						printArray(a2) + " is larger than " + printArray(a1) + " since " + a2[i] + " > " + a1[i]);
				return false;
			}
		}
		// All elements match, comparing size of arrays.
		if (a1.length > a2.length) {
			System.out.println(printArray(a1) + " is larger than " + printArray(a2) + " because it's longer.");
			return true;
		} else {
			System.out.println(printArray(a2) + " is larger than " + printArray(a1) + " because it's longer.");
			return false;
		}
	}

	private static String printArray(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("{ ");
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + " ");
		}
		sb.append("}");
		return sb.toString();
	}
}
