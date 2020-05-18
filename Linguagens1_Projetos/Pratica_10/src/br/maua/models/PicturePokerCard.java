package br.maua.models;

public class PicturePokerCard {
    private PicturePokerCardValues value;
    private int id;

    public PicturePokerCard(PicturePokerCardValues value, int id) {
        this.value = value;
        this.id = id;
    }

    public PicturePokerCardValues getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PicturePokerCard{" +
                "value=" + value +
                ", id=" + id +
                '}';
    }
}
