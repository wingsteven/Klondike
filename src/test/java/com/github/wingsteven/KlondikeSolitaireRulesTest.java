package com.github.wingsteven;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.wingsteven.Face.ACE;
import static com.github.wingsteven.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class KlondikeSolitaireRulesTest {

    private static final int STANDARD_SIZE = 52;

    @Test
    void defineACard() {
        Card card = new Card();
        aCardHasASuit(card);
        aCardHasAValue(card);
        aCardCanBeFaceUp(card);
        aCardCanBeFaceDown(card);
        aCardCanFlip(card);
    }

    private static void aCardCanFlip(Card card) {
        card.flipCard();
        assertTrue(card.isFaceUp());
        card.flipCard();
        assertFalse(card.isFaceUp());
    }

    private static void aCardCanBeFaceDown(Card card) {
        card.setFaceDown();
        assertFalse(card.isFaceUp());
    }

    private static void aCardCanBeFaceUp(Card card) {
        card.setFaceUp();
        assertTrue(card.isFaceUp());
    }

    private static void aCardHasAValue(Card card) {
        card.setFace(ACE);
        assertEquals(ACE, card.getFace());
    }

    private static void aCardHasASuit(Card card) {
        card.setSuit(SPADE);
        assertEquals(SPADE, card.getSuit());
    }

    @Test
    void defineADeck() {
        Deck deck = DeckBuilder.createNewDeck();
        assertEquals(STANDARD_SIZE, deck.size());
        Deck waste = new Deck();
        for (int i = 0; i < STANDARD_SIZE; i++) {
            Card card = deck.drawCard();
            assertTrue(Arrays.asList(Suit.values()).contains(card.getSuit()));
            assertTrue(Arrays.asList(Face.values()).contains(card.getFace()));
            waste.addCard(card);
        }
        assertTrue(deck.isEmpty());
        assertEquals(STANDARD_SIZE, waste.size());
        Card aceOfSpades = waste.drawCard();
        assertEquals(ACE, aceOfSpades.getFace());
        assertEquals(SPADE, aceOfSpades.getSuit());
    }
}
