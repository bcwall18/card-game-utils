package com.bw.cardgameutils.objects;

import com.bw.cardgameutils.pojo.Color;
import com.bw.cardgameutils.pojo.Face;
import com.bw.cardgameutils.pojo.Suit;

public class Card {

    public Color color;
    public Face face;
    public Suit suit;
    public int value;

    public Card(Color color, Face face, Suit suit) {
        this.color = color;
        this.face = face;
        this.suit = suit;
        this.value = face.getValue();
    }

    public Card(Face face, Suit suit) {
        if (suit.equals(Suit.CLUB) || suit.equals(Suit.SPADE)) {
            this.color = Color.BLACK;
        } else {
            this.color = Color.RED;
        }
        this.face = face;
        this.suit = suit;
        this.value = face.getValue();
    }

    public Card() {};

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    public Face getFace() {
        return this.face;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public String getSimpleString() {
        return this.face.getDisplayName() + this.suit.getDisplayName();
    }

    @Override
    public String toString() {
        return this.face.getFullName() + " of " + this.suit.getFullName();
    }
}