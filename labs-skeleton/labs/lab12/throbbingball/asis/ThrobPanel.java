package labs.lab12.throbbingball.asis;

import javax.swing.*;
import java.awt.*;

public class ThrobPanel extends JPanel {
	private int location, ballSize;
	private ThrobbingBall ball;

	public ThrobPanel(ThrobbingBall b) {
		int size = 180;
		location = size / 2;
		ballSize = size / 3;
		ball = b;
		setSize(size, size);
	}

    public void update() {
        // TODO [실습 12-1] 공의 색을 바꾸고 화면을 다시 그림
    }

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);   // 부모가 배경을 정리 — 항상 먼저 호출
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 180, 180);
		g.setColor(ball.getColor());
		if (ball.isLarge())
			g.fillOval(location- ballSize /2,location- ballSize /2, ballSize, ballSize);
		else
			g.fillOval(location- ballSize /4,location- ballSize /4, ballSize /2, ballSize /2);
	}
}
