package br.maua.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PicturePokerDeck {
    private List<PicturePokerCard> deckList;

    public PicturePokerDeck() {
        this.deckList = createNewDeck();
    }

    private List<PicturePokerCard> createNewDeck() {
        List<PicturePokerCard> newDeck = new ArrayList<>();
        for (PicturePokerCardValues value : PicturePokerCardValues.values()) {
            for(int myId = 1; myId <=5; myId++)
                newDeck.add(new PicturePokerCard(value, myId));
        }
        return newDeck;
    }

    public List<PicturePokerCard> getDeckList() {
        return deckList;
    }

    public PicturePokerCard getRandomCard() {
        return deckList.remove(new Random().nextInt(deckList.size()));
    }
}
