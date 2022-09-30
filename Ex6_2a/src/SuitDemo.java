
public class SuitDemo {

	public static void main(String[] args) {
		Suit cardSuit = Suit.SPADES;
		
		cardSuit.ordinal();
		cardSuit.equals(Suit.CLUBS);
		cardSuit.compareTo(Suit.CLUBS);
		Suit.valueOf("CLUBS");
		Suit.valueOf(cardSuit.toString());
		cardSuit.getColor();
		cardSuit.toString();

		System.out.println(cardSuit.ordinal());
		System.out.println(cardSuit.equals(Suit.CLUBS));
		System.out.println(cardSuit.compareTo(Suit.CLUBS));
		System.out.println(Suit.valueOf("CLUBS"));
		System.out.println(Suit.valueOf(cardSuit.toString()));
		System.out.println(cardSuit.getColor());
		System.out.println(cardSuit.toString());
	}

}
