package chapters.week06.wonderland;

public class Mushroom {
    public String getName(boolean growthSide) {
        return growthSide ? "키가 커지는 버섯" : "키가 작아지는 버섯";
    }

    public int getHeightAfter(boolean growthSide) {
        return growthSide ? 270 : 40;
    }
}
