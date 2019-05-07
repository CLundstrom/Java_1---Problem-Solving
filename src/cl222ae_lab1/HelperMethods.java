package cl222ae_lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelperMethods {

	final int[] DEFINED_BILLS = { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
	int AmountReceived = 0;
	int Price = 0;
	int AmountReturn = 0;

	// Extension of ParseFloat. Making sure user input format is valid and catching
	public float tryParseFloat(String input) {
		if (input.isEmpty())
			return 0;

		try {
			float output = Float.parseFloat(input);
			return output;
		}

		catch (NumberFormatException e) {

			System.out.println("Format not supported, please enter a float or int value. Closing application");
			System.exit(1);
			return 0;
		}

		catch (Exception e) {
			System.out.println("There was an unexpected error: " + e.toString());
			System.exit(1);
			return 0;
		}
	}

	// Extension of ParseInt.
	public int tryParseInt(String input) {
		if (input.isEmpty())
			return 0;

		try {
			int output = Integer.parseInt(input);
			return output;
		}

		catch (NumberFormatException e) {

			System.out.println("Format not supported, please enter a float or int value. Closing application");
			System.exit(1);
			return 0;
		}

		catch (Exception e) {
			System.out.println("There was an unexpected error: " + e.toString());
			System.exit(1);
			return 0;
		}
	}

	public void GreetUser() {
		System.out.print("Enter a Total Price: ");
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		float tmp = tryParseFloat(input);
		Price = Math.round(tmp);
		System.out.print("Give Cashier: ");
		String receive = sc.nextLine();
		AmountReceived = tryParseInt(receive);

		sc.close();
	}

	public List<Integer> GetChange(int cost, int givenamount) {

		// Defining interaction with user.
		if (AmountReceived < Price) {
			float missing = Price - AmountReceived;
			System.out.println(
					"Transaction declined. Missing: " + String.format("%.0f", missing) + "\nClosing application..");
			System.exit(0);
		}

		else if (AmountReceived == Price) {
			System.out.println("Thank you! Come again.");
			System.exit(0);
		}

		else {

			AmountReturn = AmountReceived - Price;

			List<Integer> change = new ArrayList<Integer>();

			// Calculating the amount of bills of each type to return
			for (int bill : DEFINED_BILLS) {
				int ofBillsBack = AmountReturn / bill;

				// Adding the amount of bills to be returned to a list.
				change.add(ofBillsBack);

				// Removing the bills from the calculated change to make sure we don't give back
				// too many bills.
				AmountReturn -= bill * ofBillsBack;
			}
			return change;
		}
		return null;
	}

	public void PrintChange(List<Integer> change) {
		System.out.println("Total change: " + (AmountReceived - Price));
		int index = 0;

		for (int i : DEFINED_BILLS) {

			System.out.println(i + "-bills: " + change.get(index));
			index++;
		}

	}

}
