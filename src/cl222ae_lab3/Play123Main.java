package cl222ae_lab3;

public class Play123Main {

	private static final int ROUNDS = 10000;
	private static Deck deck = new Deck();
	private static double fail;
	private static double success;

	public static void main(String[] args) {

		System.out.println("Let's play solitaire!\nShuffling deck..");
		
		for (int i = 0; i < ROUNDS; i++) {

			Deck deck = new Deck();
			deck.shuffle();

			if (play123() == true) {
				success = success + 1;
			}

			else {
				fail = fail + 1;

			}
		}
		double d = (success / fail);
		System.out.println("Number of successes: " + String.format("%.0f", success));
		System.out.println("Number of failures: " + String.format("%.0f", fail));
		System.out.println(String.format("Average chance of winning is: %.2f", d*100) + "%");
		

	}

	public static boolean play123() {

		for (int i = 0; i < deck.size(); i++) {

			Card one = deck.giveCard();
			if (one.getValue() == Card.Value.ACE) {
				return false;
			}

			Card two = deck.giveCard();
			if (two.getValue() == Card.Value.TWO) {
				return false;
			}

			Card three = deck.giveCard();
			if (three.getValue() == Card.Value.THREE) {
				return false;
			}
		}
		return true;
	}
}
