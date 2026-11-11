package labs.lab06.simplealice;

public class WonderLand {
    public static void main(String[] args) {
        Alice alice = new Alice();

        alice.drink(new Drink());
        alice.eat(new Cake());
        alice.eat(new Mushroom(), false);
        alice.enter(new Door());
    }
}
