package myPackage;

public class TestProgram {

	public static void main(String[] args) {
		BasketballGame gameCatDog = new BasketballGame();
		gameCatDog.setNameFstT("Cats");
		gameCatDog.setNameSndT("Dogs");
		
		while (true) {
			System.out.println("Enter a score:");
		
			gameCatDog.scoreUp();
		
			System.out.println(gameCatDog.getNameFstT() +" "+ gameCatDog.getScoreFstT() +", "
					+ gameCatDog.getNameSndT() +" "+ gameCatDog.getScoreSndT() +" "
					+ gameCatDog.winningT() +" are winning.");
		}
		
	}

}
