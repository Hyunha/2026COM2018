package labs.lab11.throbbingball.asis;

public class ThrobbingBall {
	private boolean isLarge = true;
	
	public boolean isLarge() {
		return isLarge;
	}
	
	public void throb() {
		isLarge = ! isLarge;
	}
}
