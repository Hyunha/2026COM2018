package labs.lab06.simplealice;

public class Mushroom {
    public String getName() {
        return "버섯";
    }

    public String getName(boolean growthSide) {
        if (growthSide) {
            return "키가 커지는 버섯";
        } else {
            return "키가 작아지는 버섯";
        }
    }

    /** 어느 쪽을 먹었는지에 따라 앨리스의 키가 몇 cm가 되는지 */
    public int getHeightAfter(boolean growthSide) {
        if (growthSide) {
            return 270;
        } else {
            return 40;
        }
    }
}
