package com.bridgelabz;

import java.util.Scanner;

public class DeckOfCardMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of players");
		int num = sc.nextInt();
		DeckOfCardsWorkshop deckOfCard = new DeckOfCardsWorkshop();
		deckOfCard.gameSetUp();
		deckOfCard.addPlayer(num);
		deckOfCard.orderPlayerTurn(num);
		sc.close();
	}
}
