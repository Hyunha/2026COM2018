package labs.lab11.throbbingball.asis;

import java.awt.*;
import javax.swing.*;

public class ThrobPanel extends JPanel {
	private int location, ballSize;
	private Color c = Color.RED;
	private ThrobbingBall ball;

	public ThrobPanel(ThrobbingBall b) {
		int size = 180;
		location = size / 2;
		ballSize = size / 3;
		ball = b;
		setSize(size, size);
	}

	public Color getColor() {
		return c;
	}

	public void setColor(Color newColor) {
		c = newColor;
	}

    public void throbBall() {
		ball.throb();
    }

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);   // 부모가 배경을 정리 — 항상 먼저 호출
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 180, 180);
		g.setColor(c);
		if (ball.isLarge())
			g.fillOval(location-ballSize/2,location-ballSize/2,ballSize,ballSize);
		else
			g.fillOval(location-ballSize/4,location-ballSize/4,ballSize/2,ballSize/2);
	}
}
