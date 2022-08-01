package task5_refactoring_poker;

public class Card {

    private String cardSuites; // suites
    private String cardValues; // values

        public String getSuit() {
            return cardSuites;
        }

        public void setSuit(String cardSuites) {
            this.cardSuites = cardSuites;
        }

        public String getValue() {
            return cardValues;
        }

        public void setValue(String cardValues) {
            this.cardValues = cardValues;
        }
    public String getCardName()  {

      return cardValues +  " of " + cardSuites;

    }


        @Override // cmd + N = Generate 'toString'
        public String toString() {
            return "Card{" + cardValues +
                    " of " + cardSuites + "}";
        }
    }



