package com.bw.cardgameutils.pojo;

public enum Suit {
    CLUB("C", "Clubs"),
    DIAMOND("D", "Diamonds"),
    SPADE("S", "Spades"),
    HEART("H", "Hearts");

    private final String displayName;
    private final String fullName;

    Suit(String displayName, String fullName) {
        this.displayName = displayName;
        this.fullName = fullName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getCardSuffix() {
        return "of " + this.fullName;
    }
}