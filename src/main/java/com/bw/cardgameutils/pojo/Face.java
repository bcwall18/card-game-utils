package com.bw.cardgameutils.pojo;

public enum Face {
    ACE("Ace", "A", 14), // treating ace as high right now until i can add a way to determine if ace is high or low
    TWO("Two", "2", 2),
    THREE("Three", "3", 3),
    FOUR("Four", "4", 4),
    FIVE("Five", "5", 5),
    SIX("Six", "6", 6),
    SEVEN("Seven", "7", 7),
    EIGHT("Eight", "8", 8),
    NINE("Nine", "9", 9),
    TEN("Ten", "10", 10),
    JACK("Jack", "J", 11),
    QUEEN("Queen", "Q", 12),
    KING("King", "K", 13);

    private final String fullName;
    private final String displayName;
    private final int value;

    Face(String fullName, String displayName, int value) {
        this.fullName = fullName;
        this.displayName = displayName;
        this.value = value;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public int getValue() {
        return this.value;
    }
}
