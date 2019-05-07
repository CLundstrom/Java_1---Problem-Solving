package cl222ae_lab3;

public class DeckMain {

	public static void main(String[] args) {

		Deck deck = new Deck();

		System.out.println("Cards in deck: " + deck.size());
		deck.shuffle();

		Card a = deck.giveCard();
		Card b = deck.giveCard();
		Card c = deck.giveCard();
		Card d = deck.giveCard();

		System.out.println();
		System.out.println("Cards on hand: ");
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println("Cards in deck: " + deck.size());
		// Trying another shuffle.
		deck.shuffle();

	}

}
