
public class Dog extends Pet{
	private String breed;
	private boolean boosterShot;
	
	public Dog() {
		super();
		breed = "None.";
		boosterShot = false;
	}
	
	public Dog(String newBreed, boolean newBoosterShot) {
		super();
		breed = newBreed;
		boosterShot = newBoosterShot;
	}
	
	public Dog(String newName, int newAge, double newWeight, String newBreed, boolean newBoosterShot) {
		super(newName, newAge, newWeight);
		breed = newBreed;
		boosterShot = newBoosterShot;
	}
	
	public Dog(String newName, String newBreed, boolean newBoosterShot) {
		super(newName);
		breed = newBreed;
		boosterShot = newBoosterShot;
	}
	
	public Dog(int newAge, String newBreed, boolean newBoosterShot) {
		super(newAge);
		breed = newBreed;
		boosterShot = newBoosterShot;
	}
	
	public Dog(double newWeight, String newBreed, boolean newBoosterShot) {
		super(newWeight);
		breed = newBreed;
		boosterShot = newBoosterShot;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isBoosterShot() {
		return boosterShot;
	}

	public void setBoosterShot(boolean boosterShot) {
		this.boosterShot = boosterShot;
	}
	
	public void writeDogOutput() {
		super.writeOutput();
		System.out.println("Breed: " + breed);
		System.out.println("Booster Shot: " + boosterShot);
	}
	
	public void displayNameBreed() {
		System.out.println("Name: " + getName());
		System.out.println("Breed: " + this.breed);
	}

}
