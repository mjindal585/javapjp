package bean;

import java.util.List;


public class SpringIOC5 {
	//public class Player
private List<String> playerId;
private List<String> playerName;
private Country country;
public SpringIOC5() {
	super();
	// TODO Auto-generated constructor stub
}
public SpringIOC5(List<String> playerId, List<String> playerName, Country country) {
	super();
	this.playerId = playerId;
	this.playerName = playerName;
	this.country = country;
}
public List<String> getPlayerId() {
	return playerId;
}
public void setPlayerId(List<String> playerId) {
	this.playerId = playerId;
}
public List<String> getPlayerName() {
	return playerName;
}
public void setPlayerName(List<String> playerName) {
	this.playerName = playerName;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
@Override
public String toString() {
	return "SpringIOC5 [playerId=" + playerId + ", playerName=" + playerName + ", country=" + country + "]";
}

}
