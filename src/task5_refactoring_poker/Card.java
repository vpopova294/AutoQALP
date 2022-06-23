package task5_refactoring_poker;

import java.util.Random;

    public class Card {

    String cardSuites; // suites
    String cardValues; // values


    public String getCardName()  {
      return cardValues +  " of " + cardSuites;

    }

}



