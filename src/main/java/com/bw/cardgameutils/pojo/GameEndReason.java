package com.bw.cardgameutils.pojo;

public enum GameEndReason {
    WIN("You won!"),
    LOSS("You lost!"),
    TIE("It's a tie!"),
    FORFEIT("You forfeited by ending the game.");

    private final String reason;

    GameEndReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return this.reason;
    }
}