package com.github.wingsteven;

import java.util.Deque;
import java.util.LinkedList;

public class Deck {

    private final Deque<Card> cards;

    public Deck() {
        cards = new LinkedList<>();
    }
    public int size() {
        return cards.size();
    }

    public void addCard(Card card) {
        cards.push(card);
    }

    public Card drawCard() {
        return cards.pop();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
