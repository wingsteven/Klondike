package com.github.wingsteven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KlondikeSolitaireRulesTest {

    @Test
    void defineACard() {
        Card card = new Card();
        card.setSuit("suit");
        assertEquals("suit", card.getSuit());
        card.setValue("value");
        assertEquals("value", card.getValue());
        card.setFaceUp();
        assertTrue(card.isFaceUp());
        card.setFaceDown();
        assertFalse(card.isFaceUp());
        card.flipCard();
        assertTrue(card.isFaceUp());
    }

    @Test
    void defineADeck() {
        Deck deck = new Deck();
        assertEquals(0, deck.size());
        Card aceOfSpades = new Card("ACE", "SPADE");
        deck.addCard(aceOfSpades);
        assertEquals(1, deck.size());
        for (int i = 2; i < 26; i++) {
            Card card = new Card();
            deck.addCard(card);
            assertEquals(i, deck.size());
        }
        Card card = deck.drawCard();
        assertEquals(24, deck.size());
        for (int i = deck.size() - 1; i >= 0; i--) {
            deck.drawCard();
            assertEquals(i, deck.size());
        }
    }
}
