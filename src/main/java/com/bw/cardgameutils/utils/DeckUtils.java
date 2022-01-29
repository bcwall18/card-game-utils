package com.bw.cardgameutils.utils;

import com.bw.cardgameutils.objects.Card;
import com.bw.cardgameutils.pojo.Face;
import com.bw.cardgameutils.pojo.Suit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DeckUtils {


    public static Stack<Card> getFreshDeck() {
        Stack<Card> deck = new Stack<>();
        List<Face> faces = Arrays.asList(Face.values());
        List<Suit> suits = Arrays.asList(Suit.values());

        for (Face face : faces) {
            for (Suit suit : suits) {
                Card card = new Card();
                card.setFace(face);
                card.setSuit(suit);
                card.setValue(face.getValue());
                deck.push(card);
            }
        }
        return deck;
    }

    List<String> getAllFaceValueStrings(boolean fullName) {
        Face[] faceValues = Face.values();
        List<String> faces = new ArrayList<>();

        for (Face face : faceValues) {
            if (!fullName) {
                faces.add(face.getDisplayName());
            } else {
                faces.add(face.getFullName());
            }
        }
        return faces;
    }

    List<String> getAllSuitValueStrings(boolean fullName) {
        Suit[] suitValues = Suit.values();
        List<String> suits = new ArrayList<>();

        for (Suit suit : suitValues) {
            if (!fullName) {
                suits.add(suit.getDisplayName());
            } else {
                suits.add(suit.getFullName());
            }
        }
        return suits;
    }


}