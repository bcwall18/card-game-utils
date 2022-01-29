package com.bw.cardgameutils.pojo;

public enum Color {
    RED("Red"),
    BLACK("Black");

    private final String displayName;

    Color(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }
}
