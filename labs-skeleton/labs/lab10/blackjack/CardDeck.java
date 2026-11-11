package labs.lab10.blackjack;

public class CardDeck {

	private int cardCount; // 남은 카드 수
	private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT];
	// Invariant: deck[0], .., deck[cardCount-1] 에 카드가 있다.

	/** Constructor - CardDeck 카드 한 벌 생성  */
	public CardDeck() {
		createDeck();
	}

	/** createSuit - 주어진 무늬로 카드 13장 생성  */
	private void createSuit(String whichSuit) {
		for(int i = 1; i <= Card.SIZE_OF_ONE_SUIT; i++) {
			deck[cardCount] = new Card(whichSuit, i);
			cardCount = cardCount + 1;
		}
	}

	private void createDeck() {
		createSuit(Card.SPADES);
		createSuit(Card.HEARTS);
		createSuit(Card.CLUBS);
		createSuit(Card.DIAMONDS);
	}

	/** newCard - 임의의 새 카드 한 장을 뽑아 줌
	* @return 카드 덱에서 임의로 한 장을 뽑아 리턴
	*         없으면 카드 1벌을 새로 만들고 한 장을 뽑아 리턴   */
	public Card newCard() {
		if (! this.moreCards())
			createDeck();
		int index = (int)(Math.random() * cardCount);
		Card cardToDeal = deck[index];
		for (int i = index+1; i < cardCount; i++)
			deck[i-1] = deck[i];
		cardCount = cardCount - 1;
		return cardToDeal;
	}

	/** moreCards - 카드 덱에 카드가 남아있는지 알려줌
	 * @return 있으면 true, 없으면 false */
	private boolean moreCards() {
		return cardCount > 0;
	}

//	public static void main(String[] args) {
//		CardDeck deck = new CardDeck();
//		for (int i = 0; i < 5; i++) {
//			Card card = deck.newCard();
//			System.out.println(card.getSuit() + " " + card.getRank());
//		}
//	}

}
