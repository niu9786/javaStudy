package myPackage;



public class Purchase {
	private String name;
	private int groupCount;
	private double groupPrice;
	private int numberBought;
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setPrice(int count, double costForCount) {
		if ((count <= 0) || (costForCount <= 0)) {
			System.out.println("Error: Bad parameter in "+"setPrice.");
			System.exit(0);
		}
		else {
			groupCount = count;
			groupPrice = costForCount;
		}
	}
	
	public void setNumberBought(int number) {
		if (number <= 0) {
			System.out.println("Error: Bad parameter in "+"setNumberBought.");
			System.exit(0);
		}
		else
			numberBought = number;
	}

	public String getName() {
		return name;
	}
	public double getTotalCost() {
		return (groupPrice / groupCount) * numberBought;
	}
	public double getUnitCost() {
		return groupPrice / groupCount;
	}
	public int getNumberBought() {
		return numberBought;
	}

}
