package labs.lab10.cardgame;

import javax.swing.JOptionPane;

public class ComputerPlayer extends CardPlayer {
	
	public ComputerPlayer(int maxCards) {
		super(maxCards);
	}
	
	public boolean wantsACard() {
		boolean decision;
		Card[] cards = showCards();
		// 게임에 따라 다른 전략을 세움 
		return true;
	}

}
