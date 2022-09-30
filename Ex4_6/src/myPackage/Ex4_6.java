package myPackage;

public class Ex4_6 {
	public static void main(String[] args) {
		Purchase orange = new Purchase();
		orange.setName("orange");
		orange.setPrice(10, 2.99);
		orange.setNumberBought(24);
		
		System.out.println("The "+orange.getName()+"s's cost each is $"+orange.getUnitCost());
		System.out.println("The "+orange.getName()+"s's total cost is $"+orange.getTotalCost());
		System.out.println();
		
		Purchase egg = new Purchase();
		egg.setName("egg");
		egg.setPrice(12, 1.69);
		egg.setNumberBought(36);
		
		System.out.println("The "+egg.getName()+"s's cost each is $"+egg.getUnitCost());
		System.out.println("The "+egg.getName()+"s's total cost is $"+egg.getTotalCost());
		System.out.println();
		
		Purchase apple = new Purchase();
		apple.setName("apple");
		apple.setPrice(3, 1.00);
		apple.setNumberBought(20);
		
		System.out.println("The "+apple.getName()+"s's cost each is $"+apple.getUnitCost());
		System.out.println("The "+apple.getName()+"s's total cost is $"+apple.getTotalCost());
		System.out.println();
		
		Purchase watermelon = new Purchase();
		watermelon.setName("watermelon");
		watermelon.setPrice(1, 4.39);
		watermelon.setNumberBought(2);
		
		System.out.println("The "+watermelon.getName()+"s's cost each is $"+watermelon.getUnitCost());
		System.out.println("The "+watermelon.getName()+"s's total cost is $"+watermelon.getTotalCost());
		System.out.println();
		
		Purchase bagel = new Purchase();
		bagel.setName("bagel");
		bagel.setPrice(6, 3.50);
		bagel.setNumberBought(12);
		
		System.out.println("The "+bagel.getName()+"s's cost each is $"+bagel.getUnitCost());
		System.out.println("The "+bagel.getName()+"s's total cost is $"+bagel.getTotalCost());
		System.out.println();
		
		System.out.println("The total items are "+(orange.getTotalCost()+egg.getTotalCost()+
				apple.getTotalCost()+watermelon.getTotalCost()+bagel.getTotalCost()));
	}

}
