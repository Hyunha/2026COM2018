package labs.lab06.simplealice;

public class WonderLand {
    public static void main(String[] args) {
        Alice alice = new Alice();
        Drink drink = new Drink();
        alice.drink(drink.getName());
        // TODO [실습 6-3] 케이크 먹기 → 버섯 먹기 → 문 들어가기
        // TODO [실습 6-5] 아이템 객체를 건네주는 모습으로 변경 (키를 바깥에서 지정하지 않음)
    }
}
