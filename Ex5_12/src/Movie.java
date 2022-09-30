import java.util.Scanner;

public class Movie {
	private String movieName, MPAA;
	private double terribleRate, badRate, okRate, goodRate, greatRate = 0;
	
	public void addRating() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Write the number of rating about the movie '"+this.getMovieName()+".'");
		
		int inputValue = 0;
		inputValue = keyboard.nextInt();
		
		if ((inputValue < 1) || (inputValue > 5)) {
			System.out.println("Error: The movie rating should be an integer between 1 and 5.");
		}
		else {
			if (inputValue == 1) {
				terribleRate ++;
			}
			else if (inputValue == 2) {
				badRate ++;
			}
			else if (inputValue == 3) {
				okRate ++;
			}
			else if (inputValue == 4) {
				goodRate ++;
			}
			else if (inputValue == 5) {
				greatRate ++;
			}
		}
		
	}
	
	public double getAverage() {
		return (((this.terribleRate * 1) + (this.badRate * 2) + (this.okRate * 3)
				+ (this.goodRate * 4) + (this.greatRate * 5))
				/ (this.terribleRate + this.badRate + this.okRate + this.goodRate + this.greatRate));
	}
	
	public boolean equals(Movie otherObject) {
		return(this.movieName.equalsIgnoreCase(otherObject.movieName)) &&
				(this.MPAA.equalsIgnoreCase(otherObject.MPAA)) &&
				(this.terribleRate == otherObject.terribleRate) &&
				(this.badRate == otherObject.badRate) &&
				(this.okRate == otherObject.okRate) &&
				(this.goodRate == otherObject.goodRate) &&
				(this.greatRate == otherObject.greatRate);
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMPAA() {
		return MPAA;
	}
	public void setMPAA(String mPAA) {
		MPAA = mPAA;
	}
	
}
