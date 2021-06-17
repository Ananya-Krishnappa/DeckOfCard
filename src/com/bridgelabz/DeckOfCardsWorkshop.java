package com.bridgelabz;

public class DeckOfCardsWorkshop {
	private static String[] suit = { "Spades", "Hearts", "Diamond", "Clubs" };
	private static String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	private static String[][] deckOfCards = { suit, rank };
	private static Card[] deck = new Card[52]; 

	public static void main(String[] args) {
		DeckOfCardsWorkshop deckOfCard = new DeckOfCardsWorkshop();
		deckOfCard.gameSetUp();
		deckOfCard.printDeck();
	}

	/**
	 * initializing the deck of card
	 */
	private void gameSetUp() {
		int i = 0;
		for (String s : deckOfCards[0]) {
			for (String value : deckOfCards[1]) {
				deck[i++] = new Card(s, value);
			}
		}
	}

	/**
	 * printing the deck of card
	 */
	private void printDeck() {
		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i]);
		}
	}
}
