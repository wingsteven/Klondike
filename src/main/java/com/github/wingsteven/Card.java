package com.github.wingsteven;

public class Card {
    private Suit suit;
    private Face face;
    private boolean faceUp;

    public Card() {

    }
    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
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
