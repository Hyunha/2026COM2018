package labs.lab10.blackjack;

public class BlackjackController {
	
	private Dealer dealer;
	private HumanPlayer handPlayer;
	private ComputerPlayer handDealer;
	
	public BlackjackController(Dealer d) {
		dealer = d;
		handPlayer = new HumanPlayer(11, "Doh");
		handDealer = new ComputerPlayer(11);
	}
	
	
	void manageBlackjack() {
		
		dealer.dealOneTo(handPlayer);
		dealer.dealOneTo(handDealer);
		dealer.dealOneTo(handPlayer);
		dealer.dealOneTo(handDealer);
		int scorePlayer = handPlayer.totalScore();
		if (scorePlayer == 21)
			handPlayer.youWin();
		else if (scorePlayer < 21) {
			dealer.dealTo(handPlayer);
			scorePlayer = handPlayer.totalScore();
		}
		if (scorePlayer > 21)
			handPlayer.youLose();
		else {
			dealer.dealTo(handDealer);
			int scoreDealer = handDealer.totalScore();
			if (scoreDealer > 21) 
				handPlayer.youWin();
			else if (scorePlayer == scoreDealer)
				handPlayer.youDraw();
			else if (scorePlayer > scoreDealer)
				handPlayer.youWin();
			else
				handPlayer.youLose();
		}
		
	}

}
