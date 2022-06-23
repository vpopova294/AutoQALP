package task5_refactoring_poker;


import java.util.Random;

import static task5_refactoring_poker.Deck.*;

public class PokerMachine {


    public static void shuffleDeck() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int in  = random.nextInt(26);
            int out = random.nextInt(26);

            String tmpCard = getDeckOfCards()[in];
            getDeckOfCards()[in] = getDeckOfCards()[out];
            getDeckOfCards()[out] = tmpCard;
        }

    }
    public static void serveCards() {
        String[] deck = getDeckOfCards();
//        int count = 0;
//        for (int round = 0; round <= 2; round++) {
//            System.out.println("round " + round);
//            for (int player = 1; player <= 2; player++) {
//                System.out.printf(" player %s gets card: %s%n ", player, getDeckOfCards()[count++]);
//            }
//        }
    }
}

