package labs.lab10.cardgame;

public class Dealer {
    CardDeck deck;

    public Dealer() {
        deck = new CardDeck();
    }

    /** dealTo - 카드를 한 장씩 매번 물어보면서 원하는 만큼 p에게 준다.
     * @param p - CardPlayerBehavior 를 구현한 플레이어 */
    public void dealTo(CardPlayerBehavior p) {
        // TODO [실습 10-3] p 가 원하는 동안 카드를 한 장씩 뽑아 건네주기
    }

    /** dealOneTo - 카드를 한 장 p에게 준다.
     * @param p - CardPlayerBehavior 를 구현한 플레이어 */
    public void dealOneTo(CardPlayerBehavior p) {
        // TODO [실습 10-3] 카드를 한 장 뽑아 건네주기
    }
}
