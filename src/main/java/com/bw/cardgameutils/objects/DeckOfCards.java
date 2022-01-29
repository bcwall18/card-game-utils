package com.bw.cardgameutils.objects;

import com.bw.cardgameutils.utils.DeckUtils;

import java.util.Random;
import java.util.Stack;

public class DeckOfCards {

    public Stack<Card> deck;

    public void setDeckOfCards(Stack<Card> deck) {
        this.deck = deck;
    }

    public Stack<Card> getDeck(){
        return this.deck;
    }

    public DeckOfCards() {
        this.deck = DeckUtils.getFreshDeck();
    }

    public void shuffle(int times) {
        Stack<Card> deck = this.deck;

        for (int i = 0; i < times; i++) {
            Stack<Card> tophalf = new Stack<>();
            Stack<Card> bottomhalf = new Stack<>();
            while (tophalf.size() < 26) {
                tophalf.push(deck.pop());
            }
            while (bottomhalf.size() < 26) {
                bottomhalf.push(deck.pop());
            }
            while (deck.size() < 52) {
                Card cardA = tophalf.pop();
                Card cardB = bottomhalf.pop();
                Random random = new Random();
                int probability = random.nextInt(2);
                if (probability == 0) {
                    deck.push(cardA);
                    deck.push(cardB);
                } else if (probability == 1){
                    deck.push(cardB);
                    deck.push(cardA);
                } else {
                    System.out.println("+++++++++ something went real wrong here");
                }
            }
        }
        this.deck = deck;
    }

    public void shuffle() {
        shuffle(7);
    }

    public String toString() {
        String deckString = "";
        Stack<Card> tempDeck = this.deck;
        for (Card card : tempDeck) {
            deckString += card.getFace().getDisplayName();
            deckString += card.getSuit().getDisplayName();
            deckString += " ";
        }
        return deckString;
    }
}