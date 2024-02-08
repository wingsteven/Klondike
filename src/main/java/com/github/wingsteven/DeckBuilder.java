package com.github.wingsteven;

public class DeckBuilder {

    public static Deck createNewDeck() {
        Deck deck = new Deck();
        for (Suit suit :
                Suit.values()) {
            for (Face face :
                    Face.values()) {
                Card card = new Card(face, suit);
                deck.addCard(card);
            }
        }
        return deck;
    }
}
