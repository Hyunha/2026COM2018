package labs.lab10.blackjack;

public class Dealer {

	CardDeck deck;

	public Dealer() {
		deck = new CardDeck();
	}

	public void dealTo(CardPlayerBehavior p) {
		// TODO [실습 10-4] 실습 10-3 이 끝나면 조교가 안내하는 코드로 채움
		//      (실습 10-3 에서 작성한 cardgame/Dealer 의 dealTo 와 같은 동작)
	}

	public void dealOneTo(CardPlayerBehavior p) {
		// TODO [실습 10-4] 실습 10-3 이 끝나면 조교가 안내하는 코드로 채움 (카드 한 장만 줌)
	}


//	public static void main(String[] args) {
//		Dealer d = new Dealer();
//		HumanPlayer p = new HumanPlayer(3);
//		d.dealTo(p);
//		Card[] hand = p.showCards();
//		for (int i = 0; i < hand.length; i++) {
//			System.out.println(hand[i].getSuit() + " " + hand[i].getRank());
//		}
//	}
}
