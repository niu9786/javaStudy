
public class CharacteristicDemo {

	public static void main(String[] args) {
		
		Characteristic minsu = new Characteristic("tall");
		
		minsu.setRating();
		System.out.println(minsu.getRating());
		System.out.println(minsu.getDescription());
		
		Characteristic junsu = new Characteristic("tall");
		
		junsu.setRating(8);
		System.out.println(junsu.getRating());
		System.out.println(junsu.getDescription());
		
		Characteristic yunsu = new Characteristic("short");
		
		yunsu.setRating(1);
		System.out.println(yunsu.getRating());
		System.out.println(yunsu.getDescription());
		
		Characteristic chulsu = new Characteristic("short");
		
		chulsu.setRating(6);
		System.out.println(chulsu.getRating());
		System.out.println(chulsu.getDescription());
		
		System.out.println(minsu.getCompatibility(junsu));
		System.out.println(junsu.getCompatibility(yunsu));
		System.out.println(yunsu.getCompatibility(chulsu));

	}

}
