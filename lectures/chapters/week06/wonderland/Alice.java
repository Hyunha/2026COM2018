package chapters.week06.wonderland;

public class Alice {
    private int height = 130;   // 상태 ① 키(cm)
    private Key key;            // 상태 ② 가진 열쇠 — 처음엔 없음(null)

    public void drink(Drink drink) {
        System.out.println("앨리스는 " + drink.getName() + "을(를) 마셨습니다.");
        changeHeight(drink.getHeightAfter());
    }

    public void eat(Cake cake) {
        System.out.println("앨리스는 " + cake.getName() + "을(를) 먹었습니다.");
        changeHeight(cake.getHeightAfter());
    }

    public void eat(Mushroom mushroom, boolean growthSide) {
        System.out.println("앨리스는 " + mushroom.getName(growthSide) + "을(를) 먹었습니다.");
        changeHeight(mushroom.getHeightAfter(growthSide));
    }

    public void take(Key k) {
        if (height >= k.getTableHeight()) {
            key = k;
            System.out.println("  → 탁자 위 " + k.getName() + "를 집었습니다.");
        } else {
            System.out.println("  → 키가 " + height + "cm라서 탁자 위 열쇠에 손이 닿지 않습니다.");
        }
    }

    public void enter(Door door) {
        if (height > door.getHeight()) {
            System.out.println("  → 키가 " + height + "cm라서 문을 지나갈 수 없습니다.");
        } else if (key == null) {
            System.out.println("  → 문을 지나갈 크기지만 열쇠가 없어 열 수 없습니다.");
        } else {
            System.out.println("  → 열쇠로 문을 열고 정원으로 들어갔습니다!");
        }
    }

    private void changeHeight(int newHeight) {
        System.out.println("앨리스의 키가 " + newHeight + "cm가 되었습니다.");
        height = newHeight;
    }
}
