package java_test;

import java.util.ArrayList;
import java.util.Scanner;

public class NoDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		a.add(sc.nextInt());
		
		while(sc.hasNextInt()) {
			
			int tmp = sc.nextInt();
			if(a.contains(tmp)) {
				b.add(tmp);
				break;
			}

			else {
				a.add(tmp);
			}
		}

		System.out.println("Duplicate: " + b);
		System.out.println("Numbers: " + a);
		sc.close();
	}
}
