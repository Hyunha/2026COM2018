package labs.lab11.slidepuzzlegui;

import java.awt.event.*;
import javax.swing.*;

public class PuzzleButton extends JButton implements ActionListener {

	private SlidePuzzleBoard board;
	private PuzzleFrame frame;

	public PuzzleButton(SlidePuzzleBoard b, PuzzleFrame f) {
		board = b;
		frame = f;
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO [실습 11-3] 눌린 버튼의 퍼즐 조각을 이동하고, 이동에 성공하면 화면을 갱신
	}

}
