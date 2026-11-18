package labs.lab12.throbbingball.asis;

import java.awt.*;

public class ThrobbingBall {
	private boolean isLarge = true;
	private Color color;

    public ThrobbingBall() {
        color = Color.RED;
    }

	public void throb() {
		isLarge = !isLarge;
	}

    public boolean isLarge() {
        return isLarge;
    }

    public void flipColor() {
        // TODO [실습 12-1] 빨간색 <-> 파란색으로 색상 변경
    }

    public Color getColor() {
        // TODO [실습 12-1] 공의 현재 색상을 리턴
        return null;
    }
}
