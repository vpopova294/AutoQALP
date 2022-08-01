package task5_refactoring_poker;

import logger_enum.LoggerEnum;

public class Deck {



//    public static Card[] deck = new Card[26];
//    public static Card[] getDeckOfCards() {
//        return deck;
//    }
    public Card[] deck;
   private static final LoggerEnum LOGGER_ENUM = new LoggerEnum();
   public static final String ANSI_YELLOW = "\u001B[33m";
   public static final String ANSI_WHITE = "\u001B[37m";

    public Deck() {
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        deck = new Card[52];
        int count = 0;
        // Card card;
        for (String suit : suits) {
            for (String value : values) {
                Card card = new Card();
                card.setSuit(suit);
                card.setValue(value);
                deck[count++] = card;
            }
        }
    }

    // static final Logger LOGGER = Logger.getLogger(Deck.class.getName());


        public Card getCard ( int cardIndex) {
            LOGGER_ENUM.log(LoggerEnum.LoggerLevel.DEBUG,  "This text is yellow!" + ANSI_YELLOW );
           // LOGGER_ENUM.log(LoggerEnum.LoggerLevel.INFO,"this trxt is white" + ANSI_WHITE);
            // LOGGER.log(Level.INFO,"get card ");
            return deck[cardIndex];
        }

        public void setCard (Card card,int cardIndex){
        // LOGGER_ENUM.log(LoggerEnum.LoggerLevel.INFO,  "This text is yellow!" + ANSI_YELLOW );
            deck[cardIndex] = card;
        }

    }



