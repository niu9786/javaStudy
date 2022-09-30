import java.util.Scanner;

public class Characteristic {
	private String description;
	private double rating = 0;
	
	public Characteristic(String description) {
		this.description = description;
		this.rating = 0;
	}
	
	private boolean isValid(double rating) {
		return ((rating >= 1) && (rating <= 10));
	}
	
	public void setRating(double rating) {
		if (this.isValid(rating) == true) {
			this.rating = rating;
		}
	}
	
	public void setRating() {
		Scanner keyboard = new Scanner(System.in);
		
		this.rating = keyboard.nextInt();
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getRating() {
		return this.rating;
	}
	
	public double getCompatibility(Characteristic otherRating) {
		if (this.description.equalsIgnoreCase(otherRating.description)) {
			return this.getCompatibilityMeasure(otherRating);
		}
		else {
			double returnValue = 0;
			
			return returnValue;
		}
	}
	
	private double getCompatibilityMeasure(Characteristic otherRating) {
		double m = 0;
		
		if ((this.rating != 0) && (otherRating.rating != 0)) {
			m = 1 - (Math.pow((this.rating - otherRating.rating),2) / 81);
		}
		
		return m;
	}
	
	private boolean isMatch(Characteristic otherRating) {
		return ((this.description.equalsIgnoreCase(otherRating.description)) &&
				(this.rating == otherRating.rating));
	}
	
	
}
