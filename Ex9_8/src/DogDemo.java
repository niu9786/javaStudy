
public class DogDemo {

	public static void main(String[] args) {
		Dog Hoya = new Dog();
		Dog Khan = new Dog("Maltese", true);
		Dog BbiBbi = new Dog(6.2, "Poodle", true);
		Dog Choco = new Dog("Choco", 2, 3.5, "Pomeranian", true);
		Dog Ddung = new Dog(3, "Dobermann Pinscher", false);
		
		Hoya.setName("Hoya");
		Hoya.setAge(4);
		Hoya.setWeight(6.2);
		Hoya.setBreed("Golden retriever");
		Hoya.setBoosterShot(false);
		
		Khan.setName("Khan");
		Khan.setAge(7);
		Khan.setWeight(4.7);
		
		BbiBbi.setName("BbiBbi");
		BbiBbi.setAge(1);
		
		Ddung.setName("Ddung");
		Ddung.setWeight(9.1);
		
		System.out.println(Hoya.getAge());
		System.out.println(Hoya.getWeight());
		System.out.println(Khan.getBreed());
		System.out.println(Choco.isBoosterShot());
		System.out.println(BbiBbi.getName());
		System.out.println();
		BbiBbi.writeDogOutput();
		System.out.println();
		
		// displays the name and breed of all dogs that are over two years old and have not had their booster shots.
		Hoya.displayNameBreed();
		System.out.println();
		Ddung.displayNameBreed();
	}

}
