package chapters.week06.wonderland;

public class WonderLand {
    public static void main(String[] args) {
        Alice alice = new Alice();
        Door door = new Door();
        Key key = new Key();

        alice.enter(door);              // 130cm: 너무 큼
        alice.drink(new Drink());
        alice.enter(door);              // 24cm: 열쇠 없음
        alice.take(key);                // 손이 안 닿음
        alice.eat(new Cake());
        alice.take(key);                // 270cm: 집음
        alice.enter(door);              // 너무 큼
        alice.eat(new Mushroom(), false);
        alice.enter(door);              // 40cm+열쇠: 성공
    }
}
