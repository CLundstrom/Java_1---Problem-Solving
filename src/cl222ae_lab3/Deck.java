package cl222ae_lab3;

import java.util.ArrayList;
import java.util.Collections;

import cl222ae_lab3.Card.Suit;
import cl222ae_lab3.Card.Value;

public class Deck {

	private static final int FULL = 52;
	private static ArrayList<Card> deck;

	public Deck() {

		// Creating cards in the deck
		deck = new ArrayList<Card>();

		for (Value val : Value.values()) {

			for (Suit suit : Suit.values()) {

				Card c = new Card(val, suit);
				deck.add(c);
			}
		}
	}

	public void shuffle() {
		if (!isFull()) {
			System.err.println("Only a full deck can be shuffled.");
		} else {
			Collections.shuffle(deck);
		}

	}

	public Card giveCard() {

		// Getting a card of the deck and removing it
		Card card = deck.get(deck.size() - 1);
		deck.remove(deck.size() - 1);
		return card;
	}

	public int size() {

		return deck.size();
	}

	private boolean isFull() {

		if (deck.size() == FULL) {
			return true;
		} else {
			return false;
		}
	}

}
