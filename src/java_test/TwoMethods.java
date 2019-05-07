package java_test;

import java.util.ArrayList;

public class TwoMethods {

	public static void main(String[] args) {

		String str = "XaXa";
		String str1 = "xxaaaaxxxxa";
		String str2 = "XXXaa";
		int[] a = {1,2,3,4,5};
		
		
		System.out.println(allOddNumbers(a));
		
		System.out.println(hasTwoX(str));
		System.out.println(hasTwoX(str1));
		System.out.println(hasTwoX(str2));

	}

	static boolean hasTwoX(String str) {

		int matches = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'X') {
				matches += 1;

			}

		}

		if (matches == 2) {

			return true;
		}

		return false;
	}

	static ArrayList<Integer> allOddNumbers(int[] a) {

		ArrayList<Integer> b = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				continue;
			}

			else {
				b.add(a[i]);
			}

		}
		return b;
	}

}
