package br.maua.game;

import br.maua.models.PicturePokerCard;

import java.util.List;

public class PicturePoker {
    public static void run(){
        System.out.println("Mario Poker!");
        PicturePokerDealer dealer = new PicturePokerDealer("Luigi");
        System.out.println("Deale da meda:" + dealer.getName());
        PicturePokerHand hand1 = new PicturePokerHand(dealer.deal());
        PicturePokerHand hand2 = new PicturePokerHand(dealer.deal());
        System.out.println("\n\nMao Atual 1:");
        showPicturePokerList(hand1.getHand());
        System.out.println("Valor da Mao 1:"+ hand1.checkHand(hand1.getHand()));
        System.out.println("\n\nMao Atual 2:");
        showPicturePokerList(hand2.getHand());
        System.out.println("Valor da Mao 2:"+ hand2.checkHand(hand2.getHand()));



    }
    private static void showPicturePokerList(List<PicturePokerCard> cardList) {
        System.out.println("Size:" + cardList.size());
        for (PicturePokerCard card: cardList) {
            System.out.println(card);
        }
    }
}
