package labs.lab06.simplealice;

public class Alice {
    private int height = 130;          // 상태: 앨리스의 키(cm). 외부에서 직접 바꿀 수 없다.

    public String getName() {
        return "앨리스";
    }

    public int getHeight() {
        return height;
    }

    public void drink(Drink drink) {
        System.out.println("앨리스는 " + drink.getTag() + "라고 쓰여진 "
                + drink.getName() + "을(를) 마셨습니다.");
        changeHeight(drink.getHeightAfter());
    }

    public void eat(Cake cake) {
        System.out.println("앨리스는 " + cake.getTag() + "라고 쓰여진 "
                + cake.getName() + "을(를) 먹었습니다.");
        changeHeight(cake.getHeightAfter());
    }

    public void eat(Mushroom mushroom, boolean growthSide) {
        System.out.println("앨리스는 " + mushroom.getName(growthSide) + "을(를) 먹었습니다.");
        changeHeight(mushroom.getHeightAfter(growthSide));
    }

    public void enter(Door door) {
        if (height <= door.getHeight()) {
            System.out.println("앨리스는 " + door.getTag() + " " + door.getName()
                    + "에 들어갔습니다.");
        } else {
            System.out.println("앨리스는 키가 " + height + "cm라서 "
                    + door.getName() + "을(를) 지나갈 수 없습니다.");
        }
    }

    /** 키를 바꾸는 일은 앨리스만 할 수 있다 — 그래서 private */
    private void changeHeight(int newHeight) {
        if (newHeight > height) {
            System.out.println("앨리스의 키가 " + newHeight + "cm로 커졌습니다.");
        } else if (newHeight < height) {
            System.out.println("앨리스의 키가 " + newHeight + "cm로 작아졌습니다.");
        }
        height = newHeight;
    }
}
