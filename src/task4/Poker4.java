//package task4;
//import java.util.Random;
//
//public class Poker4 {
//
//        private static int noOfCards = 52;
//
//        private static int noOfPlayers = 4;
//
//        private static String[] deck = new String[noOfCards];
//
//        public static void main(String[] args) {
//             createDeck();
//            shuffleDeck();
//             serveCards();
//        }
//
//        public static void createDeck() {
//            String[] suites = {"Hearts", "Clubs","Diamonds","Spades"};
//            String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"};
//
//            int count = 0;
//            for (String suit : suites) {
//                for (String value : values) {
//                    deck [count++] = value + "of " + suit;
//                    System.out.println(value + " of " + suit);
//                }
//            }
//        }
//
//    private static void shuffleDeck() {
//        Random random = new Random();
//        for (int i = 0; i < 100; i++) {
//            int in  = random.nextInt(noOfCards);
//            int out = random.nextInt(noOfCards);
//
//            String tmpCard = deck[in];
//            deck[in] = deck[out];
//            deck[out] = tmpCard;
//        }
//
//    }
//
//    private static void serveCards() {
//        int count = 0;
//        for (int round = 0; round <= 5; round++) {
//            System.out.println("round " + round);
//            for ( int player = 1; player <= noOfPlayers; player++) {
//                System.out.printf(" player %s gets card: %s%n ", player, deck[count++]);
//            }
//        }
//    }
//    }
//
