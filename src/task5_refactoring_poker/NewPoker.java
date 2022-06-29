package task5_refactoring_poker;


public class NewPoker {

    // create card

    public static void main(String[] args) {

//        Card card1 = new Card();
//        card1.cardSuites = "Hearts";
//        card1.cardValues = "2";
//        card1.getCardName();
//
//
//        Card card2 = new Card();
//        card2.cardSuites = "Hearts";
//        card2.cardValues = "3";
//        card2.getCardName();
//
//
//        Card card3 = new Card();
//        card3.cardSuites = "Hearts";
//        card3.cardValues = "4";
//        card3.getCardName();
//
//
//        Card card4 = new Card();
//        card4.cardSuites = "Hearts";
//        card4.cardValues = "5";
//        card4.getCardName();
//
//        Card card5 = new Card();
//        card5.cardSuites = "Hearts";
//        card5.cardValues = "6";
//        card5.getCardName();
//
//        Card card6 = new Card();
//        card6.cardSuites = "Hearts";
//        card6.cardValues = "7";
//        card6.getCardName();
//
//        Card card7 = new Card();
//        card7.cardSuites = "Hearts";
//        card7.cardValues = "8";
//        card7.getCardName();
//
//        Card card8 = new Card();
//        card8.cardSuites = "Hearts";
//        card8.cardValues = "9";
//        card8.getCardName();
//
//        Card card9 = new Card();
//        card9.cardSuites = "Hearts";
//        card9.cardValues = "10";
//        card9.getCardName();
//
//        Card card10 = new Card();
//        card10.cardSuites = "Hearts";
//        card10.cardValues = "Jack";
//        card10.getCardName();
//
//        Card card11 = new Card();
//        card11.cardSuites = "Hearts";
//        card11.cardValues = "Queen";
//        card11.getCardName();
//
//        Card card12 = new Card();
//        card12.cardSuites = "Hearts";
//        card12.cardValues = "King";
//        card12.getCardName();
//
//        Card card13 = new Card();
//        card13.cardSuites = "Hearts";
//        card13.cardValues = "Ace";
//        card13.getCardName();
//
//        Card card14 = new Card();
//        card14.cardSuites = "Clubs";
//        card14.cardValues = "2";
//        card14.getCardName();
//
//        Card card15 = new Card();
//        card15.cardSuites = "Clubs";
//        card2.cardValues = "3";
//        card15.getCardName();
//
//        Card card16 = new Card();
//        card16.cardSuites = "Clubs";
//        card16.cardValues = "4";
//        card16.getCardName();
//
//        Card card17 = new Card();
//        card17.cardSuites = "Clubs";
//        card17.cardValues = "5";
//        card17.getCardName();
//
//        Card card18 = new Card();
//        card18.cardSuites = "Clubs";
//        card18.cardValues = "6";
//        card18.getCardName();
//
//        Card card19 = new Card();
//        card19.cardSuites = "Clubs";
//        card19.cardValues = "7";
//        card19.getCardName();
//
//        Card card20 = new Card();
//        card20.cardSuites = "Clubs";
//        card20.cardValues = "8";
//        card20.getCardName();
//
//        Card card21 = new Card();
//        card21.cardSuites = "Clubs";
//        card21.cardValues = "9";
//        card21.getCardName();
//
//        Card card22 = new Card();
//        card22.cardSuites = "Clubs";
//        card22.cardValues = "10";
//        card22.getCardName();
//
//        Card card23 = new Card();
//        card23.cardSuites = "Clubs";
//        card23.cardValues = "Jack";
//        card23.getCardName();
//
//        Card card24 = new Card();
//        card24.cardSuites = "Clubs";
//        card24.cardValues = "Queen";
//        card24.getCardName();
//
//        Card card25 = new Card();
//        card25.cardSuites = "Clubs";
//        card25.cardValues = "King";
//        card25.getCardName();
//
//        Card card26 = new Card();
//        card26.cardSuites = "Clubs";
//        card26.cardValues = "Ace";
//        card26.getCardName();


        PokerMachine pokerMachine = new PokerMachine();
        Deck deck = pokerMachine.createDeck();

        pokerMachine.shuffleDeck(deck);


        Deck deck2 = pokerMachine.createDeck();
        pokerMachine.shuffleDeck(deck2);
        pokerMachine.serveCards(deck,4);






        }
    }






