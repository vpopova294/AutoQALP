package task5_refactoring_poker;


import java.util.Random;

public class PokerMachine {
    public Deck createDeck(){
        return new Deck();
    }

    public static void shuffleDeck(Deck deck) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int in  = random.nextInt(52);
            int out = random.nextInt(52);

            Card tmpCard = deck.getCard(in);
            deck.setCard(deck.getCard(out),in);
            deck.setCard(tmpCard,out);
        }

    }
    public static void serveCards(Deck deck, int players) {

        int count = 0;
        for (int round = 0; round <= 5; round++) {
            System.out.println("round " + round);
            for (int player = 1; player <= players; player++) {
                System.out.printf(" player %s gets card: %s%n ", player, deck.getCard(count++));
            }
        }
    }
}

