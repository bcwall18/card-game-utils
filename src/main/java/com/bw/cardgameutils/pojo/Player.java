package com.bw.cardgameutils.pojo;

public enum Player {
    YOU("You"),
    COMPUTER("Opponent");

    private final String displayName;

    Player(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }
}