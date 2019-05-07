package cl222ae_lab3;

public class Card {

	public enum Value {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	public enum Suit {
		DIAMONDS, SPADES, CLUBS, HEARTS
	}

	private Suit suit;
	private Value value;

	public Card(Value value, Suit suit) {

		this.suit = suit;
		this.value = value;
	}

	public Suit getSuit() {

		return suit;
	}

	public Value getValue() {

		return value;
	}

	public String toString() {

		return String.format("%s of %s", this.value, this.suit);
	}

}
