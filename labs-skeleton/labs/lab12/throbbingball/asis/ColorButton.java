package labs.lab12.throbbingball.asis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorButton extends JButton implements ActionListener {
	private ThrobPanel view;

	public ColorButton(ThrobPanel f) {
		super("OK");
		view = f;
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO [실습 12-1] 버튼을 누를 때마다 공의 색상을 바꿈
	}
}
