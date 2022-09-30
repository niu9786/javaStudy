
public class test {

	public static void main(String[] args) {
		Ex5_1 boatA = new Ex5_1();
		
		boatA.setAmount(8);
		boatA.setEfficiency(10);
		boatA.setCntSpeed(20);
		
		Ex5_1 boatB = new Ex5_1();
		
		boatB.setAmount(8);
		boatB.setEfficiency(10);
		boatB.setCntSpeed(20);
		
		Ex5_1 boatC = new Ex5_1();
		
		boatC.setAmount(9);
		boatC.setEfficiency(10);
		boatC.setCntSpeed(20);
		
		System.out.println(boatA.equals(boatB));
		System.out.println(boatA.equals(boatC));
		
	}

}
