package com.github.wingsteven;

public class Card {
    private String suit;
    private String value;
    private boolean faceUp;

    public Card() {

    }

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setFaceUp() {
        this.faceUp = true;
    }

    public void setFaceDown() {
        this.faceUp = false;
    }

    public void flipCard() {
        this.faceUp = !this.faceUp;
    }

    public boolean isFaceUp() {
        return faceUp;
    }
}
