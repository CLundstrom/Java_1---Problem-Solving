package cl222ae_lab2;

public class TartLjus {

	final static int BOX_CANDLE_AMOUNT = 24;
	final static int MAX_YEAR = 100;
	static int Boxes = 0;
	static int StoredCandles = 0;
	final static int TotalCandles = 5064;
	static int Year = 1;

	/*
	 * We follow the sum notation E = n(n+1)/2 where n is the amount of years
	 * instead.
	 * 
	 * Example: 100(100+1)/2 = 5050 candles
	 * 
	 * (100(100+1)/2)/24 = 5050/24 = 210.42 boxes
	 * 
	 */

	public static void main(String[] args) {

		// Iterating from year 1 to 100
		while (Year <= MAX_YEAR) {

			// 1 to 1 relationship between candlesNeeded and years.
			int candlesNeeded = Year;

			if (StoredCandles < candlesNeeded) {

				/*
				 * Instead of calculating boxes needed each year with math.abs(x1-x2) and
				 * modulus between two years with sum notation mentioned above it's most likely
				 * faster to iterate through and add the boxes and candles as needed.
				 */
				int tmpbox = 0;
				while (StoredCandles < candlesNeeded) {
					BuyBox();
					tmpbox++;
				}
				System.out.println("Before birthday " + Year + " , buy " + tmpbox + " more box(es).");
			}

			StoredCandles = StoredCandles - candlesNeeded;
			Year++;
		}

		System.out.println("\nTotal amount of candles bought are: " + TotalCandles + "\nTotal amount of boxes bought: "
				+ Boxes + "\nRemaining candles: " + StoredCandles);
	}

	public static void BuyBox() {

		Boxes += 1;
		StoredCandles += BOX_CANDLE_AMOUNT;
	}
}
