package labs.lab11.throbbingball.asis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorButton extends JButton implements ActionListener {
	private ThrobPanel view;

	public ColorButton(ThrobPanel f) {
		super("OK");
		view = f;
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO [실습 11-2] AS-IS(색과 크기가 동시에 바뀜)를 TO-BE 동작으로 바뀌도록 수정
		Color c = view.getColor();
		if (c == Color.RED) {
			view.setColor(Color.BLUE);
		} else {
			view.setColor(Color.RED);
		}
		view.throbBall();
		view.repaint();
	}
}
