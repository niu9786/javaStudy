package myPackage;

import java.util.Scanner;

public class BasketballGame {
	private String nameFstT, nameSndT, gameStatus; /** The names of the first and second team, 
													and the status of the game */
	private int scoreFstT, scoreSndT = 0; // The scores of the first and second team
	private char teamInput;
	private byte scoreInput = 0;
	
	public void scoreUp() {
		Scanner keyboard = new Scanner(System.in);
		
		teamInput = keyboard.next().charAt(0);
		scoreInput = keyboard.nextByte();
		
		if (teamInput == 'a') {
			scoreFstT = scoreFstT + scoreInput;
		}
		
		else if (teamInput == 'b') {
			scoreSndT = scoreSndT + scoreInput;
		}
		
		else if (teamInput == 'F') { // If the string "Finish" was input, finish the game.
			if ((scoreFstT >= 1) || (scoreSndT >= 1)) {
				System.out.println("The game was finished. The winner is " + this.winningT());
				System.exit(0);
			}
			
			else {
				System.out.println("The game was tied.");
				System.exit(0);
			}
		}
		
	}
	
	public String winningT() {
		if (scoreFstT > scoreSndT) {
			gameStatus = nameFstT;
		}
		
		else if (scoreFstT < scoreSndT) {
			gameStatus = nameSndT;
		}
		
		return gameStatus;
	}
	
	/** getter and setter */
	
	public String getNameFstT() {
		return nameFstT;
	}
	public void setNameFstT(String nameFstT) {
		this.nameFstT = nameFstT;
	}
	public String getNameSndT() {
		return nameSndT;
	}
	public void setNameSndT(String nameSndT) {
		this.nameSndT = nameSndT;
	}
	public int getScoreFstT() {
		return scoreFstT;
	}
	public void setScoreFstT(int scoreFstT) {
		this.scoreFstT = scoreFstT;
	}
	public int getScoreSndT() {
		return scoreSndT;
	}
	public void setScoreSndT(int scoreSndT) {
		this.scoreSndT = scoreSndT;
	}
	public String getGameStatus() {
		return gameStatus;
	}
	public void setGameStatus(String gameStatus) {
		this.gameStatus = gameStatus;
	}

}
