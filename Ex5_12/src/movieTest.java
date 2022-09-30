
public class movieTest {

	public static void main(String[] args) {
		Movie frozen = new Movie();
		frozen.setMovieName("Frozen");
		frozen.setMPAA("G");
		
		Movie conjuring = new Movie();
		conjuring.setMovieName("The Conjuring");
		conjuring.setMPAA("R");
		
		for (int i=0; i < 5; i++) {
			frozen.addRating();
		}
		
		for (int i=0; i < 5; i++) {
			conjuring.addRating();
		}
		
		System.out.println("The movie "+ frozen.getMovieName() + "'s MPAA rating is "+ frozen.getMPAA());
		System.out.println("The movie "+ frozen.getMovieName() + "'s average rating is "+ frozen.getAverage());
		System.out.println();
		
		System.out.println("The movie "+ conjuring.getMovieName() +"'s MPAA rating is "+ conjuring.getMPAA());
		System.out.println("The movie "+ conjuring.getMovieName() +"'s average rating is "+ conjuring.getAverage());
		System.out.println();
		
		System.out.println("Are the two movies the equal?");
		System.out.println(frozen.equals(conjuring));

	}

}
