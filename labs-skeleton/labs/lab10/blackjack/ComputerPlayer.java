package labs.lab10.blackjack;

import javax.swing.*;

public class ComputerPlayer extends CardPlayer {

	public ComputerPlayer(int maxCards) {
		super(maxCards);
	}

	public boolean wantsACard() {
		return super.totalScore() <= 16;
	}

}
