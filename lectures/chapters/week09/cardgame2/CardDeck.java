package chapters.week09.cardgame2;

public class CardDeck {
    private Card[] deck;
    private int numCards;

    private void generateDeck() {
        int i = 0;
        for (int rank = 1; rank <= 13; rank++) {
            for (int suitIdx = 0; suitIdx < 4; suitIdx++) {
                deck[i] = new Card(Card.suits[suitIdx], rank);
                i++;
            }
        }
        numCards = i;
    }

    public CardDeck() {
        deck = new Card[Card.numOfFullCards];
        generateDeck();
    }

    public Card newCard() {
        if (numCards == 0) {
            generateDeck();
        }
        return deck[--numCards];
    }

    public boolean moreCard() {
        return numCards > 0;
    }
}
