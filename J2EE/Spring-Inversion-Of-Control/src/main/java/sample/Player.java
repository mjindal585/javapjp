package sample;

public class Player {
	private String PlayerName;
	private Country c;
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public Country getC() {
		return c;
	}
	public void setC(Country c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Player [PlayerName=" + PlayerName + ", c=" + c + "]";
	}
	

}
