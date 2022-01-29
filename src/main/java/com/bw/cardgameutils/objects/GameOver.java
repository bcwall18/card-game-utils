package com.bw.cardgameutils.objects;

import com.bw.cardgameutils.pojo.GameEndReason;
import com.bw.cardgameutils.pojo.Player;

public class GameOver {

    public static final String message = "Game Over!";

    public boolean gameOver;
    public Player winner;
    public GameEndReason gameEndReason;

    public GameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public GameOver() {
        this.gameOver = false;
    }

    public String getEndMessage() {
        String endMessage = message + "\n";
        return endMessage += gameEndReason.getReason();
    }

    public boolean isGameOver() {
        return this.gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public Player getWinner() {
        return this.winner;
    }

    public void setWinner(Player player) {
        this.winner = player;
    }

    public GameEndReason getGameEndReason() {
        return this.gameEndReason;
    }

    public void setGameEndReason(GameEndReason gameEndReason) {
        this.gameEndReason = gameEndReason;
    }
}
